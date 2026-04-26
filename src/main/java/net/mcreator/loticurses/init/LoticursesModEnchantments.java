
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.loticurses.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.loticurses.enchantment.SkakidiEnchantment;
import net.mcreator.loticurses.enchantment.InternalbleedingEnchantment;
import net.mcreator.loticurses.enchantment.CurseofexplodingEnchantment;
import net.mcreator.loticurses.LoticursesMod;

public class LoticursesModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, LoticursesMod.MODID);
	public static final RegistryObject<Enchantment> SKAKIDI = REGISTRY.register("skakidi", () -> new SkakidiEnchantment());
	public static final RegistryObject<Enchantment> INTERNALBLEEDING = REGISTRY.register("internalbleeding", () -> new InternalbleedingEnchantment());
	public static final RegistryObject<Enchantment> CURSEOFEXPLODING = REGISTRY.register("curseofexploding", () -> new CurseofexplodingEnchantment());
}
