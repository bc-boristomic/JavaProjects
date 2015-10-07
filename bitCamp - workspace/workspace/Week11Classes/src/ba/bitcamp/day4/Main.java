package ba.bitcamp.day4;

public class Main implements Runnable {
	
	public static void main(String[] args) {
		
		Main m = new Main();
		Thread t = new Thread(m);
		System.out.println(t.getName());
				
		t.start();
		t.yield();
		for (int i = 0; i < 100; i++) {
			System.out.println("Main");
		}
		
	}

	@Override
	public void run() {
		System.out.println("Going to sleep");
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Wake up");
	}

}
