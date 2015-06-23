package ba.bitcamp.homeworkclasses13.task1;

/**
 * Train class allows to create Locomotive with
 * any number of railcars.
 * 
 * @author boris
 *
 */
public class Train extends ComplexGeoBody {
	
	
	public Train(double platfromLength, double platformWidth, int numberOfRailcars){
		addPart(new Locomotive(platfromLength, platformWidth, 10, platfromLength / 2, 0.3, 1));
		for (int i = 0; i < numberOfRailcars; i++) { // adds railcars
			addPart(new Base(platfromLength, platformWidth, 10));
		}
	}
	
	/**
	 * toString method of Train class.
	 * 
	 * @return <code>String</code>
	 */
	public String toString() {
		return super.toString();
	}

}
