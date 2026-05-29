
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.loticurses.init;

import net.mcreator.loticurses.LoticursesMod;

public class LoticursesModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LoticursesMod.MODID);
	public static final RegistryObject<SoundEvent> TRAKTOR_SOUND = REGISTRY.register("traktor_sound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("loticurses", "traktor_sound")));
	public static final RegistryObject<SoundEvent> THE_HORROR_BATTLE_MUSIC = REGISTRY.register("the_horror_battle_music", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("loticurses", "the_horror_battle_music")));
	public static final RegistryObject<SoundEvent> GOLEM_PLACE = REGISTRY.register("golem_place", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("loticurses", "golem_place")));
	public static final RegistryObject<SoundEvent> SUMMON_IRON_GOLEM = REGISTRY.register("summon_iron_golem", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("loticurses", "summon_iron_golem")));
}
