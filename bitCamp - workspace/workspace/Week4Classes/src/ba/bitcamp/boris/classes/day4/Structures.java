package ba.bitcamp.boris.classes.day4;

public class Structures {

	public static void main(String[] args) {

		
		/* 
		 * Strings as data structures
		 */
		String[] p1 = { "John", "Doe", "1947", "Address 1", "123ABC", "213",
				"0", "Baker", "Beans", "Boza", "johndoe@pekara.ba",
				"+387 61 999 999" };
		
		String[] p2 = { "Tarik", "Celik", "1986", "Jadranska 9", "A16F00A",
				"187", "1", "Software Developer", "Pasta", "7UP",
				"tarik.celik@bitcamp.ba", "+387 61 829 621" };

		//Test.getOlderPerson(p1, p2);
		
		
		
		/*
		 * Classes as data structures
		 */
		Person per1 = new Person("Tarik", "Celik", 1986, "Jadranska 9", "A16F00A", "tarik.celik@bitcamp.ba", 187, true, "pasta", "7UP");
		Person per2 = new Person("John", "Doe", 1947, "Address 1", "123ABC", "johndoe@pekar.ba", 213, false, "Beans", "Boza");
		
		//Test.getOlderPersonObject(per1, per2);
		
		Test.bitPrint(per1, per2, Test.getAgeDifference(per1, per2));
		
	}

}
