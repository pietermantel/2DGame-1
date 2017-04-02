package dev.pietermantel.main.states;

import java.awt.Graphics;

import dev.pietermantel.main.Game;
import dev.pietermantel.main.entitys.Player;

public class GameState extends State {
	private Player player;
	
	public GameState(Game game) {
		super(game);
		player = new Player(400,400, game.getDisplay().getFrame());
	}
	
	public void tick() {
		player.tick();
	}
	
	public void render(Graphics g) {
		player.render(g);
	}
}
