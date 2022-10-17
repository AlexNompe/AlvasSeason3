
package net.mcreator.alvas_season_three.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.alvas_season_three.itemgroup.AlvasSeason3ItemGroup;
import net.mcreator.alvas_season_three.AlvasSeason3ModElements;

@AlvasSeason3ModElements.ModElement.Tag
public class AlluminiumSwordItem extends AlvasSeason3ModElements.ModElement {
	@ObjectHolder("alvas_season_3:alluminium_sword")
	public static final Item block = null;

	public AlluminiumSwordItem(AlvasSeason3ModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 300;
			}

			public float getEfficiency() {
				return 5.5f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AlluminiumIngotItem.block));
			}
		}, 3, -2.4f, new Item.Properties().group(AlvasSeason3ItemGroup.tab)) {
		}.setRegistryName("alluminium_sword"));
	}
}
