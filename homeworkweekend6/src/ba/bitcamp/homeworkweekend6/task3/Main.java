package ba.bitcamp.homeworkweekend6.task3;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Main class draws a windows with 10 buttons. You can select five numbers, one
 * from each column. Selected number will be saved in array and showed in
 * JOptionPane window.
 * 
 * @author boris
 *
 */
public class Main extends JFrame {
	private static final long serialVersionUID = -7362210980322424751L;

	private JButton[] buttons = new JButton[10];
	private String[] numbers = new String[5];
	private int index = 0;
	private int counter = 0;

	/**
	 * Constructor of Main class
	 */
	public Main() {

		setLayout(new GridLayout(2, 5, 5, 5));

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(i + "");
			buttons[i].setFont(new Font("Calibri", Font.TRUETYPE_FONT, 18));
			buttons[i].setPreferredSize(new Dimension(90, 65));
			add(buttons[i]);
			buttons[i].addActionListener(new Action());
		}

		setTitle("Pick five numbers");
		pack();
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	/**
	 * Inner class Action implements ActionListener, watches and reacts to press
	 * of each button.
	 * 
	 * @author boris
	 *
	 */
	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (counter < 5) {
				for (int i = 0; i < buttons.length; i++) {
					if (e.getSource() == buttons[i]) {
						numbers[index] = buttons[i].getText();
						index++;
						buttons[i].setEnabled(false);
						if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
							buttons[i + 5].setEnabled(false);
						} else if (i == 5 || i == 6 || i == 7 || i == 8
								|| i == 9) {
							buttons[i - 5].setEnabled(false);
						}
					}
				}
			}
			counter++;
			if (counter == 5) {
				JOptionPane.showMessageDialog(null, "You picked these numbers "
						+ Arrays.toString(numbers));
				counter = 0;
				index = 0;
				for (int i = 0; i < buttons.length; i++) {
					buttons[i].setEnabled(true);
				}
			}

		}
	}

	public static void main(String[] args) {

		new Main();

	}

}
