package ba.bitcamp.homeworkclasses12.task6;


/**
 * Cat class inherits Pet class, note just like in Dog class
 * constructor is already inputed that all cats are cats.
 * <p>
 * Also toString method is used from super class Pet. 
 * @author boris
 *
 */
public class Cat extends Pet {

	public Cat(String name, Integer years) {
		super(name, years, CAT);
		
	}

}
