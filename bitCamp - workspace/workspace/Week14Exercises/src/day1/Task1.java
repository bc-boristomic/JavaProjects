package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Task1 {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			Class.forName("org.sqlite.JDBC");
			System.out.println("Library loaded");
			
			conn = DriverManager.getConnection("jdbc:sqlite:base.db");
			System.out.println("Connected to DB");
					
			Person njegos = new Person(null, "Njegos S.", "B");
			Person dzenan = new Person(null, "Dzenan M.", "A");
			Person sani = new Person(null, "Sani C.", "B");
			Person timur = new Person(null, "Timur O.", "C");

			Statement statement = conn.createStatement();
			String s1 = "INSERT INTO people VALUES(" + njegos.getId() + ", '" + njegos.getName() + "', '" + njegos.getGrade() + "')";
			String s2 = "INSERT INTO people VALUES(" + dzenan.getId() + ", '" + dzenan.getName() + "', '" + dzenan.getGrade() + "')";
			String s3 = "INSERT INTO people VALUES(" + sani.getId() + ", '" + sani.getName() + "', '" + sani.getGrade() + "')";
			String s4 = "INSERT INTO people VALUES(" + timur.getId() + ", '" + timur.getName() + "', '" + timur.getGrade() + "')";
			
			statement.executeUpdate(s1);
			statement.executeUpdate(s2);
			statement.executeUpdate(s3);
			statement.executeUpdate(s4);
			
			ArrayList<Person> list = new ArrayList<>();
			
			Statement stat = conn.createStatement();
			ResultSet result = stat.executeQuery("select * from people");
		
			while (result.next()) {				
				Integer id = result.getInt(1);
				String name = result.getString(2);
				String grade = result.getString(3);
				
				Person temp = new Person(id, name, grade);
				list.add(temp);
			}
			
			System.out.println(list);
			
		} catch (ClassNotFoundException e) {
			System.err.println("Msg: " + e.getMessage());
			e.printStackTrace();
			System.exit(1);
		} catch (SQLException e) {
			System.err.println("Msg: " + e.getMessage());
			e.printStackTrace();
			System.exit(1);
		}
		
		
		
		
		
		
		
	}

}
