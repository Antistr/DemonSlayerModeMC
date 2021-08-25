package net.mcreator.demonslayer.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.demonslayer.DemonSlayerModElements;
import net.mcreator.demonslayer.DemonSlayerMod;

import java.util.Map;

@DemonSlayerModElements.ModElement.Tag
public class EffetDemonEnTickActifDeLaPotionProcedure extends DemonSlayerModElements.ModElement {
	public EffetDemonEnTickActifDeLaPotionProcedure(DemonSlayerModElements instance) {
		super(instance, 2);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency entity for procedure EffetDemonEnTickActifDeLaPotion!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency world for procedure EffetDemonEnTickActifDeLaPotion!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((world instanceof World) ? ((World) world).isDaytime() : false)
				&& (world.canBlockSeeSky(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ())))))) {
			if ((!world.getWorldInfo().isRaining())) {
				entity.attackEntityFrom(DamageSource.CRAMMING, (float) 4);
			}
		}
	}
}
