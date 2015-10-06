package ba.bitcamp.homework24.task1.InitializeDatabase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import ba.bitcamp.homework24.task1.SQLUtils.CloseConnections;
import ba.bitcamp.homework24.task1.SQLUtils.ConnectToDatabase;
import ba.bitcamp.homework24.task1.SQLUtils.SQLStringConstants;

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
 * "Database 'ComplaintBook' with table Complaint initialized." will be printed
 * to standard output.
 *
 *
 * 
 * @author boris
 *
 */
public class SetupDataBase {

	public static void main(String[] args) {

		Connection conn = ConnectToDatabase.getConnection();
		Statement statement = null;

		try {
			statement = conn.createStatement();
			statement.executeUpdate(SQLStringConstants.CREATE_COMPLAINT_TABLE);
			System.out.println("New table created");
		} catch (SQLException e) {
			System.out.println("Could not update database with table");
			System.err.println("Error message: " + e.getMessage());
			System.err.println("SQL error: " + e.getErrorCode());
		} finally {
			CloseConnections.closeStatement(statement);
			CloseConnections.closeConnection(conn);
		}

	}

}
