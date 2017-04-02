package dev.pietermantel.main.entitys;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

import dev.pietermantel.main.Game;
import dev.pietermantel.main.entitys.components.HealthComponent;
import dev.pietermantel.main.entitys.components.KeyInputComponent;
import dev.pietermantel.main.entitys.components.PositionComponent;
import dev.pietermantel.main.entitys.components.TextureComponent;
import dev.pietermantel.main.imgloader.Assets;
import dev.pietermantel.tools.Clamp;

public class Player extends Entity{
	HealthComponent health;
	PositionComponent position;
	TextureComponent texture;
	KeyInputComponent keyInput;
	

	@Override
	public void tick() {
		if(keyInput.isPressed(KeyEvent.VK_RIGHT)) position.setX(position.getX()+5);
		if(keyInput.isPressed(KeyEvent.VK_LEFT)) position.setX(position.getX()-5);
		if(keyInput.isPressed(KeyEvent.VK_UP)) position.setY(position.getY()-5);
		if(keyInput.isPressed(KeyEvent.VK_DOWN)) position.setY(position.getY()+5);
		
		position.setX(Clamp.clamp(position.getX(), 0, Game.frameWidth - 64));
		position.setY(Clamp.clamp(position.getY(), 0, Game.frameHeight - 64));
		
		texture.setX(position.getX());
		texture.setY(position.getY());
	}

	@Override
	public void render(Graphics g) {
		texture.render(g);
	}
	
	public Player(float x, float y, JFrame frame) {
		health = new HealthComponent(100);
		position = new PositionComponent(x,y);
		texture = new TextureComponent(Assets.player_left, position.getX(), position.getY());
		keyInput = new KeyInputComponent();
		frame.addKeyListener(keyInput);
	}
}
