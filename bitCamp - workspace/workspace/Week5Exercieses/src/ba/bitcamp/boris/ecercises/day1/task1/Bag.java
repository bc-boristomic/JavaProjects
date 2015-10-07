package ba.bitcamp.boris.ecercises.day1.task1;

public class Bag {
	
	
	int maxCapacity;
	int tempCapacity;
	
	public Bag (int maxCapacity) {
		this.maxCapacity = maxCapacity;
		tempCapacity = 0;
	}
	
	
	
	public String toString() {
		String s = "";
		s += maxCapacity + " ";
		
		
		return s;
	}
	
	public int getMaxCapacity() {
		return maxCapacity;
	}
	
	public int getCurrentCapacity() {
		return tempCapacity;
	}
	
	public int getFreeSpace() {
		
		return maxCapacity - tempCapacity;
	}
	
	
	public void add(int items) {
		if (tempCapacity + items <= maxCapacity){
			tempCapacity += items;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void remove(int items) {
		if (tempCapacity - items >= 0) {
			tempCapacity -= items;
		}
	}
}
