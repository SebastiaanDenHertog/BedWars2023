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

package com.tomkeuper.bedwars.configuration;

import com.tomkeuper.bedwars.BedWars;
import com.tomkeuper.bedwars.api.configuration.ConfigManager;
import com.tomkeuper.bedwars.api.configuration.ConfigPath;
import com.tomkeuper.bedwars.api.language.Language;
import com.tomkeuper.bedwars.api.server.ServerType;
import com.tomkeuper.bedwars.arena.Misc;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class MainConfig extends ConfigManager {

    public MainConfig(Plugin plugin, String name) {
        super(plugin, name, BedWars.plugin.getDataFolder().getPath());

        YamlConfiguration yml = getYml();

        yml.options().header(plugin.getDescription().getName() + " by Mr. Ceasar.\n" +
                "Documentation here: https://github.com/tomkeuper/BedWars2023/wiki\n");
        yml.addDefault("timeZone", "Europe/Rome");
        yml.addDefault("serverType", "MULTIARENA");
        yml.addDefault("language", "en");
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_DISABLED_LANGUAGES, Collections.singletonList("your language iso here"));
        yml.addDefault("storeLink", "https://example.com/");
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_ENABLE_HALLOWEEN, true);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_ENABLE_ANTI_DROP, true);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_HOLOGRAM_UPDATE_DISTANCE, 50);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_ENABLE_TEAMMATE_TRACKING_ACTION_BAR, false);
        yml.addDefault(ConfigPath.GENERAL_CHAT_GLOBAL, yml.get("globalChat", false));
        yml.addDefault(ConfigPath.GENERAL_CHAT_FORMATTING, yml.get("formatChat", true));
        yml.addDefault("debug", false);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_MARK_LEAVE_AS_ABANDON, false);
        // parties category
        yml.addDefault(ConfigPath.GENERAL_ENABLE_PARTY_CMD, true);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_ALLOW_PARTIES, true);
        yml.addDefault(ConfigPath.GENERAL_ALESSIODP_PARTIES_RANK, 10);
        //
        yml.addDefault(ConfigPath.SB_CONFIG_SIDEBAR_PLAYER_NAME, "%bw_playername%");
        yml.addDefault(ConfigPath.SB_CONFIG_SIDEBAR_NAME_FORMATTING_ENABLED, true);
        yml.addDefault(ConfigPath.SB_CONFIG_SIDEBAR_USE_LOBBY_SIDEBAR, true);
        yml.addDefault(ConfigPath.SB_CONFIG_SIDEBAR_USE_GAME_SIDEBAR, true);
        yml.addDefault(ConfigPath.SB_CONFIG_SIDEBAR_TITLE_REFRESH_INTERVAL, 200);
        yml.addDefault(ConfigPath.SB_CONFIG_SIDEBAR_PLACEHOLDERS_REFRESH_INTERVAL, 200);
        yml.addDefault(ConfigPath.SB_CONFIG_SIDEBAR_PREFIX_REFRESH_INTERVAL, 8000);
        yml.addDefault(ConfigPath.SB_CONFIG_SIDEBAR_SUFFIX_REFRESH_INTERVAL, 100);
        yml.addDefault(ConfigPath.SB_CONFIG_SIDEBAR_LIST_FORMAT_LOBBY, false);
        yml.addDefault(ConfigPath.SB_CONFIG_SIDEBAR_LIST_FORMAT_WAITING, false);
        yml.addDefault(ConfigPath.SB_CONFIG_SIDEBAR_LIST_FORMAT_STARTING, false);
        yml.addDefault(ConfigPath.SB_CONFIG_SIDEBAR_LIST_FORMAT_PLAYING, true);
        yml.addDefault(ConfigPath.SB_CONFIG_SIDEBAR_LIST_FORMAT_RESTARTING, true);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_REJOIN_TIME, 60 * 5);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_RE_SPAWN_INVULNERABILITY, 4000);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_IN_GAME_ANNOUNCEMENT_ENABLE, true);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_IN_GAME_ANNOUNCEMENT_COOLDOW, 300);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_BUNGEE_OPTION_GAMES_BEFORE_RESTART, 30);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_BUNGEE_OPTION_RESTART_CMD, "restart");
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_BUNGEE_OPTION_AUTO_SCALE_LIMIT, 5);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_BUNGEE_OPTION_REDIS_HOST, "localhost");
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_BUNGEE_OPTION_REDIS_PORT, 6379);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_BUNGEE_OPTION_REDIS_PASSWORD, "StrongRedisPassword1");
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_BUNGEE_OPTION_REDIS_CHANNEL, "bw2023");
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_BUNGEE_OPTION_LOBBY_SERVER, "hub");
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_BUNGEE_OPTION_SERVER_ID, "bw1");
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_BUNGEE_OPTION_BWP_TIME_OUT, 5000);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_BUNGEE_OPTION_CLOUDNET_SUPPORT, false);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_START_COUNTDOWN_REGULAR, 40);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_START_COUNTDOWN_HALF, 25);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_START_COUNTDOWN_SHORTENED, 5);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_RESTART, 15);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_RE_SPAWN_COUNTDOWN, 5);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_REJOIN_RE_SPAWN_COUNTDOWN, 10);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_BEDS_DESTROY_COUNTDOWN, 360);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_DRAGON_SPAWN_COUNTDOWN, 600);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_GAME_END_COUNTDOWN, 120);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_SHOUT_COOLDOWN, 30);
        yml.addDefault(ConfigPath.GENERAL_CONFIG_PLACEHOLDERS_REPLACEMENTS_SERVER_IP, "yourServer.Com");

        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_HUNGER_WAITING, false);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_HUNGER_INGAME, false);

        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_ALLOW_FIRE_EXTINGUISH, true);

        //heal pool category
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_HEAL_POOL_ENABLE, true);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_HEAL_POOL_SEEN_TEAM_ONLY, true);

        // tnt jump category
        yml.addDefault(ConfigPath.GENERAL_TNT_JUMP_STRENGTH_REDUCTION, 5);
        yml.addDefault(ConfigPath.GENERAL_TNT_JUMP_Y_REDUCTION, 2);
        yml.addDefault(ConfigPath.GENERAL_TNT_JUMP_HORIZONTAL_FORGIVENESS, 1.2);
        yml.addDefault(ConfigPath.GENERAL_TNT_JUMP_DAMAGE_SELF, 1);
        yml.addDefault(ConfigPath.GENERAL_TNT_JUMP_DAMAGE_TEAMMATES, 5);
        yml.addDefault(ConfigPath.GENERAL_TNT_JUMP_DAMAGE_OTHERS, 10);

        // tnd block blast resistance
        yml.addDefault(ConfigPath.GENERAL_TNT_PROTECTION_END_STONE_BLAST, 12f);
        yml.addDefault(ConfigPath.GENERAL_TNT_PROTECTION_GLASS_BLAST, 300f);

        // tnt prime settings
        yml.addDefault(ConfigPath.GENERAL_TNT_AUTO_IGNITE, true);
        yml.addDefault(ConfigPath.GENERAL_TNT_FUSE_TICKS, 45);

        // fireball category
        yml.addDefault(ConfigPath.GENERAL_FIREBALL_EXPLOSION_SIZE, 3);
        yml.addDefault(ConfigPath.GENERAL_FIREBALL_SPEED_MULTIPLIER, 10);
        yml.addDefault(ConfigPath.GENERAL_FIREBALL_MAKE_FIRE, false);
        yml.addDefault(ConfigPath.GENERAL_FIREBALL_KNOCKBACK_HORIZONTAL, 1.0);
        yml.addDefault(ConfigPath.GENERAL_FIREBALL_KNOCKBACK_VERTICAL, 0.65);
        yml.addDefault(ConfigPath.GENERAL_FIREBALL_COOLDOWN, 0.5);
        yml.addDefault(ConfigPath.GENERAL_FIREBALL_DAMAGE_SELF, 2.0);
        yml.addDefault(ConfigPath.GENERAL_FIREBALL_DAMAGE_ENEMY, 2.0);
        yml.addDefault(ConfigPath.GENERAL_FIREBALL_DAMAGE_TEAMMATES, 0.0);
        //

        // Database Configuration
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_DATABASE_TYPE, "SQLite");
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_DATABASE_HOST, "localhost");
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_DATABASE_PORT, 3306);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_DATABASE_DATABASE, "bedwars2023");
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_DATABASE_USER, "root");
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_DATABASE_PASS, "cheese");
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_DATABASE_SSL, false);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_DATABASE_VERIFY_CERT, true);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_DATABASE_POOL_SIZE, 10);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_DATABASE_MAX_LIFETIME, 1800);
        //

        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_PERFORMANCE_ROTATE_GEN, true);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_PERFORMANCE_SPOIL_TNT_PLAYERS, true);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_PERFORMANCE_GENERATOR_SPLIT, true);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_PERFORMANCE_PAPER_FEATURES, true);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_ENABLE_FOOTSTEPS_ON_INVISIBILITY, true);

        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_DISABLE_CRAFTING, true);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_DISABLE_ENCHANTING, true);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_DISABLE_FURNACE, true);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_DISABLE_BREWING_STAND, true);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_DISABLE_ANVIL, true);
        yml.addDefault(ConfigPath.GENERAL_DISABLE_SHOUT_SOLO, false);

        /* Multi-Arena Lobby Command Items */
        saveLobbyCommandItem("stats", null, false, BedWars.getForCurrentVersion("SKULL_ITEM", "SKULL_ITEM", "PLAYER_HEAD"), 3, 0);
        saveLobbyCommandItem("arena-selector", "bw gui", true, "CHEST", 5, 4);
        saveLobbyCommandItem("leave", null, false, BedWars.getForCurrentVersion("BED", "BED", "RED_BED"), 0, 8);

        /* Pre Game Command Items */
        savePreGameCommandItem("stats", null, false, BedWars.getForCurrentVersion("SKULL_ITEM", "SKULL_ITEM", "PLAYER_HEAD"), 3, 0);
        savePreGameCommandItem("leave", null, false, BedWars.getForCurrentVersion("BED", "BED", "RED_BED"), 0, 8);

        /* Spectator Command Items */
        saveSpectatorCommandItem("teleporter", "bw teleporter", false, BedWars.getForCurrentVersion("SKULL_ITEM", "SKULL_ITEM", "PLAYER_HEAD"), 3, 0);
        saveSpectatorCommandItem("leave", null, false, BedWars.getForCurrentVersion("BED", "BED", "RED_BED"), 0, 8);

        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_ARENA_SELECTOR_SETTINGS_SIZE, 27);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_ARENA_SELECTOR_SETTINGS_SHOW_PLAYING, true);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_ARENA_SELECTOR_SETTINGS_USE_SLOTS, "10,11,12,13,14,15,16");
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_ARENA_SELECTOR_STATUS_MATERIAL.replace("%path%", "waiting"), BedWars.getForCurrentVersion("STAINED_GLASS_PANE", "CONCRETE", "LIME_CONCRETE"));
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_ARENA_SELECTOR_STATUS_DATA.replace("%path%", "waiting"), 5);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_ARENA_SELECTOR_STATUS_ENCHANTED.replace("%path%", "waiting"), false);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_ARENA_SELECTOR_STATUS_MATERIAL.replace("%path%", "starting"), BedWars.getForCurrentVersion("STAINED_GLASS_PANE", "CONCRETE", "YELLOW_CONCRETE"));
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_ARENA_SELECTOR_STATUS_DATA.replace("%path%", "starting"), 4);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_ARENA_SELECTOR_STATUS_ENCHANTED.replace("%path%", "starting"), true);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_ARENA_SELECTOR_STATUS_MATERIAL.replace("%path%", "playing"), BedWars.getForCurrentVersion("STAINED_GLASS_PANE", "CONCRETE", "RED_CONCRETE"));
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_ARENA_SELECTOR_STATUS_DATA.replace("%path%", "playing"), 14);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_ARENA_SELECTOR_STATUS_ENCHANTED.replace("%path%", "playing"), false);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_ARENA_SELECTOR_STATUS_MATERIAL.replace("%path%", "skipped-slot"), BedWars.getForCurrentVersion("STAINED_GLASS_PANE", "STAINED_GLASS_PANE", "BLACK_STAINED_GLASS_PANE"));
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_ARENA_SELECTOR_STATUS_DATA.replace("%path%", "skipped-slot"), 15);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_ARENA_SELECTOR_STATUS_ENCHANTED.replace("%path%", "skipped-slot"), false);

        /* default teleporter GUI settings */
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_TELEPORTER_GUI_SIZE, 36);
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_TELEPORTER_SLOTS, "10,11,12,13,14,15,16,19,20,21,22,23,24,25");

        /* default stats GUI items */
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_STATS_GUI_SIZE, 27);
        if (isFirstTime()) {
            Misc.addDefaultStatsItem(yml, 10, Material.DIAMOND, 0, "wins");
            Misc.addDefaultStatsItem(yml, 11, Material.REDSTONE, 0, "losses");
            Misc.addDefaultStatsItem(yml, 12, Material.IRON_SWORD, 0, "kills");
            Misc.addDefaultStatsItem(yml, 13, Material.valueOf(BedWars.getForCurrentVersion("SKULL_ITEM", "SKULL_ITEM", "SKELETON_SKULL")), 0, "deaths");
            Misc.addDefaultStatsItem(yml, 14, Material.DIAMOND_SWORD, 0, "final-kills");
            Misc.addDefaultStatsItem(yml, 15, Material.valueOf(BedWars.getForCurrentVersion("SKULL_ITEM", "SKULL_ITEM", "SKELETON_SKULL")), 1, "final-deaths");
            Misc.addDefaultStatsItem(yml, 16, Material.valueOf(BedWars.getForCurrentVersion("BED", "BED", "RED_BED")), 0, "beds-destroyed");
            Misc.addDefaultStatsItem(yml, 21, Material.valueOf(BedWars.getForCurrentVersion("STAINED_GLASS_PANE", "STAINED_GLASS_PANE", "BLACK_STAINED_GLASS_PANE")), 0, "first-play");
            Misc.addDefaultStatsItem(yml, 22, Material.CHEST, 0, "games-played");
            Misc.addDefaultStatsItem(yml, 23, Material.valueOf(BedWars.getForCurrentVersion("STAINED_GLASS_PANE", "STAINED_GLASS_PANE", "BLACK_STAINED_GLASS_PANE")), 0, "last-play");
        }

        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_DEFAULT_ITEMS + ".Default", Collections.singletonList(BedWars.getForCurrentVersion("WOOD_SWORD", "WOOD_SWORD", "WOODEN_SWORD")));
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_ALLOWED_COMMANDS, Arrays.asList("shout", "bw", "leave"));
        yml.addDefault(ConfigPath.GENERAL_CONFIGURATION_EXPERIMENTAL_TEAM_ASSIGNER, true);

        yml.addDefault(ConfigPath.LOBBY_VOID_TELEPORT_ENABLED, true);
        yml.addDefault(ConfigPath.LOBBY_VOID_TELEPORT_HEIGHT, 0);
        yml.options().copyDefaults(true);
        save();

        //set default server language
        String whatLang = "en";
        File[] langs = new File(plugin.getDataFolder(), "/Languages").listFiles();
        if (langs != null) {
            for (File f : langs) {
                if (f.isFile()) {
                    if (f.getName().contains("messages_") && f.getName().contains(".yml")) {
                        String lang = f.getName().replace("messages_", "").replace(".yml", "");
                        if (lang.equalsIgnoreCase(yml.getString("language"))) {
                            whatLang = f.getName().replace("messages_", "").replace(".yml", "");
                        }
                        if (Language.getLang(lang) == null) new Language(BedWars.plugin, lang);
                    }
                }
            }
        }
        Language def = Language.getLang(whatLang);

        if (def == null) throw new IllegalStateException("Could not found default language: " + whatLang);
        Language.setDefaultLanguage(def);

        //remove languages if disabled
        //server language can t be disabled
        for (String iso : yml.getStringList(ConfigPath.GENERAL_CONFIGURATION_DISABLED_LANGUAGES)) {
            Language l = Language.getLang(iso);
            if (l != null) {
                if (l != def) Language.getLanguages().remove(l);
            }
        }
        //

        BedWars.setDebug(yml.getBoolean("debug"));
        new ConfigManager(plugin, "bukkit", Bukkit.getWorldContainer().getPath()).set("ticks-per.autosave", -1);

        Bukkit.spigot().getConfig().set("commands.send-namespaced", false);
        try {
            Bukkit.spigot().getConfig().save("spigot.yml");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BedWars.setServerType(ServerType.valueOf(Objects.requireNonNull(yml.getString("serverType")).toUpperCase()));
        } catch (Exception e) {
            if (Objects.requireNonNull(yml.getString("serverType")).equalsIgnoreCase("BUNGEE_LEGACY")) {
                BedWars.setServerType(ServerType.BUNGEE);
                BedWars.setAutoscale(false);
            } else {
                set("serverType", "MULTIARENA");
            }
        }

        BedWars.setLobbyWorld(getLobbyWorldName());
    }

    public String getLobbyWorldName() {
        if (getYml().get("lobbyLoc") == null) return "";
        String d = getYml().getString("lobbyLoc");
        String[] data = d.replace("[", "").replace("]", "").split(",");
        return data[data.length - 1];
    }

    /**
     * Add Multi Arena Lobby Command Item To
     * This won't create the item back if you delete it.
     */
    @SuppressWarnings("WeakerAccess")
    public void saveLobbyCommandItem(String name, String cmd, boolean enchanted, String material, int data, int slot) {
        if (isFirstTime()) {
            if (cmd != null) getYml().addDefault(ConfigPath.GENERAL_CONFIGURATION_LOBBY_ITEMS_COMMAND.replace("%path%", name), cmd);
            getYml().addDefault(ConfigPath.GENERAL_CONFIGURATION_LOBBY_ITEMS_MATERIAL.replace("%path%", name), material);
            getYml().addDefault(ConfigPath.GENERAL_CONFIGURATION_LOBBY_ITEMS_DATA.replace("%path%", name), data);
            getYml().addDefault(ConfigPath.GENERAL_CONFIGURATION_LOBBY_ITEMS_ENCHANTED.replace("%path%", name), enchanted);
            getYml().addDefault(ConfigPath.GENERAL_CONFIGURATION_LOBBY_ITEMS_SLOT.replace("%path%", name), slot);
            getYml().options().copyDefaults(true);
            save();
        }
    }


    /**
     * Add Pre Game Command Item To
     * This won't create the item back if you delete it.
     */
    @SuppressWarnings("WeakerAccess")
    public void savePreGameCommandItem(String name, String cmd, boolean enchanted, String material, int data, int slot) {
        if (isFirstTime()) {
            if (cmd != null) getYml().addDefault(ConfigPath.GENERAL_CONFIGURATION_PRE_GAME_ITEMS_COMMAND.replace("%path%", name), cmd);
            if (name.equalsIgnoreCase("leave")) getYml().addDefault(ConfigPath.GENERAL_CONFIGURATION_PRE_GAME_ITEMS_LEAVE_DELAY.replace("%path%", name), 3);
            getYml().addDefault(ConfigPath.GENERAL_CONFIGURATION_PRE_GAME_ITEMS_MATERIAL.replace("%path%", name), material);
            getYml().addDefault(ConfigPath.GENERAL_CONFIGURATION_PRE_GAME_ITEMS_DATA.replace("%path%", name), data);
            getYml().addDefault(ConfigPath.GENERAL_CONFIGURATION_PRE_GAME_ITEMS_ENCHANTED.replace("%path%", name), enchanted);
            getYml().addDefault(ConfigPath.GENERAL_CONFIGURATION_PRE_GAME_ITEMS_SLOT.replace("%path%", name), slot);
            getYml().options().copyDefaults(true);
            save();
        }
    }

    /**
     * Add Spectator Command Item To
     * This won't create the item back if you delete it.
     */
    @SuppressWarnings("WeakerAccess")
    public void saveSpectatorCommandItem(String name, String cmd, boolean enchanted, String material, int data, int slot) {
        if (isFirstTime()) {
            if (cmd != null) getYml().addDefault(ConfigPath.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_COMMAND.replace("%path%", name), cmd);
            if (name.equalsIgnoreCase("leave")) getYml().addDefault(ConfigPath.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_LEAVE_DELAY.replace("%path%", name), 3);
            getYml().addDefault(ConfigPath.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_MATERIAL.replace("%path%", name), material);
            getYml().addDefault(ConfigPath.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_DATA.replace("%path%", name), data);
            getYml().addDefault(ConfigPath.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_ENCHANTED.replace("%path%", name), enchanted);
            getYml().addDefault(ConfigPath.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_SLOT.replace("%path%", name), slot);
            getYml().options().copyDefaults(true);
            save();
        }
    }
}
