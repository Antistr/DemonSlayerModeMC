package net.mcreator.demonslayer.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.demonslayer.potion.EffetPourfendeurPotion;
import net.mcreator.demonslayer.item.UniformeDePourfendeurItem;
import net.mcreator.demonslayer.item.LameDeNichirinItem;
import net.mcreator.demonslayer.item.ItemSoufflesItem;
import net.mcreator.demonslayer.DemonSlayerModVariables;
import net.mcreator.demonslayer.DemonSlayerModElements;
import net.mcreator.demonslayer.DemonSlayerMod;

import java.util.Map;

@DemonSlayerModElements.ModElement.Tag
public class MonstreDemonQuandLentiteMeurtProcedure extends DemonSlayerModElements.ModElement {
	public MonstreDemonQuandLentiteMeurtProcedure(DemonSlayerModElements instance) {
		super(instance, 16);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency entity for procedure MonstreDemonQuandLentiteMeurt!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				DemonSlayerMod.LOGGER.warn("Failed to load dependency sourceentity for procedure MonstreDemonQuandLentiteMeurt!");
			return;
		}

		//Il faut modifier les conditions pour que entity devienne sourceentity
		
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (((((sourceentity.getCapability(DemonSlayerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DemonSlayerModVariables.PlayerVariables())).Demon) == (false)) == (((sourceentity
						.getCapability(DemonSlayerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DemonSlayerModVariables.PlayerVariables())).Pourfendeur) == (false)))) {
			{
				boolean _setval = (boolean) (true);
				sourceentity.getCapability(DemonSlayerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Pourfendeur = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(EffetPourfendeurPotion.potion, (int) 99999, (int) 0, (false), (false)));
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 99999, (int) 0, (false), (false)));
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 99999, (int) 0, (false), (false)));
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, (int) 99999, (int) 0, (false), (false)));
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(new StringTextComponent("Tu deviens un Pourfendeur."), (true));
			}
			if (sourceentity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(LameDeNichirinItem.block, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
			}
			if (sourceentity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(UniformeDePourfendeurItem.body, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
			}
			if (sourceentity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(UniformeDePourfendeurItem.legs, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
			}
			if (sourceentity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(ItemSoufflesItem.block, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
			}
		}
	}
}
