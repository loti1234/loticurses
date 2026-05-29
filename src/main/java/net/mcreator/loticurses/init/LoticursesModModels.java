
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.loticurses.init;

import net.mcreator.loticurses.client.model.Modelthe_horrors;
import net.mcreator.loticurses.client.model.Modelfadeorc;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class LoticursesModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelfadeorc.LAYER_LOCATION, Modelfadeorc::createBodyLayer);
		event.registerLayerDefinition(Modelthe_horrors.LAYER_LOCATION, Modelthe_horrors::createBodyLayer);
	}
}
