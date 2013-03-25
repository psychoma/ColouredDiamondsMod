package schoolboy917.mods.diamonds.items;

import net.minecraft.item.Item;
import schoolboy917.mods.diamonds.misc.DiamondsTab;


public class itemBrownDiamond extends Item
{
	
	public itemBrownDiamond(int id){
		super(id);
		setCreativeTab(DiamondsTab.tabDiamondsMod);
	}

	public String getTextureFile()
	{
		return "/textures/Gems.png";
	}

}
