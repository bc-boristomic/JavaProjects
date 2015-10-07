package ba.bitcamp.boris.classes.day3;

public class HourlyEmployee extends Employee {
	
	private int hourlyRate;
	
	public HourlyEmployee (String name, String gender, int hourlyRate) {
		super(name, gender);
		this.hourlyRate = hourlyRate;
	}
	
	public String toString() {
		return name + " " + gender + " " + Integer.toString(hourlyRate);
	}

}
