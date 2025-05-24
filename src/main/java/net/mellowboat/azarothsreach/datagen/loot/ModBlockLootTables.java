package net.mellowboat.azarothsreach.datagen.loot;

import net.mellowboat.azarothsreach.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.otherWhenSilkTouch(ModBlocks.SPIRALING_SOD.get(), ModBlocks.SPIRALING_CLAY.get());
        this.otherWhenSilkTouch(ModBlocks.SPIRALING_SOD_PATH.get(), ModBlocks.SPIRALING_CLAY.get());
        this.otherWhenSilkTouch(ModBlocks.MYCELIAL_CARPET.get(), ModBlocks.SPIRALING_CLAY.get());
        this.dropSelf(ModBlocks.SPIRALING_CLAY.get());
        this.dropSelf(ModBlocks.SPIRALING_LIMESTONE.get());
        this.dropSelf(ModBlocks.SPIRALING_SANDSTONE.get());
        this.dropSelf(ModBlocks.SPIRALING_SILT.get());
        this.dropSelf(ModBlocks.SPIRALING_PEBBLES.get());
        this.dropSelf(ModBlocks.SPIRALING_SAND.get());
        this.dropSelf(ModBlocks.SPIRALING_SHALE.get());
        this.dropWhenSilkTouch(ModBlocks.DESERT_GLASS.get());
        this.dropWhenSilkTouch(ModBlocks.SHATTERED_DESERT_GLASS.get());
        this.dropWhenSilkTouch(ModBlocks.DESERT_GLASS_CORE.get());
        this.dropSelf(ModBlocks.GOLDEN_DANDELION.get());
        this.add(ModBlocks.PALE_PETALS.get(), this.createPetalsDrops(ModBlocks.PALE_PETALS.get()));
        this.dropSelf(ModBlocks.ROUGH_OPAL_BLOCK.get());

        //weeping oak wood family
        this.dropSelf(ModBlocks.WEEPING_OAK_LOG.get());
        this.dropSelf(ModBlocks.WEEPING_OAK_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_WEEPING_OAK_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_WEEPING_OAK_WOOD.get());
        this.dropSelf(ModBlocks.WEEPING_OAK_PLANKS.get());
        this.add(ModBlocks.WEEPING_OAK_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WEEPING_OAK_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.WEEPING_OAK_STAIRS.get());
        this.dropSelf(ModBlocks.WEEPING_OAK_SAPLING.get());
        this.add(ModBlocks.WEEPING_OAK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WEEPING_OAK_SLAB.get()));
        this.dropSelf(ModBlocks.WEEPING_OAK_FENCE.get());
        this.dropSelf(ModBlocks.WEEPING_OAK_FENCE_GATE.get());
        this.add(ModBlocks.WEEPING_OAK_DOOR.get(),
                block -> createDoorTable(ModBlocks.WEEPING_OAK_DOOR.get()));
        this.dropSelf(ModBlocks.WEEPING_OAK_TRAPDOOR.get());
        this.dropSelf(ModBlocks.WEEPING_OAK_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.WEEPING_OAK_BUTTON.get());




    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
