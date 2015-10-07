package day2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Task1 extends JFrame {
	private static final long serialVersionUID = 53176338843299089L;
	
	private JButton add = new JButton("add");
	private JButton stop = new JButton("stop");
	private ArrayList<MyThreads> threads = new ArrayList<MyThreads>();
	
	public Task1() {
		setLayout(new BorderLayout());
		add(add, BorderLayout.NORTH);
		add(stop, BorderLayout.SOUTH);
		add.addActionListener(new Action());
		stop.addActionListener(new Action());
		
		setTitle("add and stop Thread");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	private class Action implements ActionListener {

		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == add) {
				MyThreads t = new MyThreads();
				t.start();
				threads.add(t);
				
			}
			
			if (e.getSource() == stop) {
				for (MyThreads myThreads : threads) {
					myThreads.interrupt();
					System.out.println(myThreads.isAlive());
				}
			}
	
		}
		
	}
	
	
	public class MyThreads extends Thread {

		@Override
		public void run() {
			for (int i = 1; i < 101; i++) {
				System.out.print(i + " ");
				try {
					Thread.sleep(400);
									
				} catch (InterruptedException e) {
					return;
				}
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		new Task1();
	}

}
