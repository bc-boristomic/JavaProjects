package ba.bitcamp.homework16.task2;

public class Main {
	
	public static void main(String[] args) {
		
		Glass g1 = new Glass(200);
		
		System.out.println(g1.getCurrentCapacity());
		System.out.println(g1.getMaxCapacity());
		System.out.println(g1.getTypeOfLiquid());
		
		System.out.println();
		g1.addLiquid("Water", 100);
		
		
		System.out.println(g1.getCurrentCapacity());
		System.out.println(g1.getMaxCapacity());
		System.out.println(g1.getTypeOfLiquid());
		
		System.out.println("Emptying glass " + g1.emptyGlass());
	}

}