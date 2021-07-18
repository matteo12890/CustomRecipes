package de.matteo.recipes.customrecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomRecipes extends JavaPlugin {


    @Override
    public void onEnable() {
        Bukkit.addRecipe(getCustomItem());
        Bukkit.addRecipe(getCustomItem2());
        Bukkit.addRecipe(getCustomItem3());
        Bukkit.addRecipe(getCustomItem4());
        Bukkit.addRecipe(getCustomItem5());
    }


    public ShapedRecipe getCustomItem(){
        ItemStack itemStack = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§a§lEMERALD PICKAXE");
        itemMeta.addEnchant(Enchantment.DIG_SPEED, 6, true);
        itemMeta.addEnchant(Enchantment.DURABILITY, 4 , true);
        itemMeta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 4,true);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        itemStack.setItemMeta(itemMeta);

        NamespacedKey namespacedKey = new NamespacedKey(this,"emerald_pickaxe");
        ShapedRecipe shapedRecipe = new ShapedRecipe(namespacedKey , itemStack);

        shapedRecipe.shape("AAA" , " B " , " B ");
        shapedRecipe.setIngredient('A', Material.EMERALD_BLOCK);
        shapedRecipe.setIngredient('B', Material.STICK);
        return shapedRecipe;
    }

    public ShapedRecipe getCustomItem2(){
        ItemStack itemStack = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§a§lEMERALD SCHWERT");
        itemMeta.addEnchant(Enchantment.DAMAGE_ALL, 6, true);
        itemMeta.addEnchant(Enchantment.DURABILITY, 4, true);
        itemMeta.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
        itemMeta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 4, true);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        itemStack.setItemMeta(itemMeta);

        NamespacedKey namespacedKey = new NamespacedKey(this,"emerald_sword");
        ShapedRecipe shapedRecipe = new ShapedRecipe(namespacedKey , itemStack);

        shapedRecipe.shape(" A " , " A " , " B ");
        shapedRecipe.setIngredient('A', Material.EMERALD_BLOCK);
        shapedRecipe.setIngredient('B', Material.STICK);
        return shapedRecipe;
    }

    public ShapedRecipe getCustomItem3(){
        ItemStack itemStack = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§a§lEMERALD AXT");
        itemMeta.addEnchant(Enchantment.DURABILITY, 4, true);
        itemMeta.addEnchant(Enchantment.DIG_SPEED, 6, true);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        itemStack.setItemMeta(itemMeta);

        NamespacedKey namespacedKey = new NamespacedKey(this,"emerald_axe");
        ShapedRecipe shapedRecipe = new ShapedRecipe(namespacedKey , itemStack);

        shapedRecipe.shape("AA " , "AB " , " B ");
        shapedRecipe.setIngredient('A', Material.EMERALD_BLOCK);
        shapedRecipe.setIngredient('B', Material.STICK);
        return shapedRecipe;
    }

    public ShapedRecipe getCustomItem4(){
        ItemStack itemStack = new ItemStack(Material.DIAMOND_SHOVEL);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§a§lEMERALD SCHAUFEL");
        itemMeta.addEnchant(Enchantment.DURABILITY, 4, true);
        itemMeta.addEnchant(Enchantment.DIG_SPEED, 6, true);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        itemStack.setItemMeta(itemMeta);

        NamespacedKey namespacedKey = new NamespacedKey(this,"emerald_shovel");
        ShapedRecipe shapedRecipe = new ShapedRecipe(namespacedKey , itemStack);

        shapedRecipe.shape(" A " , " B " , " B ");
        shapedRecipe.setIngredient('A', Material.EMERALD_BLOCK);
        shapedRecipe.setIngredient('B', Material.STICK);
        return shapedRecipe;
    }

    public ShapedRecipe getCustomItem5(){
        ItemStack itemStack = new ItemStack(Material.DIAMOND_HOE);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§a§lEMERALD HACKE");
        itemMeta.addEnchant(Enchantment.DURABILITY, 4, true);
        itemMeta.addEnchant(Enchantment.DIG_SPEED, 6, true);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        itemStack.setItemMeta(itemMeta);

        NamespacedKey namespacedKey = new NamespacedKey(this,"emerald_hoe");
        ShapedRecipe shapedRecipe = new ShapedRecipe(namespacedKey , itemStack);

        shapedRecipe.shape("AA " , " B " , " B ");
        shapedRecipe.setIngredient('A', Material.EMERALD_BLOCK);
        shapedRecipe.setIngredient('B', Material.STICK);
        return shapedRecipe;
    }




    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
