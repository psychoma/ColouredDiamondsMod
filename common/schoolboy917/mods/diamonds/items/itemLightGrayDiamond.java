package schoolboy917.mods.diamonds.items;

import net.minecraft.item.Item;
import schoolboy917.mods.diamonds.misc.DiamondsTab;


public class itemLightGrayDiamond extends Item
{
	
	public itemLightGrayDiamond(int id){
		super(id);
		setCreativeTab(DiamondsTab.tabDiamondsMod);
	}

	public String getTextureFile()
	{
		return "/textures/Gems.png";
	}

}
