package paket;

public class Main2 {
	public static void main (String [] args){
		
		// Program koji za dati datum ispisuje koji je datum slijedeceg dana.
		
		
		int year = 2014;
		int month = 6;
		int day = 12;
				
		if (day > 31){
			day = 1;
			month++;
			if (month > 12){
				day = 1;
				month = 1;
				year = year++;
				System.out.println(day + month + year);
			}
			year = year;
		} else if (day > 1) {
			day = day++;
			if (month > 12)
			month = month;
			year = year;

		} else {
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
