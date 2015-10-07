package day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {

	private static Object lock = new Object();
	private static Integer primeCounter = 0;

	public static void main(String[] args) {

		while (true) {
		try {
			Socket connectTo = new Socket("10.0.82.98", 8000);
			System.out.println("Connected");
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					connectTo.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					connectTo.getOutputStream()));

			String fromServer = "";
				fromServer = reader.readLine();
				System.out.println(fromServer);

				String[] parts = fromServer.split(" ", 2);
				Integer start = Integer.parseInt(parts[0]);
				Integer end = Integer.parseInt(parts[1]);

				Thread t = new Thread(new Task(start, end));
				t.start();
				t.join();

				writer.write(primeCounter + "");
				writer.newLine();
				writer.flush();
				System.out.println(primeCounter);
				primeCounter = 0;

		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		}

	}

	static class Task implements Runnable {
		private int start;
		private int end;

		public Task(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public void run() {
			for (int i = start; i < end; i++) {
				if (isPrimeEfficient(i)) {
					synchronized (lock) {
						primeCounter++;
					}
				}
			}
		}
	}

	public static boolean isPrimeEfficient(int num) {
		if (num == 0 || num == 1) {
			return false;
		}

		if (num == 2) {
			return true;
		}

		if (num % 2 == 0) {
			return false;
		}

		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

}
