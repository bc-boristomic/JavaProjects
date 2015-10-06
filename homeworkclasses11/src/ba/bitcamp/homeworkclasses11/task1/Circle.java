package ba.bitcamp.homeworkclasses11.task1;

public class Circle {
	
	private double radius;
	
	/**
	 * Constructor of Circle class.
	 * 
	 * @param radius Input for <code>double</code> type radius value
	 */
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/**
	 * Calculates area of the circle.
	 * 
	 * @return <code>double</code> type value of circle area
	 */
	public double getCircleArea() {
		return Math.PI * radius * radius;
	}
	
	
	/**
	 * Calculates volume of the circle.
	 * 
	 * @return <code>double</code> type value of circle volume
	 */
	public double getCircleVolume() {
		return Math.PI * radius * 2;
	}

}
