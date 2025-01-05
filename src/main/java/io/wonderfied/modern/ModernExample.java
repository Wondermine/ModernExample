package io.wonderfied.modern;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = "modern", name = "ModernExample", version = "1.0.0")
public class ModernExample {
    public static final Logger logger = LogManager.getLogger("Modern Example");

    public ModernExample() {
        logger.info("Hello Class init");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        logger.info("Hello POST init");
    }
}
