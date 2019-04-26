package com.random83.AnAttempt.items;

import com.random83.AnAttempt.Main;
import com.random83.AnAttempt.init.ModItems;
import com.random83.AnAttempt.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {	
		Main.proxy.registerItemRenderer(this,0,"inventory");
	}

}
