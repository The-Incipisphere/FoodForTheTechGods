package io.thedogofchaos.foodforthetechgods.common;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import io.thedogofchaos.foodforthetechgods.Config;
import io.thedogofchaos.foodforthetechgods.FoodForTheTechGods;
import io.thedogofchaos.foodforthetechgods.Tags;
import io.thedogofchaos.foodforthetechgods.common.fixes.UnfuckPamsRecipes;

public class CommonProxy {

    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        Config.synchronizeConfiguration(event.getSuggestedConfigurationFile());

        FoodForTheTechGods.LOG.info("FoodForTheTechGods at version " + Tags.VERSION +", loading fine (so far...)");
    }

    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {}

    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {
        if (Loader.isModLoaded("harvestcraft") && Config.shouldUnfuckPamsRecipes) UnfuckPamsRecipes.dewit(event);
    }

    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {}
}
