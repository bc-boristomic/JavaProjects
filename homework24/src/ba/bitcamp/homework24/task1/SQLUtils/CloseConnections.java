package ba.bitcamp.homework24.task1.SQLUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CloseConnections {

	public static void closeConnection(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("Could not close connection to database "
						+ SQLStringConstants.SQL_DB_LOCATION);
				System.err.println("Error message: " + e.getMessage());
				System.err.println("SQL error: " + e.getErrorCode());
			}
		}
	}

	public static void closePreparedStatement(PreparedStatement ps) {
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				System.out.println("Could not close PreparedStatement");
				System.err.println("Error message: " + e.getMessage());
				System.err.println("SQL error: " + e.getErrorCode());
			}
		}
	}

	public static void closeResultSet(ResultSet resSet) {
		if (resSet != null) {
			try {
				resSet.close();
			} catch (SQLException e) {
				System.out.println("Could not close ResulSet");
				System.err.println("Error message: " + e.getMessage());
				System.err.println("SQL error: " + e.getErrorCode());
			}
		}
	}

	public static void closeStatement(Statement statement) {
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				System.out.println("Could not close PreparedStatement");
				System.err.println("Error message: " + e.getMessage());
				System.err.println("SQL error: " + e.getErrorCode());
			}
		}
	}

}