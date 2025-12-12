package io.thedogofchaos.foodforthetechgods.common.fixes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import io.thedogofchaos.foodforthetechgods.FoodForTheTechGods;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.OreDictionary;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;

public class UnfuckPamsRecipes {

    /**
     * Commence the unfuckening (of which consists of standardising salts, deduplicating recipes,
     * and generally making sure Pam's doesn't absolutely flood NEI).
     */
    public static void dewit() {
        standardiseTheSalts();
        fixTheRecipes();
    }

    /**
     *
     */
    private static void standardiseTheSalts() {
        Set<ItemStack> saltsToStandardise = new HashSet<>();

        saltsToStandardise.addAll(OreDictionary.getOres("itemSalt"));
        saltsToStandardise.addAll(OreDictionary.getOres("dustSalt"));

        saltsToStandardise.forEach(saltItem -> {
            // Apparently 'foodSalt' is the canonical oredict tag, according to Gregorius.
            OreDictionary.registerOre("foodSalt", saltItem);
        });
    }

    private static void fixTheRecipes() {
        CraftingManager instance = CraftingManager.getInstance();
        List<IRecipe> recipes = instance.getRecipeList();

        // todo: figure out how the fuck i'm going to deduplicate recipes from CraftingManager
    }
}
