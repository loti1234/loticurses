package net.mcreator.loticurses.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.loticurses.init.LoticursesModMobEffects;
import net.mcreator.loticurses.init.LoticursesModEnchantments;

public class EffectgiverhemorrhageProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(LoticursesModEnchantments.INTERNALBLEEDING.get(), itemstack) != 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(LoticursesModMobEffects.HEMORRHAGE.get(), 4000, 1));
		}
	}
}
