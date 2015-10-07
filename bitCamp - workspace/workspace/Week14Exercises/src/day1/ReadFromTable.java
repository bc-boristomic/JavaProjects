package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ReadFromTable {
	
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("org.sqlite.JDBC");
		System.out.println("Library loaded");
		
		conn = DriverManager.getConnection("jdbc:sqlite:base.db");
		System.out.println("Connected to DB");
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
		
		ResultSet result2 = stat.executeQuery("select * from people where grade = (select max(grade) from people)");
		Person temp = null;
		while (result2.next()) {				
			Integer id = result2.getInt(1);
			String name = result2.getString(2);
			String grade = result2.getString(3);
			System.out.println(name);
			temp = new Person(id, name, grade);
		}
		
		ResultSet result3 = stat.executeQuery("select * from people where length(name) <= 5;");
		Person temp2 = null;
		while (result3.next()) {				
			Integer id = result3.getInt(1);
			String name = result3.getString(2);
			String grade = result3.getString(3);
			
			temp2 = new Person(id, name, grade);
		}
		
		
		System.out.println(list);
		System.out.println(temp);
		System.out.println(temp2);
		
		
		
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
