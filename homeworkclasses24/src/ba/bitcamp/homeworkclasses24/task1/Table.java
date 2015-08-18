package ba.bitcamp.homeworkclasses24.task1;

/**
 * Public class Table represents unspecified table and extends Model class that
 * is used to get queries from specified table.
 * 
 * @author boris
 *
 */
public class Table extends Model {

	private Integer id;
	private String value;
	private String attribute;

	/**
	 * Overrided method from super class, used to set tableName
	 * 
	 * @param tableName
	 *            <code>String</code> type value of table name
	 */
	@Override
	public void setTableName(String tableName) {
		super.setTableName(tableName);
	}

	/**
	 * Default getter for id, returns id from table.
	 * 
	 * @return <code>Integer</code> type value of primary key
	 */
	public Integer getId() {
		return Integer.parseInt(findByPk(id));
	}

	/**
	 * Default getter for attribute, returns attribute from table.
	 * 
	 * @return <code>String</code> type value of attribute
	 */
	public String getAttribute() {
		return findByAtibute(attribute, value);
	}

	/**
	 * Default setter for id
	 * 
	 * @param id
	 *            <code>Integer</code> type value of id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Default setter for value
	 * 
	 * @param value
	 *            <code>String</code> type value of value
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Default setter for attribute
	 * 
	 * @param attribute
	 *            <code>String</code> type value of attribute
	 */
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	/**
	 * toString method returns super class toString method with id and attribute
	 * from <tt>Table</tt> class
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(" id: ").append(id);
		sb.append(" attribute: ").append(attribute);
		return sb.toString();
	}

}
