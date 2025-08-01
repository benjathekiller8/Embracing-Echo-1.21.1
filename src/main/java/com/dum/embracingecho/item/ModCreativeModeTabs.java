package com.dum.embracingecho.item;

import com.dum.embracingecho.EmbracingEcho;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EmbracingEcho.MOD_ID);

    public static final Supplier<CreativeModeTab> EMBRACING_ECHO_TAB = CREATIVE_MODE_TAB.register("embracing_echo_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ECHO_POWDER.get()))
                    .title(Component.translatable("creativetab.embracingecho.embracing_echo"))
                    .displayItems((itemDisplayParameters, output) -> {
                      output.accept(ModItems.ECHO_POWDER);

                      output.accept(ModItems.WEEPER_SPAWN_EGG);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
