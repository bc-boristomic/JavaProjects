package ba.bitcamp.homeworkweekend10.task2;

import java.util.Random;

/**
 * Class ThreeThreads have three threads that do specific task for specific
 * amount of time. Each threads starts when previous finishes their task.
 * 
 * One inner static class is used for all three threads.
 * 
 * @author boris
 *
 */
public class ThreeThreads {

	private static final int PRINT_NUMBERS = 0;
	private static final int PRINT_BITCAMP = 1;
	private static final int PRINT_RAND_NUMS = 2;

	public static void main(String[] args) {

		Thread t1 = new Thread(new MyThread(PRINT_NUMBERS));
		Thread t2 = new Thread(new MyThread(PRINT_BITCAMP));
		Thread t3 = new Thread(new MyThread(PRINT_RAND_NUMS));

		try {
			System.out.println("t1 prints numbers from 1 to 10 every 200 ms");
			t1.start();
			t1.join();
			System.out.println("\nt2 prints BitCamp four times every second");
			t2.start();
			t2.join();
			System.out.println("\nt3 prints five random numbers every 700 ms");
			t3.start();
			t3.join();
			System.out.println("\nmain method ended");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Inner static class MyThread receives option for mission in it's
	 * constructor.
	 * 
	 * @author boris
	 *
	 */
	private static class MyThread implements Runnable {

		private int option;

		public MyThread(int option) {
			this.option = option;
		}

		@Override
		public void run() {
			try {
				if (option == PRINT_NUMBERS) {
					for (int i = 1; i <= 10; i++) {
						System.out.print(i + " ");
						Thread.sleep(200);
					}
				} else if (option == PRINT_BITCAMP) {
					for (int i = 0; i < 4; i++) {
						System.out.print("BitCamp ");
						Thread.sleep(1000);
					}
				} else if (option == PRINT_RAND_NUMS) {
					Random rand = new Random();
					for (int i = 0; i < 5; i++) {
						System.out.print((rand.nextInt(5) + 1) + " ");
						Thread.sleep(700);
					}
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
