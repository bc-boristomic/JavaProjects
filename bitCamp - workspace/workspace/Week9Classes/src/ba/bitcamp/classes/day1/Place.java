package ba.bitcamp.classes.day1;

public class Place {

	private String name;
	private Place next;

	public Place(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNext(Place next) {
		this.next = next;
	}

	public Place getNext() {
		return next;
	}

}
