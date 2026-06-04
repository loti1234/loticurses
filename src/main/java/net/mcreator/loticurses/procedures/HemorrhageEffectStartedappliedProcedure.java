package net.mcreator.loticurses.procedures;

import net.minecraft.world.entity.Entity;

public class HemorrhageEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof net.minecraft.world.entity.LivingEntity _livingEntity) {
			net.eca.api.EcaAPI.banHealing(_livingEntity, (float) (20));
		}
	}
}
