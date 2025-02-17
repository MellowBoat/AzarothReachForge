package net.mellowboat.azarothsreach.item;

import net.mellowboat.azarothsreach.AzarothsReach;
import net.mellowboat.azarothsreach.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AzarothsReach.MOD_ID);

    // Creates Creative mode tab: "Azaroth's Ingredients"
    public static final RegistryObject<CreativeModeTab> AZAROTHS_INGREDIENTS = CREATIVE_MODE_TABS.register("azaroths_ingredients",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OPAL.get()))
                    .title(Component.translatable("creativetab.azaroths_ingredients"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.OPAL.get());
                        pOutput.accept(ModItems.ROUGH_OPAL.get());
                        pOutput.accept(ModItems.OPAL_SHARD.get());
                        pOutput.accept(ModItems.ROUGH_OPAL_SHARD.get());

                    })
                    .build());

    // Creates Creative mode tab: "Azaroth's Natural Blocks"
    public static final RegistryObject<CreativeModeTab> AZAROTHS_NATURAL_BLOCKS = CREATIVE_MODE_TABS.register("azaroths_natural_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.SPIRALING_SOD.get()))
                    .title(Component.translatable("creativetab.azaroths_natural_blocks"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModBlocks.SPIRALING_SOD.get());
                        pOutput.accept(ModBlocks.SPIRALING_CLAY.get());
                        pOutput.accept(ModBlocks.SPIRALING_SHALE.get());
                        pOutput.accept(ModBlocks.ROUGH_OPAL_BLOCK.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
