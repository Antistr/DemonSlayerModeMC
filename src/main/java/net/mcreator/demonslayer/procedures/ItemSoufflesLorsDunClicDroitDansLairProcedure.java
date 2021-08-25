package net.mcreator.demonslayer.procedures;

import net.minecraftforge.fml.network.NetworkHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.demonslayer.item.ItemChoixsouffleDeLaBrumeItem;
import net.mcreator.demonslayer.item.ItemChoixSouffleDuVentItem;
import net.mcreator.demonslayer.item.ItemChoixSouffleDeLInsecteItem;
import net.mcreator.demonslayer.item.ItemChoixSouffleDeLEauItem;
import net.mcreator.demonslayer.item.ItemChoisSouffleDuTonnerreItem;
import net.mcreator.demonslayer.item.ItemChoisSouffleDeLaPierreItem;
import net.mcreator.demonslayer.item.ItemChoisSouffleDeLaBeteItem;
import net.mcreator.demonslayer.item.ItemChoisSouffleDeLAmourItem;
import net.mcreator.demonslayer.item.ItemChoisSouffleDeFeuItem;
import net.mcreator.demonslayer.gui.GUIChoixSouffleGui;
import net.mcreator.demonslayer.DemonSlayerModVariables;
import net.mcreator.demonslayer.DemonSlayerModElements;
import net.mcreator.demonslayer.DemonSlayerMod;

import java.util.function.Supplier;
import java.util.Map;

import io.netty.buffer.Unpooled;

@DemonSlayerModElements.ModElement.Tag
public class ItemSoufflesLorsDunClicDroitDansLairProcedure extends DemonSlayerModElements.ModElement {
	public ItemSoufflesLorsDunClicDroitDansLairProcedure(DemonSlayerModElements instance) {
		super(instance, 36);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency entity for procedure ItemSoufflesLorsDunClicDroitDansLair!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency x for procedure ItemSoufflesLorsDunClicDroitDansLair!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency y for procedure ItemSoufflesLorsDunClicDroitDansLair!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency z for procedure ItemSoufflesLorsDunClicDroitDansLair!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency world for procedure ItemSoufflesLorsDunClicDroitDansLair!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity.getCapability(DemonSlayerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DemonSlayerModVariables.PlayerVariables())).Pourfendeur) == (true))) {
			{
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
					NetworkHooks.openGui((ServerPlayerEntity) _ent, new INamedContainerProvider() {
						@Override
						public ITextComponent getDisplayName() {
							return new StringTextComponent("GUIChoixSouffle");
						}

						@Override
						public Container createMenu(int id, PlayerInventory inventory, PlayerEntity player) {
							return new GUIChoixSouffleGui.GuiContainerMod(id, inventory, new PacketBuffer(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (entity instanceof PlayerEntity) {
				Container _current = ((PlayerEntity) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemChoisSouffleDeFeuItem.block, (int) (1));
						_setstack.setCount((int) 1);
						((Slot) ((Map) invobj).get((int) (0))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof PlayerEntity) {
				Container _current = ((PlayerEntity) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemChoisSouffleDuTonnerreItem.block, (int) (1));
						_setstack.setCount((int) 1);
						((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof PlayerEntity) {
				Container _current = ((PlayerEntity) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemChoisSouffleDeLaBeteItem.block, (int) (1));
						_setstack.setCount((int) 1);
						((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof PlayerEntity) {
				Container _current = ((PlayerEntity) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemChoisSouffleDeLAmourItem.block, (int) (1));
						_setstack.setCount((int) 1);
						((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof PlayerEntity) {
				Container _current = ((PlayerEntity) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemChoisSouffleDeLaPierreItem.block, (int) (1));
						_setstack.setCount((int) 1);
						((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof PlayerEntity) {
				Container _current = ((PlayerEntity) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemChoixSouffleDeLEauItem.block, (int) (1));
						_setstack.setCount((int) 1);
						((Slot) ((Map) invobj).get((int) (5))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof PlayerEntity) {
				Container _current = ((PlayerEntity) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemChoixsouffleDeLaBrumeItem.block, (int) (1));
						_setstack.setCount((int) 1);
						((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof PlayerEntity) {
				Container _current = ((PlayerEntity) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemChoixSouffleDuVentItem.block, (int) (1));
						_setstack.setCount((int) 1);
						((Slot) ((Map) invobj).get((int) (7))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof PlayerEntity) {
				Container _current = ((PlayerEntity) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemChoixSouffleDeLInsecteItem.block, (int) (1));
						_setstack.setCount((int) 1);
						((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
		} else {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Vous n'etes pas Pourfendeur."), (false));
			}
		}
	}
}
