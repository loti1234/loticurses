package net.mcreator.loticurses.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class EvildespawnlivingentityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeAllEffects();
		if (entity != null) {
			net.eca.api.EcaAPI.memoryRemove(entity, net.minecraft.world.entity.Entity.RemovalReason.CHANGED_DIMENSION);
		}
	}
}
