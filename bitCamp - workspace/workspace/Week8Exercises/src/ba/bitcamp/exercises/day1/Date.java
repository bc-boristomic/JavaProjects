package ba.bitcamp.exercises.day1;

public class Date {
	
	private int day;
	private int month;
	private int year;

	public Date(){
		day = 1;
		month = 1;
		year = 2000;
	}
	
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
		
	@Override
	public String toString() {
		return String.format("day %d, month %d, year %d", day, month, year);
	}
	
	public static void main(String[] args) {
		
		
		Date[] d = new Date[5];
		
		for (int i = 0; i < d.length; i++) {
			d[i] = new Date(7+i, 11-i, 2000+i);
		}
		for (Date date : d) {
			System.out.println(date);
		}
		
		
		
	}

}
