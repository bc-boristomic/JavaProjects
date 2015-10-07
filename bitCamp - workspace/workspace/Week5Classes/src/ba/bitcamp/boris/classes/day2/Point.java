package ba.bitcamp.boris.classes.day2;

public class Point {
	
	private  int x;
	private  int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
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
	
	
	public String toString() {
		String s = String.format("x = %d, y = %d", x, y);
		return s;
		
	}
	/**
	 * Returns distance from Point Object 1 to Point Object 2
	 * 
	 * @param other - Second Point Object
	 * @return <code>double</code> type value
	 */
	public double distance (Point other) {
		double d = 0;
		if (this.equals(other) == true) {
			//System.out.println("Distance not neded, objects have same value.");
			return d; 
		} else {
			d = Math.sqrt(((this.x - other.x) * (this.x - other.x)) + ((this.y - other.y) * (this.y - other.y)));
			return d;
		}
	}
	
	/**
	 * Compares two Objects from Point Class
	 * 
	 * @param other - Second Object Point
	 * @return
	 */
	public boolean equals(Point other) {
		if (this.x == other.x && this.y == other.y) {
			return true;
		} else {
			return false;
		}
	}
	

}
