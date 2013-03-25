package schoolboy917.mods.diamonds.items;

import net.minecraft.item.Item;
import schoolboy917.mods.diamonds.misc.DiamondsTab;


public class itemPinkDiamond extends Item
{
	
	public itemPinkDiamond(int id){
		super(id);
		setCreativeTab(DiamondsTab.tabDiamondsMod);
	}

	public String getTextureFile()
	{
		return "/textures/Gems.png";
	}

}
