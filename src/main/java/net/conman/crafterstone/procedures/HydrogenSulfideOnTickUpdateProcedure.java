package net.conman.crafterstone.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.conman.crafterstone.init.CrafterStoneModBlocks;

public class HydrogenSulfideOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x, y - 1, z))) {
			world.setBlock(BlockPos.containing(x, y - 1, z), CrafterStoneModBlocks.HYDROGEN_SULFIDE.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if (world.isEmptyBlock(BlockPos.containing(x, y, z - 1)) && world.isEmptyBlock(BlockPos.containing(x, y - 1, z - 1))) {
			world.setBlock(BlockPos.containing(x, y, z - 1), CrafterStoneModBlocks.HYDROGEN_SULFIDE.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if (world.isEmptyBlock(BlockPos.containing(x - 1, y, z)) && world.isEmptyBlock(BlockPos.containing(x - 1, y - 1, z))) {
			world.setBlock(BlockPos.containing(x - 1, y, z), CrafterStoneModBlocks.HYDROGEN_SULFIDE.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if (world.isEmptyBlock(BlockPos.containing(x, y, z + 1)) && world.isEmptyBlock(BlockPos.containing(x, y - 1, z + 1))) {
			world.setBlock(BlockPos.containing(x, y, z + 1), CrafterStoneModBlocks.HYDROGEN_SULFIDE.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if (world.isEmptyBlock(BlockPos.containing(x + 1, y, z)) && world.isEmptyBlock(BlockPos.containing(x + 1, y - 1, z))) {
			world.setBlock(BlockPos.containing(x + 1, y, z), CrafterStoneModBlocks.HYDROGEN_SULFIDE.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if (world.isEmptyBlock(BlockPos.containing(x, y, z - 1)) && world.isEmptyBlock(BlockPos.containing(x, y - 1, z - 2))) {
			world.setBlock(BlockPos.containing(x, y, z - 1), CrafterStoneModBlocks.HYDROGEN_SULFIDE.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if (world.isEmptyBlock(BlockPos.containing(x - 1, y, z)) && world.isEmptyBlock(BlockPos.containing(x - 2, y - 1, z))) {
			world.setBlock(BlockPos.containing(x - 1, y, z), CrafterStoneModBlocks.HYDROGEN_SULFIDE.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if (world.isEmptyBlock(BlockPos.containing(x, y, z + 1)) && world.isEmptyBlock(BlockPos.containing(x, y - 1, z + 2))) {
			world.setBlock(BlockPos.containing(x, y, z + 1), CrafterStoneModBlocks.HYDROGEN_SULFIDE.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if (world.isEmptyBlock(BlockPos.containing(x + 1, y, z)) && world.isEmptyBlock(BlockPos.containing(x + 2, y - 1, z))) {
			world.setBlock(BlockPos.containing(x + 1, y, z), CrafterStoneModBlocks.HYDROGEN_SULFIDE.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}