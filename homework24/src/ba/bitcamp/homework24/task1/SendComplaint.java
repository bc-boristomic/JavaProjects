package ba.bitcamp.homework24.task1;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import ba.bitcamp.homework24.task1.ComplaintPrototype.Complaint;
import ba.bitcamp.homework24.task1.SQLUtils.ConnectToDatabase;

/**
 * Class SendComplaint extends JFrame and is used to setup GUI interface for
 * user to send it's complaint. User can write a message, when send button is
 * pressed, message of complaint is logged to database at current date.
 * 
 * @author boris
 *
 */
public class SendComplaint extends JFrame {
	private static final long serialVersionUID = 540836126033847673L;

	private JLabel instructions = new JLabel(
			"Your message should be 255 characters long");
	private JTextField complaint = new JTextField();
	private JButton send = new JButton("Send");

	private Connection conn;
	private Statement statement;

	/**
	 * Default constructor of SendComplaint class
	 */
	public SendComplaint() {
		statement = ConnectToDatabase.connect(conn, statement);
		initGUIParts();
	}

	/**
	 * Method that initializes GUI parts
	 */
	private void initGUIParts() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

		add(instructions);
		add(complaint);
		add(send);

		complaint.setPreferredSize(new Dimension(280, 210));
		send.addActionListener(new ButtonAction());

		setTitle("Send your complaint");
		setSize(350, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	/**
	 * Private class used to add action to send button. When button is pressed a
	 * new complaint is created, complaint message is taken from complaint GUI
	 * box (JTextField). String is builded to input all the data to database.
	 * Data is send to database.
	 * <p>
	 * If no errors are logged and everything goes well,
	 * "Complaint logged at database." message will be printed to standard
	 * output.
	 * 
	 * @author boris
	 *
	 */
	private class ButtonAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == send) {
				Complaint temp = new Complaint(complaint.getText());

				StringBuilder sb = new StringBuilder();

				sb.append("INSERT INTO complaint VALUES(");
				sb.append(temp.getId());
				sb.append(", '");
				sb.append(temp.getComplaint());
				sb.append("', '");
				sb.append(temp.getDate());
				sb.append("');");

				try {

					statement.executeUpdate(sb.toString());

					complaint.setText("");
				} catch (SQLException ex) {
					System.out
							.println("Could not add new complaint to database.");
					System.err.println("Error message: " + ex.getMessage());
					System.err.println("SQL error: " + ex.getErrorCode());
				}

				System.out.println("Complaint logged at database.");

			}

		}

	}

	/**
	 * main method that runs the programm
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new SendComplaint();
	}

}
