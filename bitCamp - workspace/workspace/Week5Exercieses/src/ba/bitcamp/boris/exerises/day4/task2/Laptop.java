package ba.bitcamp.boris.exerises.day4.task2;

/**
 * Inherits PortableComputer class, have three additional variables. Can access
 * superclass thru get and set methods.
 * 
 * @author boris.tomic
 *
 */
public class Laptop extends PortableComputer {

	private Integer numberOfCells;
	private Boolean hasBluetooth;
	private Boolean hasNumKeys;

	
	
	public Laptop(String osType, Integer memory, Double price, Double weight,
			Integer displaySize, Boolean hasWiFi, Integer numberOfCells, Boolean hasBluetooth, Boolean hasNumKeys) {
		super(osType, memory, price, weight, displaySize, hasWiFi);
		this.numberOfCells = numberOfCells;
		this.hasBluetooth = hasBluetooth;
		this.hasNumKeys = hasNumKeys;
	}

	public Integer getNumberOfCells() {
		return numberOfCells;
	}

	public void setNumberOfCells(Integer numberOfCells) {
		this.numberOfCells = numberOfCells;
	}

	public Boolean getHasBluetooth() {
		return hasBluetooth;
	}

	public void setHasBluetooth(Boolean hasBluetooth) {
		this.hasBluetooth = hasBluetooth;
	}

	public Boolean getHasNumKeys() {
		return hasNumKeys;
	}

	public void setHasNumKeys(Boolean hasNumKeys) {
		this.hasNumKeys = hasNumKeys;
	}

	public void printTypeInfo() {
		super.printInfo();
		System.out.println("How much batterys is there: " + getNumberOfCells());
		System.out.println("Does it have bluetooth: " + getHasBluetooth());
		System.out.println("Does it have NumKey: " + getHasNumKeys());

	}

}
