package com.github.Lorekeeper.TestMod1.init;


import com.github.Lorekeeper.TestMod1.help.RegisterHelper;
import com.github.Lorekeeper.TestMod1.items.TestMod1Item;
import net.minecraft.item.Item;

public class ModItems 
{
	public static Item ebonyIngot = new TestMod1Item().setUnlocalizedName("ebonyIngot");
	public static void init()
	{
		RegisterHelper.registerItem(ebonyIngot);
	}
}
