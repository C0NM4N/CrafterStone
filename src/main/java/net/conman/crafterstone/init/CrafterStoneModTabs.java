/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.conman.crafterstone.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.conman.crafterstone.CrafterStoneMod;

@EventBusSubscriber
public class CrafterStoneModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CrafterStoneMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CRAFTER_STONE_GENERATION_BLOCKS = REGISTRY.register("crafter_stone_generation_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.crafter_stone.crafter_stone_generation_blocks")).icon(() -> new ItemStack(CrafterStoneModBlocks.HYDROGEN_SULFIDE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CrafterStoneModItems.SULFURID_ACID_BUCKET.get());
				tabData.accept(CrafterStoneModBlocks.HYDROGEN_SULFIDE.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(CrafterStoneModItems.STATUE_ENTITY_SPAWN_EGG.get());
		}
	}
}