package net.mellowboat.azarothsreach.datagen;

import net.mellowboat.azarothsreach.AzarothsReach;
import net.mellowboat.azarothsreach.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, AzarothsReach.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.DIRT)
                .add(ModBlocks.SPIRALING_SOD.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.WEEPING_OAK_LOG.get())
                .add(ModBlocks.WEEPING_OAK_WOOD.get())
                .add(ModBlocks.STRIPPED_WEEPING_OAK_LOG.get())
                .add(ModBlocks.STRIPPED_WEEPING_OAK_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.WEEPING_OAK_PLANKS.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.WEEPING_OAK_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.WEEPING_OAK_FENCE_GATE.get());
    }
}
