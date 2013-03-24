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
		
		itemWhiteDiamond =  new itemWhiteDiamond(7556).setIconIndex(0).setItemName("itemWhiteDiamond");
		itemOrangeDiamond = new itemOrangeDiamond(7557).setIconIndex(1).setItemName("itemOrangeDiamond");
		itemMagentaDiamond = new itemMagentaDiamond(7558).setIconIndex(2).setItemName("itemMagentaDiamond");
		itemLightBlueDiamond = new itemLightBlueDiamond(7559).setIconIndex(3).setItemName("itemLightBlueDiamond");
		itemYellowDiamond = new itemYellowDiamond(7560).setIconIndex(4).setItemName("itemYellowDiamond");
		itemLimeDiamond = new itemLimeDiamond(7561).setIconIndex(5).setItemName("itemLimeDiamond");
		itemPinkDiamond = new itemPinkDiamond(7562).setIconIndex(6).setItemName("itemPinkDiamond");
		itemGrayDiamond = new itemGrayDiamond(7563).setIconIndex(7).setItemName("itemGrayDiamond");
		itemLightGrayDiamond = new itemLightGrayDiamond(7564).setIconIndex(8).setItemName("itemLightGrayDiamond");
		itemCyanDiamond = new itemCyanDiamond(7565).setIconIndex(9).setItemName("itemCyanDiamond");
		itemPurpleDiamond = new itemPurpleDiamond(7566).setIconIndex(10).setItemName("itemPurpleDiamond");
		itemBlueDiamond = new itemBlueDiamond(7567).setIconIndex(11).setItemName("itemBlueDiamond");
		itemBrownDiamond = new itemBrownDiamond(7568).setIconIndex(12).setItemName("itemBrownDiamond");
		itemGreenDiamond = new itemGreenDiamond(7569).setIconIndex(13).setItemName("itemGreenDiamond");
		itemRedDiamond = new itemRedDiamond(7571).setIconIndex(14).setItemName("itemRedDiamond");
		itemBlackDiamond = new itemBlackDiamond(7572).setIconIndex(15).setItemName("itemBlackDiamond");
		
		
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