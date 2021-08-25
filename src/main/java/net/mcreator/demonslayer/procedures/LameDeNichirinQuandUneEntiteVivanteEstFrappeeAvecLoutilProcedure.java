package net.mcreator.demonslayer.procedures;

import net.minecraft.util.DamageSource;
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
public class LameDeNichirinQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure extends DemonSlayerModElements.ModElement {
	public LameDeNichirinQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure(DemonSlayerModElements instance) {
		super(instance, 14);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				DemonSlayerMod.LOGGER
						.warn("Failed to load dependency sourceentity for procedure LameDeNichirinQuandUneEntiteVivanteEstFrappeeAvecLoutil!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (((sourceentity instanceof MonstreDemonEntity.CustomEntity) || ((sourceentity instanceof PlayerEntity) && (new Object() {
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
		}.check(sourceentity))))) {
			sourceentity.attackEntityFrom(DamageSource.CRAMMING, (float) 4);
		}
	}
}
