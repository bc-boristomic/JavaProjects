package day2;

public class Task2 {

	private static Integer counter = 0;

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {
			initThreads();
			counter = 0;
		}
	}

	private static void initThreads() {
		Thread t1 = new Thread(new Start());
		Thread t2 = new Thread(new Start());
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(counter);
	}

	private static class Start implements Runnable {

		@Override
		public void run() {
			synchronized (counter) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				for (int i = 0; i < 100; i++) {
					counter += 10;
				}
			}
		}

	}

}
