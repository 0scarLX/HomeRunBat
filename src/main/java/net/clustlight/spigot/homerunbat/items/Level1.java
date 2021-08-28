package net.clustlight.spigot.homerunbat.items;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Level1 {

    public static ItemStack getItem() {
        ItemStack item = new ItemStack(Material.STICK);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "ホームランバット " + ChatColor.BOLD + ChatColor.GREEN + "Lv.1");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.LIGHT_PURPLE + "ホームランするバットです");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.KNOCKBACK, 4, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);

        return item;
    }

    public static void setRecipe() {
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("home_run_bat_lv1"), getItem());
        sr.shape("III",
                "ISI",
                " S ");
        sr.setIngredient('S', Material.STICK);
        sr.setIngredient('I', Material.IRON_INGOT);
        Bukkit.getServer().addRecipe(sr);
    }

}
