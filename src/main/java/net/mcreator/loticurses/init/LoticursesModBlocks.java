
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.loticurses.init;

import net.mcreator.loticurses.block.StoneoreBlock;
import net.mcreator.loticurses.block.CursiteOreBlock;
import net.mcreator.loticurses.block.BlackstoneCursiteOreBlock;
import net.mcreator.loticurses.LoticursesMod;

public class LoticursesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LoticursesMod.MODID);
	public static final RegistryObject<Block> BLACKSTONE_CURSITE_ORE = REGISTRY.register("blackstone_cursite_ore", () -> new BlackstoneCursiteOreBlock());
	public static final RegistryObject<Block> CURSITE_ORE = REGISTRY.register("cursite_ore", () -> new CursiteOreBlock());
	public static final RegistryObject<Block> STONEORE = REGISTRY.register("stoneore", () -> new StoneoreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
