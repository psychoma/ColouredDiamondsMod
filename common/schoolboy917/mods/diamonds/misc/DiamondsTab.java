package schoolboy917.mods.diamonds.misc;

import schoolboy917.mods.diamonds.ColouredDiamondsMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class DiamondsTab
{
	public static CreativeTabs tabDiamondsMod = new CreativeTabs("tabDiamondsMod") {
		public ItemStack getIconItemStack() {
			return new ItemStack (ColouredDiamondsMod.itemWhiteDiamond);
		}
	};
}
