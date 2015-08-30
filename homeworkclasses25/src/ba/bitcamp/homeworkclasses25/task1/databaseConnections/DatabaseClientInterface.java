package ba.bitcamp.homeworkclasses25.task1.databaseConnections;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Used to implement methods that connect and disconnect from database.
 * 
 * @author boris
 *
 */
public interface DatabaseClientInterface {

	void connect() throws ClassNotFoundException, SQLException;

	void disconnect(Connection conn) throws SQLException;

}
