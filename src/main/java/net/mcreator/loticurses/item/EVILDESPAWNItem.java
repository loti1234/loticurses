
package net.mcreator.loticurses.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.loticurses.procedures.EvildespawnlivingentityProcedure;

import java.util.List;

public class EVILDESPAWNItem extends Item {
	public EVILDESPAWNItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.loticurses.evildespawn.description_0"));
		list.add(Component.translatable("item.loticurses.evildespawn.description_1"));
		list.add(Component.translatable("item.loticurses.evildespawn.description_2"));
		list.add(Component.translatable("item.loticurses.evildespawn.description_3"));
		list.add(Component.translatable("item.loticurses.evildespawn.description_4"));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		EvildespawnlivingentityProcedure.execute(entity);
		return retval;
	}
}
