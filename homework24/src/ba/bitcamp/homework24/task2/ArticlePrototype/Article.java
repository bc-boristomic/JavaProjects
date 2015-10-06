package ba.bitcamp.homework24.task2.ArticlePrototype;

/**
 * Public class Article used to add articles to database and delte from
 * database.
 * 
 * @author boris
 *
 */
public class Article {

	private Integer code;
	private String name;
	private String price;

	/**
	 * Default constructor of Article class
	 * 
	 * @param code
	 *            <code>Integer</code> type value of code (barcode of article)
	 * @param name
	 *            <code>String</code> type value of article name
	 * @param price
	 *            <code>String</code> type value of article price
	 */
	public Article(Integer code, String name, String price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}

	/**
	 * Default getter for article code
	 * 
	 * @return <code>Integer</code> type value of article code
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * Default getter for article name
	 * 
	 * @return <code>String</code> type value of article name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Default getter for article price
	 * 
	 * @return <code>String</code> type value of article price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * toString method of Article object, returns <code>String</code> type value
	 * of article code followed by, article name, and article price
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Article code: ");
		sb.append(code);
		sb.append(", name: ");
		sb.append(name);
		sb.append(", price: ");
		sb.append(price);
		return sb.toString();
	}
}
