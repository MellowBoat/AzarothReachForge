package net.mellowboat.azarothsreach.datagen;

import net.mellowboat.azarothsreach.AzarothsReach;
import net.mellowboat.azarothsreach.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, AzarothsReach.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(ModBlocks.SPIRALING_PEBBLES);
        blockWithItem(ModBlocks.DESERT_GLASS);
        blockWithItem(ModBlocks.DESERT_GLASS_CORE);
        blockWithItem(ModBlocks.SHATTERED_DESERT_GLASS);
        blockWithItem(ModBlocks.ROUGH_OPAL_BLOCK);

        //Weeping Oak Wood Family
        logBlock(((RotatedPillarBlock) ModBlocks.WEEPING_OAK_LOG.get()));
        blockItem(ModBlocks.WEEPING_OAK_LOG);



        axisBlock(((RotatedPillarBlock) ModBlocks.WEEPING_OAK_WOOD.get()),
                blockTexture(ModBlocks.WEEPING_OAK_LOG.get()),
                blockTexture(ModBlocks.WEEPING_OAK_LOG.get()));
        blockItem(ModBlocks.WEEPING_OAK_WOOD);

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_WEEPING_OAK_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_WEEPING_OAK_LOG.get()),
                new ResourceLocation(AzarothsReach.MOD_ID,
                        "block/stripped_weeping_oak_log_top"));
        blockItem(ModBlocks.STRIPPED_WEEPING_OAK_LOG);

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_WEEPING_OAK_WOOD.get()),
                blockTexture(ModBlocks.STRIPPED_WEEPING_OAK_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_WEEPING_OAK_LOG.get()));
        blockItem(ModBlocks.STRIPPED_WEEPING_OAK_WOOD);

        blockWithItem(ModBlocks.WEEPING_OAK_PLANKS);

        leavesBlock(ModBlocks.WEEPING_OAK_LEAVES);
        blockItem(ModBlocks.WEEPING_OAK_LEAVES);

        saplingBlock(ModBlocks.WEEPING_OAK_SAPLING);

        stairsBlock(((StairBlock) ModBlocks.WEEPING_OAK_STAIRS.get())
                , blockTexture(ModBlocks.WEEPING_OAK_PLANKS.get()));
        blockItem(ModBlocks.WEEPING_OAK_STAIRS);

        slabBlock(((SlabBlock) ModBlocks.WEEPING_OAK_SLAB.get()),
                blockTexture(ModBlocks.WEEPING_OAK_PLANKS.get()),
                blockTexture(ModBlocks.WEEPING_OAK_PLANKS.get()));
        blockItem(ModBlocks.WEEPING_OAK_SLAB);

        fenceBlock(((FenceBlock) ModBlocks.WEEPING_OAK_FENCE.get())
                , blockTexture(ModBlocks.WEEPING_OAK_PLANKS.get()));

        fenceGateBlock(((FenceGateBlock) ModBlocks.WEEPING_OAK_FENCE_GATE.get())
                , blockTexture(ModBlocks.WEEPING_OAK_PLANKS.get()));
        blockItem(ModBlocks.WEEPING_OAK_FENCE_GATE);

        doorBlockWithRenderType(((DoorBlock) ModBlocks.WEEPING_OAK_DOOR.get()),
                modLoc("block/weeping_oak_door_bottom"),
                modLoc("block/weeping_oak_door_top"),
                "cutout");

        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.WEEPING_OAK_TRAPDOOR.get()),
                modLoc("block/weeping_oak_trapdoor"),
                true,
                "cutout");

        pressurePlateBlock(((PressurePlateBlock) ModBlocks.WEEPING_OAK_PRESSURE_PLATE.get())
                , blockTexture(ModBlocks.WEEPING_OAK_PLANKS.get()));
        blockItem(ModBlocks.WEEPING_OAK_PRESSURE_PLATE);

        buttonBlock(((ButtonBlock) ModBlocks.WEEPING_OAK_BUTTON.get())
                , blockTexture(ModBlocks.WEEPING_OAK_PLANKS.get()));





    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(AzarothsReach.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }
    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
}
