package ba.bitcamp.boris.exercises.day3.task2;

public class Battery {
		
	private String name;
	private int battery;
	private int chargeSpeed;
	
	public Battery(String name, int chargeSpeed) {
		this.name = name;
		this.battery = 50;
		this.chargeSpeed = chargeSpeed;
	}
	
	/**
	 * Prints name of battery manufacturer and battery percentage.
	 */
	public String toString() {
		return name + " " + battery + "%";
	}
	
	/**
	 * Returns speed it takes for battery to charge every minute. 
	 * 
	 * @return <code>int</code> type value.
	 */
	public int getChargeSpeed() {
		return chargeSpeed;
	}
	
	
	/**
	 * Returns name of the manufacturer.
	 * 
	 * @return <code>String</code> type value of name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns percentage of battery.
	 * 
	 * @return <code>double</code> value of battery percentage
	 */
	public int getBattery() {
		return battery;
	}
	
	/**
	 * Charges battery depending on charge speed and inputed minutes.
	 * 
	 * @param minutes <code>int</code> type value minutes
	 * @throws UnsupportedOperationException
	 */
	public void chargeBattery(int minutes) {
		if (battery >= 0 || battery < 101) {
			battery += chargeSpeed * minutes;
		} else {
			throw new UnsupportedOperationException("Battery full");
		}
	}
	
	/**
	 * Discharges battery for given value
	 * 
	 * @param value <code>double</code> type value
	 * @throws UnsupportedOperationException
	 */
	public void discargeBattery(double value) {
		if (battery - value <= 0) {
			throw new UnsupportedOperationException("You can't discharge bellow zero.");
		}
		battery -= value;
	}
	
	
	
	
	
}
