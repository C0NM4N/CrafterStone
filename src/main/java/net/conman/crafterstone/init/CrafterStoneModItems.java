/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.conman.crafterstone.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.conman.crafterstone.item.SulfuridAcidItem;
import net.conman.crafterstone.CrafterStoneMod;

@EventBusSubscriber
public class CrafterStoneModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CrafterStoneMod.MODID);
	public static final DeferredItem<Item> SULFURID_ACID_BUCKET;
	public static final DeferredItem<Item> STATUE_ENTITY_SPAWN_EGG;
	public static final DeferredItem<Item> HYDROGEN_SULFIDE;
	static {
		SULFURID_ACID_BUCKET = REGISTRY.register("sulfurid_acid_bucket", SulfuridAcidItem::new);
		STATUE_ENTITY_SPAWN_EGG = REGISTRY.register("statue_entity_spawn_egg", () -> new DeferredSpawnEggItem(CrafterStoneModEntities.STATUE_ENTITY, -13421773, -16777216, new Item.Properties()));
		HYDROGEN_SULFIDE = block(CrafterStoneModBlocks.HYDROGEN_SULFIDE, new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.FluidHandler.ITEM, (stack, context) -> new FluidBucketWrapper(stack), SULFURID_ACID_BUCKET.get());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}