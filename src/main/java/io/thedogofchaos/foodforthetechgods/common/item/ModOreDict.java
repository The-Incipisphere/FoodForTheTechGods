package io.thedogofchaos.foodforthetechgods.common.item;

import net.minecraftforge.oredict.OreDictionary;

public class ModOreDict {

    public static void register() {
        OreDictionary.registerOre("itemSalt", ModItems.scuffedSalt1);
        OreDictionary.registerOre("foodSalt", ModItems.scuffedSalt2);
    }
}
