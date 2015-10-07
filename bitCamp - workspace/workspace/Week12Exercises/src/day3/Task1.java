package day3;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class Task1 {

	private static final int FROM = 10;
	private static final int TO = 1_000_000;

	private static LinkedBlockingQueue<Producer> queue;
	private static ArrayList<Worker> workers;

	private static Integer counter = 0;
	private static Object lock = new Object();
	

	public static void main(String[] args) {

		queue = new LinkedBlockingQueue<>();
		workers = new ArrayList<>();

		int a = 0;
		int b = 100;

		for (int i = 0; i < 100; i++) {
			queue.add(new Producer(a, b));
			a = b;
			b += 10;
		}

		for (int i = 0; i < 8; i++) {
			Worker w = new Worker();
			w.start();
			workers.add(w);
		}

		long time = System.currentTimeMillis();
		for (Worker w : workers) {
			try {
				w.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Took " + (System.currentTimeMillis() - time)
				+ " ms");
		System.out.println(counter);

	}

	private static class Producer implements Runnable {

		private int start;
		private int end;

		public Producer(int start, int end) {
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
					Producer job = queue.take();
					job.run();
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
