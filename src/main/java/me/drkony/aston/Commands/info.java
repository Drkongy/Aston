package me.drkony.aston.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class info implements CommandExecutor {


    //to get the thing below just write on.

    @Override
    public boolean onCommand(CommandSender Sender, Command command, String s, String[] strings) {

        Player p = (Player) Sender;
        p.sendMessage(ChatColor.GREEN + "This is a small plugin made by zeeshan that has simple commands to help make running the server smoother.");
        p.sendMessage(ChatColor.GREEN + "Discord: Drkong#9054");

        return true;
    }
}
