package dev.pietermantel.main.entitys;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

import dev.pietermantel.main.Game;
import dev.pietermantel.main.entitys.components.HealthComponent;
import dev.pietermantel.main.entitys.components.KeyInputComponent;
import dev.pietermantel.main.entitys.components.PositionComponent;
import dev.pietermantel.main.entitys.components.SizeComponent;
import dev.pietermantel.main.entitys.components.TextureComponent;
import dev.pietermantel.main.imgloader.Assets;
import dev.pietermantel.tools.Clamp;

public class Player extends Entity{
	HealthComponent health;
	PositionComponent position;
	TextureComponent texture;
	KeyInputComponent keyInput;
	SizeComponent size;
	
	public static final int DEFAULT_HEALTH = 10;
	public static final int DEFAULT_SPEED = 3;
	public static final int DEFAULT_WIDTH = 64;
	public static final int DEFAULT_HEIGHT = 64;
	

	@Override
	public void tick() {
		calcMove();
		position.move();
		
		position.setX(Clamp.clamp(position.getX(), 0, Game.frameWidth - size.getWidth()));
		position.setY(Clamp.clamp(position.getY(), 0, Game.frameHeight - size.getHeight()));
		
		texture.setX(position.getX());
		texture.setY(position.getY());
		texture.setWidth(size.getWidth());
		texture.setWidth(size.getHeight());
	}

	@Override
	public void render(Graphics g) {
		texture.render(g);
	}
	
	public Player(float x, float y, JFrame frame) {
		health = new HealthComponent(DEFAULT_HEALTH);
		position = new PositionComponent(x,y,DEFAULT_SPEED);
		size = new SizeComponent(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		texture = new TextureComponent(Assets.player_left, position.getX(), position.getY(), size.getWidth(), size.getHeight());
		keyInput = new KeyInputComponent();
		frame.addKeyListener(keyInput);
	}
	
	private void calcMove() {
		if(keyInput.isPressed(KeyEvent.VK_W)) {
			position.setyMove(-position.getSpeed());
		} else if(keyInput.isPressed(KeyEvent.VK_S)) {
			position.setyMove(position.getSpeed());
		} else {
			position.setyMove(0);
		}
		
		if(keyInput.isPressed(KeyEvent.VK_W) && keyInput.isPressed(KeyEvent.VK_S)) {
			position.setyMove(0);
		}
		
		if(keyInput.isPressed(KeyEvent.VK_A)) {
			position.setxMove(-position.getSpeed());
		} else if(keyInput.isPressed(KeyEvent.VK_D)) {
			position.setxMove(position.getSpeed());
		} else {
			position.setxMove(0);
		}
		
		if(keyInput.isPressed(KeyEvent.VK_A) && keyInput.isPressed(KeyEvent.VK_D)) {
			position.setxMove(0);
		}
		
		//System.out.println(keyInput.isPressed(KeyEvent.VK_W));
	}
}
