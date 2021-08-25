package net.mcreator.demonslayer.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.demonslayer.item.ItemSoufflesItem;
import net.mcreator.demonslayer.item.ItemPouvoirsSanguinairesItem;
import net.mcreator.demonslayer.DemonSlayerModElements;
import net.mcreator.demonslayer.DemonSlayerMod;

import java.util.function.Supplier;
import java.util.Map;

@DemonSlayerModElements.ModElement.Tag
public class GUIChoixSouffleQuandLeGUIEstFermeProcedure extends DemonSlayerModElements.ModElement {
	public GUIChoixSouffleQuandLeGUIEstFermeProcedure(DemonSlayerModElements instance) {
		super(instance, 73);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency entity for procedure GUIChoixSouffleQuandLeGUIEstFerme!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(ItemSoufflesItem.block, (int) (1));
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(ItemPouvoirsSanguinairesItem.block, (int) (1));
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		if (entity instanceof ServerPlayerEntity) {
			Container _current = ((ServerPlayerEntity) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					((Slot) ((Map) invobj).get((int) (0))).putStack(ItemStack.EMPTY);
					_current.detectAndSendChanges();
				}
			}
		}
		if (entity instanceof ServerPlayerEntity) {
			Container _current = ((ServerPlayerEntity) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					((Slot) ((Map) invobj).get((int) (1))).putStack(ItemStack.EMPTY);
					_current.detectAndSendChanges();
				}
			}
		}
		if (entity instanceof ServerPlayerEntity) {
			Container _current = ((ServerPlayerEntity) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					((Slot) ((Map) invobj).get((int) (2))).putStack(ItemStack.EMPTY);
					_current.detectAndSendChanges();
				}
			}
		}
		if (entity instanceof ServerPlayerEntity) {
			Container _current = ((ServerPlayerEntity) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					((Slot) ((Map) invobj).get((int) (3))).putStack(ItemStack.EMPTY);
					_current.detectAndSendChanges();
				}
			}
		}
		if (entity instanceof ServerPlayerEntity) {
			Container _current = ((ServerPlayerEntity) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					((Slot) ((Map) invobj).get((int) (4))).putStack(ItemStack.EMPTY);
					_current.detectAndSendChanges();
				}
			}
		}
		if (entity instanceof ServerPlayerEntity) {
			Container _current = ((ServerPlayerEntity) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					((Slot) ((Map) invobj).get((int) (5))).putStack(ItemStack.EMPTY);
					_current.detectAndSendChanges();
				}
			}
		}
		if (entity instanceof ServerPlayerEntity) {
			Container _current = ((ServerPlayerEntity) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					((Slot) ((Map) invobj).get((int) (6))).putStack(ItemStack.EMPTY);
					_current.detectAndSendChanges();
				}
			}
		}
		if (entity instanceof ServerPlayerEntity) {
			Container _current = ((ServerPlayerEntity) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					((Slot) ((Map) invobj).get((int) (7))).putStack(ItemStack.EMPTY);
					_current.detectAndSendChanges();
				}
			}
		}
	}
}
