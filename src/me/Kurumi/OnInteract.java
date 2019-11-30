package me.Kurumi;

import net.minecraft.server.v1_14_R1.EntityArmorStand;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

public class OnInteract implements Listener {

    @EventHandler
    public void OnInteract(PlayerInteractAtEntityEvent event){
        Player p = event.getPlayer();
        Entity e = event.getRightClicked();
        if(p.getInventory().getItemInMainHand().getType() == Material.NAME_TAG){
            System.out.println("NAME TAG IF SUCCESS");
                if(e instanceof ArmorStand){
                    System.out.println("IS ARMORSTAND");
                String n = p.getInventory().getItemInMainHand().getItemMeta().getDisplayName();
                e.setCustomNameVisible(true);
                e.setCustomName(n);
            }
        }



    }


}
