
package net.mcreator.loticurses.command;

@Mod.EventBusSubscriber
public class EvilCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("evil").requires(s -> s.hasPermission(4)).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();

			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();

			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);

			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			EvilcommandProcedure.execute(entity);
			return 0;
		}));
	}

}
