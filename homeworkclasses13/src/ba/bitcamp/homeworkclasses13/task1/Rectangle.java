package ba.bitcamp.homeworkclasses13.task1;

/**
 * Rectangle class will be used to create platform, 
 * chimney and squares.
 * 
 * @author boris
 *
 */
public class Rectangle implements GeoBody {

	private double length;
	private double width;
	
	
	/**
	 * Constructor of Rectangle class.
	 * 
	 * @param length Input is <code>double</code> type value of rectangle length.
	 * @param width Input is <code>double</code> type value of rectangle width.
	 */
	public Rectangle (double length, double width){
		this.length = length;
		this.width = width;
	}
	
	
	/**
	 * Method implemented from GeoBody.
	 * Calculates area of rectangle.
	 * 
	 * @return area of rectangle
	 */
	@Override
	public double area() {
		return length * width;
	}

	/**
	 * Method implemented from GeoBody.
	 * Calculates perimeter of rectangle.
	 * 
	 * @return perimeter of rectangle
	 */
	@Override
	public double perimeter() {
		return 2 * (length + width);
	}
	
	/**
	 * toString method of Rectangle class.
	 * 
	 * @return <code>String</code>
	 */
	public String toString() {
		return String.format("Rectangle (length = %f, width = %f)", length, width);
	}

}
