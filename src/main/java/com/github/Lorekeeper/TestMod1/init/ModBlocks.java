package com.github.Lorekeeper.TestMod1.init;

import net.minecraft.block.Block;

import com.github.Lorekeeper.TestMod1.blocks.BlockTitaniumOre;
import com.github.Lorekeeper.TestMod1.help.RegisterHelper;

public class ModBlocks 
{
	public static Block titaniumOre = new BlockTitaniumOre().setBlockName("TitaniumOre");
	
	public static void init()
	{
		RegisterHelper.registerBlock(titaniumOre);
	}
}
