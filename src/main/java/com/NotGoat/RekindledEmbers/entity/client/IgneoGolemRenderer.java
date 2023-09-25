package com.NotGoat.RekindledEmbers.entity.client;

import com.NotGoat.RekindledEmbers.RekindledEmbers;
import com.NotGoat.RekindledEmbers.entity.custom.IgneoGolemEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class IgneoGolemRenderer extends GeoEntityRenderer<IgneoGolemEntity> {
    public IgneoGolemRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new IgneoGolemModel());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureResource(IgneoGolemEntity instance) {
        return new Identifier(RekindledEmbers.MOD_ID, "textures/entity/igneo_golem_texture.png");
    }

    @Override
    public RenderLayer getRenderType(IgneoGolemEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8f);

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
