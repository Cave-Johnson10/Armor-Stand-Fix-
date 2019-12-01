package me.Kurumi;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import me.Kurumi.ArmorStandFix;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

public class OnInteract implements Listener {
    Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("ArmorStandFix");
    FileConfiguration config = plugin.getConfig();

    @EventHandler
    public void OnInteract(PlayerInteractEntityEvent event){

        Player p = event.getPlayer();
        Entity e = event.getRightClicked();
        PlayerInventory inv = p.getInventory();
        if(inv.getItemInMainHand().getType() == Material.NAME_TAG){
                if(e instanceof ArmorStand){
                 if(config.getString("Type").equalsIgnoreCase("rename")) {
                     String n = inv.getItemInMainHand().getItemMeta().getDisplayName();
                     e.setCustomNameVisible(true);
                     e.setCustomName(n);
                 }
                 if(config.getString("Type").equalsIgnoreCase("cancel")){
                    // String n = e.getCustomName();
                    // e.setCustomName(n);


                     //ItemStack nameTag = inv.getItemInMainHand();
                     //ItemMeta metaNameTag = nameTag.getItemMeta();
                    // metaNameTag.setDisplayName(p.getInventory().getItemInMainHand().getItemMeta().getDisplayName());
                    // inv.remove(Material.NAME_TAG);
                     event.setCancelled(true);
                     //inv.addItem(nameTag);




                 }
            }
        }



    }


}
