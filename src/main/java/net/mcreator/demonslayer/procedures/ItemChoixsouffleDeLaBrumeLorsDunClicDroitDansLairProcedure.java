package net.mcreator.demonslayer.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.demonslayer.DemonSlayerModVariables;
import net.mcreator.demonslayer.DemonSlayerModElements;
import net.mcreator.demonslayer.DemonSlayerMod;

import java.util.Map;

@DemonSlayerModElements.ModElement.Tag
public class ItemChoixsouffleDeLaBrumeLorsDunClicDroitDansLairProcedure extends DemonSlayerModElements.ModElement {
	public ItemChoixsouffleDeLaBrumeLorsDunClicDroitDansLairProcedure(DemonSlayerModElements instance) {
		super(instance, 63);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency entity for procedure ItemChoixsouffleDeLaBrumeLorsDunClicDroitDansLair!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			String _setval = (String) "brume";
			entity.getCapability(DemonSlayerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Capacite = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Vous apprenez le souffle de la brume."), (false));
		}
		if (entity instanceof LivingEntity) {
			ItemStack _setstack = (ItemStack.EMPTY);
			_setstack.setCount((int) 1);
			((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
			if (entity instanceof ServerPlayerEntity)
				((ServerPlayerEntity) entity).inventory.markDirty();
		}
	}
}
