package day1;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class ReadJSON {
	
	public static void main(String[] args) {
		ObjectMapper maper = new ObjectMapper();
		
		Student s = null;
		try {
			s = maper.readValue(new File("student.out"), Student.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(s);
	}
	

}
