
package net.mcreator.loticurses.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class BlackstoneCursiteOreBlock extends Block {
	public BlackstoneCursiteOreBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GILDED_BLACKSTONE).strength(1.85f, 4.5f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
