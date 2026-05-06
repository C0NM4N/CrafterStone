/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.conman.crafterstone.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.conman.crafterstone.block.SulfuridAcidBlock;
import net.conman.crafterstone.block.HydrogenSulfideBlock;
import net.conman.crafterstone.CrafterStoneMod;

public class CrafterStoneModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CrafterStoneMod.MODID);
	public static final DeferredBlock<Block> SULFURID_ACID;
	public static final DeferredBlock<Block> HYDROGEN_SULFIDE;
	static {
		SULFURID_ACID = REGISTRY.register("sulfurid_acid", SulfuridAcidBlock::new);
		HYDROGEN_SULFIDE = REGISTRY.register("hydrogen_sulfide", HydrogenSulfideBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}