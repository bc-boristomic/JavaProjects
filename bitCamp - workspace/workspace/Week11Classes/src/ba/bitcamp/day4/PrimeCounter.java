package ba.bitcamp.day4;

import java.util.Date;

public class PrimeCounter extends Thread {

	private int start;
	private int end;
	private int count;

	public PrimeCounter(int start, int end) {
		this.start = start;
		this.end = end;
		this.count = 0;
	}

	public void countPrimes() {
		for (int i = start; i < end; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
	}

	public int getCount() {
		return this.count;
	}

	private boolean isPrime(int number) {
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void run() {
		countPrimes();
	}

	public static void main(String[] args) {

		Date start = new Date();

		// PrimeCounter pc = new PrimeCounter(1, 1000000);
		// pc.countPrimes();
		// System.out.println("Primes count: " + pc.getCount());

		PrimeCounter[] counters = new PrimeCounter[30];

		int startNum = 1;
		int endNum = 10_000_000;
		int step = endNum / counters.length;

		for (int i = 0; i < counters.length; i++) {
			counters[i] = new PrimeCounter(i * step, (i + 1) * step);
			counters[i].start();
		}
		
		int totalCount = 0;
		try {
			for (int i = 0; i < counters.length; i++) {
				counters[i].join();
				totalCount += counters[i].getCount();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Date end = new Date();
		long timeLapse = (end.getTime() - start.getTime()) / 1000;
		
		System.out.println("Primes count: " + totalCount);
		System.out.println("Time (s): " + timeLapse);
		System.out.println("End of main");
	}

}
