
public class Main {
	
	private static final int NUMBER_OF_PHILOSOPHERS = 5;
	
	public static void main(String[] args) {
		
		Philosopher[] philosophers = new Philosopher[NUMBER_OF_PHILOSOPHERS];
		Stick[] sticks = new Stick[NUMBER_OF_PHILOSOPHERS];
		
		for (int i = 0; i < sticks.length; i++) {
			sticks[i] = new Stick(i);
		}
		
		for (int i = 0; i < philosophers.length; i++) {
			new Philosopher(i, sticks[(i + 1) % NUMBER_OF_PHILOSOPHERS], sticks[i]).start();
		}
		
	}

}
