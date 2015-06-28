package ba.bitcamp.homeworkweekend6.task1;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Class Main creates JFrame window with 10 buttons. When you click on three
 * buttons it creates a three digit number and shows it in JOptionPane window.
 * 
 * @author boris
 *
 */
public class Main extends JFrame {
	private static final long serialVersionUID = -1143417409534556843L;

	private JButton[] buttons = new JButton[10];
	private int counter = 0;
	private StringBuilder sb = new StringBuilder();

	/**
	 * Constructor of Main class
	 */
	public Main() {

		setLayout(new GridLayout(0, 1, 0, 5));

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(i + "");
			buttons[i].setFont(new Font("Courier New", Font.BOLD, 18));
			add(buttons[i]);
			buttons[i].addActionListener(new Action());
		}

		setSize(250, 350);
		setTitle("Three digit number generator");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (counter < 3) {
				for (int i = 0; i < buttons.length; i++) {
					if (e.getSource() == buttons[i]) {
						sb.append(buttons[i].getText());
						buttons[i].setEnabled(false);
					}
				}
			}
			counter++;
			if (counter == 3) {
				JOptionPane.showMessageDialog(null, "Three digit number is " + sb);
				counter = 0;
				sb.delete(0, 3);
				for (int i = 0; i < buttons.length; i++) {
					buttons[i].setEnabled(true);
				}
			}

		}

	}

	/**
	 * main method that runs the program
	 * 
	 * @param args
	 *            <code>String</code> type array
	 */
	public static void main(String[] args) {

		new Main();

	}

}
