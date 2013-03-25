package schoolboy917.mods.diamonds;



//Mod Imports
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import schoolboy917.mods.diamonds.blocks.blockWhiteDiamondBlock;
import schoolboy917.mods.diamonds.blocks.blockOrangeDiamondBlock;
import schoolboy917.mods.diamonds.blocks.blockMagentaDiamondBlock;
import schoolboy917.mods.diamonds.blocks.blockLightBlueDiamondBlock;
import schoolboy917.mods.diamonds.blocks.blockYellowDiamondBlock;
import schoolboy917.mods.diamonds.blocks.blockLimeDiamondBlock;
import schoolboy917.mods.diamonds.blocks.blockPinkDiamondBlock;
import schoolboy917.mods.diamonds.blocks.blockGrayDiamondBlock;
import schoolboy917.mods.diamonds.blocks.blockLightGrayDiamondBlock;
import schoolboy917.mods.diamonds.blocks.blockCyanDiamondBlock;
import schoolboy917.mods.diamonds.blocks.blockPurpleDiamondBlock;
import schoolboy917.mods.diamonds.blocks.blockBlueDiamondBlock;
import schoolboy917.mods.diamonds.blocks.blockBrownDiamondBlock;
import schoolboy917.mods.diamonds.blocks.blockGreenDiamondBlock;
import schoolboy917.mods.diamonds.blocks.blockRedDiamondBlock;
import schoolboy917.mods.diamonds.blocks.blockBlackDiamondBlock;
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
import schoolboy917.mods.diamonds.misc.DiamondsTab;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "ColouredDiamondsMod", name = "Coloured Diamonds Mod", version = "2.0.0")
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
	
	public final static Block blockWhiteDiamondBlock = new blockWhiteDiamondBlock (4050, 0, Material.iron).setHardness(5F).setStepSound(Block.soundMetalFootstep).setBlockName("blockWhiteDiamondBlock").setCreativeTab(DiamondsTab.tabDiamondsMod);
	public final static Block blockOrangeDiamondBlock = new blockOrangeDiamondBlock (4051, 1, Material.iron).setHardness(5F).setStepSound(Block.soundMetalFootstep).setBlockName("blockOrangeDiamondBlock").setCreativeTab(DiamondsTab.tabDiamondsMod);
	public final static Block blockMagentaDiamondBlock = new blockMagentaDiamondBlock (4052, 2, Material.iron).setHardness(5F).setStepSound(Block.soundMetalFootstep).setBlockName("blockMagenatDiamondBlock").setCreativeTab(DiamondsTab.tabDiamondsMod);
	public final static Block blockLightBlueDiamondBlock = new blockLightBlueDiamondBlock (4053, 3, Material.iron).setHardness(5F).setStepSound(Block.soundMetalFootstep).setBlockName("blockLightBlueDiamondBlock").setCreativeTab(DiamondsTab.tabDiamondsMod);
	public final static Block blockYellowDiamondBlock = new blockYellowDiamondBlock (4054, 4, Material.iron).setHardness(5F).setStepSound(Block.soundMetalFootstep).setBlockName("blockYellowDiamondBlock").setCreativeTab(DiamondsTab.tabDiamondsMod);
	public final static Block blockLimeDiamondBlock = new blockLimeDiamondBlock (4055, 5, Material.iron).setHardness(5F).setStepSound(Block.soundMetalFootstep).setBlockName("blockLimeDiamondBlock").setCreativeTab(DiamondsTab.tabDiamondsMod);
	public final static Block blockPinkDiamondBlock = new blockPinkDiamondBlock (4056, 6, Material.iron).setHardness(5F).setStepSound(Block.soundMetalFootstep).setBlockName("blockPinkDiamondBlock").setCreativeTab(DiamondsTab.tabDiamondsMod);
	public final static Block blockGrayDiamondBlock = new blockGrayDiamondBlock (4057, 7, Material.iron).setHardness(5F).setStepSound(Block.soundMetalFootstep).setBlockName("blocGrayDiamondBlock").setCreativeTab(DiamondsTab.tabDiamondsMod);
	public final static Block blockLightGrayDiamondBlock = new blockLightGrayDiamondBlock (4058, 8, Material.iron).setHardness(5F).setStepSound(Block.soundMetalFootstep).setBlockName("blockLightGrayDiamondBlock").setCreativeTab(DiamondsTab.tabDiamondsMod);
	public final static Block blockCyanDiamondBlock = new blockCyanDiamondBlock (4059, 9, Material.iron).setHardness(5F).setStepSound(Block.soundMetalFootstep).setBlockName("blockCyanDiamondBlock").setCreativeTab(DiamondsTab.tabDiamondsMod);
	public final static Block blockPurpleDiamondBlock = new blockPurpleDiamondBlock (4060, 10, Material.iron).setHardness(5F).setStepSound(Block.soundMetalFootstep).setBlockName("blockPurpleDiamondBlock").setCreativeTab(DiamondsTab.tabDiamondsMod);
	public final static Block blockBlueDiamondBlock = new blockBlueDiamondBlock (4061, 11, Material.iron).setHardness(5F).setStepSound(Block.soundMetalFootstep).setBlockName("blockBlueDiamondBlock").setCreativeTab(DiamondsTab.tabDiamondsMod);
	public final static Block blockBrownDiamondBlock = new blockBrownDiamondBlock (4062, 12, Material.iron).setHardness(5F).setStepSound(Block.soundMetalFootstep).setBlockName("blockBlueDiamondBlock").setCreativeTab(DiamondsTab.tabDiamondsMod);
	public final static Block blockGreenDiamondBlock = new blockGreenDiamondBlock (4063, 13, Material.iron).setHardness(5F).setStepSound(Block.soundMetalFootstep).setBlockName("blockBrownDiamondBlock").setCreativeTab(DiamondsTab.tabDiamondsMod);
	public final static Block blockRedDiamondBlock = new blockRedDiamondBlock (4064, 14, Material.iron).setHardness(5F).setStepSound(Block.soundMetalFootstep).setBlockName("blockRedDiamondBlock").setCreativeTab(DiamondsTab.tabDiamondsMod);
	public final static Block blockBlackDiamondBlock = new blockBlackDiamondBlock (4065, 15, Material.iron).setHardness(5F).setStepSound(Block.soundMetalFootstep).setBlockName("blockBlackDiamondBlock").setCreativeTab(DiamondsTab.tabDiamondsMod);
	
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
		
		GameRegistry.registerBlock(blockWhiteDiamondBlock, "blockWhiteDiamondBlock");
		GameRegistry.registerBlock(blockOrangeDiamondBlock, "blockOrangeDiamondBlock");
		GameRegistry.registerBlock(blockMagentaDiamondBlock, "blockMagentaDiamondBlock");
		GameRegistry.registerBlock(blockLightBlueDiamondBlock, "blockLightBlueDiamondBlock");
		GameRegistry.registerBlock(blockYellowDiamondBlock, "blockYellowDiamondBlock");
		GameRegistry.registerBlock(blockLimeDiamondBlock, "blockLimeDiamondBlock");
		GameRegistry.registerBlock(blockPinkDiamondBlock, "blockPinkDiamondBlock");
		GameRegistry.registerBlock(blockGrayDiamondBlock, "blockGrayDiamondBlock");
		GameRegistry.registerBlock(blockLightGrayDiamondBlock, "blockLightGrayDiamondBlock");
		GameRegistry.registerBlock(blockCyanDiamondBlock, "blockCyanDiamondBlock");
		GameRegistry.registerBlock(blockPurpleDiamondBlock, "blockPurpleDiamondBlock");
		GameRegistry.registerBlock(blockBlueDiamondBlock, "blockBlueDiamondBlock");
		GameRegistry.registerBlock(blockBrownDiamondBlock, "blockBrownDiamondBlock");
		GameRegistry.registerBlock(blockGreenDiamondBlock, "blockGreenDiamondBlock");
		GameRegistry.registerBlock(blockRedDiamondBlock, "blockRedDiamondBlock");
		GameRegistry.registerBlock(blockBlackDiamondBlock, "blockBlackDiamondBlock");
		
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
		
		LanguageRegistry.addName(blockWhiteDiamondBlock, "Block of White Diamond");
		LanguageRegistry.addName(blockOrangeDiamondBlock, "Block of Orange Diamond");
		LanguageRegistry.addName(blockMagentaDiamondBlock, "Block of Magenta Diamond");
		LanguageRegistry.addName(blockLightBlueDiamondBlock, "Block of Light Blue Diamond");
		LanguageRegistry.addName(blockYellowDiamondBlock, "Block of Yellow Diamond");
		LanguageRegistry.addName(blockLimeDiamondBlock, "Block of Lime Diamond");
		LanguageRegistry.addName(blockPinkDiamondBlock, "Block of Pink Diamond");
		LanguageRegistry.addName(blockGrayDiamondBlock, "Block of Gray Diamond");
		LanguageRegistry.addName(blockLightGrayDiamondBlock, "Block of Light Gray Diamond");
		LanguageRegistry.addName(blockCyanDiamondBlock, "Block of Cyan Diamond");
		LanguageRegistry.addName(blockPurpleDiamondBlock, "Block of Purple Diamond");
		LanguageRegistry.addName(blockBlueDiamondBlock, "Block of Blue Diamond");
		LanguageRegistry.addName(blockBrownDiamondBlock, "Block of Brown Diamond");
		LanguageRegistry.addName(blockGreenDiamondBlock, "Block of Green Diamond");
		LanguageRegistry.addName(blockRedDiamondBlock, "Block of Red Diamond");
		LanguageRegistry.addName(blockBlackDiamondBlock, "Block of Black Diamond");
		
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabDiamondsMod", "en_US", "Coloured Diamonds Mod");
		
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
		
		GameRegistry.addShapelessRecipe(new ItemStack(itemWhiteDiamond, 9), new ItemStack(ColouredDiamondsMod.blockWhiteDiamondBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(itemOrangeDiamond, 9), new ItemStack(ColouredDiamondsMod.blockOrangeDiamondBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(itemMagentaDiamond, 9), new ItemStack(ColouredDiamondsMod.blockMagentaDiamondBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(itemLightBlueDiamond, 9), new ItemStack(ColouredDiamondsMod.blockLightBlueDiamondBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(itemYellowDiamond, 9), new ItemStack(ColouredDiamondsMod.blockYellowDiamondBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(itemLimeDiamond, 9), new ItemStack(ColouredDiamondsMod.blockLimeDiamondBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(itemPinkDiamond, 9), new ItemStack(ColouredDiamondsMod.blockPinkDiamondBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(itemGrayDiamond, 9), new ItemStack(ColouredDiamondsMod.blockGrayDiamondBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(itemLightGrayDiamond, 9), new ItemStack(ColouredDiamondsMod.blockLightGrayDiamondBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(itemCyanDiamond, 9), new ItemStack(ColouredDiamondsMod.blockCyanDiamondBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(itemPurpleDiamond, 9), new ItemStack(ColouredDiamondsMod.blockPurpleDiamondBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(itemBlueDiamond, 9), new ItemStack(ColouredDiamondsMod.blockBlueDiamondBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(itemBrownDiamond, 9), new ItemStack(ColouredDiamondsMod.blockBrownDiamondBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(itemGreenDiamond, 9), new ItemStack(ColouredDiamondsMod.blockGreenDiamondBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(itemRedDiamond, 9), new ItemStack(ColouredDiamondsMod.blockRedDiamondBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(itemBlackDiamond, 9), new ItemStack(ColouredDiamondsMod.blockBlackDiamondBlock));
		
		ItemStack whitediamondStack = new ItemStack(ColouredDiamondsMod.itemWhiteDiamond);
		ItemStack orangediamondStack = new ItemStack(ColouredDiamondsMod.itemOrangeDiamond);
		ItemStack magentadiamondStack = new ItemStack(ColouredDiamondsMod.itemMagentaDiamond);
		ItemStack lbluediamondStack = new ItemStack(ColouredDiamondsMod.itemLightBlueDiamond);
		ItemStack yellowdiamondStack = new ItemStack(ColouredDiamondsMod.itemYellowDiamond);
		ItemStack limediamondStack = new ItemStack(ColouredDiamondsMod.itemLimeDiamond);
		ItemStack pinkdiamondStack = new ItemStack(ColouredDiamondsMod.itemPinkDiamond);
		ItemStack graydiamondStack = new ItemStack(ColouredDiamondsMod.itemGrayDiamond);
		ItemStack lgraydiamondStack = new ItemStack(ColouredDiamondsMod.itemLightGrayDiamond);
		ItemStack cyandiamondStack = new ItemStack(ColouredDiamondsMod.itemCyanDiamond);
		ItemStack purplediamondStack = new ItemStack(ColouredDiamondsMod.itemPurpleDiamond);
		ItemStack bluediamondStack = new ItemStack(ColouredDiamondsMod.itemBlueDiamond);
		ItemStack greendiamondStack = new ItemStack(ColouredDiamondsMod.itemGreenDiamond);
		ItemStack browndiamondStack = new ItemStack(ColouredDiamondsMod.itemBrownDiamond);
		ItemStack reddiamondStack = new ItemStack(ColouredDiamondsMod.itemRedDiamond);
		ItemStack blackdiamondStack = new ItemStack(ColouredDiamondsMod.itemBlackDiamond);
		GameRegistry.addRecipe(new ItemStack(blockWhiteDiamondBlock, 1), "xxx", "xxx", "xxx", 'x', whitediamondStack);
		GameRegistry.addRecipe(new ItemStack(blockOrangeDiamondBlock, 1), "xxx", "xxx", "xxx", 'x', orangediamondStack);
		GameRegistry.addRecipe(new ItemStack(blockMagentaDiamondBlock, 1), "xxx", "xxx", "xxx", 'x', magentadiamondStack);
		GameRegistry.addRecipe(new ItemStack(blockLightBlueDiamondBlock, 1), "xxx", "xxx", "xxx", 'x', lbluediamondStack);
		GameRegistry.addRecipe(new ItemStack(blockYellowDiamondBlock, 1), "xxx", "xxx", "xxx", 'x', yellowdiamondStack);
		GameRegistry.addRecipe(new ItemStack(blockLimeDiamondBlock, 1), "xxx", "xxx", "xxx", 'x', limediamondStack);
		GameRegistry.addRecipe(new ItemStack(blockPinkDiamondBlock, 1), "xxx", "xxx", "xxx", 'x', pinkdiamondStack);
		GameRegistry.addRecipe(new ItemStack(blockGrayDiamondBlock, 1), "xxx", "xxx", "xxx", 'x', graydiamondStack);
		GameRegistry.addRecipe(new ItemStack(blockLightGrayDiamondBlock, 1), "xxx", "xxx", "xxx", 'x', lgraydiamondStack);
		GameRegistry.addRecipe(new ItemStack(blockCyanDiamondBlock, 1), "xxx", "xxx", "xxx", 'x', cyandiamondStack);
		GameRegistry.addRecipe(new ItemStack(blockPurpleDiamondBlock, 1), "xxx", "xxx", "xxx", 'x', purplediamondStack);
		GameRegistry.addRecipe(new ItemStack(blockBlueDiamondBlock, 1), "xxx", "xxx", "xxx", 'x', bluediamondStack);
		GameRegistry.addRecipe(new ItemStack(blockBrownDiamondBlock, 1), "xxx", "xxx", "xxx", 'x', browndiamondStack);
		GameRegistry.addRecipe(new ItemStack(blockGreenDiamondBlock, 1), "xxx", "xxx", "xxx", 'x', greendiamondStack);
		GameRegistry.addRecipe(new ItemStack(blockRedDiamondBlock, 1), "xxx", "xxx", "xxx", 'x', reddiamondStack);
		GameRegistry.addRecipe(new ItemStack(blockBlackDiamondBlock, 1), "xxx", "xxx", "xxx", 'x', blackdiamondStack);
		
	}
}