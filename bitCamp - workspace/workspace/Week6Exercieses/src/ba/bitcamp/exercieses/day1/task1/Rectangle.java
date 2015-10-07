package ba.bitcamp.exercieses.day1.task1;

public class Rectangle implements Shape, Drawable {
	
	private int length;
	private int width;
	
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}


	@Override
	public void drawOnConsole() {
		for (int i = 0; i < width; i++) {
			System.out.print("*");
			for (int j = 0; j < length; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


	@Override
	public int getCircumference() {
		return (length + width) + 2;
	}


	@Override
	public int getArea() {
		return length * width;
	}


	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + " Circumference=" + getCircumference() + " Area=" + getArea() + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (width != other.width)
			return false;
		if (length != other.length)
			return false;
		return true;
	}
	
	

	
}
