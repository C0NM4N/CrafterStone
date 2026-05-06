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

public abstract class SulfuricAcidFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> CrafterStoneModFluidTypes.SULFURIC_ACID_TYPE.get(), () -> CrafterStoneModFluids.SULFURIC_ACID.get(),
			() -> CrafterStoneModFluids.FLOWING_SULFURIC_ACID.get()).explosionResistance(100f).bucket(() -> CrafterStoneModItems.SULFURIC_ACID_BUCKET.get()).block(() -> (LiquidBlock) CrafterStoneModBlocks.SULFURIC_ACID.get());

	private SulfuricAcidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends SulfuricAcidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SulfuricAcidFluid {
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