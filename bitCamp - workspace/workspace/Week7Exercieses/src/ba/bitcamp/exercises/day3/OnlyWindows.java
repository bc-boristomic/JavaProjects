package ba.bitcamp.exercises.day3;

import javax.swing.JOptionPane;

public class OnlyWindows {

	public static void main(String[] args) {

		int choice, sum = 0;

		try {
			do {
				int number = Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
				choice = JOptionPane.showConfirmDialog(null, "Do you want to enter another number?");
				sum += number;
				if (choice == JOptionPane.CANCEL_OPTION) {
					JOptionPane.showMessageDialog(null, "Sum of number so far is " + sum);
				} else if (choice == JOptionPane.NO_OPTION) {
					System.exit(0);
				}
			} while (choice != JOptionPane.CANCEL_OPTION);
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Wrong input!");
		} 
	}

}
