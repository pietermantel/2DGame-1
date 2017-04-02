package dev.pietermantel.main.entitys.components;

public class PositionComponent {
	private float x,y,xMove,yMove;
	private int speed;
	
	public PositionComponent(float x, float y, int speed) {
		this.x = x;
		this.y = y;
		xMove = 0;
		yMove = 0;
		
		this.speed = speed;
	}
	
	public void move() {
		x+=xMove;
		y+=yMove;
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

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public float getxMove() {
		return xMove;
	}

	public void setxMove(float xMove) {
		this.xMove = xMove;
	}

	public float getyMove() {
		return yMove;
	}

	public void setyMove(float yMove) {
		this.yMove = yMove;
	}
	
}
