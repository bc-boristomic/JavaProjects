package ba.bitcamp.museum;

public class Employee implements Searchable {

	// Declaring variables used to describe Employee
	private String firstName;
	private String lastName;
	private Integer yearsWorking;
	private Integer pay;

	/**
	 * Default constructor of Employee class
	 * 
	 * @param name
	 *            - <code>String</code> type value of Employee first name
	 * @param surname
	 *            - <code>String</code> type value of Employee last name
	 * @param yearsWorking
	 *            - <code>Integer</code> type value of Employee years working in
	 *            museum
	 * @param pay
	 *            - <code>Integer</code> type value of Employee pay
	 */
	public Employee(String name, String surname, Integer yearsWorking,
			Integer pay) {
		this.firstName = name;
		this.lastName = surname;
		this.yearsWorking = yearsWorking;
		this.pay = pay;
	}

	/**
	 * toString method returns <code>String</code> type value of employee full
	 * name, followed by monthly pay and years working in museum.
	 */
	public String toString() {
		return String.format("\n%s %s, monthly pay: %d, works in museum %d years", firstName,
				lastName, pay, yearsWorking);
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
		Employee other = (Employee) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (pay == null) {
			if (other.pay != null)
				return false;
		} else if (!pay.equals(other.pay))
			return false;
		if (yearsWorking == null) {
			if (other.yearsWorking != null)
				return false;
		} else if (!yearsWorking.equals(other.yearsWorking))
			return false;
		return true;
	}

	/**
	 * Searches for specific <code>String</code> type value in every field of
	 * <tt>Employee</tt> object.
	 */
	@Override
	public boolean fitsSearch(String s) {
		if (s.equalsIgnoreCase(firstName) || s.equalsIgnoreCase(lastName)
				|| s.equals(yearsWorking.toString()) || s.equals(pay.toString())) {
			return true;
		}
		return false;
	}

}
