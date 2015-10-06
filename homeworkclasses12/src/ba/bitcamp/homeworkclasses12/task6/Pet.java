package ba.bitcamp.homeworkclasses12.task6;

/**
 * Class Pet contains 2 constants for dog or cat so you can choose 
 * and manipulate what each species to and how interacts.
 * 
 * @author boris
 *
 */
public class Pet {
	
	protected static final int DOG = 0;
	protected static final int CAT = 1;
	
	private String name;
	private Integer years;
	private Integer species;
	
	/**
	 * Constructor of Pet class
	 * 
	 * @param name <code>String</code> type name
	 * @param years <code>Integer</code> type years
	 * @param species <code>Integer</code> type species
	 */
	public Pet (String name, Integer years, Integer species) {
		this.name = name;
		this.years = years;
		this.species = species;
	}
	
	/**
	 * Determines if Pet is dog or cat and returns appropriate message.
	 */
	public String toString() {
		if (species == DOG) {
			return "Av av";
		}
		return "Go away human";
	}

}
