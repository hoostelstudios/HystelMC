package com.victor.HystelMC.items;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;

public class CustomAxeItem extends AxeItem
{
	public CustomAxeItem(IItemTier tier, float attackDamage, float attackSpeedIn, Properties builder) 
	{
		super(tier, attackDamage, attackSpeedIn, builder);
	}

	@Override
	public int getBurnTime(ItemStack itemStack)
	{
		return 400;
	}
}
