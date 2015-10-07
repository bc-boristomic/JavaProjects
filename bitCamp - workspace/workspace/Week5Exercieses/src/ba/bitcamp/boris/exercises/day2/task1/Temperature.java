package ba.bitcamp.boris.exercises.day2.task1;

public class Temperature {
	
	private int tempC;
	
	public Temperature (int temp) {
		this.tempC = temp;
	}
	
	public String toString() {
		String s = String.format("Temperature outside is %d", tempC);
		return s;
	}
	
	public int getTemperatureInC() {
		return tempC;
	}
	
	public double getTemperatureInK() {
		return tempC + 274.15;
	}
	
	public double getTemperatureInF() {
		return tempC * 1.8 + 32;
	}
	
	public void setTemperature(int temp) {
		this.tempC = temp;
	}
	
}
