package schoolboy917.diamonds.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemWhiteDiamond extends Item
{
	
	public ItemWhiteDiamond(int id){
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		//TODO Auto-generated constructor stub
	}
	
	public String getTextureFile()
	{
		return "/items/Items.png";
	}

}
