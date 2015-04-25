package com.github.Lorekeeper.TestMod1.items;


import com.github.Lorekeeper.TestMod1.help.Reference;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TestMod1Item extends Item
{
	public TestMod1Item()
	{
		super();
		setCreativeTab(CreativeTabs.tabMisc);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister)
	{
		itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + this.getUnlocalizedName().substring(5));
	}
	

}
