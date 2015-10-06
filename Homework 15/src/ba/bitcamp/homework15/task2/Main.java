package ba.bitcamp.homework15.task2;

public class Main {
	
	public static void main(String[] args) {
		
		Animal a1 = new Animal("Dog", 2, 3);
		Animal a2 = new Animal("Bee", 1, 1);
		
		a1.printStatus();
		
		a2.printStatus();
		
		Animal.cycleDayNight();
		
		Animal.setAmountOfWater(3);
		
		a1.printStatus();
		
		a2.printStatus();
	}

}