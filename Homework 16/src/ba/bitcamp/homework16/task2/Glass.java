package ba.bitcamp.homework16.task2;

public class Glass {
	
	private String drink;
	private int capacity;
	private int maxCapacity;
	
	public Glass (int max) {
		this.drink = null;
		this.capacity = 0;
		this.maxCapacity = max;
	}

	/**
	 * If any positive amount of liquid is added it is added double.
	 * 
	 * @param drink - <code>String</code> type value for drink 
	 * @param amount - <code>int</code> type value for amount of drink
	 */
	public void addLiquid(String name, int amount) {
		if (amount > 0) {
			this.capacity = amount * 2;
			this.drink = name;
		} else {
			this.drink = name;
			this.capacity = amount;
		}
	}
	
	/**
	 * Returns name of drink
	 * 
	 * @return <code>String</code> type name of drink
	 */
	public String getTypeOfLiquid(){
		return drink;
	}
	
	/**
	 * Return capacity of glass
	 * 
	 * @return <code>int</code> type glass capacity
	 */
	public int getMaxCapacity() {
		return this.maxCapacity;
	}
	
	/**
	 * Check current capacity
	 * 
	 * @return <code>int</code> type value
	 */
	public int getCurrentCapacity() {
		if (capacity > maxCapacity) {
			System.out.println("You overfilled  glass and spilled " + (maxCapacity - capacity));
			return 0;
		} else {
			return capacity;
		}
		
	}
	
	/**
	 * Empties filled glass.
	 * 
	 * @return <code>int</code> type value
	 */
	public int emptyGlass() {
		return this.capacity = 0;
	}
	

}