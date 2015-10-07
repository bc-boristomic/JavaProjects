package ba.bitcamp.exercieses.day1.task1;

public class Line implements Shape, Drawable {

	private int length;
	
		
	public Line(int length) {
		this.length = length;
	}

	@Override
	public void drawOnConsole() {
		for (int i = 0; i < length; i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}

	@Override
	public int getCircumference() {
		return length;
	}

	@Override
	public int getArea() {
		return 0;
	}

	
	@Override
	public String toString() {
		return "Line [length=" + length + " Circumference=" + getCircumference() + " Area=" + getArea() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Line other = (Line) obj;
		if (length != other.length)
			return false;
		return true;
	}
	
	

}
