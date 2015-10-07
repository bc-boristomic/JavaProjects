package ba.bitcamp.day4;

import java.util.Date;

public class PrimeCounter2 extends Thread {

	private int start;
	private int end;
	private static int count;

	public PrimeCounter2(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public void countPrimes() {
		for (int i = start; i < end; i++) {
			if (isPrime(i)) {
				synchronized(PrimeCounter2.class){
					count++;
				}
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

		PrimeCounter2[] counters = new PrimeCounter2[30];

		int endNum = 1000000;
		int step = endNum / counters.length;

		for (int i = 0; i < counters.length; i++) {
			counters[i] = new PrimeCounter2(i * step, (i + 1) * step);
			counters[i].start();
		}
		
		try {
			for (int i = 0; i < counters.length; i++) {
				counters[i].join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Date end = new Date();
		long timeLapse = (end.getTime() - start.getTime()) / 1000;
		int result = counters[0].getCount();
		System.out.println("Primes count: " + result);
		System.out.println("Missing numbers: " + (78501 - result));
		System.out.println("Time (s): " + timeLapse);
		System.out.println("End of main");
	}

}
