package dev.pietermantel.world.tile;

import dev.pietermantel.main.imgloader.Assets;

public class RockTile extends Tile{
	
	public RockTile(int id) {
		super(Assets.stone, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}
	
}
