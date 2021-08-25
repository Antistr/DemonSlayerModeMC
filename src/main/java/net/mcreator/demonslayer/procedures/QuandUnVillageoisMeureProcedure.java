package net.mcreator.demonslayer.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.demonslayer.potion.EffetDemonPotion;
import net.mcreator.demonslayer.DemonSlayerModElements;
import net.mcreator.demonslayer.DemonSlayerMod;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

@DemonSlayerModElements.ModElement.Tag
public class QuandUnVillageoisMeureProcedure extends DemonSlayerModElements.ModElement {
	public QuandUnVillageoisMeureProcedure(DemonSlayerModElements instance) {
		super(instance, 32);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency entity for procedure QuandUnVillageoisMeure!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency sourceentity for procedure QuandUnVillageoisMeure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (((sourceentity instanceof VillagerEntity) && ((entity instanceof PlayerEntity) && (new Object() {
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
		}.check(entity))))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SATURATION, (int) 60, (int) 2, (false), (false)));
		}
	}

	@SubscribeEvent
	public void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			Entity sourceentity = event.getSource().getTrueSource();
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			World world = entity.world;
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("sourceentity", sourceentity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
