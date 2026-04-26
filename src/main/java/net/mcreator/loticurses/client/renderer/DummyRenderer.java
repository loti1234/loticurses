
package net.mcreator.loticurses.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.loticurses.entity.DummyEntity;

public class DummyRenderer extends HumanoidMobRenderer<DummyEntity, HumanoidModel<DummyEntity>> {
	public DummyRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<DummyEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(DummyEntity entity) {
		return new ResourceLocation("loticurses:textures/entities/space_king__a_message_from_hatemonger_0-35_screenshot.png");
	}
}
