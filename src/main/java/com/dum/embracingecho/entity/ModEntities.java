package com.dum.embracingecho.entity;

import com.dum.embracingecho.EmbracingEcho;
import com.dum.embracingecho.entity.custom.WeeperEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, EmbracingEcho.MOD_ID);
    public static final Supplier<EntityType<WeeperEntity>> WEEPER =
            ENTITY_TYPES.register("weeper", () -> EntityType.Builder.of(WeeperEntity::new, MobCategory.CREATURE)
                    .sized(0.75f, 1.25f).build("weeper"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
