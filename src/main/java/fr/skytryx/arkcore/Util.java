package fr.skytryx.arkcore;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class Util {

    public static void StainedGlass(int min, int max, Inventory inv){
        ItemStack stainedglass = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta imstainedglass = stainedglass.getItemMeta();
        imstainedglass.setDisplayName(" ");
        stainedglass.setItemMeta(imstainedglass);
        for(int i = min; i < max; i++){
            inv.setItem(i, stainedglass);
        }
    }


    public static ItemStack CreateItem(Material mat, String name, List<String> lore) {
        ItemStack item = new ItemStack(mat);
        ItemMeta itemmeta = item.getItemMeta();
        itemmeta.setDisplayName(name);
        if(!lore.isEmpty()) itemmeta.setLore(lore);
        item.setItemMeta(itemmeta);
        return item;
    }
}

