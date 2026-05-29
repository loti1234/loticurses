package net.mcreator.loticurses;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.loticurses.init.LoticursesModTabs;
import net.mcreator.loticurses.init.LoticursesModSounds;
import net.mcreator.loticurses.init.LoticursesModMobEffects;
import net.mcreator.loticurses.init.LoticursesModItems;
import net.mcreator.loticurses.init.LoticursesModEntities;
import net.mcreator.loticurses.init.LoticursesModEnchantments;
import net.mcreator.loticurses.init.LoticursesModBlocks;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.AbstractMap;

@Mod("loticurses")
public class LoticursesMod {
	public static final Logger LOGGER = LogManager.getLogger(LoticursesMod.class);
	public static final String MODID = "loticurses";

	public LoticursesMod() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		MinecraftForge.EVENT_BUS.register(this);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		LoticursesModSounds.REGISTRY.register(bus);
		LoticursesModBlocks.REGISTRY.register(bus);

		LoticursesModItems.REGISTRY.register(bus);
		LoticursesModEntities.REGISTRY.register(bus);
		LoticursesModEnchantments.REGISTRY.register(bus);
		LoticursesModTabs.REGISTRY.register(bus);

		LoticursesModMobEffects.REGISTRY.register(bus);

		// Start of user code block mod init
		// End of user code block mod init
	}

	// Start of user code block mod methods
	// End of user code block mod methods
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
			workQueue.add(new AbstractMap.SimpleEntry<>(action, tick));
	}

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
			workQueue.forEach(work -> {
				work.setValue(work.getValue() - 1);
				if (work.getValue() == 0)
					actions.add(work);
			});
			actions.forEach(e -> e.getKey().run());
			workQueue.removeAll(actions);
		}
	}
}
