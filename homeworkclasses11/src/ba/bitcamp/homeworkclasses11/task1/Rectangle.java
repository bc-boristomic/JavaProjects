package ba.bitcamp.homeworkclasses11.task1;

public class Rectangle {
	
	private double length;
	private double width;
	
	/**
	 * Constructor of Rectangle class
	 * 
	 * @param length <code>double</code> type value for length
	 * @param width <code>double</code> type value for width
	 */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	
	/**
	 * Calculates area of a rectangle.
	 * 
	 * @return <code>double</code> type rectangle area
	 */
	public double getRectangleArea() {
		return length * width;
	}
	
	
	/**
	 * Calculates perimeter of a rectangle.
	 * 
	 * @return <code>double</code> type rectangle perimeter
	 */
	public double getRectanglePerimeter() {
		return (length + width) * 2;
	}

}
