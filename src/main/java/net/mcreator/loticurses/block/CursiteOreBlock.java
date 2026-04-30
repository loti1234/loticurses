
package net.mcreator.loticurses.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class CursiteOreBlock extends Block {
	public CursiteOreBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.NETHER_ORE).strength(1.85f, 4.5f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}