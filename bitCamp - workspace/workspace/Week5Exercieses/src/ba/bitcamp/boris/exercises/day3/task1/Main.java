package ba.bitcamp.boris.exercises.day3.task1;

public class Main {
	
	public static void main(String[] args) {
		
		Speakerphone s1 = new Speakerphone("Sony", 7, 213.99);
	
		System.out.println(s1);
		
		s1.enable(); // Turn it ON
		System.out.println(s1);
		
		s1.increaseVolume(); // Increase volume by 40
		s1.increaseVolume();
		s1.increaseVolume();
		s1.increaseVolume();
		
		System.out.println(s1);
		
		System.out.println("How much did it cost? " + s1.getPrice());
		
		s1.disable(); // Turn it OFF
		
		s1.lowerVolume();
				
	}
	

}
