package net.mcreator.loticurses.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.MobEffectEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HemorrhageEffectStartedappliedProcedure {
	@SubscribeEvent
	public static void onMobEffectEvent(MobEffectEvent.Added event) {
		if (event != null && event.getEntity() != null && event.getEffectInstance() != null) {
			String effect = event.getEffectInstance().toString();
			int level = new Object() {
				int convert(String s) {
					try {
						return (int) Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(effect.substring(effect.indexOf("x ") + "x ".length(), effect.indexOf(",")));
			level = Math.max(1, level);
			int duration = new Object() {
				int convert(String s) {
					try {
						return (int) Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(effect.substring(effect.indexOf("Duration: ") + 10, effect.length()));
			effect = effect.replace("effect.", "").replace(".", ":").replace(",", "");
			effect = effect.substring(0, effect.indexOf(" "));
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "eca banHealing @eca_s true");
			}
		}
	}
}
