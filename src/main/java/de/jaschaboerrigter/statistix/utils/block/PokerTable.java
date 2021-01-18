package de.jaschaboerrigter.statistix.utils.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;

public class PokerTable extends Block {

    private static DirectionProperty Facing = HorizontalBlock.HORIZONTAL_FACING;

    public PokerTable() {
        super(Properties.create(Material.WOOD).sound(SoundType.WOOD));
        this.setDefaultState(this.stateContainer.getBaseState().with(Facing, Direction.NORTH));
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(Facing, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(Facing);
    }
}
