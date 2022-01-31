package me.drkony.aston.Listeners;

import me.drkony.aston.Aston;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class playerDeath implements Listener {



    @EventHandler
    public void playerDeath(PlayerDeathEvent event){

        Player player = event.getEntity().getPlayer();

        String w = event.getEntity().getPlayer().getLocation().getWorld().getName();


        double x = event.getEntity().getPlayer().getLocation().getBlockX();
        double y = event.getEntity().getPlayer().getLocation().getBlockY();
        double z = event.getEntity().getPlayer().getLocation().getBlockZ();



        player.sendMessage(ChatColor.BOLD + "" + ChatColor.BLUE + "Don't worry lad, Zeeshan saved your cords : ");
        player.sendMessage(ChatColor.BOLD + "" + ChatColor.BLUE + "World:  " + w);
        player.sendMessage(ChatColor.BOLD + "" + ChatColor.BLUE + "X: " + x + " Y: " + y + " Z: " + z);

        System.out.println("ASTON DEATH LOGGER :   " + player.getDisplayName() + " died in: " + w + " at: " + x + ", " + y + ", " + z );

    }

}
