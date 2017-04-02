package dev.pietermantel.main.entitys.components;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class TextureComponent {
	private BufferedImage texture;
	private float x,y;
	
	public TextureComponent(BufferedImage texture, float x, float y) {
		this.texture = texture;
	}
	
	public void render(Graphics g) {
		g.drawImage(texture, (int)x, (int)y, null);
	}

	public BufferedImage getTexture() {
		return texture;
	}

	public void setTexture(BufferedImage texture) {
		this.texture = texture;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	
}
