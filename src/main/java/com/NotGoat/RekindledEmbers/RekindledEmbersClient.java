package com.NotGoat.RekindledEmbers;

import com.NotGoat.RekindledEmbers.entity.ModEntities;
import com.NotGoat.RekindledEmbers.entity.client.IgneoGolemRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class RekindledEmbersClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.IGNEO_GOLEM, IgneoGolemRenderer::new);
    }
}
