package ba.bitcamp.homeworkclasses11.task1;

public class Train {
	
	Locomotive locomotive;
	Railcar[] railcars;
	
	/**
	 * Constructor of train class
	 * 
	 * @param locomotive Locomotive object
	 * @param railcars Railcars array
	 */
	public Train(Locomotive locomotive, Railcar[] railcars) {
		this.locomotive = locomotive;
		this.railcars = railcars;
	}
	
		
	/**
	 * Calculates area of entire train.
	 * 
	 * @return <code>double</code> type value of train area
	 */
	public double getTrainArea() {
		double area = 0;
		for (int i = 0; i < railcars.length; i++) {
			area += railcars[i].getRailcarArea();
		}
		return area += locomotive.getLocomotiveArea();
	}
	
	
	/**
	 * Calculates perimeter of entire train.
	 * 
	 * @return <code>double</code> type value of train perimeter
	 */
	public double getTrainPerimeter() {
		double perimeter = 0;
		for (int i = 0; i < railcars.length; i++) {
			perimeter += railcars[i].getRailcarPerimeter();
		}
		return perimeter += locomotive.getLocomotivePerimeter();
	}

}
