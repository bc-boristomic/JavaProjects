package ba.bitcamp.boris.classes.day4;

public class Task2 {

	public static void main(String[] args) {
		
		String name;
		
		System.out.println("What is your name?");
		name = TextIO.getln();
		System.out.printf("Hello %s", name.toUpperCase());
		
	}

}
