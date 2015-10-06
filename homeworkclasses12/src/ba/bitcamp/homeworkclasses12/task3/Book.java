package ba.bitcamp.homeworkclasses12.task3;

import ba.bitcamp.homeworkclasses12.task2.Author;

/**
 * Class Book have four constants for current condition of book.
 * It have one Author from previous task, note import class from another package.
 * <p>
 * Book implements all of standard methods.
 * 
 * @author boris
 *
 */
public class Book {
	
	public static final int NO_BOOK = 0;
	public static final int ONE_BOOK = 1;
	public static final int TWO_BOOKS = 2;
	public static final int THREE_BOOKS = 3;
	
	private String name;
	private Double price;
	private Integer condition;
	private Author author;
	
	/**
	 * Constructor of Book class.
	 * 
	 * @param author Object author
	 * @param name <code>String</code> type name
	 * @param price <code>Double</code> type price
	 * @param condition <code>Integer</code> type condition
	 */
	public Book( Author author, String name, Double price, Integer condition) {
		this.author = author;
		this.name = name;
		this.price = price;
		this.condition = condition;
	}

	/**
	 * Returns name of book.
	 * 
	 * @return <code>String</code> type
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set name of book
	 * 
	 * @param name <code>String</code> type
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns price of book.
	 * 
	 * @return <code>Double</code> type
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * Set price of book.
	 * 
	 * @param price <code>Double</code> type
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * Returns condition of book.
	 * 
	 * @return <code>Integer</code> type
	 */
	public Integer getCondition() {
		return condition;
	}

	/**
	 * Set condition of book
	 * @param condition <code>Integer</code> type
	 * @throws UnsupportedOperationException
	 */
	public void setCondition(Integer condition) {
		if (condition < 0 || condition > 3) {
			throw new UnsupportedOperationException("Book condition must be 0-3");
		} else {
			this.condition = condition;
		}
	}

	/**
	 * Returns Author object
	 * 
	 * @return Author
	 */
	public Author getAuthor() {
		return author;
	}

	/**
	 * Set different Author
	 * 
	 * @param author object
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}

	/**
	 * Prints Author information then book information to standard output.
	 * First calls author toString method, then prints basic book info.
	 * Then checks condition of book and prints it. 
	 */
	public String toString() {
		String s = String.format("Author\n%s\nBook\nName: %s\nPrice: %.2f\nCondition: ", author, name, price);
		switch (condition) {
		case NO_BOOK: 
			return s += "No book\n";
		case ONE_BOOK:
			return s += "One book\n";
		case TWO_BOOKS:
			return s += "Two books\n";
		case THREE_BOOKS:
			return s += "Three books\n";
		}
		return s;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result
				+ ((condition == null) ? 0 : condition.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
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
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (condition == null) {
			if (other.condition != null)
				return false;
		} else if (!condition.equals(other.condition))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}


}
