package schoolboy917.mods.diamonds.items;

import net.minecraft.item.Item;
import schoolboy917.mods.diamonds.misc.DiamondsTab;


public class itemBlueDiamond extends Item
{
	
	public itemBlueDiamond(int id){
		super(id);
		setCreativeTab(DiamondsTab.tabDiamondsMod);
	}

	public String getTextureFile()
	{
		return "/textures/Gems.png";
	}

}
