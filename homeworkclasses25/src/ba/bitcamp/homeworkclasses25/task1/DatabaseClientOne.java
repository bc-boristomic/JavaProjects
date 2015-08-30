package ba.bitcamp.homeworkclasses25.task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import ba.bitcamp.homeworkclasses25.task1.databaseConnections.DatabaseClientInterface;

/**
 * In this example a good exception handling is shown.
 * 
 * @author boris
 *
 */
public class DatabaseClientOne implements DatabaseClientInterface {

	@SuppressWarnings("unused")
	@Override
	public void connect() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager
					.getConnection("jdbc:sqlite:database/demo.db");

		} catch (ClassNotFoundException e) {
			System.out.println("Could not load JDBC driver");
			System.err.println("Error message: " + e.getMessage());
			e.printStackTrace();
			System.exit(1);
		} catch (SQLException e) {
			System.out
					.println("Connection to demo database could not be established.");
			System.err.println("Error message: " + e.getMessage());
			System.exit(1);
		}
	}

	@Override
	public void disconnect(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out
						.println("Could not close connection to demo database");
				System.err.println("Error message: " + e.getMessage());
				System.err.println("SQL error: " + e.getErrorCode());
			}
		}
	}

}
