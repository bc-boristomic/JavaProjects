package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTeamTable {

	public static void main(String[] args) {

		Connection conn = null;

		try {
			Class.forName("org.sqlite.JDBC");
			System.out.println("Library loaded");

			conn = DriverManager.getConnection("jdbc:sqlite:standings.db");
			System.out.println("Connected to DB");

			Statement statement = conn.createStatement();
			statement.executeUpdate("create table team (id integer primary key, name varchar(50) not null, wins integer not null, losses integer not null, points integer not null, scoredplus integer, scoredminus integer, fromgroup varchar(1));");

			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
