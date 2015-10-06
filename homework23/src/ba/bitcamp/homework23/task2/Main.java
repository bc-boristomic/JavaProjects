package ba.bitcamp.homework23.task2;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

import javax.swing.JFrame;

public class Main extends JFrame {
	private static final long serialVersionUID = 2464566972531516514L;

	private MyPanel panel = new MyPanel();
	private LinkedBlockingQueue<Job> jobs = new LinkedBlockingQueue<>();
	private ArrayList<Worker> workers = new ArrayList<>();

	/**
	 * Default constructor of Main class, adds MyPanel as panel containing
	 * image, adds default JFrame components, makes jobs for workers, each job
	 * is one image pixel row, so there are image height amount of jobs. There
	 * are 8 threads, each working on different row. After all threads stop
	 * working there is 3000 ms timeout after witch application will close.
	 */
	public Main() {

		add(panel);

		setTitle("Negative image");
		setSize(1800, 1100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

//Mislim da si ovdje pogresno pretpostavio.
//Znaci ovaj dio koda si pogresno postavio.
//Previse se oslanjas na cinjenicu da je slika ucitana i kada se desi greska ovdje ce ti pasti NullPointException
//Razlog zbog kojeg ce pasti je cinjenica da konstantno vi po kodu kazete samo e.printStackTrace(); i tu puno grijesite
//Ovo znaci da si samo ispisao gresku na konzolu i da je nisi propagirao vise nigdje (ili ti ga zargonski progutao si exception)
//Znaci da bi ti ovo bio siguran kod trebao si tamo gdje citas sliku uradit throw e;
//A ovdje dodati try i catch oko citave logike (posto ako to padne ostala logika nema smisla uopce)!
		for (int i = 0; i < panel.getImage().getHeight(); i++) {
			jobs.add(new Job(panel.getImage().getWidth(), i));
		}

		for (int i = 0; i < 8; i++) {
			Worker w = new Worker();
			w.start();
			workers.add(w);
		}

		for (Worker w : workers) {
			try {
				w.join();
				//Ovo konstantno svi radite tj, gutanje exception-a i idete logikom happy path-a
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Jobs completed");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.exit(1);
			e.printStackTrace();
		}

		System.exit(0);

	}

	/**
	 * Private inner class Worker takes job from queue list and start working it
	 * until list contains a job.
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
					break;
				}
			}
		}
	}

	/**
	 * Private inner class Job implements Runnable interface and makes jobs for
	 * workers. Each job is to take one row of image and set rgb colors to
	 * negative on, so the loop goes from first pixel to end on in image width,
	 * takes each pixel in that column and sets it to negative color.
	 * 
	 * @author boris
	 *
	 */
	private class Job implements Runnable {

		private int rows;
		private int columns;

		public Job(int row, int column) {
			this.rows = row;
			this.columns = column;
		}

		@Override
		public void run() {
			for (int i = 0; i < rows; i++) {
				panel.getImage().setRGB(i, columns,
						255 - panel.getImage().getRGB(i, columns));
			}
		}

	}

	/**
	 * main method that runs the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new Main();
	}

}
