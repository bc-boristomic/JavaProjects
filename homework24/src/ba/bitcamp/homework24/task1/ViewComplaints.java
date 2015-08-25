package ba.bitcamp.homework24.task1;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import ba.bitcamp.homework24.task1.ComplaintPrototype.Complaint;
import ba.bitcamp.homework24.task1.SQLUtils.ConnectToDatabase;
import ba.bitcamp.homework24.task1.SQLUtils.SQLStringConstants;

/**
 * ViewComplaint class extends JFrame and is used to setup GUI interface for
 * management so they can view all complaints in database easily.
 * 
 * @author boris
 *
 */
public class ViewComplaints extends JFrame {
	private static final long serialVersionUID = 2815863892603059630L;

	private JButton update = new JButton("Update list");
	private JLabel message = new JLabel("List of all complaints");
	private JLabel complaintsLabel = new JLabel();
	private JScrollPane scroll = new JScrollPane();

	private ArrayList<Complaint> allComplaints = new ArrayList<>();

	/**
	 * Default constructor of ViewComplaint class
	 */
	public ViewComplaints() {
		initGUIPart();
	}

	/**
	 * Method that initalizes GUI parts
	 */
	private void initGUIPart() {
		setLayout(new BorderLayout());

		scroll.setViewportView(complaintsLabel);

		message.setHorizontalAlignment(NORMAL);

		add(update, BorderLayout.SOUTH);
		add(message, BorderLayout.NORTH);
		add(scroll, BorderLayout.CENTER);

		update.addActionListener(new ButtonAction());

		setTitle("Complaints in DB");
		setSize(900, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	/**
	 * Method that reads all complaints logged in ArrayList of complaints, build
	 * a string and set's JLabel with all the complaints.
	 */
	private void updateComplaintsLabel() {
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		for (Complaint complaint : allComplaints) {
			sb.append(complaint);
			sb.append("<br>");
		}
		sb.append("</html>");

		complaintsLabel.setFont(new Font("Courier", Font.PLAIN, 14));
		complaintsLabel.setText(sb.toString());
	}

	/**
	 * Connects to DB, executes query that select all elements from complaint
	 * table. Builds a Complaint object, of object is not in the list of
	 * complaints it is added to the list. Closes all connections to DB.
	 */
	private void addComplaintsToArrayList() {
		Connection conn = ConnectToDatabase.getConnection();
		PreparedStatement statement = null;
		ResultSet res = null;
		try {
			statement = conn
					.prepareStatement(SQLStringConstants.READ_ALL_FROM_DB);

			res = statement.executeQuery();

			while (res.next()) {
				Long id = res.getLong(SQLStringConstants.COMPLAINT_ID);
				String complaint = res
						.getString(SQLStringConstants.COMPLAINT_COMPLAINT);
				String date = res.getString(SQLStringConstants.COMPLAINT_DATE);
				Complaint temp = new Complaint(id, complaint, date);
				if (!allComplaints.contains(temp)) {
					allComplaints.add(temp);
				}
			}
		} catch (SQLException ex) {
			System.out.println("Could not read from table");
			System.err.println("Error message: " + ex.getMessage());
			System.err.println("SQL error: " + ex.getErrorCode());
			System.err.println("SQL error: " + ex.getSQLState());
			System.exit(1);
		} finally {
			if (res != null) {
				try {
					res.close();
				} catch (SQLException ex) {
					System.out.println("Could not close ResulSet");
					System.err.println("Error message: " + ex.getMessage());
					System.err.println("SQL error: " + ex.getErrorCode());
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException ex) {
					System.out.println("Could not close PreparedStatement");
					System.err.println("Error message: " + ex.getMessage());
					System.err.println("SQL error: " + ex.getErrorCode());
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ex) {
					System.out
							.println("Could not close connection to database "
									+ SQLStringConstants.SQL_DB_LOCATION);
					System.err.println("Error message: " + ex.getMessage());
					System.err.println("SQL error: " + ex.getErrorCode());
				}
			}
		}
	}

	/**
	 * Private inner class used to add action to update button. When button is
	 * pressed query is sent to database to select all complaints from complaint
	 * table. Complaints are parsed, temp Complaint object is created and if not
	 * already added, it's added to ArrayList of complaints.
	 * <p>
	 * If no errors are enquired, labels are set with all complaints.
	 * 
	 * 
	 * @author boris
	 *
	 */
	private class ButtonAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == update) {
				addComplaintsToArrayList();
				updateComplaintsLabel();
			}

		}
	}

	/**
	 * main method that runs the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new ViewComplaints();
	}

}