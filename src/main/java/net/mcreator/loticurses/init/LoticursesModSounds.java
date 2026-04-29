
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.loticurses.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.loticurses.LoticursesMod;

public class LoticursesModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LoticursesMod.MODID);
	public static final RegistryObject<SoundEvent> TRAKTOR_SOUND = REGISTRY.register("traktor_sound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("loticurses", "traktor_sound")));
}
