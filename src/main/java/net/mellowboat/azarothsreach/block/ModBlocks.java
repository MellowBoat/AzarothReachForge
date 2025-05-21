package net.mellowboat.azarothsreach.block;

import net.mellowboat.azarothsreach.AzarothsReach;
import net.mellowboat.azarothsreach.block.custom.*;
import net.mellowboat.azarothsreach.item.ModItems;
import net.mellowboat.azarothsreach.worldgen.tree.WeepingOakGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AzarothsReach.MOD_ID);

    public static final RegistryObject<Block> SPIRALING_SOD = registerBlock("spiraling_sod",
            () -> new SpiralingSod(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).randomTicks()));

    public static final RegistryObject<Block> MYCELIAL_CARPET = registerBlock("mycelial_carpet",
            () -> new MycelialCarpet(BlockBehaviour.Properties.copy(Blocks.MYCELIUM).randomTicks()));


    public static final RegistryObject<Block> SPIRALING_CLAY = registerBlock("spiraling_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ROOTED_DIRT)));

    public static final RegistryObject<Block> COMPRESSING_CLAY = registerBlock("compressing_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));

    public static final RegistryObject<Block> SPIRALING_SHALE = registerBlock("spiraling_shale",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));

    public static final RegistryObject<Block> SPIRALING_SAND = registerBlock("spiraling_sand",
            () -> new SandBlock(15982788, BlockBehaviour.Properties.copy(Blocks.SUSPICIOUS_SAND)));

    public static final RegistryObject<Block> ROUGH_OPAL_BLOCK = registerBlock("rough_opal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));

    public static final RegistryObject<Block> DESERT_GLASS = registerBlock("desert_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion()));

    public static final RegistryObject<Block> SHATTERED_DESERT_GLASS = registerBlock("shattered_desert_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion()));

    public static final RegistryObject<Block> DESERT_GLASS_CORE = registerBlock("desert_glass_core",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).lightLevel(value -> 15)));

    public static final RegistryObject<Block> PALE_PETALS = registerBlock("pale_petals",
            () -> new PinkPetalsBlock(BlockBehaviour.Properties.copy(Blocks.PINK_PETALS).noOcclusion()));

    public static final RegistryObject<Block> SPIRALING_SILT = registerBlock("spiraling_silt",
            () -> new SandBlock(14144718, BlockBehaviour.Properties.copy(Blocks.SUSPICIOUS_SAND)));

    public static final RegistryObject<Block> SPIRALING_PEBBLES = registerBlock("spiraling_pebbles",
            () -> new SandBlock(14144718, BlockBehaviour.Properties.copy(Blocks.SUSPICIOUS_GRAVEL)));

    public static final RegistryObject<Block> GOLDEN_DANDELION = registerBlock("golden_dandelion",
            () -> new FlowerBlock(() -> MobEffects.HEAL, 10,BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion().noCollission()));




    //Weeping Oak Block Family
    public static final RegistryObject<Block> WEEPING_OAK_LOG = registerBlock("weeping_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));

    public static final RegistryObject<Block> WEEPING_OAK_WOOD = registerBlock("weeping_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));

    public static final RegistryObject<Block> STRIPPED_WEEPING_OAK_LOG = registerBlock("stripped_weeping_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3f)));

    public static final RegistryObject<Block> STRIPPED_WEEPING_OAK_WOOD = registerBlock("stripped_weeping_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3f)));

    public static final RegistryObject<Block> WEEPING_OAK_LEAVES = registerBlock("weeping_oak_leaves",
            () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> WEEPING_OAK_SAPLING = registerBlock("weeping_oak_sapling",
            () -> new SaplingBlock(new WeepingOakGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> WEEPING_OAK_PLANKS = registerBlock("weeping_oak_planks",
            () -> new ModPlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> WEEPING_OAK_STAIRS = registerBlock("weeping_oak_stairs",
            () -> new StairBlock(() -> ModBlocks.WEEPING_OAK_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));

    public static final RegistryObject<Block> WEEPING_OAK_SLAB = registerBlock("weeping_oak_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));

    public static final RegistryObject<Block> WEEPING_OAK_FENCE = registerBlock("weeping_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<Block> WEEPING_OAK_FENCE_GATE = registerBlock("weeping_oak_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),
                    SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> WEEPING_OAK_DOOR = registerBlock("weeping_oak_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));

    public static final RegistryObject<Block> WEEPING_OAK_TRAPDOOR = registerBlock("weeping_oak_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    public static final RegistryObject<Block> WEEPING_OAK_PRESSURE_PLATE = registerBlock("weeping_oak_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE),BlockSetType.OAK));

    public static final RegistryObject<Block> WEEPING_OAK_BUTTON = registerBlock("weeping_oak_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON),
            BlockSetType.OAK, 10, true));





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
