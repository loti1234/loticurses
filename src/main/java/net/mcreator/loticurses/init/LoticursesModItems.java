
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.loticurses.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.loticurses.item.TraktorItem;
import net.mcreator.loticurses.item.ThehorrorsItem;
import net.mcreator.loticurses.item.RawCursiteItem;
import net.mcreator.loticurses.item.EvilstoneItem;
import net.mcreator.loticurses.item.EvillinthIngotItem;
import net.mcreator.loticurses.item.EVILDESPAWNItem;
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
	public static final RegistryObject<Item> EVILLINTH_INGOT = REGISTRY.register("evillinth_ingot", () -> new EvillinthIngotItem());
	public static final RegistryObject<Item> BLACKSTONE_CURSITE_ORE = block(LoticursesModBlocks.BLACKSTONE_CURSITE_ORE);
	public static final RegistryObject<Item> RAW_CURSITE = REGISTRY.register("raw_cursite", () -> new RawCursiteItem());
	public static final RegistryObject<Item> CURSITE_ORE = block(LoticursesModBlocks.CURSITE_ORE);
	public static final RegistryObject<Item> EVILSTONE = REGISTRY.register("evilstone", () -> new EvilstoneItem());
	public static final RegistryObject<Item> EVILDESPAWN = REGISTRY.register("evildespawn", () -> new EVILDESPAWNItem());
	public static final RegistryObject<Item> STONEORE = block(LoticursesModBlocks.STONEORE);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
