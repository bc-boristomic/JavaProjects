package ba.bitcamp.boris.exerises.day4.task2;

/**
 * Inherits PortableComputer class, have three additional variables. Can access
 * superclass thru get and set methods.
 * 
 * @author boris.tomic
 *
 */
public class PocketPC extends PortableComputer {


	private Boolean hasTouch;
	private Boolean hasSIM;
	private Boolean hasMicroSD;

	public PocketPC(String osType, Integer memory, Double price, Double weight,
			Integer displaySize, Boolean hasWiFi, Boolean hasTouch, Boolean hasSIM, Boolean hasMicroSD) {
		super(osType, memory, price, weight, displaySize, hasWiFi);
		this.hasTouch = hasTouch;
		this.hasSIM = hasSIM;
		this.hasMicroSD = hasMicroSD;
		
	}
	
	
	public Boolean getHasTouch() {
		return hasTouch;
	}

	public void setHasTouch(Boolean hasTouch) {
		this.hasTouch = hasTouch;
	}

	public Boolean getHasSIM() {
		return hasSIM;
	}

	public void setHasSIM(Boolean hasSIM) {
		this.hasSIM = hasSIM;
	}

	public Boolean getHasMicroSD() {
		return hasMicroSD;
	}

	public void setHasMicroSD(Boolean hasMicroSD) {
		this.hasMicroSD = hasMicroSD;
	}

	public void printTypeInfo() {
		super.printInfo();
		System.out.println("Is it touchpad: " + getHasTouch());
		System.out.println("Does it support SIM: " + getHasSIM());
		System.out.println("Does it support MicroSD: " + getHasSIM());

	}

}
