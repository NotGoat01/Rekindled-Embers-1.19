package com.NotGoat.RekindledEmbers;

import com.NotGoat.RekindledEmbers.block.ModBlocks;
import com.NotGoat.RekindledEmbers.entity.ModEntities;
import com.NotGoat.RekindledEmbers.entity.custom.IgneoGolemEntity;
import com.NotGoat.RekindledEmbers.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;


public class RekindledEmbers implements ModInitializer {

    public static final String MOD_ID = "rekindledembers";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        GeckoLib.initialize();
        FabricDefaultAttributeRegistry.register(ModEntities.IGNEO_GOLEM, IgneoGolemEntity.setAttributes());

    }
}
