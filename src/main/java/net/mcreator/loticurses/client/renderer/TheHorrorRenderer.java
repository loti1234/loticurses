
package net.mcreator.loticurses.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.loticurses.entity.TheHorrorEntity;
import net.mcreator.loticurses.client.model.Modelthe_horrors;

public class TheHorrorRenderer extends MobRenderer<TheHorrorEntity, Modelthe_horrors<TheHorrorEntity>> {
	public TheHorrorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelthe_horrors<TheHorrorEntity>(context.bakeLayer(Modelthe_horrors.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TheHorrorEntity entity) {
		return new ResourceLocation("loticurses:textures/entities/cat.png");
	}
}
