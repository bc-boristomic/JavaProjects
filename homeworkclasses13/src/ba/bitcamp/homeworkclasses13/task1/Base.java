package ba.bitcamp.homeworkclasses13.task1;


/**
 * Class Base construct a base of any train car, 
 * whether it's a railcar or a locomotive. 
 * 
 * @author boris
 *
 */
public class Base extends ComplexGeoBody {
	
	private double platformLength;
	private double platformWidth;
	private double wheelSize;

	/**
	 * Constructor of Base class.
	 * Construct two wheels and a platform with defined sizes.
	 * 
	 * @param platfromLength <code>double</code> type value of platform length
	 * @param platformWidth <code>double</code> type value of platform width
	 * @param wheelSize <code>double</code> type value of wheel size
	 */
	public Base(double platfromLength, double platformWidth, double wheelSize){
		addPart(new Circle(wheelSize));
		addPart(new Circle(wheelSize));
		addPart(new Rectangle(platfromLength, platformWidth));
		this.platformLength = platfromLength;
		this.platformWidth = platformWidth;
		this.wheelSize = wheelSize;
	}
	
	
	/**
	 * toString method of Base class.
	 * 
	 * @return <code>String</code>
	 */
	public String toString() {
		return String.format("Platform length = %f, platform width = %f, wheels size = %f", platformLength, platformWidth, wheelSize);
	}
}
