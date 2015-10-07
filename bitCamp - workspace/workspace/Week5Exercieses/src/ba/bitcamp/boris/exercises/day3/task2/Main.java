package ba.bitcamp.boris.exercises.day3.task2;

public class Main {
	
	public static void main(String[] args) {
		
		Battery b1 = new Battery("Samsung", 20);
		
		System.out.println(b1);
		
		b1.chargeBattery(2); // Charging battery for 2 minutes
		
		System.out.println(b1);
		
		b1.discargeBattery(32); // Discharge battery for 32%
		
		System.out.println(b1);
		
	}
	
	
	

}
