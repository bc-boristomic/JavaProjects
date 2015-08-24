package ba.bitcamp.homework24.task1;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import ba.bitcamp.homework24.task1.ComplaintPrototype.Complaint;
import ba.bitcamp.homework24.task1.SQLUtils.ConnectToDatabase;
import ba.bitcamp.homework24.task1.SQLUtils.SQLStringConstants;

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

	/**
	 * Default constructor of SendComplaint class
	 */
	public SendComplaint() {
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

				Connection conn = ConnectToDatabase.getConnection();
				PreparedStatement preparedStatement = null;

				try {
					preparedStatement = conn.prepareStatement(SQLStringConstants.ADD_TO_DB);
					preparedStatement.setNull(1, Types.NULL);
					preparedStatement.setString(2, temp.getComplaint());
					preparedStatement.setString(3, temp.getDate());
					preparedStatement.executeUpdate();
					complaint.setText("");
					System.out.println("Complaint logged at database.");
				} catch (SQLException ex) {
					System.out
							.println("Could not add new complaint to database.");
					System.err.println("Error message: " + ex.getMessage());
					System.err.println("SQL error: " + ex.getErrorCode());
				} finally {
					if (preparedStatement != null) {
						try {
							preparedStatement.close();
						} catch (SQLException ex) {
							System.out
									.println("Could not close PreparedStatement");
							System.err.println("Error message: "
									+ ex.getMessage());
							System.err.println("SQL error: "
									+ ex.getErrorCode());
						}
					}
					if (conn != null) {
						try {
							conn.close();
						} catch (SQLException ex) {
							System.out
									.println("Could not close connection to database "
											+ SQLStringConstants.SQL_DB_LOCATION);
							System.err.println("Error message: "
									+ ex.getMessage());
							System.err.println("SQL error: "
									+ ex.getErrorCode());
						}
					}
				}

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