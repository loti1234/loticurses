
package net.mcreator.loticurses.item;

public class ThehorrorsItem extends Item {
	public ThehorrorsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ThehorrorsRightclickedProcedure.execute();
		return ar;
	}
}