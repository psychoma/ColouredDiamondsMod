package schoolboy917.diamonds.mod;

import net.minecraftforge.client.MinecraftForgeClient;
import schoolboy917.diamonds.mod.CommonProxyColouredDiamondsMod;

public class ClientProxyColouredDiamondsMod extends CommonProxyColouredDiamondsMod
{
	@Override
	public void registerRenderThings()
	{
		MinecraftForgeClient.preloadTexture("items/Items.png");
	}

}
