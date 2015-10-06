package ba.bitcamp.homeworkclasses13.task1;

/**
 * Circle class will be used to create 
 * wheels and windows of train.
 * 
 * @author boris
 *
 */
public class Circle implements GeoBody {
	
	private double radius;
	
	/**
	 * Constructor of Circle class.
	 * 
	 * @param radius Input is <code>double</code> type value of circle radius. 
	 */
	public Circle(double radius){
		this.radius =radius;		
	}

	/**
	 * Method implemented from GeoBody.
	 * Calculates area of circle.
	 * 
	 * @return area of circle
	 */
	@Override
	public double area() {
		return radius * radius * Math.PI;
	}

	/**
	 * Method implemented from GeoBody.
	 * Calculates perimeter of circle.
	 * 
	 * @return perimeter of circle
	 */
	@Override
	public double perimeter() {
		return 2 * radius * Math.PI;
	}
	
	
	/**
	 * toString method of Circle class. 
	 * 
	 * @return <code>String</code>
	 */
	public String toString() {
		return String.format("Circle (r = %f)", radius);
	}
	
	

}
