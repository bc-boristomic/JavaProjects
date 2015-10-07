package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

public class CreateTeamList {

	public static void main(String[] args) {

		Connection conn = null;

		try {
			Class.forName("org.sqlite.JDBC");
			System.out.println("lyb loaded");

			conn = DriverManager.getConnection("jdbc:sqlite:standings.db");
			System.out.println("connected");

			Statement stat = conn.createStatement();
			ResultSet res = stat.executeQuery("select * from team");

			ArrayList<Team> teams = new ArrayList<>();
			while (res.next()) {
				Integer id = res.getInt(1);
				String name = res.getString(2);
				Integer wins = res.getInt(3);
				Integer losses = res.getInt(4);
				Integer points = res.getInt(5);
				Integer scoredPlus = res.getInt(6);
				Integer scoredMinus = res.getInt(7);
				String fromGroup = res.getString(8);
				Team temp = new Team(id, name, wins, losses, points,
						scoredPlus, scoredMinus, fromGroup);
				teams.add(temp);
			}
			System.out.println(teams);

			teams.sort(null);
			// or
			// Collections.sort(teams);
			
			System.out.println(teams);

			task3(conn);
			task4(conn, "A");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void task3(Connection conn) {
		try {
			Statement stat = conn.createStatement();

			ResultSet res = stat
					.executeQuery("select * from team order by fromgroup, points desc");

			ArrayList<Team> teams = new ArrayList<>();
			while (res.next()) {
				Integer id = res.getInt(1);
				String name = res.getString(2);
				Integer wins = res.getInt(3);
				Integer losses = res.getInt(4);
				Integer points = res.getInt(5);
				Integer scoredPlus = res.getInt(6);
				Integer scoredMinus = res.getInt(7);
				String fromGroup = res.getString(8);
				Team temp = new Team(id, name, wins, losses, points,
						scoredPlus, scoredMinus, fromGroup);
				teams.add(temp);
			}
			System.out.println(teams);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static void task4(Connection conn, String groupToSee) {
		try {
		Statement stat = conn.createStatement();

		ResultSet res = stat
				.executeQuery("select * from team where fromgroup = '" + groupToSee + "';");

		ArrayList<Team> teams = new ArrayList<>();
		while (res.next()) {
			Integer id = res.getInt(1);
			String name = res.getString(2);
			Integer wins = res.getInt(3);
			Integer losses = res.getInt(4);
			Integer points = res.getInt(5);
			Integer scoredPlus = res.getInt(6);
			Integer scoredMinus = res.getInt(7);
			String fromGroup = res.getString(8);
			Team temp = new Team(id, name, wins, losses, points,
					scoredPlus, scoredMinus, fromGroup);
			teams.add(temp);
		}
		System.out.println(teams);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
	

}
