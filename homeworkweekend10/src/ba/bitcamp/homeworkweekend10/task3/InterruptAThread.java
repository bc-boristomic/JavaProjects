package ba.bitcamp.homeworkweekend10.task3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Class InterruptAThread extends JFrame and have label that shows character
 * from alphabet A-Z every second. If stop button is pressed, alphabet count is
 * stoped.
 * 
 * @author boris
 *
 */
public class InterruptAThread extends JFrame {
	private static final long serialVersionUID = 5136176709035233532L;

	private static final int STOP_WRITING = 91;

	private JLabel label = new JLabel();
	private JButton button = new JButton("stop");
	private Thread t1 = new Thread(new MyThread());

	/**
	 * Default constructor of InterruptAThread class, shows GUI parts and starts
	 * a thread at the end,
	 */
	public InterruptAThread() {
		setLayout(new BorderLayout());
		add(label, BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);
		label.setHorizontalAlignment(NORMAL);
		button.addActionListener(new ButtonAction());

		setTitle("Stop alphabet printing");
		setSize(350, 100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		t1.start();
	}

	/**
	 * Private inner class MyThread implements Runnable interface. In it's run
	 * method label receives letter from alphabet every second. If thread is
	 * interrupted label stops receiving letters but program continues to run.
	 * 
	 * @author boris
	 *
	 */
	private class MyThread implements Runnable {

		@Override
		public void run() {
			for (int i = 65; i <= 90; i++) {
				label.setText(label.getText() + (char) i + " ");
				try {
					t1.sleep(1000);
				} catch (InterruptedException e) {
					i = STOP_WRITING;
				}
			}
		}
	}

	/**
	 * Private inner class ButtonAction handles action when button pressed. If
	 * button is pressed thread that writes letters on label is killed.
	 * 
	 * @author boris
	 *
	 */
	private class ButtonAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				t1.interrupt();
			}
		}

	}

	/**
	 * main method that runs the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new InterruptAThread();
	}
}
