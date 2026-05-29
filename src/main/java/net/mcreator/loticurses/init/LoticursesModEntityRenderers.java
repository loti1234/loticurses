
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.loticurses.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.loticurses.client.renderer.TheHorrorRenderer;
import net.mcreator.loticurses.client.renderer.DummyRenderer;
import net.mcreator.loticurses.client.renderer.AmethystshardRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LoticursesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(LoticursesModEntities.DUMMY.get(), DummyRenderer::new);
		event.registerEntityRenderer(LoticursesModEntities.THE_HORROR.get(), TheHorrorRenderer::new);
		event.registerEntityRenderer(LoticursesModEntities.AMETHYSTSHARD.get(), AmethystshardRenderer::new);
	}
}
