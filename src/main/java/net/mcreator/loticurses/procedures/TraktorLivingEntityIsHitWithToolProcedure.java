package net.mcreator.loticurses.procedures;

import net.minecraftforge.eventbus.api.Event;

public class TraktorLivingEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("loticurses:traktor_sound")), SoundSource.MASTER, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("loticurses:traktor_sound")), SoundSource.MASTER, 1, 1, false);
			}
		}
	}
}
