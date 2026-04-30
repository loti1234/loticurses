
package net.mcreator.loticurses.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BlackstoneCursiteOreBlock extends Block {
	public BlackstoneCursiteOreBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GILDED_BLACKSTONE).strength(1.85f, 4.5f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}