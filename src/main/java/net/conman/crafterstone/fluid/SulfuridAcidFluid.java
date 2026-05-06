package net.conman.crafterstone.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.conman.crafterstone.init.CrafterStoneModItems;
import net.conman.crafterstone.init.CrafterStoneModFluids;
import net.conman.crafterstone.init.CrafterStoneModFluidTypes;
import net.conman.crafterstone.init.CrafterStoneModBlocks;

public abstract class SulfuridAcidFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> CrafterStoneModFluidTypes.SULFURID_ACID_TYPE.get(), () -> CrafterStoneModFluids.SULFURID_ACID.get(),
			() -> CrafterStoneModFluids.FLOWING_SULFURID_ACID.get()).explosionResistance(100f).bucket(() -> CrafterStoneModItems.SULFURID_ACID_BUCKET.get()).block(() -> (LiquidBlock) CrafterStoneModBlocks.SULFURID_ACID.get());

	private SulfuridAcidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends SulfuridAcidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SulfuridAcidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}