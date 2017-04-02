package dev.pietermantel.main.states;

import java.awt.Graphics;

import dev.pietermantel.main.Game;
import dev.pietermantel.main.imgloader.Assets;

public class GameState extends State {
	
	public GameState(Game game) {
		super(game);
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		g.drawImage(Assets.player_right, 0, 0, null);
	}
}
