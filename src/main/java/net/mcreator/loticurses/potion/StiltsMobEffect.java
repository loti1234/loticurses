
package net.mcreator.loticurses.potion;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import java.util.List;
import java.util.ArrayList;

public class StiltsMobEffect extends MobEffect {
	public StiltsMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
		this.addAttributeModifier(ForgeMod.STEP_HEIGHT_ADDITION.get(), "9f72effa-ec55-35f2-b171-cef1b0465045", 4, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE, "5899993c-fb2e-3920-91df-b14b300bd74a", -3, AttributeModifier.Operation.ADDITION);
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
