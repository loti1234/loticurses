
package net.mcreator.loticurses.client.renderer;

public class TheHorrorRenderer extends MobRenderer<TheHorrorEntity, Modelthe_horrors<TheHorrorEntity>> {
	public TheHorrorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelthe_horrors<TheHorrorEntity>(context.bakeLayer(Modelthe_horrors.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TheHorrorEntity entity) {
		return new ResourceLocation("loticurses:textures/entities/cat.png");
	}
}