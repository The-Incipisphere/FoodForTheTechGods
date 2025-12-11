package io.thedogofchaos.foodforthetechgods.common.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {
    public static void register() {
        initItems();
        registerItems();
    }

    // these two items are just for testing tag application
    public static Item scuffedSalt1;
    public static Item scuffedSalt2;

    public static void initItems() {
        scuffedSalt1 = new Item().setUnlocalizedName("scuffed_salt_1").setCreativeTab(CreativeTabs.tabFood);
        scuffedSalt2 = new Item().setUnlocalizedName("scuffed_salt_2").setCreativeTab(CreativeTabs.tabFood);
    };

    private static void registerItems() {
        GameRegistry.registerItem(scuffedSalt1, scuffedSalt1.getUnlocalizedName());
        GameRegistry.registerItem(scuffedSalt2, scuffedSalt2.getUnlocalizedName());
    }


}
