package com.mytutorial.tutorial.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class BlockCheese extends Block {

    public BlockCheese(Material material) {
        super(material);
        this.setHardness(0.5f);
        this.setHarvestLevel("pickaxe", 4);
        this.setLightLevel(0.3f);
        this.setLightOpacity(2); // 16 - x = y
        this.setStepSound(this.soundTypeCloth);
    }

    @Override
    public boolean isOpaqueCube () {
        return false;
    }
}
