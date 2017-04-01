package dev.pietermantel.main.imgloader;

import java.awt.image.BufferedImage;

public class SheetLoader {
	private BufferedImage sheet;
	
	public SheetLoader(BufferedImage sheet) {
		this.sheet = sheet;
		
	}
	
	public BufferedImage crop(int[] x) {
		return sheet.getSubimage(x[0],x[1],x[2],x[3]);
	}
}
