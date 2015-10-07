package ba.bitcamp.boris.exercises.day5;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
	
	University u1 = new University();
	
	u1.name = "UNSA";
	u1.city = "Sarajevo";
	u1.yearOfConstruction = 1949;
	
	u1.faculties = new Faculty[3];
	u1.faculties[0] = new Faculty();
	u1.faculties[0].name = "Pravni fakultet";
	u1.faculties[0].isBologna = true;
	u1.faculties[0].departments = new String[2];
	u1.faculties[0].departments[0] = "Krivicno pravo";
	u1.faculties[0].departments[1] = "Notarski odsjek";
	
	u1.faculties[1] = new Faculty();
	u1.faculties[1].name = "Elektrotehnicki fakultet";
	u1.faculties[1].isBologna = true;
	u1.faculties[1].departments = new String[2];
	u1.faculties[1].departments[0] = "Telekomunikacije";
	u1.faculties[1].departments[1] = "Elektroenergetika";
	
	//System.out.println(u1.faculties[1].name);
	//System.out.println(u1.faculties[1].isBologna);
	//System.out.println(Arrays.toString(u1.faculties[1].departments));
	
	//System.out.println(u1.faculties[1]);
	
	
	System.out.println(u1);
	}
}
