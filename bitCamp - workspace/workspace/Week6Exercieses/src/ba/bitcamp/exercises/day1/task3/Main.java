package ba.bitcamp.exercises.day1.task3;

public class Main {
	
	public static void main(String[] args) {
		
		
		Clock c = new Clock(10, 27, 30);
		
		c.addToFile("file", WriteableClock.MILITARY_FORMAT_NO_SECONDS);
		
	}

}
