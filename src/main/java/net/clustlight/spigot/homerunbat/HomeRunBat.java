package net.clustlight.spigot.homerunbat;

import net.clustlight.spigot.homerunbat.items.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class HomeRunBat extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getServer().addRecipe(Level1.getRecipe());
        Bukkit.getServer().addRecipe(Level2.getRecipe());
        Bukkit.getServer().addRecipe(Level3.getRecipe());

        getServer().getPluginManager().registerEvents(new BatListener(), this);
    }

}
