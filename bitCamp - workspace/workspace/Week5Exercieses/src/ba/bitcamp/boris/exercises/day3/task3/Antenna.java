package ba.bitcamp.boris.exercises.day3.task3;

public class Antenna {
	
	private String name;
	private int signal;
	private int batteryConsumptionPerHour;

	/**
	 * Constructor of Antenna Class
	 * 
	 * @param name <code>String</code> type name of Antenna
	 * @param battery <code>int</code> type battery consumption per hour
	 */
	public Antenna(String name, int battery) {
		this.name = name;
		this.batteryConsumptionPerHour = battery;
		signal = 4;
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
	 * Returns name of Antenna manufacturer.
	 * 
	 * @return <code>String</code> type value of manufacturer name
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * Return strength of signal.
	 * 
	 * @return <code>int</code> type value of signal strength
	 */
	public int getSignalStrength() {
		return signal;
	}
	
	
	/**
	 * Changes signal strength
	 * 
	 * @param set <code>int</code> type value
	 */
	public void setSignalStrength(int set) {
		if(set > 4 || set < 0) {
			throw new UnsupportedOperationException("Illegal signal strength");
		}
		signal = set;
	}
	
	/**
	 * Returns true if inputed signal is lower then signal of Antenna, 
	 * and if it's CAL or SMS or phone number from BiH.
	 * Otherwise returns false.
	 * 
	 * @param inSignal <code>int</code> type value of singnal
	 * @param value <code>String</code> type value of call message
	 * @return <code>boolean</code> type value
	 */
	public boolean getCall(int inSignal, String value) {
		if (value.substring(0, 3).equals("CAL") || value.substring(0, 3).equals("SMS") 
				&& value.substring(3, 6).equals("387") && value.length() < 15 && inSignal < signal) {
			return true;
		}
		return false;
	}
	
	/**
	 * Prints name and signal strength.
	 */
	public String toString() {
		return name + " signal strength: " + signal;
	}
	
	
}
