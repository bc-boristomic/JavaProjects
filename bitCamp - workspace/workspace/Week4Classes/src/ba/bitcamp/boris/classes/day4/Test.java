package ba.bitcamp.boris.classes.day4;

public class Test {
	
	public static void getOlderPerson(String[] p1, String[] p2) {
		
		if (Integer.parseInt(p1[2]) > Integer.parseInt(p2[2])) {
			printer(p2);
		} else {
			printer(p1);
		}
	}
	
	
	
	public static void printer(String[] printable) {
		System.out.println("Older person is ");
		System.out.println("Name:\t\t " + printable[0]);
		System.out.println("Surname:\t " + printable[1]);
		System.out.println("Year of birth:\t " + printable[2]);
		System.out.println("Address:\t " + printable[3]);
		System.out.println("ID number:\t " + printable[4]);
		System.out.println("Email:\t\t " + printable[10]);
	}

	
	
	public static void getOlderPersonObject (Person p1, Person p2) {
		Integer ageDiff;
		if (p1.yearOfBirth > p2.yearOfBirth) {
			ageDiff = p1.yearOfBirth - p2.yearOfBirth;
			printerObject(p2, ageDiff);
		} else {
			ageDiff = p2.yearOfBirth - p1.yearOfBirth;
			printerObject(p1, ageDiff);
		}
	}
	
	
	
	public static void printerObject (Person printable, Integer ageDifference) {
		System.out.println("Older person is ");
		System.out.println("Name:\t\t " + printable.firstName);
		System.out.println("Surname:\t " + printable.lastName);
		System.out.println("Year of birth:\t " + printable.yearOfBirth);
		System.out.println("Address:\t " + printable.address);
		System.out.println("ID number:\t " + printable.personalID);
		System.out.println("Email:\t\t " + printable.email);
		System.out.println("Age difference is: " + ageDifference);
	}
	
	
	public static Integer getAgeDifference (Person p1, Person p2) {
		Integer ageDiff;
		if (p1.yearOfBirth > p2.yearOfBirth) {
			ageDiff = p1.yearOfBirth - p2.yearOfBirth;
		} else {
			ageDiff = p2.yearOfBirth - p1.yearOfBirth;
		}
		return ageDiff;
	}
	
	
	public static void bitPrint (Person p1, Person p2, Integer ageDifference) {
		System.out.printf("%s %s, born %d, lives at %s. %s is older then %s by %d, he is born %d and lives at %s.", p1.firstName, p1.lastName, p1.yearOfBirth, p1.address, p2.firstName, p1.firstName, ageDifference, p2.yearOfBirth, p2.address );
		
	}
	
}
