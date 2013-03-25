package schoolboy917.mods.diamonds.items;

import net.minecraft.item.Item;
import schoolboy917.mods.diamonds.misc.DiamondsTab;


public class itemBlackDiamond extends Item
{
	
	public itemBlackDiamond(int id){
		super(id);
		setCreativeTab(DiamondsTab.tabDiamondsMod);
	}

	public String getTextureFile()
	{
		return "/textures/Gems.png";
	}

}
