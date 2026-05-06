/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.conman.crafterstone.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.conman.crafterstone.block.SulfuricAcidBlock;
import net.conman.crafterstone.CrafterStoneMod;

public class CrafterStoneModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CrafterStoneMod.MODID);
	public static final DeferredBlock<Block> SULFURIC_ACID;
	static {
		SULFURIC_ACID = REGISTRY.register("sulfuric_acid", SulfuricAcidBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}