package me.drkony.aston.Commands;

import me.drkony.aston.Aston;
import me.drkony.aston.PlayerData.playerPlayTime;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.IOException;

public class playtime implements CommandExecutor {
    public playerPlayTime data;


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {




        this.data = new playerPlayTime(new Aston());
        Player p = (Player) commandSender;
        data.saveDefaultConfig();

//        int PT = 0;
//        if(this.data.getConfig().contains("players." + p.getUniqueId().toString() + ".PlayTime")){
//            PT = this.data.getConfig().getInt("players." + p.getUniqueId().toString() + ".PlayTime");
//        }
//        data.getConfig().set("players." + p.getUniqueId().toString() + ".PlayTime", (PT+1));
//
//
//        try {
//            data.saveConfig();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        p.sendMessage(ChatColor.GREEN + "This is a test!");

























        return true;
    }
}
