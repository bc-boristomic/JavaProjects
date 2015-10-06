package ba.bitcamp.homework24.task2.CustomMessages;

import javax.swing.JOptionPane;

public class Message {

	/**
	 * Public method that returns user selection if message is warning type,
	 * otherwise returns -50 number. Opens different JOptionPane depending on
	 * inputed type as well as inputed message.
	 * 
	 * @param type
	 *            <code>String</code> type value of type of message, error or
	 *            warning
	 * @param message
	 *            <code>String</code> type value of message
	 * @return <code>int</code> type value of user choice if no choice is made
	 *         -50 is returned
	 */
	public static int message(String type, String message) {
		if (type.equals("error")) {
			if (message.equals("code")) {
				selectErrorMessage("Database already contains inputed Code.");
			} else if (message.equals("nan")) {
				selectErrorMessage("Inputed Code must me a number.");
			} else if (message.equals("size")) {
				selectErrorMessage("Inputed Code number must have 10 digits.");
			}
		} else if (type.equals("warning")) {
			return getWarningOption();
		}
		return -50;
	}

	/**
	 * Private method that opens JOptionPane with custom error message.
	 * 
	 * @param message
	 *            <code>String</code> type value of message to be displayed
	 */
	private static void selectErrorMessage(String message) {
		JOptionPane.showMessageDialog(null, message, "Error!",
				JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Private method that opens JOptionPane confirmation warning message.
	 * 
	 * @return <code>int</code> type value of selected option, 0 for Ok, 2 for
	 *         Cancel
	 */
	private static int getWarningOption() {
		return JOptionPane
				.showConfirmDialog(
						null,
						"You already have article with this name. \nDo you want to proceed",
						"Warning", JOptionPane.WARNING_MESSAGE);
	}

}
