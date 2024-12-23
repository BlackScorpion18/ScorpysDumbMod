package net.scorpy18.scorpysdumbmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.scorpy18.scorpysdumbmod.ScorpysDumbMod;
import net.scorpy18.scorpysdumbmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ScorpysDumbMod.MOD_ID);

    // creating the custom creative tab
    public static final RegistryObject<CreativeModeTab> SCORPYS_DUMB_MOD_TAB = CREATIVE_MODE_TABS.register("scorpys_dumb_mod_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHAOS_ORB.get()))
            .title(Component.translatable("creativetab:scorpys_dumb_mod_tab"))
            .displayItems((pParameters, pOutput) -> {
                // adding items
                pOutput.accept(ModItems.CHAOS_ORB.get());
                pOutput.accept(ModItems.RAW_CHAOS.get());
                pOutput.accept(ModItems.CHAOS_SLURRY.get());
                pOutput.accept(ModItems.EYE_OF_THE_ORB.get());
                pOutput.accept(ModItems.MOUTH_OF_GREED.get());

                // adding blocks
                pOutput.accept(ModBlocks.CHAOS_ORE.get());
                pOutput.accept(ModBlocks.RAW_CHAOS_BLOCK.get());
                pOutput.accept(ModBlocks.CHAOS_BLOCK.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
