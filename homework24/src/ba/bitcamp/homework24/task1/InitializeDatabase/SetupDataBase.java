package ba.bitcamp.homework24.task1.InitializeDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DO NOT RUN IF YOU ALREADY HAVE INITIALIZED DB.
 * 
 * SetupDataBase class used to initialize database with table Complaint. If
 * table Complaint already exist it will be dropped.
 * <P>
 * After establishing connection to DB, table is dropped if exists and new one
 * is created with values of id primary key, string for message with max length
 * of 255 characters, and string for date with max length of 25 characters.
 * <p>
 * If there are not errors in the way message
 * "Database 'ComplaintBook' with table Complaint initialized." will be printet
 * to standard output.
 *
 *
 * 
 * @author boris
 *
 */
public class SetupDataBase {

	public static void main(String[] args) {

		Connection conn = null;

		try {

			Class.forName("org.sqlite.JDBC");

		} catch (ClassNotFoundException e) {
			System.out.println("Could not load JDBC driver");
			System.err.println("Error message: " + e.getMessage());
			System.exit(1);
		}

		try {

			conn = DriverManager.getConnection("jdbc:sqlite:databases/complaintbook.db");
			Statement statement = conn.createStatement();

			StringBuilder sb = new StringBuilder();
			sb.append("DROP TABLE IF EXISTS complaint;");
			sb.append("CREATE TABLE complaint ");
			sb.append("(id INTEGER PRIMARY KEY, ");
			sb.append("complaint VARCHAR(255) NOT NULL, ");
			sb.append("date VARCHAR(25) NOT NULL);");

			statement.executeUpdate(sb.toString());

		} catch (SQLException e) {
			System.out
					.println("Connection to 'ComplaintBook' database could not be established.");
			System.err.println("Error message: " + e.getMessage());
			System.exit(1);
		}

		System.out
				.println("Database 'ComplaintBook' with table Complaint initialized.");

	}

}
