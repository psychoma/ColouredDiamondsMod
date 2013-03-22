package schoolboy917.diamonds.mod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "ColouredDiamondsMod", name = "Coloured Diamonds Mod", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class ColouredDiamondsMod
{
	@SidedProxy(clientSide = "schoolboy917.diamonds.mod.ClientProxyColouredDiamondsMod", serverSide = "schoolboy917.diamonds.mod.CommonProxyColouredDiamondsMod")
	public static CommonProxyColouredDiamondsMod proxy;
	
	public static Item WhiteDiamond;
	public static Item OrangeDiamond;
	public static Item MagentaDiamond;
	public static Item LightBlueDiamond;
	public static Item YellowDiamond;
	public static Item LimeDiamond;
	public static Item PinkDiamond;
	public static Item GrayDiamond;
	public static Item LightGrayDiamond;
	public static Item CyanDiamond;
	public static Item PurpleDiamond;
	public static Item BlueDiamond;
	public static Item BrownDiamond;
	public static Item GreenDiamond;
	public static Item RedDiamond;
	public static Item BlackDiamond;
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderThings();
		
		WhiteDiamond = new WhiteDiamond(5000).setIconIndex(0).setItemName("IWhiteDiamond");
		OrangeDiamond = new OrangeDiamond(5001).setIconIndex(1).setItemName("OrangeDiamond");
		MagentaDiamond = new MagentaDiamond(5002).setIconIndex(2).setItemName("MagentaDiamond");
		LightBlueDiamond = new LightBlueDiamond(5003).setIconIndex(3).setItemName("LightBlueDiamond");
		YellowDiamond = new YellowDiamond(5004).setIconIndex(4).setItemName("YellowDiamond");
		LimeDiamond = new LimeDiamond(5005).setIconIndex(5).setItemName("LimeDiamond");
		PinkDiamond = new PinkDiamond(5006).setIconIndex(6).setItemName("PinkDiamond");
		GrayDiamond = new GrayDiamond(5007).setIconIndex(7).setItemName("GrayDiamond");
		LightGrayDiamond = new LightGrayDiamond(5008).setIconIndex(8).setItemName("LightGrayDiamond");
		CyanDiamond = new CyanDiamond(5009).setIconIndex(9).setItemName("CyanDiamond");
		PurpleDiamond = new PurpleDiamond(5010).setIconIndex(10).setItemName("PurpleDiamond");
		BlueDiamond = new BlueDiamond(5011).setIconIndex(11).setItemName("BlueDiamond");
		BrownDiamond = new BrownDiamond(5012).setIconIndex(12).setItemName("BrownDiamond");
		GreenDiamond = new GreenDiamond(5013).setIconIndex(13).setItemName("GreenDiamond");
		RedDiamond = new RedDiamond(5014).setIconIndex(14).setItemName("RedDiamond");
		BlackDiamond = new BlackDiamond(5015).setIconIndex(15).setItemName("BlackDiamond");
		
		
		LanguageRegistry.addName(WhiteDiamond, "White Diamond");
		LanguageRegistry.addName(OrangeDiamond, "Orange Diamond");
		LanguageRegistry.addName(MagentaDiamond, "Magenta Diamond");
		LanguageRegistry.addName(LightBlueDiamond, "Light Blue Diamond");
		LanguageRegistry.addName(YellowDiamond, "Yellow Diamond");
		LanguageRegistry.addName(LimeDiamond, "Lime Diamond");
		LanguageRegistry.addName(PinkDiamond, "Pink Diamond");
		LanguageRegistry.addName(GrayDiamond, "Gray Diamond");
		LanguageRegistry.addName(LightGrayDiamond, "Light Gray Diamond");
		LanguageRegistry.addName(CyanDiamond, "Cyan Diamond");
		LanguageRegistry.addName(PurpleDiamond, "Purple Diamond");
		LanguageRegistry.addName(BlueDiamond, "Blue Diamond");
		LanguageRegistry.addName(BrownDiamond, "Brown Diamond");
		LanguageRegistry.addName(GreenDiamond, "Green Diamond");
		LanguageRegistry.addName(RedDiamond, "Red Diamond");
		LanguageRegistry.addName(BlackDiamond, "Black Diamond");
		
		GameRegistry.addShapelessRecipe(new ItemStack(WhiteDiamond, 1), new ItemStack(Item.dyePowder, 1, 15), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(OrangeDiamond, 1), new ItemStack(Item.dyePowder, 1, 14), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(MagentaDiamond, 1), new ItemStack(Item.dyePowder, 1, 13), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(LightBlueDiamond, 1), new ItemStack(Item.dyePowder, 1, 12), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(YellowDiamond, 1), new ItemStack(Item.dyePowder, 1, 11), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(LimeDiamond, 1), new ItemStack(Item.dyePowder, 1, 10), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(PinkDiamond, 1), new ItemStack(Item.dyePowder, 1, 9), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(GrayDiamond, 1), new ItemStack(Item.dyePowder, 1, 8), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(LightGrayDiamond, 1), new ItemStack(Item.dyePowder, 1, 7), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(CyanDiamond, 1), new ItemStack(Item.dyePowder, 1, 6), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(PurpleDiamond, 1), new ItemStack(Item.dyePowder, 1, 5), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(BlueDiamond, 1), new ItemStack(Item.dyePowder, 1, 4), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(GreenDiamond, 1), new ItemStack(Item.dyePowder, 1, 2), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(BrownDiamond, 1), new ItemStack(Item.dyePowder, 1, 3), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(RedDiamond, 1), new ItemStack(Item.dyePowder, 1, 1), (Item.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(BlackDiamond, 1), new ItemStack(Item.dyePowder, 1, 0), (Item.diamond));
	}
}