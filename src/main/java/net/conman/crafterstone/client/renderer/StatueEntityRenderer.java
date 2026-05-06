package net.conman.crafterstone.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.conman.crafterstone.entity.StatueEntityEntity;

public class StatueEntityRenderer extends HumanoidMobRenderer<StatueEntityEntity, HumanoidModel<StatueEntityEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("crafter_stone:textures/entities/statue_entity.png");

	public StatueEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<StatueEntityEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(StatueEntityEntity entity) {
		if (entity.getTexture() != "statue_entity")
			return ResourceLocation.parse("crafter_stone:textures/entities/" + entity.getTexture() + ".png");
		return entityTexture;
	}
}