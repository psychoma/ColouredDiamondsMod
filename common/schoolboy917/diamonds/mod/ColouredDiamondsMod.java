package schoolboy917.diamonds.mod;

import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "ColouredDiamondsMod", name = "Coloured Diamonds Mod", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class ColouredDiamondsMod
{
	@SidedProxy(clientSide = "schoolboy917.diamonds.mod.ClientProxyColouredDiamondsMod", serverSide = "schoolboy917.diamonds.mod.CommonProxyColouredDiamondsMod")
	public static CommonProxyColouredDiamondsMod proxy;
	
	public static Item schoolboy917.diamond.modItem
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderThings();
		
		schoolboy917.diamonds.modItem = new ItemWhiteDiamond(5000).setIconIndex(0).setItemName("WhiteDiamiond");
		
		LanguageRegistry.addName(WhiteDiamond, "White Diamond");
	}
}