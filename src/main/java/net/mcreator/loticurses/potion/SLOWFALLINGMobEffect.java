
package net.mcreator.loticurses.potion;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import java.util.List;
import java.util.ArrayList;

public class SLOWFALLINGMobEffect extends MobEffect {
	public SLOWFALLINGMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
		this.addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE, "88486e7b-584a-3923-9125-8d1ba1017119", 999, AttributeModifier.Operation.ADDITION);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		return cures;
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
