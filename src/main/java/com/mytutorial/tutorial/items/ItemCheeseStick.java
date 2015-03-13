package com.mytutorial.tutorial.items;

import net.minecraft.item.Item;
import net.minecraft.potion.PotionHelper;

public class ItemCheeseStick extends Item {
    public ItemCheeseStick () {
        this.setFull3D();
        this.setMaxStackSize(64);
        this.setMaxDamage(1000);
        this.setPotionEffect(PotionHelper.fermentedSpiderEyeEffect);
    }
}
