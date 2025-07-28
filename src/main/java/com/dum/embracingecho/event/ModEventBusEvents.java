package com.dum.embracingecho.event;

import com.dum.embracingecho.EmbracingEcho;
import com.dum.embracingecho.entity.ModEntities;
import com.dum.embracingecho.entity.client.WeeperModel;
import com.dum.embracingecho.entity.custom.WeeperEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = EmbracingEcho.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerlayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(WeeperModel.LAYER_LOCATION, WeeperModel::createBodyLayer);
    }
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.WEEPER.get(), WeeperEntity.createAttributes().build());
    }

}
