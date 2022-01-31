package me.drkony.aston.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class uptime implements CommandExecutor {
    private long startTime;
    public uptime(long serverStartTime){
        startTime = serverStartTime/1000;
    }





    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        long currentTime = System.currentTimeMillis() / 1000;
        long uptime = currentTime - startTime;
        //int uptime = Math.toIntExact(currentTime) - Math.toIntExact(startTime);


        long seconds = uptime % 60;
        long  minutes = (uptime / 60) % 60;
        long hours = (uptime / 3600) % 24;
        long days = uptime / 86400;


        if(sender instanceof Player){
            Player p = (Player) sender;


            if(minutes == 0){
                p.sendMessage(ChatColor.GREEN + "Uptime: " + seconds + " Seconds.");
            }else if(hours == 0) {
                p.sendMessage(ChatColor.GREEN + "Uptime: " + minutes + " minutes and " + seconds + " Seconds.");
            }else if(days == 0){
                p.sendMessage(ChatColor.GREEN + "Uptime: "  +hours+ " hours, " + minutes + " minutes and " + seconds + " Seconds.");
            }else {
                p.sendMessage(ChatColor.GREEN + "Uptime: " + days + " days, " +hours+ " hours, " + minutes + " minutes and " + seconds + " Seconds.");
            }




        }
        return true;
    }
}
