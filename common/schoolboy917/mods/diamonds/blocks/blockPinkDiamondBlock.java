package schoolboy917.mods.diamonds.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class blockPinkDiamondBlock extends Block
{
	public blockPinkDiamondBlock (int id, int texture, Material iron) {
		super(id, texture, iron);
	}
	
	@Override
	public String getTextureFile () {
		return "/textures/Blocks.png";
	}
}


