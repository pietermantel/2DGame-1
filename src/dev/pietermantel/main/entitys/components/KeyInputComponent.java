package dev.pietermantel.main.entitys.components;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInputComponent implements KeyListener{
	
	private boolean[] pressed;

	@Override
	public void keyPressed(KeyEvent e) {
		pressed[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		pressed[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent arg0) {}
	
	public KeyInputComponent() {
		pressed = new boolean[222];
	}
	
	public boolean isPressed(int key) {
		return pressed[key];
	}
}
