package ba.bitcamp.homework16.task1;

public class Temperature {
	
	private int tempC;
	
	public Temperature (int temp) {
		this.tempC = temp;
	}
	
	public String toString() {
		String s = String.format("Temperature outside is %d", tempC);
		return s;
	}
	
	/**
	 * Returns temperature in Celsius.
	 * 
	 * @return <code>int</code> type value Celsius
	 */
	public int getTemperatureInC() {
		return tempC;
	}
	
	/**
	 * Returns temperature in Kelvins.
	 * 
	 * @return <code>double</code> type value Kelvins
	 */
	public double getTemperatureInK() {
		return tempC + 274.15;
	}
	
	/**
	 * Returns temperature in Fahrenheit.
	 * 
	 * @return <code>double</code> type value Fahrenheit
	 */
	public double getTemperatureInF() {
		return tempC * 1.8 + 32;
	}
	
	/**
	 * Changes Celsius temperature. 
	 * 
	 * @param temp <code>int</code> type Celsius
	 */
	public void setTemperature(int temp) {
		this.tempC = temp;
	}
	
}