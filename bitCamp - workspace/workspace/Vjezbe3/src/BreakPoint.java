public class BreakPoint {
	public static void main  (String [] args ){
		int meters = 33000;
		int kilometers = meters / 1000;
		int milimiters = meters *1000;
		double inches = meters * 39.3701;
		double miles = meters * 0.000621;
		
		// 33000 [m] 3,3 [km] 33000000 [mm] foot inch

		System.out.println(kilometers + "[km]\n" + milimiters + "[mm]\n" + inches + "[inch]\n" + miles + "[miles]\n"); 	
		
		int celsius = 20;
		double kelvins = 274.15 + celsius;
		double farenheit = celsius * 3.4;
		
		System.out.println(celsius + "[C]\n" + kelvins + "[K]\n" + farenheit + "[F]\n");
	
		int step = 180;
		double rads = step / Math.PI;
		
		System.out.println(rads + "[R]");
	}
	
	
}
