package net.mcreator.demonslayer.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.demonslayer.DemonSlayerModElements;
import net.mcreator.demonslayer.DemonSlayerMod;

import java.util.Map;

@DemonSlayerModElements.ModElement.Tag
public class PouvoireSangunaireSangEnflameActifProcedure extends DemonSlayerModElements.ModElement {
	public PouvoireSangunaireSangEnflameActifProcedure(DemonSlayerModElements instance) {
		super(instance, 89);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency entity for procedure PouvoireSangunaireSangEnflameActif!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency x for procedure PouvoireSangunaireSangEnflameActif!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency y for procedure PouvoireSangunaireSangEnflameActif!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency z for procedure PouvoireSangunaireSangEnflameActif!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency world for procedure PouvoireSangunaireSangEnflameActif!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double vie = 0;
		while ((true)) {
			vie = (double) ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1);
			if (((vie) != ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1))) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, (int) 60, (int) 1));
				world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)), Blocks.FIRE.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)), Blocks.FIRE.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)), Blocks.FIRE.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)), Blocks.FIRE.getDefaultState(), 3);
			}
		}
	}
}
