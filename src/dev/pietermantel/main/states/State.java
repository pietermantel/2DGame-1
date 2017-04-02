package dev.pietermantel.main.states;

import java.awt.Graphics;

import dev.pietermantel.main.Game;

public abstract class State {
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	protected Game game;
	
	public State(Game game) {
		this.game = game;
	}
	
	//StateManager
	
	private static State currentState = null;
	
	public static void setState(State state) {
		currentState = state;
	}
	
	public static State getState() {
		return currentState;
	}
	
}
