package io.thedogofchaos.foodforthetechgods;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import io.thedogofchaos.foodforthetechgods.common.CommonProxy;

@Mod(
    modid = FoodForTheTechGods.MODID,
    version = Tags.VERSION,
    name = "FoodForTheTechGods",
    acceptedMinecraftVersions = "[1.7.10]")
public class FoodForTheTechGods {

    public static final String MODID = "ffttg";
    public static final Logger LOG = LogManager.getLogger(MODID);

    @SidedProxy(
        clientSide = "io.thedogofchaos.foodforthetechgods.client.ClientProxy",
        serverSide = "io.thedogofchaos.foodforthetechgods.common.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        LOG.info("FoodForTheTechGods version " + Tags.VERSION + ", jumping in!");
        LOG.info("Doing preInit things!");
        proxy.preInit(event);
        LOG.debug("Finished doing preInit things!");
    }

    @Mod.EventHandler
    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
        LOG.info("Doing init things!");
        proxy.init(event);
        LOG.debug("Finished doing init things!");
    }

    @Mod.EventHandler
    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {
        LOG.info("Doing postInit things!");
        proxy.postInit(event);
        LOG.debug("Finished doing postInit things!");
    }

    @Mod.EventHandler
    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {
        LOG.info("Doing serverStarting things!");
        proxy.serverStarting(event);
        LOG.debug("Finished doing serverStarting things!");
    }
}
