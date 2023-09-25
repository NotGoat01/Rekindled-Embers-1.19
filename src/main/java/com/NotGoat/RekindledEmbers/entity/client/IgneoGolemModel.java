package com.NotGoat.RekindledEmbers.entity.client;

import com.NotGoat.RekindledEmbers.RekindledEmbers;
import com.NotGoat.RekindledEmbers.entity.custom.IgneoGolemEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IgneoGolemModel extends AnimatedGeoModel<IgneoGolemEntity> {
    @Override
    public Identifier getModelResource(IgneoGolemEntity object) {
        return new Identifier(RekindledEmbers.MOD_ID, "geo/igneo_golem.geo.json");
    }

    @Override
    public Identifier getTextureResource(IgneoGolemEntity object) {
        return new Identifier(RekindledEmbers.MOD_ID, "textures/entity/igneo_golem_texture.png");
    }

    @Override
    public Identifier getAnimationResource(IgneoGolemEntity animatable) {
        return new Identifier(RekindledEmbers.MOD_ID, "animations/igneo_golem.animation.json");
    }
}