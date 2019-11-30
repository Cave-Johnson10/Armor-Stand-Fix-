package me.Kurumi;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ArmorStandFix extends JavaPlugin {

    public void onEnable(){
        Bukkit.getPluginManager().registerEvents(new OnInteract(), this);

    }
}
