package ba.bitcamp.homeworkclasses15.task1;


import java.awt.Color;

public class Line {
	
	private int x, y;
	
	private Color color;
	
	public Line(int x, int y, Color color){
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

		
	
}