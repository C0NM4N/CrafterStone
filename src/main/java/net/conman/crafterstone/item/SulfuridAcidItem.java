package net.conman.crafterstone.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.conman.crafterstone.init.CrafterStoneModFluids;

public class SulfuridAcidItem extends BucketItem {
	public SulfuridAcidItem() {
		super(CrafterStoneModFluids.SULFURID_ACID.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}