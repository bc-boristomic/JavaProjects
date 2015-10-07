package ba.bitcamp.boris.exercises.day3.task4;

public class Main {
	
	public static void main(String[] args) {
		
		Display d1 = new Display("Samsung", 20);
		
		System.out.println(d1);
		
		d1.turnON(); // turning display on
		System.out.println(d1);
		
		d1.lowerBrightness(); // lowering brightness by 30 points
		d1.lowerBrightness();
		d1.lowerBrightness();
		System.out.println(d1);
	}

}
