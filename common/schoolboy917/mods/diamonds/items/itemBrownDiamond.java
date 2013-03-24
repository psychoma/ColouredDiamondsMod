package schoolboy917.mods.diamonds.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class itemBrownDiamond extends Item
{
	
	public itemBrownDiamond(int id){
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		//TODO Auto-generated constructor stub
	}
	
	public String getTextureFile()
	{
		return "/textures/gems/gems.png";
	}

}
