
package net.mcreator.demonslayer.potion;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Potion;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effect;
import net.minecraft.entity.ai.attributes.AttributeModifierManager;
import net.minecraft.entity.LivingEntity;

import net.mcreator.demonslayer.procedures.EffetPoisonDeGlycineQuandLaPotionExpireProcedure;
import net.mcreator.demonslayer.procedures.EffetPoisonDeGlycineEnTickActifDeLaPotionProcedure;
import net.mcreator.demonslayer.DemonSlayerModElements;

import java.util.Map;
import java.util.HashMap;

@DemonSlayerModElements.ModElement.Tag
public class EffetPoisonDeGlycinePotion extends DemonSlayerModElements.ModElement {
	@ObjectHolder("demon_slayer:effet_poison_de_glycine")
	public static final Effect potion = null;
	@ObjectHolder("demon_slayer:effet_poison_de_glycine")
	public static final Potion potionType = null;
	public EffetPoisonDeGlycinePotion(DemonSlayerModElements instance) {
		super(instance, 79);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerEffect(RegistryEvent.Register<Effect> event) {
		event.getRegistry().register(new EffectCustom());
	}

	@SubscribeEvent
	public void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}
	public static class PotionCustom extends Potion {
		public PotionCustom() {
			super(new EffectInstance(potion, 3600));
			setRegistryName("effet_poison_de_glycine");
		}
	}

	public static class EffectCustom extends Effect {
		private final ResourceLocation potionIcon;
		public EffectCustom() {
			super(EffectType.HARMFUL, -3368449);
			setRegistryName("effet_poison_de_glycine");
			potionIcon = new ResourceLocation("demon_slayer:textures/wisteriapoison.png");
		}

		@Override
		public String getName() {
			return "effect.effet_poison_de_glycine";
		}

		@Override
		public boolean isBeneficial() {
			return false;
		}

		@Override
		public boolean isInstant() {
			return false;
		}

		@Override
		public boolean shouldRenderInvText(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRender(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRenderHUD(EffectInstance effect) {
			return true;
		}

		@Override
		public void performEffect(LivingEntity entity, int amplifier) {
			World world = entity.world;
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				EffetPoisonDeGlycineEnTickActifDeLaPotionProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		public void removeAttributesModifiersFromEntity(LivingEntity entity, AttributeModifierManager attributeMapIn, int amplifier) {
			super.removeAttributesModifiersFromEntity(entity, attributeMapIn, amplifier);
			World world = entity.world;
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				EffetPoisonDeGlycineQuandLaPotionExpireProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		public boolean isReady(int duration, int amplifier) {
			return true;
		}
	}
}
