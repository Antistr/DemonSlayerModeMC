package net.mcreator.demonslayer.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.demonslayer.potion.EffetDemonPotion;
import net.mcreator.demonslayer.DemonSlayerModElements;
import net.mcreator.demonslayer.DemonSlayerMod;

import java.util.Map;
import java.util.Collection;

@DemonSlayerModElements.ModElement.Tag
public class MobPourfendeurQuandLentiteMeurtProcedure extends DemonSlayerModElements.ModElement {
	public MobPourfendeurQuandLentiteMeurtProcedure(DemonSlayerModElements instance) {
		super(instance, 20);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency sourceentity for procedure MobPourfendeurQuandLentiteMeurt!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
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
		}.check(sourceentity))) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.SATURATION, (int) 60, (int) 1));
		}
	}
}
