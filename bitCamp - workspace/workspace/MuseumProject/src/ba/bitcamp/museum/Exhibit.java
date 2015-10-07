package ba.bitcamp.museum;

public class Exhibit implements Comparable<Exhibit>, Searchable {

	// Static variable used as counter for each id, every time Default Constructor is used counter increases by one
	private static int idCount = 1;

	// Declaring variables used to describe each Exhibit
	private Integer id;
	private String name;
	private String description;

	/**
	 * Default constructor of Exhibits class, automatically generates ID for
	 * each exhibit starting from 1. Leaves name of exhibit and short
	 * description for user input.
	 * 
	 * @param name
	 *            - <code>String</code> type value of exhibit name
	 * @param description
	 *            - <code>String</code> type value of exhibit description
	 */
	public Exhibit(String name, String description) {
		this.id = idCount++;
		this.name = name;
		this.description = description;
	}

	/**
	 * Constructor of Exhibits class that lets user enter ID, name and short
	 * description for each exhibit.
	 * 
	 * @param id
	 *            - <code>Integer</code> type value of ID
	 * @param name
	 *            - <code>String</code> type value of exhibit name
	 * @param description
	 *            - <code>String</code> type value of exhibit description
	 */
	public Exhibit(Integer id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	/**
	 * toString return <code>String</code> value representation of
	 * <tt>Exhibit</tt> object ID, followed by name, and in new line
	 * description.
	 */
	public String toString() {
		return String.format("\nID: %d, Name: %s \nDescription: %s", id, name,
				description);
	}

	/**
	 * Generated equals method
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exhibit other = (Exhibit) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/**
	 * Implemented compareTo method from Comparable interface. Checks if
	 * <tt>Exhibits</tt> are compared by name, if they are not, compares each
	 * name. If you call this method with list, it will return sorted list
	 * starting in alphabetical order.
	 */
	@Override
	public int compareTo(Exhibit e) {
		if (!name.equals(e.name)) {
			return this.name.compareToIgnoreCase(e.name);
		}
		return 0;
	}

	/**
	 * Searches for specific <code>String</code> type value in every field of
	 * <tt>Exhibit</tt> object.
	 */
	@Override
	public boolean fitsSearch(String s) {
		if (s.equals(id.toString()) || s.equalsIgnoreCase(name)
				|| s.equalsIgnoreCase(description)) {
			return true;
		}
		return false;
	}
}
