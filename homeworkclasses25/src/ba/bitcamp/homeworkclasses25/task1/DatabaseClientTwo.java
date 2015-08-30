package ba.bitcamp.homeworkclasses25.task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import ba.bitcamp.homeworkclasses25.task1.databaseConnections.DatabaseClientInterface;

/**
 * Example where there is not check for NullPointerException
 * 
 * @author boris
 *
 */
public class DatabaseClientTwo implements DatabaseClientInterface {

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

	/**
	 * Possible NullPointerException issue demonstrated
	 */
	@Override
	public void disconnect(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("Could not close connection to demo database");
			System.err.println("Error message: " + e.getMessage());
			System.err.println("SQL error: " + e.getErrorCode());
		}
	}

}
