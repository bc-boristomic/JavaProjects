package ba.bitcamp.homework23.task1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Public class FilesAndThreads implements Consumer / Producer multi-processing.
 * 
 * @author boris
 *
 */
public class FilesAndThreads {

	private LinkedBlockingQueue<Job> jobs = new LinkedBlockingQueue();
	private ArrayList<Worker> workers = new ArrayList<>();
	private ArrayList<Character> letters = new ArrayList<>();
	private Integer counter = 0;
	private Object lock = new Object();
	private BufferedReader reader;

	/**
	 * Public method startWorking first reads from file ensuring that all the
	 * letters are read correctly. Then assigns twenty smaller tasks for each
	 * worker to process. There are four workers (Threads) each processing
	 * processing tasks as long as there are tasks to be processed. When all the
	 * workers finish their job, number of letters that are same as first letter
	 * in a file will be printer to standard output.
	 */
	public void startWorking() {
		StringBuilder sb = new StringBuilder();

		readFromFile();
		int numOfLetters = letters.size();
		int numOfTasks = 20;
		//Zamalo pa utrefi, ali ovdje imas ipak malu fulu ;)
		//Uzmi da se u fajlu nalazi npr, 101 slovo i podjeli ovo sa brojem taskova 20 i dobit ces 5,05
		//posto radis stavljanje u int ti ces dobiti vrijednost 5
		//Sada kada ovo stavis u svoju logiku imat ces: 0 - 5, 6 - 10 ,... 95 - 100 i kao sto vidimo 101 slovo
		//nece nikada biti procitano.
		//Dodaj logiku za provjeru da 21 Job preuzme npr, sve sto ne udje u ovih prvih 20 taskova tj,
		//int leftOver = numOfLetters % numOfTasks;
		//A zatim to predas Job-u koji uzme Job 21 da to obradi.
		//Ili ako hoces sve sto ne bude ucitano sa prvih 19 Jobova daj zadnjem Jobu da obradi tj, imat ces 95 - 101.
		//Mislim da ce ti problem predstavljati sva slova od 101 do 109 jer kada predje 5.5 moguce da zaokruzi na 6 int tip.
		int load = numOfLetters / numOfTasks;

		for (int i = 0; i < numOfTasks; i++) {
			Job j = new Job(i * load, (i + 1) * load);
			jobs.add(j);
		}

		for (int i = 0; i < 4; i++) {
			Worker w = new Worker();
			workers.add(w);
			w.start();
		}

		for (Worker worker : workers) {
			try {
				worker.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		sb.append("Letter ").append(letters.get(0)).append(", appeared ");
		sb.append(counter).append(" times in \"file.txt\" file.");

		System.out.println(sb);
	}

	/**
	 * Private method readFromFile will read from file "file.txt" and add every
	 * letter from file to ArrayList of letters, every letter will be parsed to
	 * lower case, ensuring that count number will be right.
	 */
	private void readFromFile() {
		try {
			reader = new BufferedReader(new FileReader("src/file.txt"));

			while (reader.ready()) {
				letters.add(Character.toLowerCase((char) reader.read()));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Private inner class Job implements Runnable interface and is used as
	 * producer class. Creates a job for a consumer (worker), each worker can
	 * take a smaller workload (via constructor, a smaller portion of job so
	 * they can process it faster.
	 * 
	 * @author boris
	 *
	 */
	private class Job implements Runnable {

		private int from;
		private int to;

		/**
		 * Default constructor of Job class for inputing workload position from
		 * and to, start and finish.
		 * 
		 * @param from
		 *            <code>int</code> type value starting position from
		 * @param to
		 *            <code>int</code> type value ending position to
		 */
		public Job(int from, int to) {
			this.from = from;
			this.to = to;
		}

		@Override
		public void run() {
			Character ch = letters.get(0);

			for (int i = from; i < to; i++) {
				if (ch.equals(letters.get(i))) {
					synchronized (lock) {
						counter++;
					}
				}
			}

		}

	}

	/**
	 * Private inner class Worker extends Thread and is used as consumer class.
	 * Worker will take job from queue of jobs as long as there is a job in a
	 * queue and will go and process it.
	 * 
	 * @author boris
	 *
	 */
	private class Worker extends Thread {
		@Override
		public void run() {
			while (!jobs.isEmpty()) {
				try {
					Job j = jobs.take();
					j.run();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
