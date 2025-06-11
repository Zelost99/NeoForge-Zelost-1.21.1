package net.noname.dinotimemod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.noname.dinotimemod.DinosaurTimeMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DinosaurTimeMod.MODID);

    public static final DeferredItem<Item> AMBER = ITEMS.register("amber",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AMBER_MOSQUITO = ITEMS.register("amber_mosquito",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
