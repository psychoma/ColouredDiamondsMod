package schoolboy917.mods.diamonds;



//Mod Imports
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import schoolboy917.mods.diamonds.common.CommonProxy;
import schoolboy917.mods.diamonds.items.itemBlackDiamond;
import schoolboy917.mods.diamonds.items.itemBlueDiamond;
import schoolboy917.mods.diamonds.items.itemBrownDiamond;
import schoolboy917.mods.diamonds.items.itemCyanDiamond;
import schoolboy917.mods.diamonds.items.itemGrayDiamond;
import schoolboy917.mods.diamonds.items.itemGreenDiamond;
import schoolboy917.mods.diamonds.items.itemLightBlueDiamond;
import schoolboy917.mods.diamonds.items.itemLightGrayDiamond;
import schoolboy917.mods.diamonds.items.itemLimeDiamond;
import schoolboy917.mods.diamonds.items.itemMagentaDiamond;
import schoolboy917.mods.diamonds.items.itemOrangeDiamond;
import schoolboy917.mods.diamonds.items.itemPinkDiamond;
import schoolboy917.mods.diamonds.items.itemPurpleDiamond;
import schoolboy917.mods.diamonds.items.itemRedDiamond;
import schoolboy917.mods.diamonds.items.itemWhiteDiamond;
import schoolboy917.mods.diamonds.items.itemYellowDiamond;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "ColouredDiamondsMod", name = "Coloured Diamonds Mod", version = "1.1.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class ColouredDiamondsMod
{
	@SidedProxy(clientSide = "schoolboy917.mods.diamonds.client.ClientProxy", serverSide = "schoolboy917.mods.diamonds.common.CommonProxy")
	public static CommonProxy proxy;
	
	public static Item itemWhiteDiamond;
	public static Item itemOrangeDiamond;
	public static Item itemMagentaDiamond;
	public static Item itemLightBlueDiamond;
	public static Item itemYellowDiamond;
	public static Item itemLimeDiamond;
	public static Item itemPinkDiamond;
	public static Item itemGrayDiamond;
	public static Item itemLightGrayDiamond;
	public static Item itemCyanDiamond;
	public static Item itemPurpleDiamond;
	public static Item itemBlueDiamond;
	public static Item itemBrownDiamond;
	public static Item itemGreenDiamond;
	public static Item itemRedDiamond;
	public static Item itemBlackDiamond;
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderThings();
		
		itemWhiteDiamond =  new itemWhiteDiamond(5000).setIconIndex(0).setItemName("WhiteDiamond");
		itemOrangeDiamond = new itemOrangeDiamond(5001).setIconIndex(1).setItemName("OrangeDiamond");
		itemMagentaDiamond = new itemMagentaDiamond(5002).setIconIndex(2).setItemName("MagentaDiamond");
		itemLightBlueDiamond = new itemLightBlueDiamond(5003).setIconIndex(3).setItemName("LightBlueDiamond");
		itemYellowDiamond = new itemYellowDiamond(5004).setIconIndex(4).setItemName("YellowDiamond");
		itemLimeDiamond = new itemLimeDiamond(5005).setIconIndex(5).setItemName("LimeDiamond");
		itemPinkDiamond = new itemPinkDiamond(5006).setIconIndex(6).setItemName("PinkDiamond");
		itemGrayDiamond = new itemGrayDiamond(5007).setIconIndex(7).setItemName("GrayDiamond");
		itemLightGrayDiamond = new itemLightGrayDiamond(5008).setIconIndex(8).setItemName("LightGrayDiamond");
		itemCyanDiamond = new itemCyanDiamond(5009).setIconIndex(9).setItemName("CyanDiamond");
		itemPurpleDiamond = new itemPurpleDiamond(5010).setIconIndex(10).setItemName("PurpleDiamond");
		itemBlueDiamond = new itemBlueDiamond(5011).setIconIndex(11).setItemName("BlueDiamond");
		itemBrownDiamond = new itemBrownDiamond(5012).setIconIndex(12).setItemName("BrownDiamond");
		itemGreenDiamond = new itemGreenDiamond(5013).setIconIndex(13).setItemName("GreenDiamond");
		itemRedDiamond = new itemRedDiamond(5014).setIconIndex(14).setItemName("RedDiamond");
		itemBlackDiamond = new itemBlackDiamond(5015).setIconIndex(15).setItemName("BlackDiamond");
		
		
		LanguageRegistry.addName(itemWhiteDiamond, "White Diamond");
		LanguageRegistry.addName(itemOrangeDiamond, "Orange Diamond");
		LanguageRegistry.addName(itemMagentaDiamond, "Magenta Diamond");
		LanguageRegistry.addName(itemLightBlueDiamond, "Light Blue Diamond");
		LanguageRegistry.addName(itemYellowDiamond, "Yellow Diamond");
		LanguageRegistry.addName(itemLimeDiamond, "Lime Diamond");
		LanguageRegistry.addName(itemPinkDiamond, "Pink Diamond");
		LanguageRegistry.addName(itemGrayDiamond, "Gray Diamond");
		LanguageRegistry.addName(itemLightGrayDiamond, "Light Gray Diamond");
		LanguageRegistry.addName(itemCyanDiamond, "Cyan Diamond");
		LanguageRegistry.addName(itemPurpleDiamond, "Purple Diamond");
		LanguageRegistry.addName(itemBlueDiamond, "Blue Diamond");
		LanguageRegistry.addName(itemBrownDiamond, "Brown Diamond");
		LanguageRegistry.addName(itemGreenDiamond, "Green Diamond");
		LanguageRegistry.addName(itemRedDiamond, "Red Diamond");
		LanguageRegistry.addName(itemBlackDiamond, "Black Diamond");
		
		GameRegistry.addShapelessRecipe(new ItemStack(itemWhiteDiamond, 1), new ItemStack(Item.dyePowder, 1, 15), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(itemOrangeDiamond, 1), new ItemStack(Item.dyePowder, 1, 14), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(itemMagentaDiamond, 1), new ItemStack(Item.dyePowder, 1, 13), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(itemLightBlueDiamond, 1), new ItemStack(Item.dyePowder, 1, 12), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(itemYellowDiamond, 1), new ItemStack(Item.dyePowder, 1, 11), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(itemLimeDiamond, 1), new ItemStack(Item.dyePowder, 1, 10), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(itemPinkDiamond, 1), new ItemStack(Item.dyePowder, 1, 9), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(itemGrayDiamond, 1), new ItemStack(Item.dyePowder, 1, 8), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(itemLightGrayDiamond, 1), new ItemStack(Item.dyePowder, 1, 7), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(itemCyanDiamond, 1), new ItemStack(Item.dyePowder, 1, 6), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(itemPurpleDiamond, 1), new ItemStack(Item.dyePowder, 1, 5), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(itemBlueDiamond, 1), new ItemStack(Item.dyePowder, 1, 4), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(itemGreenDiamond, 1), new ItemStack(Item.dyePowder, 1, 2), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(itemBrownDiamond, 1), new ItemStack(Item.dyePowder, 1, 3), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(itemRedDiamond, 1), new ItemStack(Item.dyePowder, 1, 1), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(itemBlackDiamond, 1), new ItemStack(Item.dyePowder, 1, 0), (Item.diamond));
	}
}