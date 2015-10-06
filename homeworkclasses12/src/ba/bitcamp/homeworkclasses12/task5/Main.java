package ba.bitcamp.homeworkclasses12.task5;

public class Main {
	
	public static void main(String[] args) {
		
		
		Date d1 = new Date(2); // set date with only day constructor
		Date d2 = new Date(13, 10); // set date with day and month constructor
		Date d3 = new Date(28, 2, 2015); // set date with full date constructor
		
		d3.setDate(27); // set new date by changing date
		
		System.out.println(d1); // use toString method to print date information
		System.out.println(d2); // use toString method to print date information
		System.out.println(d3); // use toString method to print date information
		
		System.out.println("Pass one day");
		
		d3.dayPassed();	// pass one day
		System.out.println(d3); // use toString method to print date information
		
		System.out.println("Pass anther day");
		d3.dayPassed(); // pass another day		
		System.out.println(d3); // use toString method to print date information
		
		System.out.println("Pass two months");
		d3.monthPassed(); // pass month
		d3.monthPassed(); // pass another month
	
		System.out.println(d3);
		
	}

}
