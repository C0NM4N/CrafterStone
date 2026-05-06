/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.conman.crafterstone.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.conman.crafterstone.CrafterStoneMod;

public class CrafterStoneModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CrafterStoneMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CRAFTER_STONE_ITEMS = REGISTRY.register("crafter_stone_items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.crafter_stone.crafter_stone_items")).icon(() -> new ItemStack(CrafterStoneModItems.NITRO_PLANE_ITEM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CrafterStoneModItems.NITRO_PLANE_ITEM.get());
				tabData.accept(CrafterStoneModItems.SULFURIC_ACID_BUCKET.get());
			}).build());
}