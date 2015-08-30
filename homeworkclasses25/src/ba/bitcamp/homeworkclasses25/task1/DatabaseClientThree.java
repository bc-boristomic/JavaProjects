package ba.bitcamp.homeworkclasses25.task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import ba.bitcamp.homeworkclasses25.task1.databaseConnections.DatabaseClientInterface;

/**
 * Example with bad (no) exception handling.
 * 
 * @author boris
 *
 */
public class DatabaseClientThree implements DatabaseClientInterface {

	@SuppressWarnings("unused")
	@Override
	public void connect() throws ClassNotFoundException, SQLException {
		Class.forName("org.sqlite.JDBC");
		Connection conn = DriverManager
				.getConnection("jdbc:sqlite:database/demo.db");
	}

	@Override
	public void disconnect(Connection conn) throws SQLException {
		conn.close();
	}

}
