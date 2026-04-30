
package net.mcreator.loticurses.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class StoneoreBlock extends Block {
	public StoneoreBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}