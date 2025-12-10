package io.thedogofchaos.foodforthetechgods;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class Config {

    public static boolean shouldUnfuckPamsRecipes = true;

    public static void synchronizeConfiguration(File configFile) {
        Configuration configuration = new Configuration(configFile);

        shouldUnfuckPamsRecipes = configuration.getBoolean("unfuckPamsRecipes", Configuration.CATEGORY_GENERAL, shouldUnfuckPamsRecipes, "Should we unfuck (fix) duplicated recipes from Pam's Harvestcraft?");

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}
