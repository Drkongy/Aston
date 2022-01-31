package me.drkony.aston.Commands;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class test implements CommandExecutor {
    String configTest;
    public test(String t){
        configTest = t;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if(sender instanceof Player){
            Player p = (Player) sender;
            if(p.hasPermission("Aston.test")){

                p.sendMessage("I like that lad");
                p.sendMessage(configTest);
            }else{
                p.sendMessage("You need to be opped to do tests.");
                System.out.println(p.getDisplayName() +  " Tried to use the test command");
            }

        }

        return true;
    }
}
