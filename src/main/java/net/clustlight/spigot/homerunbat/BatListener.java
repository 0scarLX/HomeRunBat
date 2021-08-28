package net.clustlight.spigot.homerunbat;

import net.clustlight.spigot.homerunbat.items.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BatListener implements Listener {

    private final List<ItemStack> bats = new ArrayList<>(
            Arrays.asList(
                    Level1.getItem(),
                    Level2.getItem(),
                    Level3.getItem()
            )
    );

    @EventHandler
    public void onDamage(EntityDamageByEntityEvent event) {
        Entity entity = event.getDamager();
        if (entity instanceof Player) {
            Player player = (Player) entity;
            if (bats.contains(player.getInventory().getItemInMainHand())) {
                event.setDamage(0);
            }
        }
    }


}
