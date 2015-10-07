package ba.bitcamp.boris.exercises.day5.task1;

public class Main {
	
	public static void main(String[] args) {
		
		
		Zebra z = new Zebra(70, 14, Zebra.DEADLY_SICK);
		Zebra z2 = new Zebra(80, 29, Zebra.HEALTHY);
		
		Tiger t = new Tiger(220, 80, Tiger.EATING);
		//t.setIsAlive(false);
		Plant p1 = new Plant(true, false, Plant.MEDIUM_QUANTITY);
		
		Plant p2 = new Plant(true, true, Plant.LOW_QUANTITY);
		
		System.out.println("Dead Zebra");
		System.out.println("----------");
		System.out.println(z);
		System.out.println();
		
		System.out.println("Live sick Zebra");
		System.out.println("----------");
		System.out.println(z2);
		System.out.println();
		
		System.out.println("Live Tiger");
		System.out.println("----------");
		System.out.println(t);
		System.out.println();
		
		System.out.println("Live Good Plant");
		System.out.println(p1);
		System.out.println();
		
		System.out.println("Live Poison Plant");
		System.out.println(p2);
		System.out.println();
		
		t.eat(z);
		t.eat(z2);
		t.eat(t);
		
		
	}

}
