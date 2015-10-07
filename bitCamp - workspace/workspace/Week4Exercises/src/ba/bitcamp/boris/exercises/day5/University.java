package ba.bitcamp.boris.exercises.day5;

import java.util.Arrays;

public class University {

	String name;
	String city;
	Integer yearOfConstruction;
	Faculty[] faculties;
	
	@Override
	public String toString() {
		String s = "";
		s += "Name: " + name + "\n";
		s += "City: " + city + "\n";
		s += "Year: " + yearOfConstruction + "\n";
		
		for (int i = 0; i < faculties.length; i++) {
			s += "\n" + faculties[i] + "\n";
		}
		
		
		return s;
	}
}
