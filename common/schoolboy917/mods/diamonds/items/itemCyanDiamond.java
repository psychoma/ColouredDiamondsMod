package schoolboy917.mods.diamonds.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class itemCyanDiamond extends Item
{
	
	public itemCyanDiamond(int id){
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		//TODO Auto-generated constructor stub
	}
	
	public String getTextureFile()
	{
		return "/items/Items.png";
	}

}
