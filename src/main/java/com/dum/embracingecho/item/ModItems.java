package com.dum.embracingecho.item;

import com.dum.embracingecho.EmbracingEcho;
import com.dum.embracingecho.entity.ModEntities;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EmbracingEcho.MOD_ID);

    public static final DeferredItem<Item> ECHO_POWDER = ITEMS.register("echo_powder",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationModifier(0.3f)
                            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 400, 5), 1.0f)
                            .build()
                    )
            ));

    public static final DeferredItem<Item> WEEPER_SPAWN_EGG = ITEMS.register("weeper_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.WEEPER, 0x31afaf, 0xffac00,
                    new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
