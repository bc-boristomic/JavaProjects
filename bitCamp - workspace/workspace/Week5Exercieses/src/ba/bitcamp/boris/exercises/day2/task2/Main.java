package ba.bitcamp.boris.exercises.day2.task2;

public class Main {
	
	public static void main(String[] args) {
		
		Glass g1 = new Glass(200);
		
		System.out.println(g1.getCurrentCapacity());
		System.out.println(g1.getMaxCapacity());
		System.out.println(g1.getTypeOfLiquid());
		
		System.out.println();
		g1.addLiquid("Water", 150);
		
		System.out.println(g1.getCurrentCapacity());
		System.out.println(g1.getMaxCapacity());
		System.out.println(g1.getTypeOfLiquid());
		
		System.out.println("Emptying glass " + g1.emptyGlass());
	}

}
