package net.mellowboat.azarothsreach.block.custom;

import net.mellowboat.azarothsreach.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.SpreadingSnowyDirtBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.lighting.LightEngine;

public class SpiralingSod extends SpreadingGrassBase {
    public SpiralingSod(Properties pProperties) {
        super(pProperties);
    }



    @Override
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (!canBeGrass(pState, pLevel, pPos)) {
            if (!pLevel.isAreaLoaded(pPos, 1)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light and spreading
            pLevel.setBlockAndUpdate(pPos, ModBlocks.SPIRALING_CLAY.get().defaultBlockState());
        } else {
            if (!pLevel.isAreaLoaded(pPos, 3)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light and spreading
            if (pLevel.getMaxLocalRawBrightness(pPos.above()) >= 9) {
                BlockState blockstate = this.defaultBlockState();

                for(int i = 0; i < 4; ++i) {
                    BlockPos blockpos = pPos.offset(pRandom.nextInt(3) - 1, pRandom.nextInt(5) - 3, pRandom.nextInt(3) - 1);
                    if (pLevel.getBlockState(blockpos).is(ModBlocks.SPIRALING_CLAY.get()) && canPropagate(blockstate, pLevel, blockpos)) {
                        pLevel.setBlockAndUpdate(blockpos, blockstate.setValue(SNOWY, Boolean.valueOf(pLevel.getBlockState(blockpos.above()).is(Blocks.SNOW))));
                    }
                }
            }
        }
    }





}
