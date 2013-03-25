package schoolboy917.mods.diamonds.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class itemOrangeDiamond extends Item
{
	
	public itemOrangeDiamond(int id){
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		//TODO Auto-generated constructor stub
	}
	
	public String getTextureFile()
	{
		return "/textures/Gems.png";
	}

}

