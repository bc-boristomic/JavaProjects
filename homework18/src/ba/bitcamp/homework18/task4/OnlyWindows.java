package ba.bitcamp.homework18.task4;

import javax.swing.JOptionPane;

/**
 * Asks for numbers and calculates sum.
 * If you don't enter any it says wrong input and exits.
 * If you click cancel in next window it shows sum and exits.
 * If you click no it simply exits.
 * 
 * @author boris
 *
 */
public class OnlyWindows {

	public static void main(String[] args) {

		String number;
		int choice, sum = 0;

		do {
			
			number = JOptionPane.showInputDialog("Enter number");
			try {
				if (!(number.equals(null))) {
					sum += Integer.parseInt(number);
				}
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Wrong input!");
				System.exit(0);
			} 
			choice = JOptionPane.showConfirmDialog(null, "Do you want to enter another number?");
			if (choice == JOptionPane.CANCEL_OPTION) {
				JOptionPane.showMessageDialog(null, "Sum of number so far is " + sum);
			} else if (choice == JOptionPane.NO_OPTION) {
				System.exit(0);
			}
		} while (choice != JOptionPane.CANCEL_OPTION);
	}
}
