package schoolboy917.diamonds.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MagentaDiamond extends Item
{
	
	public MagentaDiamond(int id){
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		//TODO Auto-generated constructor stub
	}
	
	public String getTextureFile()
	{
		return "/items/Items.png";
	}

}
