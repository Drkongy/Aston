package me.drkony.aston;

import me.drkony.aston.Commands.*;
import me.drkony.aston.Listeners.JoinLeaveListener;
import me.drkony.aston.Listeners.playerDeath;
import me.drkony.aston.PlayerData.playerPlayTime;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;



public final class Aston extends JavaPlugin implements Listener {

    public playerPlayTime ptData;





    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Aston Has Started!");
        long LST = System.currentTimeMillis();  // last start time

        this.ptData = new playerPlayTime(this);



        //listeners
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
        getServer().getPluginManager().registerEvents(new playerDeath(), this);

        //commands

        getCommand("test").setExecutor(new test(getConfig().getString("test")));
        getCommand("uptime").setExecutor(new uptime(LST));
        getCommand("ping").setExecutor(new ping());
        getCommand("info").setExecutor(new info());
        getCommand("cords").setExecutor(new cords());
        getCommand("banana").setExecutor(new banana());
        getCommand("playtime").setExecutor(new playtime());




    }
}
