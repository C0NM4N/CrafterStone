/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.conman.crafterstone.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.conman.crafterstone.client.gui.StatueEntityDebugScreen;

@EventBusSubscriber(Dist.CLIENT)
public class CrafterStoneModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(CrafterStoneModMenus.STATUE_ENTITY_DEBUG.get(), StatueEntityDebugScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}