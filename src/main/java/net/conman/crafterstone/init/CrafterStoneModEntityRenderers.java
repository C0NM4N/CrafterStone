/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.conman.crafterstone.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.conman.crafterstone.client.renderer.StatueEntityRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class CrafterStoneModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CrafterStoneModEntities.STATUE_ENTITY.get(), StatueEntityRenderer::new);
	}
}