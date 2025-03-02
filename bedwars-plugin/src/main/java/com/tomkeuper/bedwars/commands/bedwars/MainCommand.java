/*
 * BedWars2023 - A bed wars mini-game.
 * Copyright (C) 2024 Tomas Keuper
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
 * Contact e-mail: contact@fyreblox.com
 */

package com.tomkeuper.bedwars.commands.bedwars;

import com.tomkeuper.bedwars.BedWars;
import com.tomkeuper.bedwars.api.command.ParentCommand;
import com.tomkeuper.bedwars.api.command.SubCommand;
import com.tomkeuper.bedwars.api.language.Language;
import com.tomkeuper.bedwars.api.language.Messages;
import com.tomkeuper.bedwars.api.server.ServerType;
import com.tomkeuper.bedwars.arena.SetupSession;
import com.tomkeuper.bedwars.commands.bedwars.subcmds.sensitive.*;
import com.tomkeuper.bedwars.support.citizens.JoinNPC;
import com.tomkeuper.bedwars.commands.bedwars.subcmds.regular.*;
import com.tomkeuper.bedwars.commands.bedwars.subcmds.sensitive.setup.*;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.tomkeuper.bedwars.BedWars.*;
import static com.tomkeuper.bedwars.api.language.Language.getMsg;

public class MainCommand extends BukkitCommand implements ParentCommand {

    /* SubCommands ArenaList */
    private static List<SubCommand> subCommandList = new ArrayList<>();
    /* MainCommand instance*/
    private static MainCommand instance;
    /* Dot char */
    @SuppressWarnings("WeakerAccess")
    public static char dot = 254;

    public MainCommand(String name) {
        super(name);
        setAliases(Arrays.asList("bedwars", "bedwars2023"));
        instance = this;
        new CmdJoin(this, "join");
        new CmdLeave(this, "leave");
        new CmdLang(this, "lang");
        new CmdTeleporter(this, "teleporter");
        if (getServerType() != ServerType.BUNGEE) {
            new CmdGUI(this, "gui");
        }
        new CmdStats(this, "stats");
        new CmdStart(this, "forceStart");
        new CmdStart(this, "start");
        if (BedWars.getServerType() != ServerType.BUNGEE) {
            new SetLobby(this, "setLobby"); //priority 1
        }
        new SetupArena(this, "setupArena"); //priority 2
        new ArenaList(this, "arenaList"); //priority 3
        new DelArena(this, "delArena"); //priority 4
        new EnableArena(this, "enableArena"); //priority 5
        new DisableArena(this, "disableArena"); //priority 6
        new CloneArena(this, "cloneArena"); //priority 7
        new ArenaGroup(this, "arenaGroup"); //priority 8
        new Build(this, "build"); //priority 9
        new Level(this, "level");
        new Reload(this, "reload"); //priority 11
        new CmdList(this, "cmds"); //priority 20
        if (BedWars.getServerType() == ServerType.BUNGEE){
            new RedisUpdate(this, "redisUpdate"); // not listed
        }
        new ApplyTabConfig(this, "applyTabConfig"); // not listed

        /* Arena setup commands (in world) */
        new AutoCreateTeams(this, "autoCreateTeams");
        new SetWaitingSpawn(this, "setWaitingSpawn");
        new SetSpectatorPos(this, "setSpectSpawn");
        new CreateTeam(this, "createTeam");
        new WaitingPos(this, "waitingPos");
        new RemoveTeam(this, "removeTeam");
        new SetMaxInTeam(this, "setMaxInTeam");
        new SetMaxBuildHeight(this, "setMaxBuildHeight");
        new SetMinBuildHeight(this, "setMinBuildHeight");
        new SetSpawn(this, "setSpawn");
        new SetBed(this, "setBed");
        new SetShop(this, "setShop");
        new SetUpgrade(this, "setUpgrade");
        new AddGenerator(this, "addGenerator");
        new SetSpawnProtection(this, "setSpawnProtection");
        new SetShopProtection(this, "setShopProtection");
        new SetUpgradesProtection(this, "setUpgradesProtection");
        new SetGeneratorProtection(this, "setGeneratorProtection");
        new SetIslandRadius(this, "setIslandRadius");
        new RemoveGenerator(this, "removeGenerator");
        new SetUseBedHologram(this, "setUseBedHologram");
        new SetDisplayName(this, "setDisplayName");
        new SetType(this, "setType");
        new Save(this, "save");
        if (JoinNPC.isCitizensSupport() && BedWars.getServerType() != ServerType.BUNGEE) {
            new NPC(this, "npc");
        }
        new CmdTpStaff(this, "tp");
        new SetKillDropsLoc(this, "setKillDrops");
    }

