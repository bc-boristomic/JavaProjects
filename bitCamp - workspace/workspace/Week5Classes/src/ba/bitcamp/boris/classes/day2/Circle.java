package ba.bitcamp.boris.classes.day2;

public class Circle {
	
	private int diametar;
	private Point point;
	
	
	public Circle (int r, Point p) {
		this.diametar = r;
		this.point = p;
	}
	
	public String toString() {
		String s = "Center point is at " + point + ", diametar is " + diametar;
		return s;
	}
	
	public boolean equals(Circle other) {
		if (this.point.equals(other.point) && this.diametar == other.diametar) {
			return true;
		} else {
			return false;
		}
	}
	
	public void areConnected(Circle other) {
		if (this.point.distance(other.point) <= (this.diametar + other.diametar)) {
			System.out.println("are connected");
		} else {
			System.out.println("not connected");
		}
	}

}
