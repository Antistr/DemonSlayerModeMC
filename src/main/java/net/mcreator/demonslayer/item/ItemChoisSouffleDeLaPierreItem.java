
package net.mcreator.demonslayer.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.demonslayer.procedures.ItemChoisSouffleDeLaPierreLorsDunClicDroitDansLairProcedure;
import net.mcreator.demonslayer.itemgroup.OngletCapaciteesItemGroup;
import net.mcreator.demonslayer.DemonSlayerModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@DemonSlayerModElements.ModElement.Tag
public class ItemChoisSouffleDeLaPierreItem extends DemonSlayerModElements.ModElement {
	@ObjectHolder("demon_slayer:item_chois_souffle_de_la_pierre")
	public static final Item block = null;
	public ItemChoisSouffleDeLaPierreItem(DemonSlayerModElements instance) {
		super(instance, 58);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(OngletCapaciteesItemGroup.tab).maxStackSize(1).isImmuneToFire().rarity(Rarity.EPIC));
			setRegistryName("item_chois_souffle_de_la_pierre");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 0F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Cr\u00E9er un mur de pierre de 3 bloc de haut et 5 bloc de large"));
			list.add(new StringTextComponent("\u00E0 3 bloc de vous."));
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			ItemStack itemstack = ar.getResult();
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ItemChoisSouffleDeLaPierreLorsDunClicDroitDansLairProcedure.executeProcedure($_dependencies);
			}
			return ar;
		}
	}
}
