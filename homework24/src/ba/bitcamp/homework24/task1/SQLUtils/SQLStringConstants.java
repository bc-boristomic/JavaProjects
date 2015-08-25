package ba.bitcamp.homework24.task1.SQLUtils;

public class SQLStringConstants {

	public static final String SQL_DRIVER = "org.sqlite.JDBC";
	public static final String SQL_DB_LOCATION = "jdbc:sqlite:databases/complaintbook.db";

	public static final String CREATE_COMPLAINT_TABLE = "DROP TABLE IF EXISTS complaint; "
			+ "CREATE TABLE complaint "
			+ "(id INTEGER PRIMARY KEY, "
			+ "complaint VARCHAR(255) NOT NULL, "
			+ "date VARCHAR(25) NOT NULL);";

	public static final String ADD_TO_DB = "INSERT INTO complaint (id, complaint, date) VALUES (?, ?, ?)";
	public static final String READ_ALL_FROM_DB = "SELECT * FROM complaint";

	public static final String COMPLAINT_ID = "id";
	public static final String COMPLAINT_COMPLAINT = "complaint";
	public static final String COMPLAINT_DATE = "date";

}
