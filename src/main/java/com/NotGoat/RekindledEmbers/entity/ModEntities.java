package com.NotGoat.RekindledEmbers.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import com.NotGoat.RekindledEmbers.RekindledEmbers;
import com.NotGoat.RekindledEmbers.entity.custom.IgneoGolemEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<IgneoGolemEntity> IGNEO_GOLEM = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(RekindledEmbers.MOD_ID, "igneo_golem"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, IgneoGolemEntity::new)
                    .dimensions(EntityDimensions.fixed(0.8f, 1.5f)).build());

}