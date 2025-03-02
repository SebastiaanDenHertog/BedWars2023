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

package com.tomkeuper.bedwars.language;

import com.tomkeuper.bedwars.BedWars;
import com.tomkeuper.bedwars.api.configuration.ConfigPath;
import com.tomkeuper.bedwars.api.language.Language;
import com.tomkeuper.bedwars.api.language.Messages;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Spanish extends Language {

    public Spanish() {
        super(BedWars.plugin, "es");
        YamlConfiguration yml = getYml();
        yml.options().header("Translated by NotLew_x#9207");
        yml.addDefault(Messages.PREFIX, "");
        yml.addDefault("name", "Espanol");

        yml.addDefault(Messages.FORMATTING_SIDEBAR_TAB_HEADER_LOBBY, "&6%bw_server_ip%");
        yml.addDefault(Messages.FORMATTING_SIDEBAR_TAB_HEADER_WAITING, "&a%bw_server_ip%");
        yml.addDefault(Messages.FORMATTING_SIDEBAR_TAB_HEADER_STARTING, "&6%bw_server_ip%");
        yml.addDefault(Messages.FORMATTING_SIDEBAR_TAB_HEADER_PLAYING, "&d%bw_server_ip%");
        yml.addDefault(Messages.FORMATTING_SIDEBAR_TAB_HEADER_RESTARTING, "&c%bw_server_ip%");
        yml.addDefault(Messages.FORMATTING_SIDEBAR_TAB_HEADER_SPECTATOR, "&9%bw_server_ip%");

        yml.addDefault(Messages.FORMATTING_SIDEBAR_TAB_FOOTER_LOBBY, "&6%bw_server_ip%");
        yml.addDefault(Messages.FORMATTING_SIDEBAR_TAB_FOOTER_WAITING, "&a%bw_server_ip%");
        yml.addDefault(Messages.FORMATTING_SIDEBAR_TAB_FOOTER_STARTING, "&6%bw_server_ip%");
        yml.addDefault(Messages.FORMATTING_SIDEBAR_TAB_FOOTER_PLAYING, "&d%bw_server_ip%");
        yml.addDefault(Messages.FORMATTING_SIDEBAR_TAB_FOOTER_RESTARTING, "&c%bw_server_ip%");
        yml.addDefault(Messages.FORMATTING_SIDEBAR_TAB_FOOTER_SPECTATOR, "&9%bw_server_ip%");

        yml.options().copyDefaults(true);
        yml.addDefault(Messages.COMMAND_MAIN, Arrays.asList("", "&2▪ &7/" + BedWars.mainCmd + " stats", "&2▪ &7/" + BedWars.mainCmd + " join &o<arena/grupo>", "&2▪ &7/" + BedWars.mainCmd + " leave", "&2▪ &7/" + BedWars.mainCmd + " lang", "&2▪ &7/" + BedWars.mainCmd + " gui", "&2▪ &7/" + BedWars.mainCmd + " start &3(vip)"));
        yml.addDefault(Messages.ARENA_JOIN_VIP_KICK, "%bw_lang_prefix%&cHas sido expulsado ya que un VIP se ha unido a la partida.\n&aConsidere hacer una donación para obtener más funciones. &7&o(click)");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL, "%bw_lang_prefix%&cEsta arena está llena!\n&aConsidere hacer una donación para obtener más funciones. &7&o(click)");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL_OF_VIPS, "%bw_lang_prefix%&cEsta arena esta llena!.\n&cConsidere hacer una donación para obtener más funciones. &7&o(click).");
        yml.addDefault(Messages.ARENA_START_COUNTDOWN_STOPPED_INSUFF_PLAYERS_CHAT, "%bw_lang_prefix%§cNo hay suficientes jugadores! La cuenta regresiva ha sido frenada!");
        yml.addDefault(Messages.ARENA_RESTART_PLAYER_KICK, "%bw_lang_prefix%&eLa arena en la que estabas se está reiniciando.");
        yml.addDefault(Messages.ARENA_STATUS_PLAYING_NAME, "&cEn Juego");
        yml.addDefault(Messages.ARENA_STATUS_RESTARTING_NAME, "&4Reiniciando");
        yml.addDefault(Messages.ARENA_STATUS_WAITING_NAME, "&2En Espera §c%bw_full%");
        yml.addDefault(Messages.ARENA_STATUS_STARTING_NAME, "&6Comenzando §c%bw_full%");
        yml.addDefault(Messages.COMMAND_JOIN_GROUP_OR_ARENA_NOT_FOUND, "%bw_lang_prefix%&No existe una arena o grupos de arena llamadas: %bw_name%");
        yml.addDefault(Messages.COMMAND_JOIN_NO_EMPTY_FOUND, "%bw_lang_prefix%&cNo hay arenas disponibles por el momento ;(");
        yml.addDefault(Messages.COMMAND_LEAVE_DENIED_NOT_IN_ARENA, "%bw_lang_prefix%&cNo estas en ninguna arena!");
        yml.addDefault(Messages.COMMAND_LEAVE_HAS_PARTY_POPUP_TITLE, "Are you sure?");
        yml.addDefault(Messages.COMMAND_LEAVE_HAS_PARTY_POPUP_STAY, "&cNo");
        yml.addDefault(Messages.COMMAND_LEAVE_HAS_PARTY_POPUP_STAY_LORE, List.of("&fStay in the arena"));
        yml.addDefault(Messages.COMMAND_LEAVE_HAS_PARTY_POPUP_BRING_PARTY, "&aYes");
        yml.addDefault(Messages.COMMAND_LEAVE_HAS_PARTY_POPUP_BRING_PARTY_LORE, List.of("&fSummon party with you"));
        yml.addDefault(Messages.ARENA_GUI_INV_NAME, "&8Arenas disponibles");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_NAME, "&a&l%bw_name%");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_LORE, Arrays.asList("", "&7Estado: %bw_arena_status%", "&7Jugadores: &f%bw_on%&7/&f%bw_max%", "&7Tipo: &a%bw_group%", "", "&aClick Izquierdo para unirte!", "&eClick Derecho para espectar!"));
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_NAME, "&r%bw_server_ip%");
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_LORE, Collections.emptyList());
        yml.addDefault(Messages.COMMAND_LANG_LIST_HEADER, "%bw_lang_prefix% &2Idiomas disponibles:");
        yml.addDefault(Messages.COMMAND_LANG_LIST_FORMAT, "&a▪  &7%bw_lang_iso% - &f%bw_name%");
        yml.addDefault(Messages.COMMAND_LANG_USAGE, "%bw_lang_prefix%&7Usa: /lang &f&o<iso>");
        yml.addDefault(Messages.COMMAND_TP_PLAYER_NOT_FOUND, "%bw_lang_prefix%&cJugador no encontrado!");
        yml.addDefault(Messages.COMMAND_TP_NOT_IN_ARENA, "%bw_lang_prefix%&cEste jugador no está en una arena de bedwars.!");
        yml.addDefault(Messages.COMMAND_TP_NOT_STARTED, "%bw_lang_prefix%&cLa arena donde está el jugador aún no comenzó.!");
        yml.addDefault(Messages.COMMAND_TP_USAGE, "%bw_lang_prefix%&cUso: /bw tp <usuario>");
        yml.addDefault(Messages.COMMAND_REJOIN_PLAYER_RECONNECTED, "%bw_lang_prefix%&7%bw_player% &ese ha vuelto a conectar!");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_NOT_EXIST, "%bw_lang_prefix%&cEste idioma no existe!");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_SUCCESSFULLY, "%bw_lang_prefix%&aIdioma cambiado!");
        yml.addDefault(Messages.COMMAND_LANG_USAGE_DENIED, "%bw_lang_prefix%&cNo puedes cambiar tu idioma mientras estas en juego.");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_PARTY_TOO_BIG, "%bw_lang_prefix%&cTu party es demasiado grande para unirte a esta partida como equipo. Considera reducir el tamaño o ingresar a una arena más grande.");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_NOT_PARTY_LEADER, "%bw_lang_prefix%&cSolo el lider puede unirse a una partida.");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIER, "&eNivel &c%bw_tier%");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_DIAMOND, "&b&lDiamante");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_EMERALD, "&a&lEsmeralda");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIMER, "&eAparece en &c%bw_seconds% &esegundos");
        yml.addDefault(Messages.COMMAND_JOIN_PLAYER_JOIN_MSG, "%bw_lang_prefix%&7%bw_player% &ese ha unido (&b%bw_on%&e/&b%bw_max%&e)!");
        yml.addDefault(Messages.COMMAND_LEAVE_MSG, "%bw_lang_prefix%&7%bw_player% &eha salido!");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CHAT, "%bw_lang_prefix%&eEl juego comenzara en &6%bw_time% &esegundo(s)!");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE, "&a%bw_seconds%");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-5", "&e❺");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-4", "&e❹");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-3", "&c❸");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-2", "&c❷");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-1", "&c❶");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_SUB_TITLE, "&cEsperando más jugadores..");
        yml.addDefault(Messages.FORMATTING_CHAT_LOBBY, "%bw_level%%bw_v_prefix%&7%bw_player%%bw_v_suffix%: %bw_message%");
        yml.addDefault(Messages.FORMATTING_CHAT_WAITING, "%bw_level%%bw_v_prefix%&7%bw_player%%bw_v_suffix%: %bw_message%");
        yml.addDefault(Messages.FORMATTING_CHAT_SHOUT, "%bw_level%%bw_v_prefix%&6[SHOUT] %bw_team_format% &7%bw_player%&f%bw_v_suffix%: %bw_message%");
        yml.addDefault(Messages.FORMATTING_CHAT_TEAM, "%bw_level%%bw_v_prefix%&f%bw_team_format%&7 %bw_player%%bw_v_suffix%: %bw_message%");
        yml.addDefault(Messages.FORMATTING_CHAT_SPECTATOR, "%bw_level%%bw_v_prefix%&7[ESPECTADOR] %bw_player%%bw_v_suffix%: %bw_message%");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TUTORIAL, Arrays.asList("&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &lBedWars", "",
                "&e&l    Protege tu cama y destruye camas enemigas.",
                "&e&l Consigue mejoras para ti y para tu equipo consiguiendo",
                "&e&l   Hierro, Oro, Esmeralda, y Diamantes de los generadores",
                "&e&l         para acceder a importantes mejoras.", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.MEANING_SHOUT, "grita");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TITLE, "&aVAMOS");


        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING, Arrays.asList("&f&lBED WARS", "&7%bw_date% &8%bw_server_id%", "", "&fMapa: &a%bw_map%", "", "&fJugador: &a%bw_on%/%bw_max%", "", "&fEsperando...", "", "§fMode: &a%bw_group%", "&fVersion: &7%bw_version%", "", "&e%bw_server_ip%"));
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_STARTING, Arrays.asList("&f&lBED WARS", "&7%bw_date% &8%bw_server_id%", "", "&fMapa: &a%bw_map%", "", "&fJugador: &a%bw_on%/%bw_max%", "", "&fomenzando en &a%bw_time%s", "", "§fMode: &a%bw_group%", "&fVersion: &7%bw_version%", "", "&e%bw_server_ip%"));
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING, Arrays.asList("&e&lBED WARS", "&7%bw_date%", "", "&f%bw_next_event% in &a%bw_time%", "",
                "%bw_team_1%", "%bw_team_2%", "%bw_team_3%", "%bw_team_4%", "%bw_team_5", "%bw_team_6%", "%bw_team_7%", "%bw_team_8%", "", "&e%bw_server_ip%"));

        yml.addDefault("scoreboard.Doubles.playing", Arrays.asList("&e&lBED WARS", "&7%bw_date%", "", "&f%bw_next_event% in &a%bw_time%", "",
                "%bw_team_1%", "%bw_team_2%", "%bw_team_3%", "%bw_team_4%", "%bw_team_5", "%bw_team_6%", "%bw_team_7%", "%bw_team_8%", "", "&e%bw_server_ip%"));

        yml.addDefault("scoreboard.3v3v3v3.playing", Arrays.asList("&e&lBED WARS", "&7%bw_date%", "", "&f%bw_next_event% in &a%bw_time%", "",
                "%bw_team_1%", "%bw_team_2%", "%bw_team_3%", "%bw_team_4%", "", "&finalKills: &a%bw_kills%", "&fAsesinatos Finales: &a%bw_final_kills%", "&fCamas Destruidas: &a%bw_beds%", "", "&e%bw_server_ip%"));

        yml.addDefault("scoreboard.4v4v4v4.playing", Arrays.asList("&e&lBED WARS", "&7%bw_date%", "", "&f%bw_next_event% in &a%bw_time%", "",
                "%bw_team_1%", "%bw_team_2%", "%bw_team_3%", "%bw_team_4%", "", "&fAsesinatos: &a%bw_kills%", "&fAsesinatos Finales: &a%bw_final_kills%", "&fCamas Destruidas: &a%bw_beds%", "", "&e%bw_server_ip%"));

        yml.addDefault(Messages.SCOREBOARD_LOBBY, Arrays.asList("&6&lBedWars,&4&lB&6&ledWars,&c&lB&4&le&6&ldWars,&6&lB&c&le&4&ld&6&lWars,&6&lBe&c&ld&4&lW&6&lars,&6&lBed&c&lW&4&la&6&lrs,&6&lBedW&c&la&4&lr&6&ls,&6&lBedWa&c&lr&4&ls,&6&lBedWar&c&ls,&6&lBedWars",
                "&fTu nivel: %bw_level%", "", "&fProgreso: &a%bw_current_xp%&7/&b%bw_required_xp%", "%bw_progress%", "", "&7%bw_player%", "", "&fDinero: &a%bw_money%", "", "&fVictorias totales: &a%bw_wins%", "&fAsesinatos totales: &a%bw_kills%", "", "&e%bw_server_ip%"));

        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TAB_PREFIX_SPECTATOR, List.of("&7"));
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TAB_SUFFIX_SPECTATOR, new ArrayList<>());
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TAB_PREFIX_RESTARTING, Arrays.asList("%bw_team_color%&l%bw_team_letter% &r%bw_team_color%", "%bw_team% ", "%bw_v_prefix% %bw_team_color%"));
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TAB_SUFFIX_RESTARTING, new ArrayList<>());
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TAB_PREFIX_PLAYING, Arrays.asList("%bw_team_color%&l%bw_team_letter% &r%bw_team_color%", "%bw_team% ", "%bw_v_prefix% %bw_team_color%&l%bw_team_letter% &r%bw_team_color%"));
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TAB_SUFFIX_PLAYING, new ArrayList<>());
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TAB_PREFIX_STARTING, List.of("%bw_v_prefix% "));
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TAB_SUFFIX_STARTING, new ArrayList<>());
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TAB_PREFIX_WAITING, List.of("%bw_v_prefix% "));
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TAB_SUFFIX_WAITING, new ArrayList<>());
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TAB_PREFIX_LOBBY, List.of("%bw_v_prefix% "));
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TAB_SUFFIX_LOBBY, new ArrayList<>());
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_DATE, "dd/MM/yy");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_GENERIC, "%bw_team_color%%bw_team_letter%&f %bw_team_name%: %bw_team_status%");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ELIMINATED, "&c&l✘");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_BED_DESTROYED, "&a%bw_players_remaining%");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ALIVE, "&a&l✓");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_NEXEVENT_TIMER, "mm:ss");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_YOUR_TEAM, "&7 TU'");
        yml.addDefault(Messages.FORMATTING_ACTION_BAR_TRACKING, "&fTracking: %bw_team% &f- Distance: %bw_distance%m");
        yml.addDefault(Messages.FORMATTING_BOSSBAR_DRAGON, "%bw_team% &7Dragon");
        yml.addDefault(Messages.FORMATTING_TEAM_WINNER_FORMAT, "      %bw_team_color%%bw_team_name% &7- %bw_winner_members%");
        yml.addDefault(Messages.FORMATTING_SOLO_WINNER_FORMAT, "                 %bw_team_color%%bw_team_name% &7- %bw_winner_members%");
        yml.addDefault(Messages.BED_HOLOGRAM_DEFEND, "&c&lDefiende tu cama!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_OWN_BED, "&cNo puedes destruir tu propia cama!");
        yml.addDefault(Messages.INTERACT_CANNOT_PLACE_BLOCK, "%bw_lang_prefix%&cNo puedes colocar bloques aqui!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_BLOCK, "%bw_lang_prefix%&cSolo puedes romper bloques puesto por jugadores!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT, "\n&f&lCAMA DESTRUIDA > La cama del equipo %bw_team_color%%bw_team_name% &7ha sido destruida por %bw_player_color%%bw_player%&7!\n");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_TITLE_ANNOUNCEMENT, "&cCAMA DESTRUÍDA!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_SUBTITLE_ANNOUNCEMENT, "&fYa no reaparecerás!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT_TO_VICTIM, "&f&lCAMA DESTRUIDA > &7Tu cama ha sido destruida por %bw_player_color%%bw_player%&7!");
        yml.addDefault(Messages.INTERACT_INVISIBILITY_REMOVED_DAMGE_TAKEN, "&cYa no eres invisible porque has recibido daño!");
        yml.addDefault(Messages.INTERACT_MAGIC_MILK_REMOVED, "&cYour Magic Milk wore off!");
        yml.addDefault(Messages.TEAM_ELIMINATED_CHAT, "\n&f&lEQUIPO ELIMINADO > El equipo %bw_team_color%%bw_team_name% &cha sido eliminado\n");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_REGULAR_KILL, "%bw_player_color%%bw_player% &7ha caído al vacio.");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_FINAL_KILL, "%bw_player_color%%bw_player% &7ha caído al vacio. &b&lMUERTE FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_REGULAR_KILL, "%bw_player_color%%bw_player% &7fue empujado al vacio por %bw_killer_color%%bw_killer_name%&7.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_FINAL_KILL, "%bw_player_color%%bw_player% &7fue empujado al vacio por %bw_killer_color%%bw_killer_name%&7. &b&lMUERTE FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_REGULAR_KILL, "%bw_player_color%%bw_player% &7fue empujado por %bw_killer_color%%bw_killer_name%&7.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_FINAL_KILL, "%bw_player_color%%bw_player% &7fue empujado por %bw_killer_color%%bw_killer_name%&7. &b&lMUERTE FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_REGULAR_KILL, "%bw_player_color%%bw_player% &7fue golpeado por una bomba por %bw_killer_color%%bw_killer_name%&7.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_FINAL_KILL, "%bw_player_color%%bw_player% &7fue golpeado por una bomba por %bw_killer_color%%bw_killer_name%&7. &b&lMUERTE FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_REGULAR_KILL, "%bw_player_color%%bw_player% &7fue asesinado por %bw_killer_color%%bw_killer_name%&7.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_FINAL_KILL, "%bw_player_color%%bw_player% &7fue asesinado por %bw_killer_color%%bw_killer_name%&7. &b&lMUERTE FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_REGULAR, "%bw_player_color%%bw_player% &7se ha desconectado mientras luchaba con %bw_killer_color%%bw_killer_name%&7.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_FINAL, "%bw_player_color%%bw_player% &7se ha desconectado mientras luchaba con %bw_killer_color%%bw_killer_name%&7. &b&lMUERTE FINAL!");
        yml.addDefault(Messages.BED_HOLOGRAM_DESTROYED, "&c&lTu cama ha sido destruida!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_TITLE, "&cHAS MUERTO!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_SUBTITLE, "&eReaparecerás en &c%bw_time% &esegundos!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_CHAT, "%bw_lang_prefix%&eReaparecerás en &c%bw_time% &esegundos!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWNED_TITLE, "&aHAS REAPARECIDO!");
        yml.addDefault(Messages.PLAYER_DIE_ELIMINATED_CHAT, "%bw_lang_prefix%&cHas sido eliminado!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWNED_TEXT, "%bw_lang_prefix%&eYou have respawned!");
        yml.addDefault(Messages.PLAYER_HIT_BOW, "%bw_lang_prefix%%bw_player% &7tiene &c%bw_damage_amount% &7de vida!");
        yml.addDefault(Messages.GAME_END_GAME_OVER_PLAYER_TITLE, "&c&lJUEGO FINALIZADO!");
        yml.addDefault(Messages.GAME_END_VICTORY_PLAYER_TITLE, "&6&lVICTORIA!");
        yml.addDefault(Messages.FORMATTING_EACH_WINNER, "%bw_player%");
        yml.addDefault(Messages.GAME_END_FIRST_KILLER, "%bw_player%");
        yml.addDefault(Messages.GAME_END_SECOND_KILLER, "%bw_player%");
        yml.addDefault(Messages.GAME_END_THIRD_KILLER, "%bw_player%");
        yml.addDefault(Messages.GAME_END_TOP_PLAYER_CHAT, Arrays.asList(
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &lBedWars", "", "%bw_winner_format%", "", "",
                "&e                          &l1st Killer &7- %bw_first_format% - %bw_first_kills%",
                "&6                          &l2nd Killer &7- %bw_second_format% - %bw_second_kills%",
                "&c                          &l3rd Killer &7- %bw_third_format% - %bw_third_kills%", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.GAME_END_TEAM_WON_CHAT, "%bw_lang_prefix%%bw_team_color%%bw_team_name% &aha ganado el juego!");
        yml.addDefault(Messages.MEANING_NOBODY, "Nadie");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER1, "I");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER2, "II");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER3, "III");
        yml.addDefault(Messages.GENERATOR_UPGRADE_CHAT_ANNOUNCEMENT, "%bw_lang_prefix%%bw_generator_type% Los generadores &ehan sido mejorados al nivel &c%bw_tier%");
        yml.addDefault(Messages.NPC_NAME_TEAM_UPGRADES.replace("%group%", "default"), "&bMEJORAS TEAM,&e&lCLICK DERECHO");
        yml.addDefault(Messages.NPC_NAME_SOLO_UPGRADES.replace("%group%", "default"), "&bMEJORAS SOLO,&e&lCLICK DERECHO");
        yml.addDefault(Messages.NPC_NAME_TEAM_SHOP.replace("%group%", "default"), "&bTIENDA,&e&lCLICK DERECHO");
        yml.addDefault(Messages.NPC_NAME_SOLO_SHOP.replace("%group%", "default"), "&bTIENDA,&e&lCLICK DERECHO");

        yml.addDefault(Messages.MEANING_FULL, "Lleno");
        yml.addDefault(Messages.MEANING_SHOUT, "global");
        yml.addDefault(Messages.MEANING_NOBODY, "Nadie");
        yml.addDefault(Messages.MEANING_NEVER, "Nunca");
        yml.addDefault(Messages.MEANING_IRON_SINGULAR, "de Hierro");
        yml.addDefault(Messages.MEANING_IRON_PLURAL, "de Hierro");
        yml.addDefault(Messages.MEANING_GOLD_SINGULAR, "de Oro");
        yml.addDefault(Messages.MEANING_GOLD_PLURAL, "de Oro");
        yml.addDefault(Messages.MEANING_EMERALD_SINGULAR, "Esmeralda");
        yml.addDefault(Messages.MEANING_EMERALD_PLURAL, "Esmeraldas");
        yml.addDefault(Messages.MEANING_DIAMOND_SINGULAR, "Diamante");
        yml.addDefault(Messages.MEANING_DIAMOND_PLURAL, "Diamantes");
        yml.addDefault(Messages.MEANING_VAULT_SINGULAR, "$");
        yml.addDefault(Messages.MEANING_VAULT_PLURAL, "$");
        yml.addDefault(Messages.MEANING_ENABLED, "&aEnabled");
        yml.addDefault(Messages.MEANING_DISABLED, "&cDisabled");

        yml.addDefault(Messages.COMMAND_JOIN_USAGE, "§a▪ §7Usa: /" + BedWars.mainCmd + " join §o<arena/grupo>");
        yml.addDefault(Messages.COMMAND_NOT_ALLOWED_IN_GAME, "%bw_lang_prefix%&cNo tienes permisos para hacer esto.");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_CLICK_TO_BUY, "&aClick para comprar!");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_INSUFFICIENT_MONEY, "&cNo tienes suficiente material de %bw_currency%");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_INSUFFICIENT_SPACE, "&eYou don't have enough inventory space to buy this item!");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_LOCKED, "&cBLOQUEADO");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_UNLOCKED, "&aDESBLOQUEADO");
        yml.addDefault("upgrades.Default.generators.tier1.name", "&eFundidor de Hierro");
        yml.addDefault("upgrades.Default.generators.tier1.lore", Arrays.asList("&7Incrementa la velocidad de aparicion de Hierro", "&7y Oro un 50%..", "", "&8Precio:&b %bw_cost% %bw_currency%", ""));
        yml.addDefault("upgrades.Default.generators.tier2.name", "&eFundidor de Oro");
        yml.addDefault("upgrades.Default.generators.tier2.lore", Arrays.asList("&7Incrementa la velocidad de aparicion de Hierro", "&7y Oro un 100%..", "", "&8Precio:&b %bw_cost% %bw_currency%", ""));
        yml.addDefault("upgrades.Default.generators.tier3.name", "&eFundidor de Esmeralda");
        yml.addDefault("upgrades.Default.generators.tier3.lore", Arrays.asList("&7Activa la aparicion de Esmeraldas del", "&7generador de tu equipo.", "", "&8Precio:&b %bw_cost% %bw_currency%", ""));
        yml.addDefault("upgrades.Default.maniacMiner.tier1.name", "&eMinero Maniaco");
        yml.addDefault("upgrades.Default.maniacMiner.tier1.lore", Arrays.asList("&7Todos los jugadores de tu quipo", "&7tendran permanentemente Apuro I", "", "&8Precio:&b %bw_cost% %bw_currency%", ""));
        yml.addDefault("upgrades.Default.sharpSword.tier1.name", "&eEspadas Afiladas");
        yml.addDefault("upgrades.Default.sharpSword.tier1.lore", Arrays.asList("&7Tu equipo consigue Filo I en", "&7todas las espadas!", "", "&8Precio:&b %bw_cost% %bw_currency%", ""));
        yml.addDefault("upgrades.Default.reinforced.tier1.name", "&eArmadura Reforzada");
        yml.addDefault("upgrades.Default.reinforced.tier1.lore", Arrays.asList("&7Tu equipo conseguira Proteccion I en", "&7en todas las armaduras!", "", "&8Precio:&b %bw_cost% %bw_currency%", ""));
        yml.addDefault("upgrades.Default.trap.tier1.name", "&eEs una trampa!");
        yml.addDefault("upgrades.Default.trap.tier1.lore", Arrays.asList("&7El proximo enemigo en entrar", "&7a tú base recibirá efecto", "&7v!", "", "&8Precio:&b %bw_cost% %bw_currency%", ""));
        yml.addDefault("upgrades.Default.miningFatigue.tier1.name", "&eTrampa de Fatiga Minera");
        yml.addDefault("upgrades.Default.miningFatigue.tier1.lore", Arrays.asList("&7El próximo enemigo en entrar a tú", "&7base recibirá Fatiga al minar", "&7por 10 segundos!", "", "&8Precio:&b %bw_cost% %bw_currency%", ""));
        yml.addDefault("upgrades.Default.healPool.tier1.name", "&ePiscina de Salud");
        yml.addDefault("upgrades.Default.healPool.tier1.lore", Arrays.asList("&7Crea una capsula de regeneracion", "&7alrededor de tu base!", "", "&8Precio:&b %bw_cost% %bw_currency%", ""));
        yml.addDefault(Messages.FORMATTING_DESPAWNABLE_UTILITY_NPC_HEALTH, "▮ ");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_REGULAR, "%bw_player_color%%bw_player% &7murió.");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_FINAL_KILL, "%bw_player_color%%bw_player% &7murió. &b&lASESINATO FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_REGULAR, "%bw_player_color%%bw_player% &7ha sido disparado por %bw_killer_color%%bw_killer_name%&7!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_FINAL_KILL, "%bw_player_color%%bw_player% &7ha sido disparado por %bw_killer_color%%bw_killer_name%&7! &b&lMUERTE FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_REGULAR, "%bw_player_color%%bw_player% &7&7fue asesinado por el BedBug de %bw_killer_color%%bw_killer_team_name%&7.");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_FINAL_KILL, "%bw_player_color%%bw_player% &7&7fue asesinado por el BedBug de %bw_killer_color%%bw_killer_team_name%&7. &b&lMUERTE FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_REGULAR, "%bw_player_color%%bw_player% &7fue asesinado por el Golem de %bw_killer_color%%bw_killer_team_name%&7.");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_FINAL_KILL, "%bw_player_color%%bw_player% &7fue asesinado por el Golem de %bw_killer_color%%bw_killer_team_name%&7. &b&lMUERTE FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_DIAMOND, "%bw_lang_prefix%&b+%bw_amount% %bw_meaning%");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_EMERALD, "%bw_lang_prefix%&a+%bw_amount% %bw_meaning%");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_IRON, "%bw_lang_prefix%&f+%bw_amount% %bw_meaning%");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_GOLD, "%bw_lang_prefix%&6+%bw_amount% %bw_meaning%");
        yml.addDefault(Messages.ARENA_MAX_BUILD_LIMIT_REACHED, "&cMax build height limit reached!");
        yml.addDefault(Messages.ARENA_MIN_BUILD_LIMIT_REACHED, "&cMin build height limit reached!");
        yml.addDefault(Messages.ARENA_FIREBALL_COOLDOWN, "&cPlease wait %bw_cooldown%s to use that again!");
        yml.addDefault(Messages.ARENA_IN_GAME_ANNOUNCEMENT, Arrays.asList("&c&lIf you get disconnected use /rejoin to join back in the game.", "&c&lCross-teaming is not allowed! Report cross-teamers using /report."));
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_REGULAR, "%bw_player_color%%bw_player% &7fue golpeado por una bomba.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_FINAL_KILL, "%bw_player_color%%bw_player% &7fue golpeado por una bomba. &b&lMUERTE FINAL!");
        yml.addDefault(Messages.PLAYER_STATS_GUI_INV_NAME, "&8%bw_player% Estadistícas");

        /* save default items messages for stats gui */
        addDefaultStatsMsg(yml, "wins", "&6Victorias", "&f%bw_wins%");
        addDefaultStatsMsg(yml, "losses", "&6Derrotas", "&f%bw_losses%");
        addDefaultStatsMsg(yml, "kills", "&6Asesinatos", "&f%bw_kills%");
        addDefaultStatsMsg(yml, "deaths", "&6Muertes", "&f%bw_deaths%");
        addDefaultStatsMsg(yml, "final-kills", "&6Asesinatos Finales", "&f%bw_final_kills%");
        addDefaultStatsMsg(yml, "final-deaths", "&6Muertes Finales", "&f%bw_final_deaths%");
        addDefaultStatsMsg(yml, "beds-destroyed", "&6Camas Destruidas", "&f%bw_beds%");
        addDefaultStatsMsg(yml, "first-play", "&6Primera Partida", "&f%bw_play_first%");
        addDefaultStatsMsg(yml, "last-play", "&6Ultima Partida", "&f%bw_play_last%");
        addDefaultStatsMsg(yml, "games-played", "&6Juegos Jugados", "&f%bw_games_played%");
        yml.addDefault(Messages.FORMATTING_STATS_DATE_FORMAT, "yyyy/MM/dd HH:mm");

        yml.addDefault(Messages.MEANING_NEVER, "Nunca");

        /* party commands */
        yml.addDefault(Messages.COMMAND_PARTY_HELP, Arrays.asList("&6▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&aComandos de Party:",
                "&e/party help &7- &bMuestra este mismo mensaje",
                "&e/party invite <player> &7- &bInvita a un jugador a tu party",
                "&e/party info &7- &bShow party members and owner",
                "&e/party promote <player> &7- &bTransfer party ownership",
                "&e/party leave &7- &bDeja tu actual party",
                "&e/party remove <player> &7- &bExpulsa a un jugador de tu party",
                "&e/party accept <player> &7- &bAcepta la invitacion a una party",
                "&e/party disband &7- &bRompe una party")
        );
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_USAGE, "%bw_lang_prefix%&eUso: &7/party invite <jugador>");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_PLAYER_OFFLINE, "%bw_lang_prefix%&7%bw_player% &eno está conectado!");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT, "%bw_lang_prefix%&eInvitación enviada a &7%bw_player%&6.");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT_TARGET_RECEIVE_MSG, "%bw_lang_prefix%&b%bw_player% &ete ha invitado a una party! &o&7(Click para aceptar)");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_CANNOT_INVITE_YOURSELF, "%bw_lang_prefix%&cNo puedes invitarte a ti mismo!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_NO_INVITE, "%bw_lang_prefix%&cNo hay mas solicitudes para aceptar.");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_ALREADY_IN_PARTY, "%bw_lang_prefix%&eYa estas en una party!");
        yml.addDefault(Messages.COMMAND_PARTY_INSUFFICIENT_PERMISSIONS, "%bw_lang_prefix%&cSolo el jefe de la party puede hacer eso!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_USAGE, "%bw_lang_prefix%&eUso: &7/party accept <jugador>");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_SUCCESS, "%bw_lang_prefix%&7%bw_player% &ese ha unido a la party!");
        yml.addDefault(Messages.COMMAND_PARTY_GENERAL_DENIED_NOT_IN_PARTY, "%bw_lang_prefix%&cTu no estas en una party!");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_DENIED_IS_OWNER_NEEDS_DISBAND, "%bw_lang_prefix%&cNo puedes dejar tu propia party!\n&eIntenta utilizando: &b/party disband");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_SUCCESS, "%bw_lang_prefix%&7%bw_player% &eha abandonado tu party!");
        yml.addDefault(Messages.COMMAND_PARTY_DISBAND_SUCCESS, "%bw_lang_prefix%&eHas roto la party!");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_USAGE, "%bw_lang_prefix%&7Usa: &e/party remove <jugador>");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_SUCCESS, "%bw_lang_prefix%&7%bw_player% &efue expulsado de tu party.");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_DENIED_TARGET_NOT_PARTY_MEMBER, "%bw_lang_prefix%&7%bw_player% &eno está en tu party!");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_SUCCESS, "%bw_lang_prefix%&eHas promovido exitosamente a %bw_player% a dueño");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_OWNER, "%bw_lang_prefix%&eHas sido promovido a dueño del grupo");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_NEW_OWNER, "%bw_lang_prefix%&7 &e%bw_player% ha sido promovido a dueño");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_OWNER, "\n%bw_lang_prefix%&eEl dueño del grupo es: &7%bw_party_owner%");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYERS, "%bw_lang_prefix%&eLos miembros del grupo son:");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYER, "&7%bw_player%");
        yml.addDefault(Messages.COMMAND_PARTY_CHAT_ENABLED_DISABLED, "&e&lPARTY &8&l┃ &fParty chat is now %bw_party_chat_status% &f!");
        yml.addDefault(Messages.NEXT_EVENT_BEDS_DESTROY, "&fBOOM Camas");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_II, "&fDiamante II");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_III, "&fDiamante III");
        yml.addDefault(Messages.NEXT_EVENT_DRAGON_SPAWN, "&fMuerte Súbita");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_II, "&fEsmeralda II");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_III, "&fEsmeralda III");
        yml.addDefault(Messages.NEXT_EVENT_GAME_END, "&4Fin del Juego");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_BEDS_DESTROYED, "&cCAMAS DESTRUIDAS!");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_BEDS_DESTROYED, "&fTodas las camas fueron destruidas!");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_BEDS_DESTROYED, "&c&Todas las camas fueron destruidas!");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_SUDDEN_DEATH, "&cMuerte súbita");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_SUDDEN_DEATH, "");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_SUDDEN_DEATH, "&cMUERTE SÚBITA: &6&b%bw_dragons_amount% %bw_team_color%%bw_team_name% Dragon!");
        yml.addDefault(Messages.COMMAND_NOT_FOUND_OR_INSUFF_PERMS, "%bw_lang_prefix%&cComando no encontrado o permisos insuficientes!");
        yml.addDefault(Messages.COMMAND_FORCESTART_NOT_IN_GAME, "§c▪ §7No estas jugando!");
        yml.addDefault(Messages.COMMAND_FORCESTART_SUCCESS, "§c▪ §7Cuenta regresiva comenzada!");
        yml.addDefault(Messages.COMMAND_FORCESTART_NO_PERM, "%bw_lang_prefix%&7Tu no puedes forzar el comienzo de la arena.\n§7Esta es una funcion que solo miembros staff pueden utilizar.");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_MSG, "%bw_lang_prefix%§6Estas ahora espectando la arena §9%bw_arena%§6.\n%bw_lang_prefix%§ePuedes dejar la arena en cualquier momento escribiendo §c/leave§e.");
        yml.addDefault(Messages.INTERACT_CHEST_CANT_OPEN_TEAM_ELIMINATED, "&cNo puedes abrir este cofre ya que el equipo ha sido totalmente eliminado!");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_NAME, "&lTransportador");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_NAME, "%bw_v_prefix%%bw_player%");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_LORE, Arrays.asList("&7Salud: &f%bw_player_health%%", "&7Comida: &f%bw_player_food%", "", "&7Click-Izquierdo para espectar al jugador."));
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_NAME, "&c&lRegresar al Lobby");
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_LORE, Collections.singletonList("&7Click-Derecho para regresar al lobby!"));
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_TITLE, "&Modo Espectador: &7%bw_player%");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_SUBTITLE, "&cSHIFT para salir");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_TITLE, "&eSalir del Modo Espectador");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_SUBTITLE, "");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_PLAYER_OFFLINE, "%bw_lang_prefix%&7%bw_player% &eno está conectado!");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_DENIED_MSG, "&cLos espectadores no están permitidos en esta arena!");

        yml.addDefault(Messages.ARENA_LEAVE_PARTY_DISBANDED, "%bw_lang_prefix%§cEl dueño de la party se fue y la party se disolvió!");
        yml.addDefault(Messages.XP_REWARD_PER_MINUTE, "%bw_lang_prefix%&6+%bw_xp% Experiencia de BedWars recibida (Tiempo de juego).");
        yml.addDefault(Messages.XP_REWARD_WIN, "%bw_lang_prefix%&6+%bw_xp% Experiencia de BedWars recibida (Victoria).");
        yml.addDefault(Messages.XP_REWARD_PER_TEAMMATE, "%bw_lang_prefix%&6+%bw_xp% Experiencia de BedWars recibida (Apoyo de equipo).");
        yml.addDefault(Messages.XP_REWARD_BED_DESTROY, "%bw_lang_prefix%&6+%bw_xp% Experiencia de BedWars recibida (Cama Destruida).");
        yml.addDefault(Messages.XP_REWARD_REGULAR_KILL, "%bw_lang_prefix%&6+%bw_xp% Experiencia de BedWars recibida (Asesinato).");
        yml.addDefault(Messages.XP_REWARD_FINAL_KILL, "%bw_lang_prefix%&6+%bw_xp% Experiencia de BedWars recibida (Asesinato Final).");

        yml.addDefault(Messages.MONEY_REWARD_PER_MINUTE, "%bw_lang_prefix%&6+%bw_money% Monedas (Tiempo de Juego).");
        yml.addDefault(Messages.MONEY_REWARD_WIN, "%bw_lang_prefix%&6+%bw_money% Monedas (Ganar Partida).");
        yml.addDefault(Messages.MONEY_REWARD_PER_TEAMMATE, "%bw_lang_prefix%&6+%bw_money% Monedas (Soporte al Equipo).");
        yml.addDefault(Messages.MONEY_REWARD_BED_DESTROYED, "%bw_lang_prefix%&6+%bw_money% Monedas (Cama Destruida).");
        yml.addDefault(Messages.MONEY_REWARD_FINAL_KILL, "%bw_lang_prefix%&6+%bw_money% Monedas (Asesinato Final).");
        yml.addDefault(Messages.MONEY_REWARD_REGULAR_KILL, "%bw_lang_prefix%&6+%bw_money% Monedas (Asesinato).");

        //shop
        yml.addDefault(Messages.SHOP_INDEX_NAME, "&8Compra rapida");
        yml.addDefault(Messages.SHOP_QUICK_ADD_NAME, "&8Agregando a la Compra Rápida...");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_MONEY, "%bw_lang_prefix%&cNo tienes suficiente %bw_currency%! Necesitas %bw_amount% mas!");
        yml.addDefault(Messages.SHOP_NEW_PURCHASE, "%bw_lang_prefix%&aCompraste &6%bw_item%");
        yml.addDefault(Messages.SHOP_ALREADY_BOUGHT, "%bw_lang_prefix%&cYa lo has comprado!");
        yml.addDefault(Messages.SHOP_ALREADY_HIGHER_TIER, "%bw_lang_prefix%&cYou already have a higher tier item.");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_SILVERFISH_NAME, "%bw_team_color%&l%bw_team_name% &r%bw_team_color%Silverfish");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_IRON_GOLEM_NAME, "%bw_team_color%%bw_despawn_time%s &8[ %bw_team_color%%bw_health%&8]");
        yml.addDefault(Messages.SHOP_SEPARATOR_NAME, "&8⇧ Categorías");
        yml.addDefault(Messages.SHOP_SEPARATOR_LORE, Collections.singletonList("&8⇩ Items"));
        yml.addDefault(Messages.SHOP_QUICK_BUY_NAME, "&bCompra Rápida");
        yml.addDefault(Messages.SHOP_QUICK_BUY_LORE, new ArrayList<>());
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_NAME, "&cSlot vacío!");
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_LORE, Arrays.asList(
                "&7Esto es un slot de compra rápida!",
                "&bAgachate y haz click en &7cualquier item",
                "&7en la tienda para añadirlo aquí."));
        yml.addDefault(Messages.SHOP_CAN_BUY_COLOR, "&a");
        yml.addDefault(Messages.SHOP_CANT_BUY_COLOR, "&c");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CAN_BUY, "&eClick para comprar!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CANT_AFFORD, "&cNo tienes suficiente %bw_currency%!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_MAXED, "&aAL MÁXIMO!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_ARMOR, "&aEQUIPADO!");
        yml.addDefault(Messages.SHOP_LORE_QUICK_ADD, "&bAgachate y haz click en un item para añadirlo a la Compra Rápida!");
        yml.addDefault(Messages.SHOP_LORE_QUICK_REMOVE, "&bAgachate y haz click en un item para removerlo de la Compra Rápida!");


        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "&8Bloques", "&aBloques", Collections.singletonList("&eClick to view!"));

        addContentMessages(yml, "wool", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "%bw_color%Lana", Arrays.asList("&7Precio: &f%bw_cost% %bw_currency%", "", "&7Genial para cruzar", "&7islas. Se convierte en el color de tu equipo.",
                "&7tu equipo.", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "clay", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "%bw_color%Arcilla", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "&7Bloque básico para defender tu cama.", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "glass", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "%bw_color%Cristan Anti Explosiones", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "&7Inmune a explosiones.", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "stone", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "%bw_color%End Stone", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "&7Bloque sólido para defender tu cama.", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "ladder", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "%bw_color%Escalera", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "&7Útil para salvar gatos atrapados en", "&7arboles.", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "obsidian", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "%bw_color%Obsidiana", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "&7Protección extrema para tu cama.", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "wood", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "%bw_color%Madera", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "&7Bloque sólido para defender tu cama", "", "%bw_quick_buy%", "%bw_buy_status%"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_MELEE, "&8Espada", "&aEspada", Collections.singletonList("&eClick para ver!"));

        addContentMessages(yml, "stone-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "%bw_color%Espada de piedra", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "iron-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "%bw_color%Espada de hierro", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "diamond-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "%bw_color%Espada de diamante", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "stick", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "%bw_color%Palo (KnockBack I)", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "%bw_quick_buy%", "%bw_buy_status%"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "&8Armadura", "&aArmadura", Collections.singletonList("&eClick para ver!"));

        addContentMessages(yml, "chainmail", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "%bw_color%Armadura de malla permanente", Arrays.asList("&7Precio: %bw_cost% %bw_currency%",
                "", "&7Botas y pantalones de cota de malla", "&7con las que siempre reapacerás", "&7con ella.", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "iron-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "%bw_color%Armadura de hierro permanente", Arrays.asList("&7Precio: %bw_cost% %bw_currency%",
                "", "&7Botas y pantalones de hierro", "&7con las que siempre reapacerás", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "diamond-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "%bw_color%Armadura de diamante permanente", Arrays.asList("&7Precio: %bw_cost% %bw_currency%",
                "", "&7Botas y pantalones de diamante", "&7con las que siempre reaparecerás", "", "%bw_quick_buy%", "%bw_buy_status%"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "&8Herramientas", "&aHerramientas", Collections.singletonList("&eClick para ver!"));

        addContentMessages(yml, "shears", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "%bw_color%Tijeras permanentes", Arrays.asList("&7Precio: %bw_cost% %bw_currency%",
                "", "&7Geniales para deshacerte de la lana. Siempre", "&7reapareceras con estas tijeras.", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "pickaxe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "%bw_color%Pico %bw_tier%", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "&7Nivel: &e%bw_tier%",
                "", "&7Esto es un item mejorable.", "&7Perderas un nivel cuando.", "&7mueras!", "", "&7Reaparecerás permanentemente", "&7con almenos el nivel menor.", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "axe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "%bw_color%Hacha %bw_tier%", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "&7Tier: &e%bw_tier%",
                "", "&7Esto es un item mejorable.", "&7Perderas un nivel cuando.", "&7mueras!", "", "&7Reaparecerás permanentemente", "&7con almenos el nivel menor.", "", "%bw_quick_buy%", "%bw_buy_status%"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_RANGED, "&8A distancia", "&aA distancia", Collections.singletonList("&eClick para ver!"));

        addContentMessages(yml, "arrow", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "%bw_color%Flechas", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "bow1", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "%bw_color%Arco", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "bow2", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "%bw_color%Arco (Poder I)", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "bow3", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "%bw_color%Arco (Poder I, Golpeo I)", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "%bw_quick_buy%", "%bw_buy_status%"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "&8Pociones", "&aPociones", Collections.singletonList("&eClick para ver!"));

        addContentMessages(yml, "speed-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "%bw_color%Poción de Velocidad II (45 segundos)", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "jump-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "%bw_color%Poción de Salto V (45 segundos)", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "invisibility", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "%bw_color%Poción de Invisibilidad (30 segundos)", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "%bw_quick_buy%", "%bw_buy_status%"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "&8Especiales", "&aEspeciales", Collections.singletonList("&eClick para ver!"));

        addContentMessages(yml, "golden-apple", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "%bw_color%Manzana de Oro", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "&7Curación completa.", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "bedbug", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "%bw_color%BedBug", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "&7Aparece un silverfish donde la",
                "&7bola de nieve caiga para distraer a tus", "&7enemigos. Dura 15 segundos.", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "dream-defender", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "%bw_color%Defensor de los Sueños", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "&7Golem de Hierro para ayudarte a defender tu",
                "&7base. Dura 4 minutos.", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "fireball", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "%bw_color%Fireball", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "&7Click-Derecho para lanzar! Genial para",
                "&7derribar a enemigos en", "&7puentes finos", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "tnt", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "%bw_color%TNT", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "&7Se activa instantaneamente, apropiado",
                "&7para explotar cosas!", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "ender-pearl", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "%bw_color%Ender Pearl", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "&7La forma más rápida para invadir",
                "&7enemigas.", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "water-bucket", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "%bw_color%Cubo de Agua", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "&7Genial para ralentizar a enemigos",
                "&7enemigos. Puedes protegerte", "&7de TNT.", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "bridge-egg", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "%bw_color%Puente Huevo", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "&7Este huevo crea un puente en se",
                "&7recorrido.", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "magic-milk", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "%bw_color%Leche Magica", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "&7Evita cualquier trampa durante",
                "&7segundos despues de consumirla.", "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "sponge", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "%bw_color%Esponja", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "&7Genial para absorber agua.",
                "", "%bw_quick_buy%", "%bw_buy_status%"));
        addContentMessages(yml, "tower", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "%bw_color%Torre Compacta", Arrays.asList("&7Precio: %bw_cost% %bw_currency%", "", "&7Pon una torre compacta", "&7como defensa!", "", "%bw_quick_buy%", "%bw_buy_status%"));




        /* Lobby Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "stats"), "&lEstadistícas");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "stats"), Arrays.asList("&7Utiliza este objeto para", "&7ver tus estadísticas."));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "arena-selector"), "&eJugar");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "arena-selector"), Arrays.asList("&7Utiliza este objeto para", "&7seleccionar tu arena y jugar"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "leave"), "&c&lSalir");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "leave"), Arrays.asList("&7Utiliza este objeto para", "&7regresar al lobby."));
        /* Pre Game Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "stats"), "&lEstadistícas");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "stats"), Arrays.asList("&7Utiliza este objeto para", "&7ver tus estadísticas."));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "leave"), "&c&lSalir");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "leave"), Arrays.asList("&7Utiliza este objeto para", "&7regresar al lobby."));
        /* Spectator Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "teleporter"), "&eTeletransportarse");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_LORE.replace("%path%", "teleporter"), Arrays.asList("&7Utiliza este objeto para", "&7transportarte a usuarios."));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "leave"), "&c&lSalir");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_LORE.replace("%path%", "leave"), Arrays.asList("&7Utiliza este objeto para", "&7regresar al lobby."));

        yml.addDefault(Messages.COMMAND_COOLDOWN, "&cNo puedes hacer eso aún! Espera %bw_seconds% segundos más!");
        yml.addDefault(Messages.COMMAND_SHOUT_DISABLE_SOLO, "&cShouting is disabled in Solo!");
        yml.addDefault(Messages.COMMAND_LEAVE_STARTED, "&a&lTeleporting you to the lobby in %bw_leave_delay% seconds... Right-click again to cancel the teleport!");
        yml.addDefault(Messages.COMMAND_LEAVE_CANCELED, "&c&lTeleport cancelled!");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_TEAM, "%bw_team_color%[%bw_team_name%]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SHOUT, "&6[GRITA]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SPECTATOR, "&7[ESPECTADOR]");
        yml.addDefault(Messages.ARENA_JOIN_DENIED_SELECTOR, "%bw_lang_prefix%&cLo lamentamos, pero no puedes ingresar a esta arena por el momento. Usa Click-Derecho para entrar en modo espectador!");
        yml.addDefault(Messages.ARENA_SPECTATE_DENIED_SELECTOR, "%bw_lang_prefix%&cLo lamentamos, pero no puedes espectar esta arena en este momento. Utiliza Click-Izquierdo para jugar!");
        yml.addDefault(Messages.ARENA_JOIN_DENIED_NO_PROXY, "&cLo siento, pero debes unirte a una arena usando BedWarsProxy. \n&eSi desea configurar una arena, asegúrese de otorgarse el permiso bw.setup para que pueda unirse al servidor directamente!");
        yml.addDefault(Messages.ARENA_JOIN_DENIED_NO_TIME, "&cSorry but you joined while the game was already started.");
        yml.addDefault(Messages.REJOIN_NO_ARENA, "%bw_lang_prefix%&cNo hay arena a la cual unirse. Recuerda que sólo puedes ingresar a una 5 minutos después del comienzo de la partida!");
        yml.addDefault(Messages.REJOIN_DENIED, "%bw_lang_prefix%&cNo puedes unirte a esa partida. El juego ha terminado o tu cama ha sido destruida.");
        yml.addDefault(Messages.REJOIN_ALLOWED, "%bw_lang_prefix%&eHas ingresado nuevamente a &a%bw_arena%&e!");

        yml.addDefault(Messages.MEANING_NO_TRAP, "Sin trampas!");
        yml.addDefault(Messages.FORMAT_UPGRADE_TRAP_COST, "&7Precio: %bw_currency_color%%bw_cost% %bw_currency%");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CAN_AFFORD, "&e");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CANT_AFFORD, "&c");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_UNLOCKED, "&a");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_LOCKED, "&7");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_UNLOCKED, "&a");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_CLICK_TO_BUY, "%bw_color%Click para comprar!");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_LOCKED, "&cBLOQUEADO");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_UNLOCKED, "%bw_color%DESBLOQUEADO");
        yml.addDefault(Messages.UPGRADES_UPGRADE_BOUGHT_CHAT, "&a%bw_player% compró &6%bw_item%");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("%bw_name%", "forge").replace("%bw_tier%", "tier-1"), "%bw_color%Forja de Hierro");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("%bw_name%", "forge"),
                Arrays.asList("&7Incrementa la aparición de los", "&7recursos de tu isla.", "", "{tier_1_color}Nivel 1: +50% de Recursos, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Nivel 2: +100% de Recursos, &b{tier_2_cost} {tier_2_currency}",
                        "{tier_3_color}Nivel 3: Aparecen esmeraldas, &b{tier_3_cost} {tier_3_currency}",
                        "{tier_4_color}Nivel 4: +200% de Recursos, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("%bw_name%", "forge").replace("%bw_tier%", "tier-2"), "%bw_color%Forja de Oro");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("%bw_name%", "forge").replace("%bw_tier%", "tier-3"), "%bw_color%Forja de Esmeraldas");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("%bw_name%", "forge").replace("%bw_tier%", "tier-4"), "%bw_color%Forja Fundida");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_NAME_PATH + "traps", "&eCompra una trampa");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_LORE_PATH + "traps", Arrays.asList("&7Las trampas compradas serán", "&7guardadas en la cola.", "", "&eClick para navegar!"));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("%bw_name%", "swords").replace("%bw_tier%", "tier-1"), "%bw_color%Espadas afiladas");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("%bw_name%", "swords"),
                Arrays.asList(
                        "&7Tu equipo gana permanentemente",
                        "&7Filo I en todas las espadas y",
                        "&7hachas!",
                        "",
                        "{tier_1_color}Precio: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("%bw_name%", "armor").replace("%bw_tier%", "tier-1"), "%bw_color%Armadura Reforzada I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("%bw_name%", "armor"),
                Arrays.asList("&7Tu equipo gana permanentemente",
                        "&7Protección en todas las piezas!",
                        "&7de armadura", "", "{tier_1_color}Nivel 1: Protección I, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Nivel 2: Protección II, &b{tier_2_cost} {tier_2_currency}s",
                        "{tier_3_color}Nivel 3: Protección III, &b{tier_3_cost} {tier_3_currency}",
                        "{tier_4_color}Nivel 4: Protección IV, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("%bw_name%", "armor").replace("%bw_tier%", "tier-2"), "%bw_color%Armadura Reforzada II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("%bw_name%", "armor").replace("%bw_tier%", "tier-3"), "%bw_color%Armadura Reforzada III");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("%bw_name%", "armor").replace("%bw_tier%", "tier-4"), "%bw_color%Armadura Reforzada IV");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("%bw_name%", "miner").replace("%bw_tier%", "tier-1"), "%bw_color%Minero Maniaco I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("%bw_name%", "miner"),
                Arrays.asList("&7Todos los miembros de tu equipo ganarán", "&7Prisa Minera permanentemente.", "", "{tier_1_color}Nivel 1: Prisa I, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_1_color}Nivel 2: Prisa II, &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("%bw_name%", "miner").replace("%bw_tier%", "tier-2"), "%bw_color%Minero Maniaco II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("%bw_name%", "heal-pool").replace("%bw_tier%", "tier-1"), "%bw_color%Piscina de curación");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("%bw_name%", "heal-pool"),
                Arrays.asList("&7Crea un campo de regeneración", "&7alrededor de tu base!", "", "{tier_1_color}Precio: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("%bw_name%", "dragon").replace("%bw_tier%", "tier-1"), "%bw_color%Dragon Buff");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("%bw_name%", "dragon"),
                Arrays.asList(
                        "&7Tu equipo tendrá 2 dragones",
                        "&7en vez de uno durante la!",
                        "&7pelea final",
                        "","{tier_1_color}Precio: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "glass", "&8⬆&7Comprable");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "glass", Collections.singletonList("&8⬇&7Cola de Trampas"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "first", "%bw_color%Trampa #1: %bw_name%");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "first", Arrays.asList("&7El primer enemigo en caminar", "&7en tu base activara", "&7esta trampa!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "first",
                Arrays.asList(
                        "",
                        "&7Comprar una trampa lo pondrá",
                        "&7aquí. Su precio irá subiendo",
                        "&7basado en el número de trampas",
                        "&7listadas.",
                        "", "&7Trampa Siguiente: &b%bw_cost% %bw_currency%"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "second", "%bw_color%Trampa #2: %bw_name%");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "second", Arrays.asList(
                "&7El segundo enemigo en entrar a tu base",
                "&7activará esta trampa"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "second",
                Arrays.asList(
                        "",
                        "&7Comprar una trampa lo pondrá",
                        "&7aquí. Su precio irá subiendo",
                        "&7basado en el número de trampas",
                        "&7listadas.",
                        "",
                        "&7Trampa Siguiente: &b%bw_cost% %bw_currency%"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "third", "%bw_color%Trampa #3: %bw_name%");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "third", Arrays.asList(
                "&7El tercer enemigo en entrar a tu base",
                "&7activará esta trampa"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "third",
                Arrays.asList(
                        "",
                        "&7Comprar una trampa lo pondrá",
                        "&7aquí. Su precio irá subiendo",
                        "&7basado en el número de trampas",
                        "&7listadas.",
                        "",
                        "&7Trampa Siguiente: &b%bw_cost% %bw_currency%"));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "1", "%bw_color%Es una trampa!");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "1", Arrays.asList(
                "&7Inflinge Cegera y Lentitud",
                "&7por 5 segundos.",
                ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "2", "%bw_color%Trampa de contraofensiva");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "2", Arrays.asList(
                "&7Da Velocidad I durante 15 segundos",
                "&7a los jugadores aliados cerca de.",
                "&7tu base",
                ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "3", "%bw_color%Trampa de alarma");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "3", Arrays.asList(
                "&7Revela a los jugadores invisibles",
                "&7y también su nombre y equipo.",
                ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "4", "%bw_color%Trampa de fatiga minera");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "4", Arrays.asList(
                "&7Inflinje fatiga minera durante",
                "&715 segundos.",
                ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "back", "&aAtrás");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "back", Collections.singletonList("&7A actualizaciones y trampas"));
        yml.addDefault(Messages.UPGRADES_CATEGORY_GUI_NAME_PATH + "traps", "&8Añade una trampa");
        yml.addDefault(Messages.UPGRADES_TRAP_QUEUE_LIMIT, "&cTrampas llenas!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_MSG, "&c&lLa trampa %bw_trap% fue activada!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_TITLE, "&cTRAMPA ACTIVADA!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_SUBTITLE, "&fTu %bw_trap% ha sido activada!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_MSG + "3", "&c&lTrampa activada por &7&l%bw_player% &c&ldel equipo %bw_color%&l%bw_team%!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_TITLE + "3", "&c&lALARMA!!!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_SUBTITLE + "3", "&fTrampa de alarma activada por el equipo %bw_color%%bw_team%&f!");
        yml.addDefault(Messages.UPGRADES_UPGRADE_ALREADY_CHAT, "&cYou already unlocked this upgrade!");
        save();
        setPrefix(m(Messages.PREFIX));
        setPrefixStatic(m(Messages.PREFIX));
    }
}
