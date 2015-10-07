package ba.bitcamp.classes.day1.task2;

public class Outer {
	
	private int number;
	public Inner in;
	
	public Outer(){
		this.number = 10;
		in = new Inner(20);
	}
	
	// If Inner class is static you can create an object with it.
	class Inner {
		
		private int innerNumber;
		private int number;
		
		public Inner(int number){
			this.number = number;
		}
		
		public void printVariable(int number){
			System.out.println("Param number: " + number);
			System.out.println("Inner number: " + this.number);
			System.out.println("Outer number: " + Outer.this.number);
		}
		
	}

}
