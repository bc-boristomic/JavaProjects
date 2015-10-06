package ba.bitcamp.homework24.task2.InitializeDatabase;

import java.sql.SQLException;
import java.sql.Statement;

import ba.bitcamp.homework24.task2.SQLUtils.ConnectToDatabase;

/**
 * DO NOT RUN IF YOU ALREADY HAVE INITIALIZED DB.
 * 
 * 
 * <p>
 * If there are not errors in the way message
 * "Database 'Articles' with table Article initialized." will be printed to
 * standard output.
 *
 *
 * 
 * @author boris
 *
 */
public class InitializeDatabase {

	public static void main(String[] args) {

		Statement statement = ConnectToDatabase.connect();

		StringBuilder sb = new StringBuilder();
		sb.append("DROP TABLE IF EXISTS article;");
		sb.append("CREATE TABLE article ");
		sb.append("(code BIGINT PRIMARY KEY NOT NULL, ");
		sb.append("name VARCHAR(255) NOT NULL, ");
		sb.append("price VARCHAR(10) NOT NULL, ");
		sb.append("constraint pk_article_code UNIQUE (code));");

		try {
			statement.executeUpdate(sb.toString());
		} catch (SQLException e) {
			System.out
					.println("Connection to 'Articles' database could not be established.");
			System.err.println("Unable to create table" + e.getErrorCode());
			System.err.println("Error message: " + e.getMessage());
			System.exit(1);
		}

		System.out
				.println("Database 'Articles' with table Article initialized.");

	}

}
