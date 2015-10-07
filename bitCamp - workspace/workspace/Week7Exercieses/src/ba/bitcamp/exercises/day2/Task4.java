package ba.bitcamp.exercises.day2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Task4 extends JFrame {
	private static final long serialVersionUID = -3675650074079639989L;
	
	private JLabel text = new JLabel("Get ready!");
	private Timer timer;
	private long start;
	private long stop;
	
	public Task4(){

		add(text);
		text.setHorizontalAlignment(NORMAL);
		
		timer = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setForeground(Color.RED);
				text.setFont(new Font("Serif", Font.BOLD, 20));
				text.setText("Press any key");
				start = System.currentTimeMillis();
				
			}
		});
		timer.start();
		
		addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				if (timer.isRunning() == true){
					text.setText("You pressed too early!");
				}
				timer.stop();
				if (e.isActionKey() == false && timer.isRunning() == false) {
					stop = System.currentTimeMillis() - start;
					text.setText("Took you " + stop + " ms");
				}
			}
		});
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				stop = System.currentTimeMillis() - start;
				text.setText("Took you " + stop + " ms");
				if (true){
					text.setText("You pressed too early!");
				}
				timer.stop();
			}
		});
		
		setTitle("Reaction Game");
		setSize(350, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		new Task4();
		
	}

}
