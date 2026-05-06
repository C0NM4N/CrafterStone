package net.conman.crafterstone.potion;

import net.neoforged.neoforge.common.NeoForgeMod;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import net.conman.crafterstone.procedures.PetrifiedEffectOnEffectActiveTickProcedure;
import net.conman.crafterstone.procedures.PetrifiedEffectEffectStartedappliedProcedure;
import net.conman.crafterstone.CrafterStoneMod;

public class PetrifiedEffectMobEffect extends MobEffect {
	public PetrifiedEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13421773);
		this.addAttributeModifier(Attributes.BLOCK_INTERACTION_RANGE, ResourceLocation.fromNamespaceAndPath(CrafterStoneMod.MODID, "effect.petrified_effect_0"), -100, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, ResourceLocation.fromNamespaceAndPath(CrafterStoneMod.MODID, "effect.petrified_effect_1"), -100, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.JUMP_STRENGTH, ResourceLocation.fromNamespaceAndPath(CrafterStoneMod.MODID, "effect.petrified_effect_2"), -100, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ENTITY_INTERACTION_RANGE, ResourceLocation.fromNamespaceAndPath(CrafterStoneMod.MODID, "effect.petrified_effect_3"), -100, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(NeoForgeMod.NAMETAG_DISTANCE, ResourceLocation.fromNamespaceAndPath(CrafterStoneMod.MODID, "effect.petrified_effect_4"), -100, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(NeoForgeMod.SWIM_SPEED, ResourceLocation.fromNamespaceAndPath(CrafterStoneMod.MODID, "effect.petrified_effect_5"), -100.001, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		PetrifiedEffectEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		PetrifiedEffectOnEffectActiveTickProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}