package com.dum.embracingecho.item;

import com.dum.embracingecho.EmbracingEcho;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EmbracingEcho.MOD_ID);

    public static final DeferredItem<Item> ECHO_POWDER = ITEMS.register("echo_powder", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
