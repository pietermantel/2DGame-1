package dev.pietermantel.main.states;

import java.awt.Graphics;

import dev.pietermantel.main.imgloader.Assets;

public class GameState extends State {
	
	public GameState() {
		
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		g.drawImage(Assets.dirt, 0,0,null);
		g.drawImage(Assets.grass, 32,0,null);
		g.drawImage(Assets.dirt, 0,32,null);
		g.drawImage(Assets.dirt, 32,32,null);
	}
}
