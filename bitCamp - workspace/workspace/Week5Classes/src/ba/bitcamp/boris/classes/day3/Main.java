package ba.bitcamp.boris.classes.day3;

public class Main {
	
	public static void main(String[] args) {
		
//		Card c1 = new Card();
//		Card c2 = new Card(4, 1);
//		Card c3 = new Card(3, 2);
//		Card c4 = new Card(4, 4);
//	
//		
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c3);
//		System.out.println(c4);
		
		Employee e = new Employee("Ime", "rod");
		System.out.println(e);
		
		SalaryEmployee e1 = new SalaryEmployee("Ime2", "rod2", 300);
		System.out.println(e1);
		
		HourlyEmployee e2 = new HourlyEmployee("Ime3", "rod3", 20);
		System.out.println(e2);
		
		
	}

}
