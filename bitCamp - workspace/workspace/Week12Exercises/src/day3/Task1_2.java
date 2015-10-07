package day3;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;


public class Task1_2 {
	
	private static LinkedBlockingQueue<Task> queue;
	private static ArrayList<Worker> workers;
	private static Integer counter = 0;
	private static Object lock = new Object();

	
	public static void main(String[] args) {
		
		queue = new LinkedBlockingQueue<>();
		workers = new ArrayList<>();
		int workLoad = 10_000; // makes 1000 jobs
		int loadTaken = 10;
		
		while (loadTaken < 1_000_000) {
			Task t = new Task(loadTaken, loadTaken + workLoad);
			queue.add(t);
			loadTaken += workLoad;
		}
		
		
		long time = System.currentTimeMillis();
		for (int i = 0; i < 8; i++) {
			Worker w = new Worker();
			w.start();
			workers.add(w);
		}	
				
		try {
			for (Worker w : workers) {
				w.join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Took " + (System.currentTimeMillis() - time) + " ms");
		System.out.println("Primes: " + counter);

		
	}
	
	private static class Task implements Runnable {
		
		private int start;
		private int end;
		
		public Task(int start, int end) {
			this.start = start;
			this.end = end;
		}
		
		@Override
		public void run() {
			for (int i = start; i < end; i++) {
				if (isPrime(i)) {
					synchronized (lock) {
						counter++;
					}
				}
			}
		}
		
	}
	
	
	private static class Worker extends Thread {

		@Override
		public void run() {
			while (!queue.isEmpty()) {
				try {
					Task t = queue.take();
					t.run();
				} catch (InterruptedException e) {
					break;
				}
			}
		}
	}
	
	
	private static boolean isPrime(int number) {
		for (int i = 2; i < number / 2 + 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	

}
