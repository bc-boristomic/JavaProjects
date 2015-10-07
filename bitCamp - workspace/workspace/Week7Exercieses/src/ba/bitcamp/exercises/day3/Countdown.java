package ba.bitcamp.exercises.day3;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Countdown extends JFrame {
	private static final long serialVersionUID = -5257662596598995984L;

	private JLabel time = new JLabel("0");
	private JTextField seconds = new JTextField(10);
	private JButton start = new JButton("Start");
	private JPanel panel = new JPanel(new BorderLayout());
	private int sec;
	private Timer timer;

	public Countdown() {

		add(panel);
		time.setHorizontalAlignment(NORMAL);
		time.setFont(new Font("Serif", Font.PLAIN, 18));
		panel.add(time, BorderLayout.NORTH);
		panel.add(seconds, BorderLayout.CENTER);
		panel.add(start, BorderLayout.SOUTH);

		start.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sec = Integer.parseInt(seconds.getText());
				timer.start();
			}
		});

		timer = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				time.setText("" + sec--);
				if (Integer.parseInt(time.getText()) == 0) {
					timer.stop();
				}
			}
		});

		setTitle("Countdown");
		setSize(350, 95);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Countdown();

	}

}
