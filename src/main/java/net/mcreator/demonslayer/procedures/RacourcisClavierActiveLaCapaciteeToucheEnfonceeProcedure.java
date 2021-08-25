package net.mcreator.demonslayer.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.demonslayer.DemonSlayerModVariables;
import net.mcreator.demonslayer.DemonSlayerModElements;
import net.mcreator.demonslayer.DemonSlayerMod;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

@DemonSlayerModElements.ModElement.Tag
public class RacourcisClavierActiveLaCapaciteeToucheEnfonceeProcedure extends DemonSlayerModElements.ModElement {
	public RacourcisClavierActiveLaCapaciteeToucheEnfonceeProcedure(DemonSlayerModElements instance) {
		super(instance, 67);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency entity for procedure RacourcisClavierActiveLaCapaciteeToucheEnfoncee!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency x for procedure RacourcisClavierActiveLaCapaciteeToucheEnfoncee!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency y for procedure RacourcisClavierActiveLaCapaciteeToucheEnfoncee!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency z for procedure RacourcisClavierActiveLaCapaciteeToucheEnfoncee!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency world for procedure RacourcisClavierActiveLaCapaciteeToucheEnfoncee!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			Entity _ent = entity;
			_ent.setPositionAndUpdate(x, y, z);
			if (_ent instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
			}
		}
		if (((((entity.getCapability(DemonSlayerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DemonSlayerModVariables.PlayerVariables())).Capacite)).equals("feu"))) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("world", world);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				SouffleDeFeuActifProcedure.executeProcedure($_dependencies);
			}
		} else if (((((entity.getCapability(DemonSlayerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DemonSlayerModVariables.PlayerVariables())).Capacite)).equals("tonnerre"))) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("world", world);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				SouffleDuTonnerreActifProcedure.executeProcedure($_dependencies);
			}
		} else if (((((entity.getCapability(DemonSlayerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DemonSlayerModVariables.PlayerVariables())).Capacite)).equals("bete"))) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("world", world);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				SouffleDeLaBeteActifProcedure.executeProcedure($_dependencies);
			}
		} else if (((((entity.getCapability(DemonSlayerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DemonSlayerModVariables.PlayerVariables())).Capacite)).equals("amour"))) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("world", world);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				SouffleDeLAmourActifProcedure.executeProcedure($_dependencies);
			}
		} else if (((((entity.getCapability(DemonSlayerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DemonSlayerModVariables.PlayerVariables())).Capacite)).equals("brume"))) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("world", world);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				SouffleDeLaBrumeActifProcedure.executeProcedure($_dependencies);
			}
		} else if (((((entity.getCapability(DemonSlayerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DemonSlayerModVariables.PlayerVariables())).Capacite)).equals("pierre"))) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("world", world);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				SouffleDeLaPierreActifProcedure.executeProcedure($_dependencies);
			}
		} else if (((((entity.getCapability(DemonSlayerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DemonSlayerModVariables.PlayerVariables())).Capacite)).equals("insecte"))) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("world", world);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				SouffleDeLInsecteActifProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
