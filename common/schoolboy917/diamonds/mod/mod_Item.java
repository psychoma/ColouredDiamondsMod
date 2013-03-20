package schoolboy917.ColouredDiamondsMod.mod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.BaseMod;
import net.minecraft.src.ModLoader;

public class mod_Item extends BaseMod 
{

	public static Item WhiteDiamond = new Item(9210).setItemName("WhiteDiamond").setCreativeTab(CreativeTabs.tabMaterials);	
	public static Item OrangeDiamond = new Item(9211).setItemName("OrangeDiamond").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item MagentaDiamond = new Item(9212).setItemName("MagentaDiamond").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item LightBlueDiamond = new Item(9213).setItemName("LightBlueDiamond").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item YellowDiamond = new Item(9214).setItemName("YellowDiamond").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item LimeDiamond = new Item(9215).setItemName("LimeDiamond").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item PinkDiamond = new Item(9216).setItemName("PinkDiamond").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item GrayDiamond = new Item(9217).setItemName("GrayDiamond").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item LightGrayDiamond = new Item(9218).setItemName("LightGrayDiamond").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item CyanDiamond = new Item(9219).setItemName("CyanDiamond").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item PurpleDiamond = new Item(9220).setItemName("PurpleDiamond").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item BlueDiamond = new Item(9221).setItemName("BlueDiamond").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item BrownDiamond = new Item(9222).setItemName("BrownDiamond").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item GreenDiamond = new Item(9223).setItemName("GreenDiamond").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item RedDiamond = new Item(9224).setItemName("RedDiamond").setCreativeTab(CreativeTabs.tabMaterials);
	public static Item BlackDiamond = new Item(9225).setItemName("BlackDiamond").setCreativeTab(CreativeTabs.tabMaterials);
	
	public mod_Item() {
		ModLoader.addName(WhiteDiamond, "White Diamond");
		WhiteDiamond.iconIndex = ModLoader.addOverride("/gui/items.png", "/ColouredDiamondsMod/gems/diamond_white.png");
		ModLoader.addName(OrangeDiamond, "Orange Diamond");
		OrangeDiamond.iconIndex = ModLoader.addOverride("/gui/items.png", "/ColouredDiamondsMod/gems/diamond_orange.png");
		ModLoader.addName(MagentaDiamond, "Magenta Diamond");
		MagentaDiamond.iconIndex = ModLoader.addOverride("/gui/items.png", "/ColouredDiamondsMod/gems/diamond_magenta.png");
		ModLoader.addName(LightBlueDiamond, "Light Blue Diamond");
		LightBlueDiamond.iconIndex = ModLoader.addOverride("/gui/items.png", "/ColouredDiamondsMod/gems/diamond_light_blue.png");
		ModLoader.addName(YellowDiamond, "Yellow Diamond");
		YellowDiamond.iconIndex = ModLoader.addOverride("/gui/items.png", "/ColouredDiamondsMod/gems/diamond_yellow.png");
		ModLoader.addName(LimeDiamond, "Lime Diamond");
		LimeDiamond.iconIndex = ModLoader.addOverride("/gui/items.png", "/ColouredDiamondsMod/gems/diamond_lime.png");
		ModLoader.addName(PinkDiamond, "Pink Diamond");
		PinkDiamond.iconIndex = ModLoader.addOverride("/gui/items.png", "/ColouredDiamondsMod/gems/diamond_pink.png");
		ModLoader.addName(GrayDiamond, "Gray Diamond");
		GrayDiamond.iconIndex = ModLoader.addOverride("/gui/items.png", "/ColouredDiamondsMod/gems/diamond_gray.png");
		ModLoader.addName(LightGrayDiamond, "Light Gray Diamond");
		LightGrayDiamond.iconIndex = ModLoader.addOverride("/gui/items.png", "/ColouredDiamondsMod/gems/diamond_light_gray.png");
		ModLoader.addName(CyanDiamond, "Cyan Diamond");
		CyanDiamond.iconIndex = ModLoader.addOverride("/gui/items.png", "/ColouredDiamondsMod/gems/diamond_cyan.png");
		ModLoader.addName(PurpleDiamond, "Purple Diamond");
		PurpleDiamond.iconIndex = ModLoader.addOverride("/gui/items.png", "/ColouredDiamondsMod/gems/diamond_purple.png");
		ModLoader.addName(BlueDiamond, "Blue Diamond");
		BlueDiamond.iconIndex = ModLoader.addOverride("/gui/items.png", "/ColouredDiamondsMod/gems/diamond_blue.png");
		ModLoader.addName(BrownDiamond, "Brown Diamond");
		BrownDiamond.iconIndex = ModLoader.addOverride("/gui/items.png", "/ColouredDiamondsMod/gems/diamond_brown.png");
		ModLoader.addName(GreenDiamond, "Green Diamond");
		GreenDiamond.iconIndex = ModLoader.addOverride("/gui/items.png", "/ColouredDiamondsMod/gems/diamond_green.png");
		ModLoader.addName(RedDiamond, "Red Diamond");
		RedDiamond.iconIndex = ModLoader.addOverride("/gui/items.png", "/ColouredDiamondsMod/gems/diamond_red.png");
		ModLoader.addName(BlackDiamond, "Black Diamond");
		BlackDiamond.iconIndex = ModLoader.addOverride("/gui/items.png", "/ColouredDiamondsMod/gems/diamond_black.png");
		
		GameRegistry.addShapelessRecipe(new ItemStack(mod_Item.WhiteDiamond, 1), new ItemStack(Item.dyePowder, 1, 15), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(mod_Item.OrangeDiamond, 1), new ItemStack(Item.dyePowder, 1, 14), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(mod_Item.MagentaDiamond, 1), new ItemStack(Item.dyePowder, 1, 13), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(mod_Item.LightBlueDiamond, 1), new ItemStack(Item.dyePowder, 1, 12), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(mod_Item.YellowDiamond, 1), new ItemStack(Item.dyePowder, 1, 11), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(mod_Item.LimeDiamond, 1), new ItemStack(Item.dyePowder, 1, 10), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(mod_Item.PinkDiamond, 1), new ItemStack(Item.dyePowder, 1, 9), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(mod_Item.GrayDiamond, 1), new ItemStack(Item.dyePowder, 1, 8), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(mod_Item.LightGrayDiamond, 1), new ItemStack(Item.dyePowder, 1, 7), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(mod_Item.CyanDiamond, 1), new ItemStack(Item.dyePowder, 1, 6), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(mod_Item.PurpleDiamond, 1), new ItemStack(Item.dyePowder, 1, 5), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(mod_Item.BlueDiamond, 1), new ItemStack(Item.dyePowder, 1, 4), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(mod_Item.GreenDiamond, 1), new ItemStack(Item.dyePowder, 1, 2), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(mod_Item.BrownDiamond, 1), new ItemStack(Item.dyePowder, 1, 3), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(mod_Item.RedDiamond, 1), new ItemStack(Item.dyePowder, 1, 1), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(mod_Item.BlackDiamond, 1), new ItemStack(Item.dyePowder, 1, 0), (Item.diamond));
		
	}
	
	public void load() 
	{
		
	}
	
	public String getVersion() {
		return "1.0";
	}

}
