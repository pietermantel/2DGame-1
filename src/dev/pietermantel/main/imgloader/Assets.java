package dev.pietermantel.main.imgloader;

import java.awt.image.BufferedImage;

public class Assets {
	
	public static BufferedImage dirt,grass;
	
	public static void init() {
		SheetLoader sheet = new SheetLoader(ImageLoader.loadImage("/textures/SpriteSheetTile.png"));
		dirt = sheet.crop(SheetInfo.DIRT);
		grass = sheet.crop(SheetInfo.GRASS);
		
	}
	
}
