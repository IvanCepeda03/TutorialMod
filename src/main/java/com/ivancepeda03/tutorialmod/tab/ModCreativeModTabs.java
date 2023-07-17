package com.ivancepeda03.tutorialmod.tab;

import com.ivancepeda03.tutorialmod.TutorialMod;
import com.ivancepeda03.tutorialmod.block.ModBlocks;
import com.ivancepeda03.tutorialmod.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB =
           CREATIVE_MODE_TAB.register("tutorial_tab",
                   () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                           .title(Component.translatable("creativetab.tutorial_tab"))
                           .displayItems(((pParameters, pOutput) -> {
                               // Add items to the tab
                               pOutput.accept(ModItems.SAPPHIRE.get());
                               pOutput.accept(ModItems.RAW_SAPPHIRE.get());

                               // Add blocks to the tab
                               pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                               pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                           }))
                           .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
