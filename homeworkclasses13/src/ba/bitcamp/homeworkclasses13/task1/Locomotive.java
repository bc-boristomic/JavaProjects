package ba.bitcamp.homeworkclasses13.task1;

/**
 * Constructs a Locomotive on a Base
 * 
 * @author boris
 *
 */
public class Locomotive extends Base {

	private int numberOfChumneys;
	
	/**
	 * Constructor of Locomotive class
	 * 
	 * @param platfromLength platfromLength <code>double</code> type value of platform length
	 * @param platformWidth <code>double</code> type value of platform width
	 * @param wheelSize <code>double</code> type value of wheel size
	 * @param cabinSize <code>double</code> type value of cabin size (based on square)
	 * @param percentageOfWindowsOnCabin <code>double</code> type value of windows %
	 * @param numberOfChimneys <code>int</code> type number of chimneys
	 */
	public Locomotive(double platfromLength, double platformWidth, double wheelSize, 
			double cabinSize, double percentageOfWindowsOnCabin, int numberOfChimneys) {
		super(platfromLength, platformWidth, wheelSize);
		addPart(new Square(cabinSize){ // adds a cabin and calculates area to subtract because of windows percentage surface
			@Override
			public double area() {
				return super.area() * (1 - percentageOfWindowsOnCabin);
			}
		});
		for (int i = 0; i < numberOfChimneys; i++) { // for number of chimneys adds chimneys
			addPart(new Chimney(cabinSize)); // Chimney is nested class of Locomotive class
		}
		GeoBody frontLight = new GeoBody(){ // constructs a front light (half of circle)

			@Override
			public double area() {
				return (platformWidth / 2) * (platformWidth / 2) * Math.PI / 2;
			}

			@Override
			public double perimeter() {
				return platformWidth + platformWidth * Math.PI;
			}
			
		};
		addPart(frontLight); // adds front light
		this.numberOfChumneys = numberOfChimneys;
	}

	/**
	 * toString method of Locomotive class
	 * @return <code>String</code>
	 */
	public String toString() {
		return String.format("Locomotive have %d chimneys", numberOfChumneys);
	}
	
	
	/**
	 * Nested class chimney
	 * 
	 * Creates a chimney tall as cabin with edges on top. 
	 * 
	 * @author boris
	 *
	 */
	private class Chimney extends ComplexGeoBody{
		
		public Chimney(double height){
			addPart(new Rectangle(height / 3, height));
			addPart(new Rectangle(height / 3 + 10, 10));
		}
	}
}
