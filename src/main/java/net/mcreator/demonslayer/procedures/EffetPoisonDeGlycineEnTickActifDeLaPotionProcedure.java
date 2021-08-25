package net.mcreator.demonslayer.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.demonslayer.potion.EffetDemonPotion;
import net.mcreator.demonslayer.entity.MonstreDemonEntity;
import net.mcreator.demonslayer.DemonSlayerModElements;
import net.mcreator.demonslayer.DemonSlayerMod;

import java.util.Map;
import java.util.Collection;

@DemonSlayerModElements.ModElement.Tag
public class EffetPoisonDeGlycineEnTickActifDeLaPotionProcedure extends DemonSlayerModElements.ModElement {
	public EffetPoisonDeGlycineEnTickActifDeLaPotionProcedure(DemonSlayerModElements instance) {
		super(instance, 79);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency entity for procedure EffetPoisonDeGlycineEnTickActifDeLaPotion!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((new Object() {
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
		}.check(entity)) || (entity instanceof MonstreDemonEntity.CustomEntity))) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.REGENERATION);
			}
			if (entity instanceof PlayerEntity) {
				((PlayerEntity) entity).addExhaustion((float) 0.1);
			}
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).attackEntityFrom(new DamageSource("poison_de_glycine").setDamageBypassesArmor(), (float) 1);
			}
		}
	}
}
