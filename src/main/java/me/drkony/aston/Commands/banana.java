package me.drkony.aston.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class banana implements CommandExecutor {
    public int bananaCount = 0;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        Player p = (Player) sender;
        if(p.hasPermission("Aston.banana")){
            bananaCount++;
            p.sendMessage("Bananas: " + bananaCount);
        }else {
            p.sendMessage(ChatColor.GREEN + "You don't have perms to use this command.");
            System.out.println(p.getDisplayName() +  " Tried to use the banana command");

        }




        return true;
    }
}
