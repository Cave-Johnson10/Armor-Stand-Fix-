package me.Kurumi;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class ArmorStandFix extends JavaPlugin {
FileConfiguration config = this.getConfig();



    public void onEnable(){
        this.saveDefaultConfig();
        config.addDefault("Type", "rename");
        Bukkit.getPluginManager().registerEvents(new OnInteract(), this);


    }
    public FileConfiguration getAConfig(){
        return config;
    }
}
