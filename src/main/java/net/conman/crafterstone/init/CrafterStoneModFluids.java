/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.conman.crafterstone.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.conman.crafterstone.fluid.SulfuricAcidFluid;
import net.conman.crafterstone.CrafterStoneMod;

public class CrafterStoneModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, CrafterStoneMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> SULFURIC_ACID = REGISTRY.register("sulfuric_acid", () -> new SulfuricAcidFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_SULFURIC_ACID = REGISTRY.register("flowing_sulfuric_acid", () -> new SulfuricAcidFluid.Flowing());

	@EventBusSubscriber(Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(SULFURIC_ACID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SULFURIC_ACID.get(), RenderType.translucent());
		}
	}
}