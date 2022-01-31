package me.drkony.aston.PlayerData;

import me.drkony.aston.Aston;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;

public class playerPlayTime {
    private Aston plugin;
    private FileConfiguration ptDataConfig = null;
    private  File ptf = null;

    public playerPlayTime(Aston plugin){
        this.plugin = plugin;
        // saves / initialises the config
        saveDefaultConfig();
    }



    public void reloadConfig(){
        if(this.ptf == null){
            this.ptf  = new File(this.plugin.getDataFolder(), "ptData.yml");

        }

        this.ptDataConfig = YamlConfiguration.loadConfiguration(this.ptf);
        InputStream defaultStream = this.plugin.getResource("ptData.yml");
        if(defaultStream != null){
            YamlConfiguration defaultConfig = YamlConfiguration.loadConfiguration(new InputStreamReader(defaultStream));
            this.ptDataConfig.setDefaults(defaultConfig);
        }
    }

    public FileConfiguration getConfig(){
        if(this.ptDataConfig == null){
            reloadConfig();
        }
        return this.ptDataConfig;

    }

    public void saveConfig() throws IOException {
        if(this.ptDataConfig == null || this.ptf == null){
            return;

        }
        try{
            this.getConfig().save(this.ptf);
        }catch (IOException e){
            plugin.getLogger().log(Level.SEVERE, "could not save config " + this.ptf, e);
        }

    }

    public void saveDefaultConfig(){
        if(this.ptf == null){
            this.ptf = new File(this.plugin.getDataFolder(), "ptData.yml");
        }

        if(!this.ptf.exists()){
            this.plugin.saveResource("ptData.yml", false);
        }
    }


}
