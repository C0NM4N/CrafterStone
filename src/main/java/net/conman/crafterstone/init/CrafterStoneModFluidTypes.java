/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.conman.crafterstone.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.conman.crafterstone.fluid.types.SulfuricAcidFluidType;
import net.conman.crafterstone.CrafterStoneMod;

public class CrafterStoneModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, CrafterStoneMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> SULFURIC_ACID_TYPE = REGISTRY.register("sulfuric_acid", () -> new SulfuricAcidFluidType());
}