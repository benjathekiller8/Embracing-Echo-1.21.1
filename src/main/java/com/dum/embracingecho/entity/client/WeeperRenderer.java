package com.dum.embracingecho.entity.client;

import com.dum.embracingecho.EmbracingEcho;
import com.dum.embracingecho.entity.custom.WeeperEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class WeeperRenderer extends MobRenderer<WeeperEntity, WeeperModel<WeeperEntity>> {
    public WeeperRenderer(EntityRendererProvider.Context context) {
        super(context, new WeeperModel<>(context.bakeLayer(WeeperModel.LAYER_LOCATION)), 0.25f);
    }

    @Override
    public ResourceLocation getTextureLocation(WeeperEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(EmbracingEcho.MOD_ID, "textures/entity/weeper/weeper_texture.png");
    }

    @Override
    public void render(WeeperEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
