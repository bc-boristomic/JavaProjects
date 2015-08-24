package ba.bitcamp.homework24.task1.SQLUtils;

public class SQLStringConstants {

	public static final String SQL_DRIVER = "org.sqlite.JDBC";
	public static final String SQL_DB_LOCATION = "jdbc:sqlite:databases/complaintbook.db";

	public static final String ADD_TO_DB = "INSERT INTO complaint (id, complaint, date) VALUES (?, ?, ?)";
	public static final String READ_ALL_FROM_DB = "SELECT * FROM complaint";

}
