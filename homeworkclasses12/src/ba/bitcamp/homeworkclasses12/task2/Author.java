package ba.bitcamp.homeworkclasses12.task2;


/**
 * Author class contains basic information about author.
 * Implements all the basic methods, toString, hashCode and equals.
 * Also all of get and set methods.
 * 
 * @author boris
 *
 */
public class Author {
	
	private String name;
	private String email;
	private String sex;
	
	/**
	 * Constructor for Author class
	 * 
	 * @param name <code>String</code> type input
	 * @param email <code>String</code> type input
	 * @param sex <code>String</code> type input
	 */
	public Author(String name, String email, String sex) {
		this.name = name;
		this.email = email;
		this.sex = sex;
	}

	/**
	 * Returns given name
	 * 
	 * @return <code>String</code> type name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets name of Author
	 * 
	 * @param name <code>String</code> type input
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns given email
	 * 
	 * @return <code>String</code> type email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets email of Author
	 * 
	 * @param email <code>String</code> type input
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Returns given sex
	 * 
	 * @return <code>String</code> type sex
	 */
	public String getSex() {
		return sex;
	}
	
	/**
	 * Sets sex of Author
	 * 
	 * @param sex <code>String</code> type input
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * Prints to standard output Author's name, email and sex.
	 */
	public String toString() {
		return String.format("Name: %s\nEmail: %s\nSex: %s", name, email, sex);
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	
	
	
	

}
