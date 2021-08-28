package net.clustlight.spigot.homerunbat;

import net.clustlight.spigot.homerunbat.items.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class HomeRunBat extends JavaPlugin {

    @Override
    public void onEnable() {

        Level1.setRecipe();
        Level2.setRecipe();
        Level3.setRecipe();

        getServer().getPluginManager().registerEvents(new BatListener(), this);
    }

}
