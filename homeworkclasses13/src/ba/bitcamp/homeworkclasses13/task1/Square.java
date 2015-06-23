package ba.bitcamp.homeworkclasses13.task1;


/**
 * Class square will be used to create cabin of Locomotive.
 * 
 * @author boris
 *
 */
public class Square extends Rectangle {

	private double side;
	
	/**
	 * Constructor of Square class.
	 * Sends side to both length and width of rectangle.
	 * Square is rectangle with same sides.
	 * 
	 * @param side Input is <code>double</code> type side of square
	 */
	public Square(double side) {
		super(side, side);
	}
	
	/**
	 * toString method of Square class.
	 * 
	 * @return <code>String</code>
	 */
	public String toString() {
		return String.format("Square (side = %f)", side);
	}

}
