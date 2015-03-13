package com.mytutorial.tutorial.blocks;

import com.mytutorial.tutorial.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class OrangeBlock extends Block {

    private String name = "orangeBlock";

    public OrangeBlock() {

        super(Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockName(Constants.MODID + "_" + name);
        GameRegistry.registerBlock(this, name);
    }
}
