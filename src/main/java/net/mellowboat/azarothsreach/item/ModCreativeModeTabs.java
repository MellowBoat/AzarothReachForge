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

    // Creates Creative mode tab: "Azaroth's Ingredients"
    public static final RegistryObject<CreativeModeTab> AZAROTHS_BUILDING_BLOCKS = CREATIVE_MODE_TABS.register("azaroths_building_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.WEEPING_OAK_PLANKS.get()))
                    .title(Component.translatable("creativetab.azaroths_building_blocks"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.WEEPING_OAK_LOG.get());
                        pOutput.accept(ModBlocks.WEEPING_OAK_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_WEEPING_OAK_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_WEEPING_OAK_WOOD.get());
                        pOutput.accept(ModBlocks.WEEPING_OAK_PLANKS.get());
                        pOutput.accept(ModBlocks.WEEPING_OAK_STAIRS.get());
                        pOutput.accept(ModBlocks.WEEPING_OAK_SLAB.get());
                        pOutput.accept(ModBlocks.WEEPING_OAK_FENCE.get());
                        pOutput.accept(ModBlocks.WEEPING_OAK_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.WEEPING_OAK_DOOR.get());
                        pOutput.accept(ModBlocks.WEEPING_OAK_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.WEEPING_OAK_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.WEEPING_OAK_BUTTON.get());

                    })
                    .build());

    // Creates Creative mode tab: "Azaroth's Natural Blocks"
    public static final RegistryObject<CreativeModeTab> AZAROTHS_NATURAL_BLOCKS = CREATIVE_MODE_TABS.register("azaroths_natural_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.SPIRALING_SOD.get()))
                    .title(Component.translatable("creativetab.azaroths_natural_blocks"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModBlocks.SPIRALING_SOD.get());
                        pOutput.accept(ModBlocks.MYCELIAL_CARPET.get());
                        pOutput.accept(ModBlocks.SPIRALING_SOD_PATH.get());
                        pOutput.accept(ModBlocks.SPIRALING_CLAY.get());
                        pOutput.accept(ModBlocks.SPIRALING_SILT.get());
                        pOutput.accept(ModBlocks.SPIRALING_LIMESTONE.get());
                        pOutput.accept(ModBlocks.SPIRALING_PEBBLES.get());
                        pOutput.accept(ModBlocks.SPIRALING_SAND.get());
                        pOutput.accept(ModBlocks.SPIRALING_SANDSTONE.get());
                        pOutput.accept(ModBlocks.SPIRALING_SHALE.get());
                        pOutput.accept(ModBlocks.DESERT_GLASS.get());
                        pOutput.accept(ModBlocks.SHATTERED_DESERT_GLASS.get());
                        pOutput.accept(ModBlocks.DESERT_GLASS_CORE.get());
                        pOutput.accept(ModBlocks.ROUGH_OPAL_BLOCK.get());
                        pOutput.accept(ModBlocks.PALE_PETALS.get());
                        pOutput.accept(ModBlocks.GOLDEN_DANDELION.get());
                        pOutput.accept(ModBlocks.WEEPING_OAK_LOG.get());
                        pOutput.accept(ModBlocks.WEEPING_OAK_LEAVES.get());
                        pOutput.accept(ModBlocks.WEEPING_OAK_SAPLING.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
