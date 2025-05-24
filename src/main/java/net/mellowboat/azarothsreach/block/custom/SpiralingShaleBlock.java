package net.mellowboat.azarothsreach.block.custom;

import net.mellowboat.azarothsreach.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.SnowyDirtBlock;
import net.minecraft.world.level.block.state.BlockState;

public class SpiralingShaleBlock extends SnowyDirtBlock {
    public SpiralingShaleBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockState blockstate = pContext.getLevel().getBlockState(pContext.getClickedPos().above());
        return this.defaultBlockState().setValue(SNOWY, Boolean.valueOf(isSnowySetting(blockstate)));
    }

    @Override
    public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
        return pFacing == Direction.UP ? pState.setValue(SNOWY, Boolean.valueOf(isSnowySetting(pFacingState))) : super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
    }

    public static boolean isSnowySetting(BlockState pState) {
        return pState.is(ModBlocks.SPIRALING_CLAY.get());
    }
}
