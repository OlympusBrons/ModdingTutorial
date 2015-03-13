package com.mytutorial.tutorial;

import com.mytutorial.tutorial.blocks.BlockCheese;
import com.mytutorial.tutorial.blocks.JBlock;
import com.mytutorial.tutorial.blocks.ModBlocks;
import com.mytutorial.tutorial.items.*;
import com.mytutorial.tutorial.lib.Constants;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class Tutorial {

    // Tools/Weapons
    public static Item cheesePickaxe;
    public static Item cheeseAxe;
    public static Item cheeseShovel;
    public static Item cheeseHoe;
    public static Item cheeseSword;
    public static Item cheeseStick;


    // Misc
    public static Item itemTable;
    public static Item itemChessboard;
    public static Item itemLightsaber;
    //Food
    public static Item itemCheese;
    public static Item itemGrilledCheese;
    //Blocks
    public static Block jBlock;
    public static Block blockCheese;

    public static final Item.ToolMaterial cheeseToolMaterial = EnumHelper.addToolMaterial("cheeseToolMaterial", 4, 5500, 20.0F, 7.0f, 20);


    @Mod.EventHandler
    public void preInit (FMLPreInitializationEvent event) {
        // Item/Block init and registering

// ------------------------------------------------ //
//               Tools / Weapons                    //
// ------------------------------------------------ //

        cheesePickaxe = new ItemCheesePickaxe(cheeseToolMaterial).setUnlocalizedName("ItemCheesePickaxe").setCreativeTab(tabTutorialMod).setTextureName("tutorialorange:itemcheesepickaxe");
        cheeseAxe = new ItemCheeseAxe(cheeseToolMaterial).setUnlocalizedName("ItemCheeseAxe").setCreativeTab(tabTutorialMod).setTextureName("tutorialorange:itemcheeseaxe");
        cheeseShovel = new ItemCheeseShovel(cheeseToolMaterial).setUnlocalizedName("ItemCheeseHoe").setCreativeTab(tabTutorialMod).setTextureName("tutorialorange:itemcheeseshovel");
        cheeseHoe = new ItemCheeseHoe(cheeseToolMaterial).setUnlocalizedName("ItemCheeseShovel").setCreativeTab(tabTutorialMod).setTextureName("tutorialorange:itemcheesehoe");
        cheeseSword = new ItemCheeseSword(cheeseToolMaterial).setUnlocalizedName("ItemCheeseSword").setCreativeTab(tabTutorialMod).setTextureName("tutorialorange:itemcheesesword");
        cheeseStick = new ItemCheeseStick().setUnlocalizedName("ItemCheeseStick").setCreativeTab(tabTutorialMod).setTextureName("tutorialorange:itemcheesestick");

// ------------------------------------------------ //
//                    Blocks                        //
// ------------------------------------------------ //

        ModBlocks.init();
        jBlock = new JBlock(Material.wood).setBlockName("JBlock").setBlockTextureName("tutorialorange:blockjarronface").setCreativeTab(CreativeTabs.tabBlock).setCreativeTab(tabTutorialMod);
        blockCheese = new BlockCheese(Material.rock).setBlockName("BlockCheese").setBlockTextureName("tutorialorange:blockcheese").setCreativeTab(CreativeTabs.tabBlock).setCreativeTab(tabTutorialMod);

// ------------------------------------------------ //
//                    Items                         //
// ------------------------------------------------ //

        itemTable = new ItemTable().setUnlocalizedName("ItemTable").setTextureName("tutorialorange:itemtable");
        itemChessboard = new ItemChessBoard().setUnlocalizedName("ItemChessboard").setTextureName("tutorialorange:itemchessboard");
        itemLightsaber = new ItemLightSaber().setUnlocalizedName("ItemLightsaber").setTextureName("tutorialorange:itemlightsaber");

        // Food

        itemCheese = new ItemFood(8, 0.5f, false).setUnlocalizedName("ItemCheese").setTextureName("tutorialorange:itemcheese").setCreativeTab(tabTutorialMod);
        itemGrilledCheese = new ItemFood(16, 1.0f, true).setUnlocalizedName("ItemGrilledCheese").setTextureName("tutorialorange:itemgrilledcheese").setCreativeTab(tabTutorialMod);

        // X * 0.5 = 10 hunger

// ------------------------------------------------ //
//                  Registration                    //
// ------------------------------------------------ //

        GameRegistry.registerBlock(jBlock, "JBlock");
        GameRegistry.registerBlock(blockCheese, "BlockCheese");
        GameRegistry.registerItem(itemTable, itemTable.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemChessboard, itemChessboard.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemLightsaber, itemLightsaber.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemCheese, itemCheese.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemGrilledCheese, itemGrilledCheese.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheesePickaxe, cheesePickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheeseAxe, cheeseAxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheeseShovel, cheeseShovel.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheeseHoe, cheeseHoe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheeseSword, cheeseSword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheeseStick, cheeseStick.getUnlocalizedName().substring(5));

// ------------------------------------------------ //
//                   Smelting                       //
// ------------------------------------------------ //
        GameRegistry.addSmelting(itemCheese, new ItemStack(itemGrilledCheese), 5.0f);

    }

    @Mod.EventHandler
    public void init (FMLInitializationEvent event) {
        // Proxy, TileEntity, entity, GUI and Packet Registering

// ------------------------------------------------ //
//                Crafting Recipes                  //
// ------------------------------------------------ //

        GameRegistry.addRecipe(new ItemStack(itemTable), new Object[]{"WWW", " W ", " W ", 'W', Blocks.planks});

        GameRegistry.addRecipe(new ItemStack(cheesePickaxe), new Object[]{"CCC"," S "," S ", 'C', itemGrilledCheese, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(cheeseAxe), new Object[]{"CC","CS"," S",  'C', itemGrilledCheese, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(cheeseAxe), new Object[]{"CC","SC","S ",  'C', itemGrilledCheese, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(cheeseShovel), new Object[]{"C","S","S",'C', itemGrilledCheese, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(cheeseHoe), new Object[]{"CC"," S"," S",'C', itemGrilledCheese, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(cheeseHoe), new Object[]{"CC","S ","S ",'C', itemGrilledCheese, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(cheeseSword), new Object[]{"C","C","S",'C', itemGrilledCheese, 'S', Items.stick});


    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event) {

    }

// ------------------------------------------------ //
//                  Creative Tabs                   //
// ------------------------------------------------ //

    public static CreativeTabs tabTutorialMod = new CreativeTabs("tabTutorialMod") {
        @Override
        public Item getTabIconItem () {
            return new ItemStack(Items.cooked_chicken).getItem();
        }
    };
}
