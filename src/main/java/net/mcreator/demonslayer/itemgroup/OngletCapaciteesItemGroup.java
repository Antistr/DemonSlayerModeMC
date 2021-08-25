
package net.mcreator.demonslayer.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.demonslayer.item.LameDeNichirinItem;
import net.mcreator.demonslayer.DemonSlayerModElements;

@DemonSlayerModElements.ModElement.Tag
public class OngletCapaciteesItemGroup extends DemonSlayerModElements.ModElement {
	public OngletCapaciteesItemGroup(DemonSlayerModElements instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabonglet_capacitees") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LameDeNichirinItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
