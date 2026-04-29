
package net.mcreator.loticurses.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CursestoneItem extends Item {
	public CursestoneItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
