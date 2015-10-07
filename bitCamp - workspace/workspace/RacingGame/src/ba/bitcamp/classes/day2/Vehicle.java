package ba.bitcamp.classes.day2;

import java.awt.Color;
import java.awt.Graphics;

public class Vehicle {
	
	private static final int STEP = 5;
	
	private static final int WIDTH = 40;
	private static final int HEIGHT = 60;

	protected int x;
	protected int y;
	private Color color;
	
	private boolean chrashed = false;

	private long chrashTime;
	
	public Vehicle (int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public void draw(Graphics g){
		if (isCrashed()) {
			g.setColor(Color.RED);
		} else {
			g.setColor(color);
		}
		g.fillRect(x, y, WIDTH, HEIGHT);
	}

	public void moveLeft() {
		x -= STEP;
	}

	public void moveRight() {
		x += STEP;
	}
	
	public boolean collide (Vehicle other) {
		if (other.y + HEIGHT > y) {
			if (other.x + WIDTH < x && other.x + WIDTH > x) {
				return true;
			} else if (other.x > x && x + WIDTH > other.x) {
				return true;
			}
		}
		return false;
	}

	public boolean isCrashed() {
		if (chrashed) {
			if (System.currentTimeMillis() - chrashTime > 3000) {
				chrashed = false;
			}
		}
		return chrashed;
	}
	
	public void crash() {
		chrashed = true;
		chrashTime = System.currentTimeMillis();
	}
}
