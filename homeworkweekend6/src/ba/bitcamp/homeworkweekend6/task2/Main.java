package ba.bitcamp.homeworkweekend6.task2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Main class creates window with two buttons and two text areas where a random
 * first or last name from one of Seinfeld main characters is displayed. 
 * Depends on which button you click.
 * 
 * @author boris
 *
 */
public class Main extends JFrame {
	private static final long serialVersionUID = 4358254763372349089L;

	private JButton firstName = new JButton("First Name");
	private JButton lastName = new JButton("Last Name");
	private JLabel fName = new JLabel();
	private JLabel lName = new JLabel();

	/**
	 * Constructor of main class.
	 */
	public Main() {

		setLayout(new GridLayout(1, 0));
		add(firstName);
		add(fName);
		fName.setHorizontalAlignment(NORMAL);
		add(lName);
		lName.setHorizontalAlignment(NORMAL);
		add(lastName);
		firstName.addActionListener(new Action());
		lastName.addActionListener(new Action());

		setTitle("Random name generator");
		setSize(450, 280);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == firstName) {
				fName.setText(Main.FirstName.generateName());
			}
			if (e.getSource() == lastName) {
				lName.setText(Main.LastName.generateName());
			}
		}

	}

	/**
	 * Static inner class used to generate first name.
	 * 
	 * @author boris
	 *
	 */
	static class FirstName {

		private static String[] firstName = { "George", "Cosmo", "Elaine", "Jerry" };

		/**
		 * Generates random name.
		 * 
		 * @param names
		 *            names <code>String</code> type array
		 * @return randomly picked <code>String</code>
		 */
		static String generateName() {
			int random = (int) (Math.random() * 4);
			return firstName[random];
		}

		public String toString() {
			return "FirstName [firstName=" + Arrays.toString(firstName) + "]";
		}
	}

	/**
	 * Static inner class used to generate last name.
	 * 
	 * @author boris
	 *
	 */
	static class LastName {

		private static String[] lastName = { "Costanza", "Kramer", "Benes", "Seinfeld" };

		/**
		 * Generates random name.
		 * 
		 * @param names
		 *            <code>String</code> type array
		 * @return randomly picked <code>String</code>
		 */
		static String generateName() {
			int random = (int) (Math.random() * 4);
			return lastName[random];
		}

		public String toString() {
			return "LastName [lastName=" + Arrays.toString(lastName) + "]";
		}
	}

	public static void main(String[] args) {

		new Main();

	}

}
