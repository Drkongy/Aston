package me.drkony.aston.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.List;

public class JoinLeaveListener implements Listener {
    @EventHandler
    public void onLeave(PlayerQuitEvent e){
        Player player = e.getPlayer();

        e.setQuitMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + player.getDisplayName() + " is gone （︶^︶） come back bro... I need you..." + ChatColor.RESET);

    }
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        if (player.hasPlayedBefore()) {
            event.setJoinMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "Welcome Back " + player.getDisplayName() + "  ( ﾉ ﾟｰﾟ)ﾉ");
        } else {
            event.setJoinMessage(ChatColor.BLUE + "" + ChatColor.BOLD + "Welcome to Aston 1st Year Minecraft server " + player.getDisplayName() + ", Thanks for joining" + ChatColor.DARK_RED + " <3");
        }
    }


}
