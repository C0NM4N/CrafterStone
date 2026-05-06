package net.conman.crafterstone.procedures;

import net.neoforged.neoforge.event.entity.player.ItemEntityPickupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.conman.crafterstone.init.CrafterStoneModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PetrifiedPickupHandlerProcedure {
	@SubscribeEvent
	public static void onPickup(ItemEntityPickupEvent.Pre event) {
		execute(event, event.getPlayer());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CrafterStoneModMobEffects.PETRIFIED_EFFECT)) {
			if (event instanceof net.neoforged.neoforge.event.entity.player.ItemEntityPickupEvent.Pre preEvent) {
				preEvent.setCanPickup(net.neoforged.neoforge.common.util.TriState.FALSE);
			}
		}
	}
}