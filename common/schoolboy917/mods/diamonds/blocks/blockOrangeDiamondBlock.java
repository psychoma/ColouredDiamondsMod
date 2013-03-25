package schoolboy917.mods.diamonds.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class blockOrangeDiamondBlock extends Block
{
	public blockOrangeDiamondBlock (int id, int texture, Material iron) {
		super(id, texture, iron);
	}
	
	@Override
	public String getTextureFile () {
		return "/textures/Blocks.png";
	}
}


