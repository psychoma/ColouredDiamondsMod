package schoolboy917.mods.diamonds.client;

import net.minecraftforge.client.MinecraftForgeClient;
import schoolboy917.mods.diamonds.common.CommonProxy;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenderThings()
	{
		MinecraftForgeClient.preloadTexture("items/Items.png");
	}

}
