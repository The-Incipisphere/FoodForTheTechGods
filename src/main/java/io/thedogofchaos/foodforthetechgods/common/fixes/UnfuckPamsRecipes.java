package io.thedogofchaos.foodforthetechgods.common.fixes;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;

public class UnfuckPamsRecipes {

    /**
     * Commence the unfuckening (of which consists of standardising salts, deduplicating recipes,
     * and generally making sure Pam's doesn't absolutely flood NEI).
     *
     * @param event The Post-Init event (just in case we need it)
     */
    public static void dewit(FMLPostInitializationEvent event) {
        standardiseTheSalts(event);
        fixTheRecipes(event);
    }

    private static void fixTheRecipes(FMLPostInitializationEvent event) {}

    private static void standardiseTheSalts(FMLPostInitializationEvent event) {
        Set<ItemStack> saltsToStandardise = new HashSet<>();

        saltsToStandardise.addAll(OreDictionary.getOres("itemSalt"));
        saltsToStandardise.addAll(OreDictionary.getOres("foodSalt"));

    }
}
