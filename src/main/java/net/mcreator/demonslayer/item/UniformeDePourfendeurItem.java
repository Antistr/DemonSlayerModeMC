
package net.mcreator.demonslayer.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.demonslayer.procedures.UniformeDePourfendeurEvenementDeTickDuPlastronProcedure;
import net.mcreator.demonslayer.procedures.UniformeDePourfendeurEvenementDeTickDesJambieresProcedure;
import net.mcreator.demonslayer.DemonSlayerModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@DemonSlayerModElements.ModElement.Tag
public class UniformeDePourfendeurItem extends DemonSlayerModElements.ModElement {
	@ObjectHolder("demon_slayer:uniforme_de_pourfendeur_helmet")
	public static final Item helmet = null;
	@ObjectHolder("demon_slayer:uniforme_de_pourfendeur_chestplate")
	public static final Item body = null;
	@ObjectHolder("demon_slayer:uniforme_de_pourfendeur_leggings")
	public static final Item legs = null;
	@ObjectHolder("demon_slayer:uniforme_de_pourfendeur_boots")
	public static final Item boots = null;
	public UniformeDePourfendeurItem(DemonSlayerModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 30;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{0, 9, 11, 0}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 11;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather"));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PepiteEcarlateItem.block, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "uniforme_de_pourfendeur";
			}

			@Override
			public float getToughness() {
				return 2.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("Haut de l'uniforme de Pourfendeur."));
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "demon_slayer:textures/models/armor/test_armure_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					UniformeDePourfendeurEvenementDeTickDuPlastronProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("uniforme_de_pourfendeur_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("Bas de l'uniforme de Pourfendeur."));
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "demon_slayer:textures/models/armor/test_armure_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					UniformeDePourfendeurEvenementDeTickDesJambieresProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("uniforme_de_pourfendeur_leggings"));
	}
}