    @Override
    public boolean execute(CommandSender s, String st, String[] args) {

        if (args.length == 0) {
            /* Set op commands, console always has permission*/
            if ((s.isOp() || s.hasPermission(BedWars.mainCmd + ".*"))) {
                if (s instanceof Player) {
                    if (SetupSession.isInSetupSession(((Player) s).getUniqueId())) {
                        Bukkit.dispatchCommand(s, getName() + " cmds");
                    } else {
                        s.sendMessage("");
                        s.sendMessage("§8§l" + dot + " §6" + plugin.getDescription().getName() + " v" + plugin.getDescription().getVersion() + " §7- §c Admin Commands");
                        s.sendMessage("");
                        sendSubCommands(s);
                    }
                } else {
                    s.sendMessage("");
                    s.sendMessage("§8§l" + dot + " §6" + plugin.getDescription().getName() + " v" + plugin.getDescription().getVersion() + " §7- §c Console Commands");
                    s.sendMessage("");
                    sendSubCommands(s);
                }
            } else {
                /* Send player commands */
                Bukkit.dispatchCommand(s, mainCmd + " cmds");
            }
            return true;
        }

        boolean commandFound = false;
        for (SubCommand sb : getSubCommands()) {
            if (sb.getSubCommandName().equalsIgnoreCase(args[0])) {
                if (sb.hasPermission(s)) {
                    commandFound = sb.execute(Arrays.copyOfRange(args, 1, args.length), s);
                }
            }
        }

        if (!commandFound) {
            if (s instanceof Player) {
                s.sendMessage(getMsg((Player) s, Messages.COMMAND_NOT_FOUND_OR_INSUFF_PERMS));
            } else {
                s.sendMessage(Language.getDefaultLanguage().m(Messages.COMMAND_NOT_FOUND_OR_INSUFF_PERMS));
            }
        }
        return true;
    }

    public static boolean isArenaGroup(String var) {
        if (config.getYml().get("arenaGroups") != null) {
            return config.getYml().getStringList("arenaGroups").contains(var);
        }
        return var.equalsIgnoreCase("default");
    }

    public static TextComponent createTC(String text, String suggest, String shot_text) {
        TextComponent tx = new TextComponent(text);
        tx.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, suggest));
        tx.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(shot_text).create()));
        return tx;
    }

    @Override
    public void addSubCommand(SubCommand subCommand) {
        subCommandList.add(subCommand);
    }

    @Override
    public void sendSubCommands(CommandSender p) {
        if (p instanceof Player){
            for (int i = 0; i <= 20; i++) {
                for (SubCommand sb : getSubCommands()) {
                    if (sb.getPriority() == i && sb.isShow() && sb.canSee(p, BedWars.getAPI())) {
                        ((Player) p).spigot().sendMessage(sb.getDisplayInfo());
                    }
                }
            }
        }else {
            for (int i = 0; i <= 20; i++) {
                for (SubCommand sb : getSubCommands()) {
                    if (sb.getPriority() == i && sb.isShow() && sb.canSee(p, BedWars.getAPI())) {
                        p.sendMessage(sb.getDisplayInfo().getText());
                    }
                }
            }
        }
    }

    public List<String> tabComplete(CommandSender s, String alias, String[] args, Location location) throws IllegalArgumentException {
        if (args.length == 1) {
            List<String> sub = new ArrayList<>();
            for (SubCommand sb : getSubCommands()) {
                if (sb.canSee(s, BedWars.getAPI())) sub.add(sb.getSubCommandName());
            }
            return sub;
        } else if (args.length == 2) {
            if (hasSubCommand(args[0])) {
                if (getSubCommand(args[0]).canSee(s, BedWars.getAPI()))
                    return getSubCommand(args[0]).getTabComplete();
            }
        }
        return null;
    }


    @Override
    public List<SubCommand> getSubCommands() {
        return subCommandList;
    }

    /**
     * Get instance
     */
    public static MainCommand getInstance() {
        return instance;
    }

    /**
     * Check if lobby location is set
     */
    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    public static boolean isLobbySet() {
        if (BedWars.getServerType() == ServerType.BUNGEE) return true;
        return !config.getLobbyWorldName().isEmpty();
    }

    @Override
    public boolean hasSubCommand(String name) {
        for (SubCommand sc : getSubCommands()) {
            if (sc.getSubCommandName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Get sub-command by name
     */
    @SuppressWarnings("WeakerAccess")
    public SubCommand getSubCommand(String name) {
        for (SubCommand sc : getSubCommands()) {
            if (sc.getSubCommandName().equalsIgnoreCase(name)) {
                return sc;
            }
        }
        return null;
    }

    /**
     * Get a dot symbol
     */
    public static char getDot() {
        return dot;
    }
}