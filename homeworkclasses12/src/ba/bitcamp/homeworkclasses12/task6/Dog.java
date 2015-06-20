package ba.bitcamp.homeworkclasses12.task6;

/**
 * Class dog inherits Pet class, so you can choose species
 * right in the constructor since all dogs are dogs.
 * <p>
 * Note there is no need for toString method since the one 
 * working in Pet class will do all the work.
 * 
 * @author boris
 *
 */
public class Dog extends Pet {

	private String breed;

	public Dog(String name, Integer years, String breed) {
		super(name, years, DOG);
		this.breed = breed;
	}

}
