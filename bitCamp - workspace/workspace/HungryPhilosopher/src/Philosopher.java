import java.util.Random;


public class Philosopher extends Thread {
	
	private int philosopherPosition;
	private Stick leftStick;
	private Stick rightStick;
	private boolean isHungry;
	private Random timeOfAction;
	
	public Philosopher(int philosopherPosition, Stick leftStick, Stick rightStick) {
		this.philosopherPosition = philosopherPosition;
		this.leftStick = leftStick;
		this.rightStick = rightStick;
		isHungry = false;
		timeOfAction = new Random();
	}
	
	private boolean checkIfHungry() {
		int tempNum = timeOfAction.nextInt(100);
		if (tempNum > 50) {
			return true;
		}
		return false;
	}
	
	@Override
	public void run() {
		while (true) {
			if (checkIfHungry()) {
				eat();
				
			} else {
				think();
			}
		}
	}
	
	private void think() {
		System.out.println(philosopherPosition + " is thinking.");
		try {
			Thread.sleep(timeOfAction.nextInt(5000));
		} catch (InterruptedException e) {
			System.err.println("Thread was interrupted while thinking");
			e.printStackTrace();
		}
	}
	
	private void eat() {
		while (!leftStick.getIfFree()) {
			try {
				System.out.println("Philosopher " + philosopherPosition + " is waiting left stick " + leftStick.getStickNumber());
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.err.println("Thread was interrupted while thinking");
				e.printStackTrace();
			}			
		}
		
		while (!rightStick.getIfFree()) {
			try {
				System.out.println("Philosopher " + philosopherPosition + " is waiting right stick " + rightStick.getStickNumber());
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.err.println("Thread was interrupted while thinking");
				e.printStackTrace();
			}			
		}
		System.out.println(philosopherPosition + " is eating");
		
		leftStick.setStickFree();
		rightStick.setStickFree();
		
	}

}
