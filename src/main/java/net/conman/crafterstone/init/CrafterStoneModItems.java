/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.conman.crafterstone.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Item;

import net.conman.crafterstone.item.SulfuricAcidItem;
import net.conman.crafterstone.item.NitroPlaneItemItem;
import net.conman.crafterstone.CrafterStoneMod;

@EventBusSubscriber
public class CrafterStoneModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CrafterStoneMod.MODID);
	public static final DeferredItem<Item> NITRO_PLANE_ITEM;
	public static final DeferredItem<Item> SULFURIC_ACID_BUCKET;
	static {
		NITRO_PLANE_ITEM = REGISTRY.register("nitro_plane_item", NitroPlaneItemItem::new);
		SULFURIC_ACID_BUCKET = REGISTRY.register("sulfuric_acid_bucket", SulfuricAcidItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.FluidHandler.ITEM, (stack, context) -> new FluidBucketWrapper(stack), SULFURIC_ACID_BUCKET.get());
	}
}