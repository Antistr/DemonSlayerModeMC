
package net.mcreator.demonslayer.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.demonslayer.procedures.LameDeNichirinRoseQuandLoutilEstDansLinventaireParTickProcedure;
import net.mcreator.demonslayer.procedures.LameDeNichirinQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure;
import net.mcreator.demonslayer.procedures.LameDeNichirinLorsqueLoutilEstDansLaMainProcedure;
import net.mcreator.demonslayer.DemonSlayerModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@DemonSlayerModElements.ModElement.Tag
public class LameDeNichirinRoseItem extends DemonSlayerModElements.ModElement {
	@ObjectHolder("demon_slayer:lame_de_nichirin_rose")
	public static final Item block = null;
	public LameDeNichirinRoseItem(DemonSlayerModElements instance) {
		super(instance, 41);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 300;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PepiteEcarlateItem.block, (int) (1)));
			}
		}, 3, 6f, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("Arme des Pourfendeur"));
				list.add(new StringTextComponent("Elle vous donne l'effet Boost de vie"));
			}

			@Override
			public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
				boolean retval = super.hitEntity(itemstack, entity, sourceentity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("sourceentity", sourceentity);
					LameDeNichirinQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}

			@Override
			public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
				super.inventoryTick(itemstack, world, entity, slot, selected);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				if (selected) {
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					LameDeNichirinLorsqueLoutilEstDansLaMainProcedure.executeProcedure($_dependencies);
				}
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					LameDeNichirinRoseQuandLoutilEstDansLinventaireParTickProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("lame_de_nichirin_rose"));
	}
}
