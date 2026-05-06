package net.conman.crafterstone.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.conman.crafterstone.init.CrafterStoneModMobEffects;

public class PetrifiedOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CrafterStoneModMobEffects.PETRIFIED_EFFECT)) {
			return true;
		}
		return false;
	}
}