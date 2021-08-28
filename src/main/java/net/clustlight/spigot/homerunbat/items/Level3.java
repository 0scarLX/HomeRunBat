package net.clustlight.spigot.homerunbat.items;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Level3 {

    public static ItemStack getItem() {
        ItemStack item = new ItemStack(Material.STICK);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "ホームランバット " + ChatColor.BOLD + ChatColor.YELLOW + "Lv.3");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.LIGHT_PURPLE+"ホームランするバットです (最高レベル)");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.KNOCKBACK, 20, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);

        return item;
    }


    public static void setRecipe() {
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("home_run_bat_lv3"), getItem());
        sr.shape("III",
                "ISI",
                " S ");
        sr.setIngredient('S', new RecipeChoice.ExactChoice(Level2.getItem()));
        sr.setIngredient('I', Material.IRON_INGOT);
        Bukkit.getServer().addRecipe(sr);
    }

}
