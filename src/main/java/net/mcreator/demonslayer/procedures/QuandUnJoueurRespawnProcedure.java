package net.mcreator.demonslayer.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.demonslayer.potion.EffetPourfendeurPotion;
import net.mcreator.demonslayer.potion.EffetDemonPotion;
import net.mcreator.demonslayer.DemonSlayerModVariables;
import net.mcreator.demonslayer.DemonSlayerModElements;
import net.mcreator.demonslayer.DemonSlayerMod;

import java.util.Map;
import java.util.HashMap;

@DemonSlayerModElements.ModElement.Tag
public class QuandUnJoueurRespawnProcedure extends DemonSlayerModElements.ModElement {
	public QuandUnJoueurRespawnProcedure(DemonSlayerModElements instance) {
		super(instance, 23);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency entity for procedure QuandUnJoueurRespawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity.getCapability(DemonSlayerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DemonSlayerModVariables.PlayerVariables())).Pourfendeur) == (true))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(EffetPourfendeurPotion.potion, (int) 99999, (int) 0, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 99999, (int) 0, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 99999, (int) 0, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, (int) 99999, (int) 0, (false), (false)));
		} else if ((((entity.getCapability(DemonSlayerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DemonSlayerModVariables.PlayerVariables())).Demon) == (true))) {
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

	@SubscribeEvent
	public void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
		Entity entity = event.getPlayer();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", entity.getPosX());
		dependencies.put("y", entity.getPosY());
		dependencies.put("z", entity.getPosZ());
		dependencies.put("world", entity.world);
		dependencies.put("entity", entity);
		dependencies.put("endconquered", event.isEndConquered());
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
