
package net.mcreator.alvas_season_three.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.alvas_season_three.itemgroup.AlvasSeason3ItemGroup;
import net.mcreator.alvas_season_three.AlvasSeason3ModElements;

@AlvasSeason3ModElements.ModElement.Tag
public class RawTinItem extends AlvasSeason3ModElements.ModElement {
	@ObjectHolder("alvas_season_3:raw_tin")
	public static final Item block = null;

	public RawTinItem(AlvasSeason3ModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(AlvasSeason3ItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("raw_tin");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
