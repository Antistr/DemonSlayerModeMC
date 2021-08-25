package net.mcreator.demonslayer.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.demonslayer.potion.EffetPourfendeurPotion;
import net.mcreator.demonslayer.potion.EffetDemonPotion;
import net.mcreator.demonslayer.DemonSlayerModVariables;
import net.mcreator.demonslayer.DemonSlayerModElements;
import net.mcreator.demonslayer.DemonSlayerMod;

import java.util.Map;

@DemonSlayerModElements.ModElement.Tag
public class SangDeMuzanQuandLaNourritureEstMangeeProcedure extends DemonSlayerModElements.ModElement {
	public SangDeMuzanQuandLaNourritureEstMangeeProcedure(DemonSlayerModElements instance) {
		super(instance, 3);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency entity for procedure SangDeMuzanQuandLaNourritureEstMangee!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity.getCapability(DemonSlayerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DemonSlayerModVariables.PlayerVariables())).Pourfendeur) == (true))
				|| (((entity.getCapability(DemonSlayerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DemonSlayerModVariables.PlayerVariables())).Demon) == (false)))) {
			{
				boolean _setval = (boolean) (false);
				entity.getCapability(DemonSlayerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Pourfendeur = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = (boolean) (true);
				entity.getCapability(DemonSlayerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Demon = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 200, (int) 2, (true), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HUNGER, (int) 200, (int) 2, (true), (false)));
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(EffetPourfendeurPotion.potion);
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Vous devenez un d\u00E9mon."), (true));
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(EffetDemonPotion.potion, (int) 99999, (int) 0, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 99999, (int) 0, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 99999, (int) 0, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, (int) 99999, (int) 0, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 99999, (int) 0, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 99999, (int) 0, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, (int) 99999, (int) 0, (false), (false)));
		}
	}
}
