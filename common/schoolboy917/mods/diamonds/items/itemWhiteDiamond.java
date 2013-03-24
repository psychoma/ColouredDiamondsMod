package schoolboy917.mods.diamonds.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class itemWhiteDiamond extends Item
{
	
	public itemWhiteDiamond(int id){
		super(id);
		setCreativeTab(CreativeTabs.tabMaterials);
	}

	public String getTextureFile()
	{
		return "/textures/gems/diamond_white.png";
	}

}
