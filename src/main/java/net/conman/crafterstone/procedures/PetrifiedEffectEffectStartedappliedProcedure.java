package net.conman.crafterstone.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class PetrifiedEffectEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		((LivingEntity) entity).getAttribute(BuiltInRegistries.ATTRIBUTE.getHolder(ResourceLocation.parse("minecraft:generic.scale")).get()).setBaseValue((-0.9));
	}
}