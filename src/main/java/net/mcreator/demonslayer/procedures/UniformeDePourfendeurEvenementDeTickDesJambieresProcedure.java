package net.mcreator.demonslayer.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.demonslayer.potion.EffetDemonPotion;
import net.mcreator.demonslayer.DemonSlayerModElements;
import net.mcreator.demonslayer.DemonSlayerMod;

import java.util.Map;
import java.util.Collection;

@DemonSlayerModElements.ModElement.Tag
public class UniformeDePourfendeurEvenementDeTickDesJambieresProcedure extends DemonSlayerModElements.ModElement {
	public UniformeDePourfendeurEvenementDeTickDesJambieresProcedure(DemonSlayerModElements instance) {
		super(instance, 12);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency entity for procedure UniformeDePourfendeurEvenementDeTickDesJambieres!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == EffetDemonPotion.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity))) {
			if (entity instanceof LivingEntity) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.armorInventory.set((int) 1, (ItemStack.EMPTY));
				else
					((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 1),
							(ItemStack.EMPTY));
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
		}
	}
}
