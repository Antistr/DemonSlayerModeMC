
package net.mcreator.demonslayer.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.demonslayer.procedures.SangDeMuzanQuandLaNourritureEstMangeeProcedure;
import net.mcreator.demonslayer.DemonSlayerModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@DemonSlayerModElements.ModElement.Tag
public class SangDeMuzanItem extends DemonSlayerModElements.ModElement {
	@ObjectHolder("demon_slayer:sang_de_muzan")
	public static final Item block = null;
	public SangDeMuzanItem(DemonSlayerModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.EPIC)
					.food((new Food.Builder()).hunger(-2).saturation(-0.5f).setAlwaysEdible().build()));
			setRegistryName("sang_de_muzan");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 20;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.DRINK;
		}

		@Override
		public net.minecraft.util.SoundEvent getEatSound() {
			return net.minecraft.util.SoundEvents.ENTITY_GENERIC_DRINK;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Permet de se transformer en d\u00E9mon."));
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SangDeMuzanQuandLaNourritureEstMangeeProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
