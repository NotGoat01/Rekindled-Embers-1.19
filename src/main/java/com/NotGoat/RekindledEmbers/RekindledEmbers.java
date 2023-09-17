package com.NotGoat.RekindledEmbers;

import com.NotGoat.RekindledEmbers.item.ModBlocks;
import com.NotGoat.RekindledEmbers.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;



public class RekindledEmbers implements ModInitializer {

    public static final String MOD_ID = "rekindledembers";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {

        ModItems.registerModItems();
        ModBlocks.registerBlocks();
        LOGGER.info("Initializing Mod: RekindledEmbers");
    }
}
