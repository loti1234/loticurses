
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.loticurses.init;

import net.mcreator.loticurses.entity.TheHorrorEntity;
import net.mcreator.loticurses.entity.DummyEntity;
import net.mcreator.loticurses.LoticursesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LoticursesModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, LoticursesMod.MODID);
	public static final RegistryObject<EntityType<DummyEntity>> DUMMY = register("dummy",
			EntityType.Builder.<DummyEntity>of(DummyEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DummyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TheHorrorEntity>> THE_HORROR = register("the_horror", EntityType.Builder.<TheHorrorEntity>of(TheHorrorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048)
			.setUpdateInterval(3).setCustomClientFactory(TheHorrorEntity::new).fireImmune().sized(0.6f, 0.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DummyEntity.init();
			TheHorrorEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DUMMY.get(), DummyEntity.createAttributes().build());
		event.put(THE_HORROR.get(), TheHorrorEntity.createAttributes().build());
	}
}
