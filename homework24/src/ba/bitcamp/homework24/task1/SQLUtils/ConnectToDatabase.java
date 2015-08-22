package ba.bitcamp.homework24.task1.SQLUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Utility class used to setup connection to DB.
 * 
 * @author boris
 *
 */
public class ConnectToDatabase {

	/**
	 * Upon connecting to complaintbook.db database returns Statement with
	 * established connection ready for IO.
	 * 
	 * @param conn
	 *            <code>Connection</code> type value of connection to database
	 * @param statement
	 *            <code>Statement</code> type value of statement ready for IO at
	 *            connected database
	 * @return <code>Statement</code> ready to use for query
	 */
	public static Statement connect(Connection conn, Statement statement) {

		try {

			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:complaintbook.db");
			statement = conn.createStatement();

		} catch (ClassNotFoundException e) {
			System.out.println("Could not load JDBC driver");
			System.err.println("Error message: " + e.getMessage());
			System.exit(1);
		} catch (SQLException e) {
			System.out
					.println("Connection to 'ComplaintBook' database could not be established.");
			System.err.println("Error message: " + e.getMessage());
			System.exit(1);
		}

		System.out.println("Connection to database established");
		return statement;
	}

}
