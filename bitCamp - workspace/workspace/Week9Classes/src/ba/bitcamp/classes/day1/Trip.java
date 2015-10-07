package ba.bitcamp.classes.day1;

public class Trip {

	private Place start;

	public void setStart(Place start) {
		this.start = start;
	}

	public Place getStart() {
		return start;
	}

	public void addPlace(Place place) {
		if (start == null) {
			start = place;
		} else {
			Place last = start;
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(place);
		}
	}

	@Override
	public String toString() {
		String s = "";

		Place currentPlace = start;

		while (currentPlace != null) {
			s += String.format("%s \n", currentPlace);
			currentPlace = currentPlace.getNext();
		}
		return s;
	}

}
