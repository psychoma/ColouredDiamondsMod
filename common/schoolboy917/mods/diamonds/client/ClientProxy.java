package schoolboy917.mods.diamonds.client;

import net.minecraftforge.client.MinecraftForgeClient;
import schoolboy917.mods.diamonds.common.CommonProxy;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenderThings()
	{
		MinecraftForgeClient.preloadTexture("/textures/gems/diamond_white.png");
		MinecraftForgeClient.preloadTexture("/textures/gems/diamond_yellow.png");
		MinecraftForgeClient.preloadTexture("/textures/gems/diamond_magenta.png");
		MinecraftForgeClient.preloadTexture("/textures/gems/diamond_orange.png");
		MinecraftForgeClient.preloadTexture("/textures/gems/diamond_red.png");
		MinecraftForgeClient.preloadTexture("/textures/gems/diamond_light_blue.png");
		MinecraftForgeClient.preloadTexture("/textures/gems/diamond_black.png");
		MinecraftForgeClient.preloadTexture("/textures/gems/diamond_brown.png");
		MinecraftForgeClient.preloadTexture("/textures/gems/diamond_green.png");
		MinecraftForgeClient.preloadTexture("/textures/gems/diamond_Lime.png");
		MinecraftForgeClient.preloadTexture("/textures/gems/diamond_blue.png");
		MinecraftForgeClient.preloadTexture("/textures/gems/diamond_light_gray.png");
		MinecraftForgeClient.preloadTexture("/textures/gems/diamond_gray.png");
		MinecraftForgeClient.preloadTexture("/textures/gems/diamond_pink.png");
		MinecraftForgeClient.preloadTexture("/textures/gems/diamond_purple.png");
		MinecraftForgeClient.preloadTexture("/textures/gems/diamond_cyan.png");
	}

}
