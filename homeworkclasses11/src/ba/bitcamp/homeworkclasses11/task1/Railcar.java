package ba.bitcamp.homeworkclasses11.task1;

public class Railcar {
	
	Circle wheels;
	Rectangle platform;
	
	/**
	 * Constructor of Railcar class
	 * 
	 * @param wheels Circle object
	 * @param platform Rectangle object
	 */
	public Railcar(Circle wheels, Rectangle platform) {
		this.wheels = wheels;
		this.platform = platform;
	}
	
	/**
	 * Calculates railcar area.
	 * 
	 * @return <code>double</code> type value of area
	 */
	public double getRailcarArea() {
		return (wheels.getCircleArea() * 2) + platform.getRectangleArea(); 
	}

	
	/**
	 * Calculates railcar perimeter.
	 * 
	 * @return <code>double</code> type value of perimeter
	 */
	public double getRailcarPerimeter() {
		return (wheels.getCircleVolume() * 2) + platform.getRectanglePerimeter();
	}
}
