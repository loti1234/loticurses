
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.loticurses.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.loticurses.item.TraktorItem;
import net.mcreator.loticurses.item.ThehorrorsItem;
import net.mcreator.loticurses.item.DespawnItem;
import net.mcreator.loticurses.item.CursestoneItem;
import net.mcreator.loticurses.LoticursesMod;

public class LoticursesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LoticursesMod.MODID);
	public static final RegistryObject<Item> DUMMY_SPAWN_EGG = REGISTRY.register("dummy_spawn_egg", () -> new ForgeSpawnEggItem(LoticursesModEntities.DUMMY, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> DESPAWN = REGISTRY.register("despawn", () -> new DespawnItem());
	public static final RegistryObject<Item> THEHORRORS = REGISTRY.register("thehorrors", () -> new ThehorrorsItem());
	public static final RegistryObject<Item> THE_HORROR_SPAWN_EGG = REGISTRY.register("the_horror_spawn_egg", () -> new ForgeSpawnEggItem(LoticursesModEntities.THE_HORROR, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> TRAKTOR = REGISTRY.register("traktor", () -> new TraktorItem());
	public static final RegistryObject<Item> CURSESTONE = REGISTRY.register("cursestone", () -> new CursestoneItem());
	// Start of user code block custom items
	// End of user code block custom items
}
