package dev.pietermantel.main.imgloader;

import java.awt.image.BufferedImage;

public class Assets {
	
	public static BufferedImage dirt,grass, player_left, player_right;
	
	public static void init() {
		SheetLoader sheet = new SheetLoader(ImageLoader.loadImage("/textures/SpriteSheetTile.png"));
		dirt = sheet.crop(SheetInfo.DIRT);
		grass = sheet.crop(SheetInfo.GRASS);
		player_right = sheet.crop(SheetInfo.PLAYER_RIGHT);
		player_left = sheet.crop(SheetInfo.PLAYER_LEFT);
	}
	
}
