package dev.pietermantel.main.imgloader;

import java.awt.image.BufferedImage;

public class Assets {
	
	public static BufferedImage dirt,stone, player_left, player_right,water;
	
	public static void init() {
		SheetLoader sheet = new SheetLoader(ImageLoader.loadImage("/textures/SpriteSheetTile.png"));
		dirt = sheet.crop(SheetInfo.DIRT);
		stone = sheet.crop(SheetInfo.STONE);
		player_right = sheet.crop(SheetInfo.PLAYER_RIGHT);
		player_left = sheet.crop(SheetInfo.PLAYER_LEFT);
		water = sheet.crop(SheetInfo.WATER);
	}
	
}
