package ba.bitcamp.boris.exercises.day3.task1;

public class Speakerphone {
	
	private String name;
	private double price;
	private boolean isON;
	private int currentVolume;
	private int batteryConsumptionPerHour;
	
	/**
	 * Constructor of Speakerphone Class
	 * 
	 * @param name <code>String</code> type name of speakerphone manufacturer
	 * @param batery <code>int</code> type battery consumption per hour
	 * @param price <code>double</code> type price of speakerphone
	 */
	public Speakerphone(String name, int batery, double price) {
		this.name = name;
		this.price = price;
		this.isON = false;
		this.currentVolume = 0;
		this.batteryConsumptionPerHour = batery;
	}
	
	/**
	 * Prints name of speakerphone manufacturer, if speakerphone is 
	 * turned on return current volume, if it's turned off return just that.
	 */
	public String toString() {
		String s = "";
		s += name + " ";
		if (isON == true) {
			s += currentVolume + "";
		} else {
			s += "OFF ";
		}
		return s;
	}
	
	/**
	 * Returns battery consumption per hour.
	 * 
	 * @return <code>int</code> type battery consumption per hour
	 */
	public int getBatteryConsumptionPerHour() {
		return batteryConsumptionPerHour;
	}
	
	/**
	 * Returns name of speakerphone manufacturer.
	 * 
	 * @return <code>String</code> type name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns price of speakerphone.
	 * 
	 * @return <code>double</code> type price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Returns if speakerphone is on or off.
	 * 
	 * @return <code>boolean</code> type representation is speakerphone on or off
	 */
	public boolean getIsItON() {
		return isON;
	}
	
	/**
	 * Returns current volume of speakerphone.
	 * 
	 * @return <code>int</code> type representation of current volume.
	 */
	public int getCurrentVolume() {
		return currentVolume;
	}
	
	/**
	 * Turns speakerphone ON.
	 */
	public void enable() {
		isON = true;
	}
	
	/**
	 * Turns speakerphone OFF.
	 */
	public void disable() {
		isON = false;
	}
	
	/**
	 * Lowers volume by 10.
	 * @throws IllegalArgumentException
	 */
	public void lowerVolume() {
		if (currentVolume <= 9 || isON == false) {
			throw new IllegalArgumentException("It's either OFF or already at 0 volume.");
		}
		currentVolume -= 10;
	}
	
	/**
	 * Increase volume by 10.
	 * @throws IllegalArgumentException
	 */
	public void increaseVolume() {
		if (currentVolume >= 91 || isON == false) {
			throw new IllegalArgumentException("It's either OFF or at 100 volume.");
		}
		currentVolume += 10;
	}
	
	

}
