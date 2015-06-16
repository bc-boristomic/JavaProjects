package ba.bitcamp.homework15.task2;

public class Animal {
	
	private String name;
	private int isActiveByDay;
	private int waterConsumption;
	
	private static int habitatIsDay = 1;
	private static int habitatAmountOfWater = 1; 
	
	public Animal(String name, int isActiveByDay, int waterConsumption) {
		this.name = name;
		this.isActiveByDay = isActiveByDay;
		this.waterConsumption = waterConsumption;
	}
	
	
	/**
	 * Prints condition of animals depending on status of habitat.
	 */
	public void printStatus() {
		if (habitatIsDay == isActiveByDay && habitatAmountOfWater == waterConsumption) {
			System.out.println("It’s fine. The animal is active and has water.");
		} else if (habitatIsDay == isActiveByDay && habitatAmountOfWater >= waterConsumption) {
			System.out.println("The animal is active, but does not have enough water.");
		} else if (habitatIsDay != isActiveByDay && habitatAmountOfWater >= waterConsumption) {
			System.out.println("The animal is not active, but has enough water.");
		} else if (habitatIsDay != isActiveByDay && habitatAmountOfWater != waterConsumption) {
			System.out.println("The animal is not active and it does not have enough water.");
		}
	}
	
	
	/**
	 * Changes from day to night and vice versa.
	 */
	public static void cycleDayNight() {
		if (habitatIsDay == 1) {
			habitatIsDay += 1;
		} else if (habitatIsDay == 2) {
			habitatIsDay -= 1;
		}
	}
	
	/**
	 * Sets amount of water in habitat.
	 * 
	 * @param amount - Water amount that habitat have
	 */
	public static void setAmountOfWater (int amount) {
		habitatAmountOfWater = amount;
	}
	
	

}