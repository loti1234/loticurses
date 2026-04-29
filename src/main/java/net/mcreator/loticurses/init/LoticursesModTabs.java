
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.loticurses.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.loticurses.LoticursesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LoticursesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LoticursesMod.MODID);
	public static final RegistryObject<CreativeModeTab> LOTI_CURSES_TAB = REGISTRY.register("loti_curses_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.loticurses.loti_curses_tab")).icon(() -> new ItemStack(LoticursesModItems.CURSESTONE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LoticursesModItems.TRAKTOR.get());
				tabData.accept(LoticursesModItems.CURSESTONE.get());
				tabData.accept(LoticursesModBlocks.CURSITE_ORE.get().asItem());
				tabData.accept(LoticursesModBlocks.BLACKSTONE_CURSITE_ORE.get().asItem());
				tabData.accept(LoticursesModItems.RAW_CURSITE.get());
				tabData.accept(LoticursesModItems.EVILLINTH_INGOT.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(LoticursesModItems.DUMMY_SPAWN_EGG.get());
			tabData.accept(LoticursesModItems.THE_HORROR_SPAWN_EGG.get());
		}
	}
}
