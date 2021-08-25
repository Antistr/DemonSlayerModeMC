package net.mcreator.demonslayer.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.demonslayer.item.LameDeNichirinVerteItem;
import net.mcreator.demonslayer.item.LameDeNichirinRougeItem;
import net.mcreator.demonslayer.item.LameDeNichirinRoseItem;
import net.mcreator.demonslayer.item.LameDeNichirinNoireItem;
import net.mcreator.demonslayer.item.LameDeNichirinJauneItem;
import net.mcreator.demonslayer.item.LameDeNichirinIndigoItem;
import net.mcreator.demonslayer.item.LameDeNichirinGrisItem;
import net.mcreator.demonslayer.item.LameDeNichirinBleuItem;
import net.mcreator.demonslayer.item.LameDeNichirinBlancItem;
import net.mcreator.demonslayer.DemonSlayerModElements;
import net.mcreator.demonslayer.DemonSlayerMod;

import java.util.Map;

@DemonSlayerModElements.ModElement.Tag
public class LameDeNichirinLorsDunClicDroitDansLairProcedure extends DemonSlayerModElements.ModElement {
	public LameDeNichirinLorsDunClicDroitDansLairProcedure(DemonSlayerModElements instance) {
		super(instance, 75);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency entity for procedure LameDeNichirinLorsDunClicDroitDansLair!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency x for procedure LameDeNichirinLorsDunClicDroitDansLair!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency y for procedure LameDeNichirinLorsDunClicDroitDansLair!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency z for procedure LameDeNichirinLorsDunClicDroitDansLair!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency world for procedure LameDeNichirinLorsDunClicDroitDansLair!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double coloration = 0;
		if (entity instanceof LivingEntity) {
			ItemStack _setstack = (ItemStack.EMPTY);
			_setstack.setCount((int) 1);
			((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
			if (entity instanceof ServerPlayerEntity)
				((ServerPlayerEntity) entity).inventory.markDirty();
		}
		coloration = (double) Math.floor(((Math.random() * 9) + 1));
		if (((coloration) == 1)) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("La lame se colore en noire."), (false));
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(LameDeNichirinNoireItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		} else if (((coloration) == 2)) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("La lame se colore en rouge."), (false));
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(LameDeNichirinRougeItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		} else if (((coloration) == 3)) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("La lame se colore en jaune."), (false));
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(LameDeNichirinJauneItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		} else if (((coloration) == 4)) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("La lame se colore en bleu."), (false));
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(LameDeNichirinBleuItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		} else if (((coloration) == 5)) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("La lame se colore en vert."), (false));
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(LameDeNichirinVerteItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		} else if (((coloration) == 6)) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("La lame se colore en gris."), (false));
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(LameDeNichirinGrisItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		} else if (((coloration) == 7)) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("La lame se colore en rose."), (false));
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(LameDeNichirinRoseItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		} else if (((coloration) == 8)) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("La lame se colore en indigo."), (false));
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(LameDeNichirinIndigoItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		} else if (((coloration) == 9)) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("La lame se colore en blanc."), (false));
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(LameDeNichirinBlancItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		}
	}
}
