package dev.pietermantel.main;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import dev.pietermantel.main.display.Display;
import dev.pietermantel.main.imgloader.Assets;

//@SuppressWarnings("unused")
public class Game implements Runnable{
	public int frameWidth, frameHeight;
	public String title;
	public boolean running = false;
	private Thread thread;
	
//	private float ratio = (float) 1* (float)9/ (float)16;
//	private final int intWidth = 600;
	
	private Display display;
	
	public Game(int width, int height, String title) {
		frameWidth = width;
		frameHeight = height;
		this.title = title;
	}
	
	public void run() {
		//System.out.println("run");
		
		int fps = 60;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		
		init();
		while(running) {
			now = System.nanoTime();
			delta += (now - lastTime)/timePerTick;
			timer += now - lastTime;
			lastTime = now;
			
			if(delta >= 1) {
				tick();
				delta--;
				ticks++;
			}
			if(timer >= 1000000000) {
				System.out.println("FPS: " + ticks);
				ticks = 0;
				timer = 0;
			}
			render();
		}
		stop();
	}
	
	public synchronized void start() {
		//System.out.println("start");
		if(running) return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop() {
		if(!running) return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void render() {
		BufferStrategy bs = display.getCanvas().getBufferStrategy();
		if(bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		//Draw
		//g.fillRect(0, 0, frameWidth, frameHeight);
		g.drawImage(Assets.grass, 54, 67, null);
		
		//===
		g.dispose();
		bs.show();
	}
	
	private void tick() {
		
	}
	
	private void init() {
		display = new Display(title, frameWidth, frameHeight);
		Assets.init();
	}
}
