package net.mcreator.demonslayer.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.Entity;

import net.mcreator.demonslayer.DemonSlayerModElements;
import net.mcreator.demonslayer.DemonSlayerMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

@DemonSlayerModElements.ModElement.Tag
public class SouffleDeLAmourActifProcedure extends DemonSlayerModElements.ModElement {
	public SouffleDeLAmourActifProcedure(DemonSlayerModElements instance) {
		super(instance, 71);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency entity for procedure SouffleDeLAmourActif!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency x for procedure SouffleDeLAmourActif!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency y for procedure SouffleDeLAmourActif!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency z for procedure SouffleDeLAmourActif!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency world for procedure SouffleDeLAmourActif!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (10 / 2d), y - (10 / 2d), z - (10 / 2d), x + (10 / 2d), y + (10 / 2d), z + (10 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if ((entityiterator instanceof TameableEntity) && (entity instanceof PlayerEntity)) {
					((TameableEntity) entityiterator).setTamed(true);
					((TameableEntity) entityiterator).setTamedBy((PlayerEntity) entity);
				}
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(
							new StringTextComponent(
									(("Vous avez apprivois\u00E9 une entit\u00E9 de type ") + "" + ((entityiterator.getDisplayName().getString())))),
							(true));
				}
			}
		}
	}
}
