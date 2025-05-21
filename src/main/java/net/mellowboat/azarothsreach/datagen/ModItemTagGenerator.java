package net.mellowboat.azarothsreach.datagen;

import net.mellowboat.azarothsreach.AzarothsReach;
import net.mellowboat.azarothsreach.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, AzarothsReach.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.WEEPING_OAK_LOG.get().asItem())
                .add(ModBlocks.WEEPING_OAK_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_WEEPING_OAK_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_WEEPING_OAK_WOOD.get().asItem());
        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.WEEPING_OAK_PLANKS.get().asItem());
    }
}
