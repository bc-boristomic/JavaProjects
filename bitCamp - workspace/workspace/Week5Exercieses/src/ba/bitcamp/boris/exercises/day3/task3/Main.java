package ba.bitcamp.boris.exercises.day3.task3;

public class Main {
	
	public static void main(String[] args) {
		
		Antenna a1 = new Antenna("Motorolla", 50);
		
		System.out.println(a1);
		
		a1.setSignalStrength(3); // Change signal to 3
		
		System.out.println(a1);
		
		String call = "CAL38761234567";
		String message = "SMS38794957543";
		
		System.out.println(a1.getCall(2, call)); // get call
		
		System.out.println(a1.getCall(1, message)); // get corrupted message
		
		
		
	}

}
