package ba.bitcamp.boris.exercises.day2.task2;

public class Glass {
	
	private String drink;
	private int amount;
	private int maxCapacity;
	
	public Glass (int max) {
		this.drink = null;
		this.amount = 0;
		this.maxCapacity = max;
	}

	/**
	 * If any positive amount of liquid is added it is added double.
	 * 
	 * @param drink - <code>String</code> type value for drink 
	 * @param amount - <code>int</code> type value for amount of drink
	 */
	public void addLiquid(String drink, int amount) {
		if (amount > 0) {
			this.amount = amount * 2;
		} else {
			this.drink = drink;
			this.amount = amount;
		}
	}
	
	/**
	 * Returns name of drink
	 * 
	 * @return <code>String</code> type name of drink
	 */
	public String getTypeOfLiquid(){
		return this.drink;
	}
	
	/**
	 * Return capacity of glass
	 * 
	 * @return <code>int</code> type glass capacity
	 */
	public int getMaxCapacity() {
		return this.maxCapacity;
	}
	
	public int getCurrentCapacity() {
		return this.maxCapacity - this.amount;
	}
	
	public int emptyGlass() {
		return this.amount = 0;
	}
	
	
	
	
}
