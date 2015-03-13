package com.mytutorial.tutorial.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ItemChessBoard extends Item {
    public ItemChessBoard () {
        setCreativeTab(CreativeTabs.tabMisc);
        setFull3D();
        setMaxStackSize(16);
    }
}
