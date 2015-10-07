package ba.bitcamp.day3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

	public static void runExample() {

		ExecutorService es = Executors.newFixedThreadPool(2);
		es.submit(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Task 1");

			}
		});

		es.submit(new Runnable() {
			@Override
			public void run() {
				System.out.println("Task 2");

			}
		});
		
		es.shutdown(); // when all threads finish their work shuts app down
		
	}

}
