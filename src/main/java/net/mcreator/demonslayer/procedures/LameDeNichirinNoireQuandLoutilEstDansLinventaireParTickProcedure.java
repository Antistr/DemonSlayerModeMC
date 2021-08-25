package net.mcreator.demonslayer.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.demonslayer.DemonSlayerModElements;
import net.mcreator.demonslayer.DemonSlayerMod;

import java.util.Map;

@DemonSlayerModElements.ModElement.Tag
public class LameDeNichirinNoireQuandLoutilEstDansLinventaireParTickProcedure extends DemonSlayerModElements.ModElement {
	public LameDeNichirinNoireQuandLoutilEstDansLinventaireParTickProcedure(DemonSlayerModElements instance) {
		super(instance, 51);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency entity for procedure LameDeNichirinNoireQuandLoutilEstDansLinventaireParTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HERO_OF_THE_VILLAGE, (int) 60, (int) 0, (false), (false)));
	}
}
