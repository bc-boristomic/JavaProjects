package ba.bitcamp.homeworkclasses13.task1;

import java.util.Arrays;

/**
 * Class ComplexGeoBody calculates area and perimeter 
 * of any possible part that comes to it.
 * 
 * <p>Also adds a part to any train.
 * 
 * @author boris
 *
 */
public class ComplexGeoBody implements GeoBody {

	GeoBody[] parts;
	
	/**
	 * Calculates area of all parts in 
	 * array of geometrical shapes.
	 * 
	 * @return <code>double</code> type value of area
	 */
	@Override
	public double area() {
		if (parts != null) {
			double area = 0;
			for (GeoBody part : parts) {
				area += part.area();
			}
			return area;
		}
		return 0;
	}

	
	/**
	 * Calculates perimeter of all parts in 
	 * array of geometrical shapes.
	 * 
	 * @return <code>double</code> type value of perimeter
	 */
	@Override
	public double perimeter() {
		if (parts != null) {
			double perimeter = 0;
			for (GeoBody part : parts) {
				perimeter += part.perimeter();
			}
			return perimeter;
		}
		return 0;
	}
	
	
	/**
	 * toString method of ComplexGeoBody class
	 * 
	 * @return <code>String</code>
	 */
	public String toString() {
		return String.format("ComplexGeoBody {parts = %s}", Arrays.toString(parts));
	}
	
	/**
	 * Method that adds geometrical part to train.
	 * 
	 * @param part new instance of some shape
	 */
	public void addPart(GeoBody part){
		GeoBody[] temp;
		if (parts == null) {
			temp = new GeoBody[] {part};
		} else {
			temp = new GeoBody[parts.length + 1];
			System.arraycopy(parts, 0, temp, 0, parts.length);
		}
		temp[temp.length - 1] = part;
		parts = temp;
	}

}
