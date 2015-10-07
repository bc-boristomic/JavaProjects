package day2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task3 extends JFrame {
	private static final long serialVersionUID = -6937257090318865511L;

	private static JButton start = new JButton("start");
	private static Integer counter = 0;
	private static ArrayList<MyThreads> threads = new ArrayList<MyThreads>();
	private static JLabel label = new JLabel();

	
	public Task3() {
		setLayout(new BorderLayout());
		add(start, BorderLayout.NORTH);
		start.addActionListener(new Action());
		add(label, BorderLayout.CENTER);
		setTitle("add and stop Thread");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == start) {
				MyThreads t = new MyThreads();
				t.start();
				threads.add(t);
				start.setEnabled(false);

			}

		}

	}
	
	private static boolean isPrime(int number) {
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static class MyThreads extends Thread {

		@Override
		public void run() {
			int startNum = 10;
			int finish = 10000000;
			for (int i = startNum; i < finish; i++) {
				if (isPrime(i)) {
					synchronized(counter){
						counter++;
					}
				
				}
			}
			label.setText(counter + "");
			System.out.println(counter);
			counter = 0;
			if (counter == 0) {
				start.setEnabled(true);
				
			}

		}

	}
	
	public static void main(String[] args) {
		new Task3();
	}

}
