package ba.bitcamp.classes.day2;

import java.awt.Color;

public class AnimatedVehicle extends Vehicle {

	private int roadWidth;
	private int roadHeight;

	public AnimatedVehicle(Color color, int roadWidth, int roadHeight) {
		super(0, 0, color);
		this.roadWidth = roadWidth;
		this.roadHeight = roadHeight;
		resetPosition();
	}

	
	public void resetPosition() {
		x = (int)(Math.random() * roadWidth);
		y = 0 - (int)(Math.random() * 100);
	}
	
	public void moveDown() {
		if (y < roadHeight) {
			y += 5;
		} else {
			resetPosition();
		}
	}
}
