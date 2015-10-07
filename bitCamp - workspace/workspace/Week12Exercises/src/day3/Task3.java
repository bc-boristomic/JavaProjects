package day3;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class Task3 {

	private static int countFile = 0;
	private static int countDirectory = 0;

	private static LinkedBlockingQueue<Task> queue;
	private static ArrayList<Worker> workers;

	private static Object lock = new Object();

	public static void main(String[] args) {
		queue = new LinkedBlockingQueue<>();
		workers = new ArrayList<>();
		Task t = new Task(new File("/"));
		queue.add(t);
		long time = System.currentTimeMillis();
		for (int i = 0; i < 8; i++) {
			Worker w = new Worker();
			w.start();

		}
		for (Worker w : workers) {
			try {
				w.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("Time took to search with one thread "
				+ (System.currentTimeMillis() - time));
		System.out.println("Files " + countFile);
		System.out.println("Directories " + countDirectory);

	}

	private static class Task implements Runnable {

		private File root;

		public Task(File file) {
			this.root = file;
		}

		@Override
		public void run() {
			if (root == null) {
				return;
			} else if (root.listFiles() == null) {
				return;
			}
			for (File f : root.listFiles()) {
				if (f.isFile()) {
					synchronized (lock) {
						countFile++;
					}
				} else if (f.isDirectory()) {
					synchronized (lock) {
						countDirectory++;
						queue.add(new Task(f));
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
					return;
				}
			}
		}
	}

}
