package ba.bitcamp.homeworkclasses11.task1;

public class Main {
	
	public static void main(String[] args) {
		
		// cm measurements
		Circle wheels = new Circle(30.5);
		
		Circle windows = new Circle(40);
		
		Square cabin = new Square(510.18);
		
		Rectangle platform = new Rectangle(715.5, 40);
		
		Rectangle chimny = new Rectangle(70, 25);
		
		Locomotive l1 = new Locomotive(wheels, cabin, platform, chimny, windows);
	
		Railcar r1 = new Railcar(wheels, platform);
		Railcar r2 = new Railcar(wheels, platform);
		Railcar r3 = new Railcar(wheels, platform);
		
		Railcar[] r = new Railcar[] {r1, r2, r3};
		
		Train t = new Train(l1, r);
		
		System.out.print("To paint entire train it would take ");
		System.out.println(t.getTrainArea() / 100 + " liters of paint."); // from cm to m
		
		System.out.print("To outline entire train it would take ");
		System.out.println(t.getTrainPerimeter() / 100 + " liters of paint."); // from cm to m (1m == 1l of paint)
		
		
	}

}
