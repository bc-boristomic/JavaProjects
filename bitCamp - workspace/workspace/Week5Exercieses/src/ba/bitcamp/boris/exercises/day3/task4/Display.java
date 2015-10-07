package ba.bitcamp.boris.exercises.day3.task4;



public class Display {
	
	private String name;
	private int brightness;
	private boolean isON;
	private int batteryConsumptionPerHour; 
	
	/**
	 * Constructor of Display Class.
	 * 
	 * @param name <code>String</code> type name of manufacturer
	 * @param consumtion <code>int</code> type battery consumption per hour
	 */
	public Display (String name, int consumtion) {
		this.name = name;
		this.batteryConsumptionPerHour = consumtion;
		brightness = 100;
		isON = false;
	}
	
	
	/**
	 * Returns battery consumption per hour.
	 * 
	 * @return <code>int</code> type value
	 */
	public int getBatteryConsumptionPerHour() {
		return batteryConsumptionPerHour;
	}
	
	/**
	 * Turns display ON.
	 */
	public void turnON() {
		isON = true;
	}
	
	/**
	 * Turns display OFF.
	 */
	public void turnOFF() {
		isON = false;
	}
	
	/**
	 * Increases brightness by 10 points
	 * @throws UnsupportedOperationException
	 */
	public void increaseBrightness() {
		if (isON == false || brightness > 91) {
			throw new UnsupportedOperationException("Display is OFF or brightnes can't get any higher.");
		} else {
			brightness += 10;
		}
	}
	
	/**
	 * Lowers brightness by 10 points.
	 * @throws UnsupportedOperationException
	 */
	public void lowerBrightness() {
		if (isON == false || brightness < 9) {
			throw new UnsupportedOperationException("Display is OFF or brightnes can't get any lower.");
		} else {
			brightness -= 10;
		}
	}
	
	/**
	 * Prints name of Display manufacturer and brightness if display is turned on.
	 * If display is turned off, prints name and OFF.
	 */
	public String toString() {
		String s = "";
		s += name + " ";
		if (isON == true) {
			s +=  brightness + " ";
		} else {
			s += "OFF";
		}
		return s;
	}
	
	/**
	 * Checks if display is ON.
	 * 
	 * @return <code>boolean</code> type value
	 */
	public boolean isDisplayON() {
		return isON;
	}
	
}
