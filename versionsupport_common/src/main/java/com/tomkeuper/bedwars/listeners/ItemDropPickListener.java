/*
 * BedWars1058 - A bed wars mini-game.
 * Copyright (C) 2021 Andrei Dascălu
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * Contact e-mail: andrew.dascalu@gmail.com
 */

package com.tomkeuper.bedwars.listeners;

import com.tomkeuper.bedwars.api.arena.GameState;
import com.tomkeuper.bedwars.api.arena.IArena;
import com.tomkeuper.bedwars.api.events.player.PlayerGeneratorCollectEvent;
import com.tomkeuper.bedwars.api.server.ServerType;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDropItemEvent;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupArrowEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;
import java.util.stream.Collectors;

import static com.tomkeuper.bedwars.support.version.common.VersionCommon.api;

public class ItemDropPickListener {

    // 1.11 or older
    public static class PlayerDrop implements Listener {
        @EventHandler
        public void onDrop(PlayerDropItemEvent e){
            if (manageDrop(e.getPlayer(), e.getItemDrop())) e.setCancelled(true);
        }
    }

    // 1.11 or older
    public static class PlayerPickup implements Listener {
        @SuppressWarnings("deprecation")
        @EventHandler
        public void onPickUp(PlayerPickupItemEvent e) {
            Player p = e.getPlayer();

            List<Item> items = e.getItem().getNearbyEntities(0.5, 0.5, 0.5).stream()
                    .filter(entity -> entity instanceof Item)
                    .filter(entity -> ((Item) entity).getItemStack().getType() == e.getItem().getItemStack().getType())
                    .filter(entity -> entity.getLocation().distance(e.getItem().getLocation()) < 0.1)
                    .map(entity -> (Item) entity)
                    .collect(Collectors.toList());
            items.add(e.getItem());
            int amount = items.size();

            if (managePickup(e.getItem(), e.getPlayer(), items.size())) {
                e.setCancelled(true);
                return;
            }

            if (items.size() > 1) {
                items.remove(e.getItem());
                items.forEach(Entity::remove);
            }
            if (items.size() == 1) return;
            p.getInventory().addItem(new ItemStack(e.getItem().getItemStack().getType(), amount));
        }
    }

    // 1.13 or newer
    public static class EntityDrop implements Listener {
        @EventHandler
        public void onDrop(EntityDropItemEvent e){
            if (manageDrop(e.getEntity(), e.getItemDrop())) e.setCancelled(true);
        }
    }

    // 1.12 or newer
    public static class EntityPickup implements Listener {
        @EventHandler
        public void onPickup(EntityPickupItemEvent e) {
            if (!(e.getEntity() instanceof Player)) return;
            Player p = e.getEntity() instanceof Player ? (Player) e.getEntity() : null;
            if (p == null) return;

            List<Item> items = e.getItem().getNearbyEntities(0.5, 0.5, 0.5).stream()
                    .filter(entity -> entity instanceof Item)
                    .filter(entity -> ((Item) entity).getItemStack().getType() == e.getItem().getItemStack().getType())
                    .filter(entity -> entity.getLocation().distance(e.getItem().getLocation()) < 0.1)
                    .map(entity -> (Item) entity)
                    .collect(Collectors.toList());
            items.add(e.getItem());
            int amount = items.size();

            if (managePickup(e.getItem(), e.getEntity(), items.size())) {
                e.setCancelled(true);
                return;
            }

            if (items.size() > 1) {
                items.remove(e.getItem());
                items.forEach(Entity::remove);
            }
            if (items.size() == 1) return;
            p.getInventory().addItem(new ItemStack(e.getItem().getItemStack().getType(), amount));
        }
    }

    // 1.9 or newer
    public static class ArrowCollect implements Listener {
        @EventHandler
        public void onArrowPick(PlayerPickupArrowEvent e){
            if (api.getArenaUtil().isSpectating(e.getPlayer())) {
                e.setCancelled(true);
            }
        }
    }

    /**
     * @return true if event should be cancelled
     */
    private static boolean managePickup(Item item, LivingEntity player, int amount) {
        if (!(player instanceof Player)) return false;

        if (api.getServerType() == ServerType.MULTIARENA) {
            //noinspection ConstantConditions
            if (player.getLocation().getWorld().getName().equalsIgnoreCase(api.getLobbyWorld())) {
                return true;
            }
        }
        Player p = (Player) player;
        IArena a = api.getArenaUtil().getArenaByPlayer(p);
        ItemStack iStack = item.getItemStack();

        if (a == null) return false;
        if (!a.isPlayer(p)) return true;
        if (a.getStatus() != GameState.playing) return true;
        if (a.getRespawnSessions().containsKey(p)) return true;

        if (iStack.getType() == Material.ARROW) {
            item.setItemStack(api.getVersionSupport().createItemStack(iStack.getType().toString(), iStack.getAmount(), (short) 0));
            return false;
        }

        if (iStack.getType().toString().equals("BED")) {
            item.remove();
            return true;
        } else if (iStack.hasItemMeta()) {
            //noinspection ConstantConditions
            if (iStack.getItemMeta().hasDisplayName()) {
                if (iStack.getItemMeta().getDisplayName().contains("custom")) {
                    Material material = item.getItemStack().getType();
                    ItemMeta itemMeta = new ItemStack(material).getItemMeta();

                    //Call ore pick up event
                    if (!api.getAFKUtil().isPlayerAFK(p)){
                        PlayerGeneratorCollectEvent event = new PlayerGeneratorCollectEvent(p, item, a, amount);
                        Bukkit.getPluginManager().callEvent(event);
                        if (event.isCancelled()) {
                            return true;
                        } else {
                            iStack.setItemMeta(itemMeta);
                        }
                    } else return true; //Cancel event if player is afk
                }
            }
        }
        return false;
    }

    /**
     * @return true to cancel the event.
     */
    private static boolean manageDrop(Entity player, Item item) {
        if (!(player instanceof Player)) return false;
        if (api.getServerType() == ServerType.MULTIARENA) {
            //noinspection ConstantConditions
            if (player.getLocation().getWorld().getName().equalsIgnoreCase(api.getLobbyWorld())) {
                return true;
            }
        }
        IArena a = api.getArenaUtil().getArenaByPlayer((Player) player);
        if (a == null) return false;

        if (!a.isPlayer((Player) player)) {
            return true;
        }

        if (a.getStatus() != GameState.playing) {
            return true;
        } else {
            ItemStack i = item.getItemStack();
            if (i.getType() == Material.COMPASS) {
                return true;
            }
        }

        return a.getRespawnSessions().containsKey(player);
    }
}
