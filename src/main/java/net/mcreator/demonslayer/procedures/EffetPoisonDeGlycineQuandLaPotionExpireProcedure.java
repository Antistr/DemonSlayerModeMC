package net.mcreator.demonslayer.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.demonslayer.DemonSlayerModElements;
import net.mcreator.demonslayer.DemonSlayerMod;

import java.util.Map;

@DemonSlayerModElements.ModElement.Tag
public class EffetPoisonDeGlycineQuandLaPotionExpireProcedure extends DemonSlayerModElements.ModElement {
	public EffetPoisonDeGlycineQuandLaPotionExpireProcedure(DemonSlayerModElements instance) {
		super(instance, 86);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency entity for procedure EffetPoisonDeGlycineQuandLaPotionExpire!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 99999, (int) 0, (false), (false)));
	}
}
