package ba.bitcamp.homework24.task1.SQLUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Utility class used to setup connection to DB.
 * 
 * @author boris
 *
 */
public class ConnectToDatabase {

	/**
	 * Establishes connection to complaintbook.db and returns connection. If
	 * connection can't be established exception will be printed to standard
	 * output.
	 * 
	 * @return <code>Connection</code> type value that is connected to db
	 *         location
	 */
	public static Connection getConnection() {

		Connection conn = null;

		try {
			Class.forName(SQLStringConstants.SQL_DRIVER);
			conn = DriverManager
					.getConnection(SQLStringConstants.SQL_DB_LOCATION);

		} catch (ClassNotFoundException e) {
			System.out.println("Could not load JDBC driver");
			System.err.println("Error message: " + e.getMessage());
			e.printStackTrace();
			System.exit(1);
		} catch (SQLException e) {
			System.out
					.println("Connection to 'ComplaintBook' database could not be established.");
			System.err.println("Error message: " + e.getMessage());
			System.exit(1);
		}
		return conn;
	}

}