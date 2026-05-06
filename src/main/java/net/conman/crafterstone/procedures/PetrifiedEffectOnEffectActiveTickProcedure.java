package net.conman.crafterstone.procedures;

import net.minecraft.world.entity.Entity;

public class PetrifiedEffectOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isUnderWater()) {
			entity.setAirSupply(220);
		} else {
			if (entity.isOnFire()) {
				entity.clearFire();
			}
		}
	}
}