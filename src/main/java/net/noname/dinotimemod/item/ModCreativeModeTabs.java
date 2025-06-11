package net.noname.dinotimemod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.noname.dinotimemod.DinosaurTimeMod;
import net.noname.dinotimemod.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DinosaurTimeMod.MODID);

    public static final Supplier<CreativeModeTab> DINO_TIME_TAB = CREATIVE_MODE_TAB.register("dino_time_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AMBER_MOSQUITO.get()))
                    .title(Component.translatable("creativetab.dinotimemod.fossil_ore"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.STONE_AMBER_ORE);
                        output.accept(ModBlocks.DEEPSLATE_AMBER_ORE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
