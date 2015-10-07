package ba.bitcamp.boris.homework.week4.day2;

public class Task1 {
	
	public static void main(String[] args) {
		
		System.out.println(convertToKelvins(100));
		
	}
	
	/**
	 * Converts Celsius to Kelvins (ºC to ºK)
	 * 
	 * @param C inputed value is in <code>double</code> Celsiusº
	 * @return Kelvinsº
	 */
	public static double convertToKelvins (double C) {
		return 273.15 + C;
	}

}
