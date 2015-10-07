package day1;
import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;


public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("Ime", "Faks", "sem 1");
		System.out.println(s1);
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File("student.out"), s1);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
