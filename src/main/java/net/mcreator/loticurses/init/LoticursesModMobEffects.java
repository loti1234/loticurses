
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.loticurses.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.loticurses.potion.StiltsMobEffect;
import net.mcreator.loticurses.potion.SLOWFALLINGMobEffect;
import net.mcreator.loticurses.potion.OverwhelmingvelocityMobEffect;
import net.mcreator.loticurses.potion.HemorrhageMobEffect;
import net.mcreator.loticurses.LoticursesMod;

public class LoticursesModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, LoticursesMod.MODID);
	public static final RegistryObject<MobEffect> HEMORRHAGE = REGISTRY.register("hemorrhage", () -> new HemorrhageMobEffect());
	public static final RegistryObject<MobEffect> SLOWFALLING = REGISTRY.register("slowfalling", () -> new SLOWFALLINGMobEffect());
	public static final RegistryObject<MobEffect> STILTS = REGISTRY.register("stilts", () -> new StiltsMobEffect());
	public static final RegistryObject<MobEffect> OVERWHELMINGVELOCITY = REGISTRY.register("overwhelmingvelocity", () -> new OverwhelmingvelocityMobEffect());
}
