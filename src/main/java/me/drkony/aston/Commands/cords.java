package me.drkony.aston.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class cords implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        Player player = (Player) sender;

        if (strings.length == 0) {
            int x = player.getLocation().getBlockX();
            int y = player.getLocation().getBlockY();
            int z = player.getLocation().getBlockZ();
            String w = player.getLocation().getWorld().getName();
            player.sendMessage(ChatColor.GREEN + "Your current co-ordinates are: x: " + x + "  y: " + y + "  z: " + z  + " World: " + w);

        }else{
            if (player.hasPermission("Aston.cords")) {
                Player Target = Bukkit.getPlayerExact(strings[0]);
                if (Target instanceof Player) {
                    int x = Target.getLocation().getBlockX();
                    int y = Target.getLocation().getBlockY();
                    int z = Target.getLocation().getBlockZ();
                    String w = Target.getLocation().getWorld().getName();

                    player.sendMessage(ChatColor.GREEN + Target.getDisplayName()+"'s co-ordinates are: x: " + x + "  y: " + y + "  z: " + z  + " World: " + w);
                }else {
                    player.sendMessage(ChatColor.GREEN + "Player does not exist twat!");
                }


            } else {
                player.sendMessage(ChatColor.GREEN +"No perms to see players location!");
                System.out.println(player.getDisplayName() +  " Tried to use the cords command");
            }

        }






        return true;
    }

}

