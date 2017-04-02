package dev.pietermantel.world.tile;

import dev.pietermantel.main.imgloader.Assets;

public class WaterTile extends Tile{
	public WaterTile(int id) {
		super(Assets.water, id);
	}
	
	public boolean isSolid() {
		return true;
	}
}
