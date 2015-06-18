package ba.bitcamp.homeworkclasses11.task1;

public class Square {
	
	private double side;
	
	/**
	 * Constructor of Square class
	 * 
	 * @param side <code>double</code> type value for square side
	 */
	public Square(double side) {
		this.side = side;
	}
	
	/**
	 * Calculates perimeter of a square
	 * 
	 * @return <code>double</code> type value for perimeter
	 */
	public double getSquarePerimeter() {
		return side * 4;
	}
	
	
	/**
	 * Calculates area of the square
	 * 
	 * @return <code>double</code> type value for area
	 */
	public double getSquareArea() {
		return side * side; 
	}

}
