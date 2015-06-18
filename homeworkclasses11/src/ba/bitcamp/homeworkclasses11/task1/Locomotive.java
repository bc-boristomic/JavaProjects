package ba.bitcamp.homeworkclasses11.task1;

public class Locomotive {
	
	Circle wheels;
	Circle windows;
	Square cabin;
	Rectangle platform;
	Rectangle chimny;
	
	/**
	 * Constructor of Locomotive class
	 * 
	 * @param wheels Circle object
	 * @param cabin Square object
	 * @param platform Rectangle object
	 * @param chimny Rectangle object
	 * @param windows Circle object
	 */
	public Locomotive(Circle wheels, Square cabin, Rectangle platform, Rectangle chimny, Circle windows) {
		this.wheels = wheels;
		this.cabin = cabin;
		this.platform = platform;
		this.chimny = chimny;
		this.windows = windows;
	}
	
	/**
	 * Calculates area of a locomotive.
	 * 
	 * @return <code>double</code> type value of area
	 */
	public double getLocomotiveArea() {
		return (wheels.getCircleArea() * 2) - (windows.getCircleArea() * 2) + cabin.getSquareArea() 
				+ platform.getRectangleArea() + chimny.getRectangleArea();
	}
	
	
	/**
	 * Calculates perimeter of a locomotive.
	 * 
	 * @return <code>double</code> type value of perimeter
	 */
	public double getLocomotivePerimeter() {
		return (wheels.getCircleVolume() * 2) + (windows.getCircleVolume() * 2) + cabin.getSquarePerimeter()
				+ platform.getRectanglePerimeter() + chimny.getRectanglePerimeter();
	}
	
	

}
