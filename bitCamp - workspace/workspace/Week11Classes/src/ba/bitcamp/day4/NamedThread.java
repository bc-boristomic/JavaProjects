package ba.bitcamp.day4;

public class NamedThread extends Thread {
	
	private String name;
	
	public NamedThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " counted to " + i);
		}
	}
	
	
	public static void main(String[] args) {
		
		NamedThread t1 = new NamedThread("Ross");
		NamedThread t2 = new NamedThread("Joey");
		NamedThread t3 = new NamedThread("Rachel");
		
		t1.start();
		t2.start();
		t3.start();
		
		// waits for threads to finish to go on with code
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("End of main");
		
		
	}

}
