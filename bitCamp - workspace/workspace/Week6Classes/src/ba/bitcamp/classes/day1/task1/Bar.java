package ba.bitcamp.classes.day1.task1;

public class Bar implements Compare {
	
	private String name;
	
	public Bar(String name) {
		this.name = name;
	}
	
	
//	public int compare(Bar other) {
//		if (this.name.length() > other.name.length()) {
//			return 1;
//		} else if (this.name.length() == other.name.length()) {
//			return 0;
//		} else {
//			return -1;
//		}
//	}
//	
	
	public String toString(){
		return "Bar: " + name;
	}

	/**
	 * @throws IllegalArgumentException
	 */
	@Override
	public int compare(Object o) throws IllegalArgumentException {
		if (o instanceof Bar) {
			Bar other = (Bar) o;
			if (this.name.length() > other.name.length()) {
				return 1;
			} else if (this.name.length() == other.name.length()) {
				return 0;
			} else {
				return -1;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

}
