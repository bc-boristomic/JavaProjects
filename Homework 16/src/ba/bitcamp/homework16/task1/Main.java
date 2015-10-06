package ba.bitcamp.homework16.task1;

public class Main {
	
	public static void main(String[] args) {
		
		Temperature t1 = new Temperature(12);
		
		System.out.println("Temperature in Celsius is " + t1.getTemperatureInC());
		System.out.println("Temperature in Kelvins is " + t1.getTemperatureInK());
		System.out.println("Temperature in Farenheit is " + t1.getTemperatureInF());
		
		System.out.println();
		
		System.out.println("Changing temperature");
		t1.setTemperature(32);
		
		System.out.println("Temperature in Celsius is " + t1.getTemperatureInC());
		System.out.println("Temperature in Kelvins is " + t1.getTemperatureInK());
		System.out.println("Temperature in Farenheit is " + t1.getTemperatureInF());
		
		
	}

}