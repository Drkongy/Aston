package me.drkony.aston.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ping implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;



        if(strings.length == 0 ){
            int pp = ((Player) p.getPlayer()).getPing();
            if(pp <= 30){
                p.sendMessage(ChatColor.GREEN + "Ping: " + ChatColor.DARK_GREEN + pp);

            }else if (pp > 30 && pp <= 100){
                p.sendMessage(ChatColor.GREEN + "Ping: " + ChatColor.GREEN+ pp);

            }else if (pp > 100 && pp <= 500){
                p.sendMessage(ChatColor.GREEN + "Ping: " + ChatColor.GOLD+ pp);

            }else{
                p.sendMessage(ChatColor.GREEN + "Ping: " + ChatColor.RED + pp);
            }
        }else {
            Player Target = Bukkit.getPlayerExact(strings[0]);
            if(Target instanceof Player){
                int pp = ((Player) Target.getPlayer()).getPing();
                if(pp <= 30){
                    p.sendMessage(ChatColor.GREEN + Target.getDisplayName() + "'s Ping: " + ChatColor.DARK_GREEN + pp);

                }else if (pp > 30 && pp <= 100){
                    p.sendMessage(ChatColor.GREEN + Target.getDisplayName() + "'s Ping: " + ChatColor.GREEN+ pp);

                }else if (pp > 100 && pp <= 500){
                    p.sendMessage(ChatColor.GREEN + Target.getDisplayName() + "'s Ping: "  + ChatColor.GOLD+ pp);

                }else{
                    p.sendMessage(ChatColor.GREEN + Target.getDisplayName() + "'s Ping: "  + ChatColor.RED + pp);
                }
            }else {
                p.sendMessage(ChatColor.GREEN + "This player doesn't exist twat!");
            }
        }







        return true;
    }




}
