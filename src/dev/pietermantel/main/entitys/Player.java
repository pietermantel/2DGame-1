package dev.pietermantel.main.entitys;

import java.awt.Graphics;

import dev.pietermantel.main.entitys.components.HealthComponent;
import dev.pietermantel.main.entitys.components.PositionComponent;
import dev.pietermantel.main.entitys.components.TextureComponent;
import dev.pietermantel.main.imgloader.Assets;

public class Player extends Entity{
	HealthComponent health;
	PositionComponent position;
	TextureComponent texture;
	

	@Override
	public void tick() {
		texture.setX(position.getX());
		texture.setY(position.getY());
	}

	@Override
	public void render(Graphics g) {
		texture.render(g);
	}
	
	public Player(float x, float y) {
		health = new HealthComponent(100);
		position = new PositionComponent(x,y);
		texture = new TextureComponent(Assets.player_left, position.getX(), position.getY());
	}
}
