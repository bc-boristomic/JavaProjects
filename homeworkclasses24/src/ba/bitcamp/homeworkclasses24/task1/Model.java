package ba.bitcamp.homeworkclasses24.task1;

/**
 * Public abstract class Model have tableName attribute with it's setter
 * representing name of table that will be used by other two method to do
 * specific query.
 * <p>
 * findByPk method select specific row by inputed primary key.
 * <p>
 * findByAttribute returns attribute if the inputed value is same as required
 * attribute.
 * 
 * @author boris
 *
 */
public abstract class Model {

	private String tableName;

	/**
	 * Default setter for tableName.
	 * 
	 * @param tableName
	 *            <code>String</code> type value of tableName
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	/**
	 * Query for finding row with inputed primary key.
	 * 
	 * @param id
	 *            <code>Integer</code> type value of primary key
	 * @return <code>String</code> type value of selected table row
	 */
	public String findByPk(Integer id) {
		return "SELECT * FROM " + tableName + " WHERE id = " + id;
	}

	/**
	 * Query for finding attribute with inputed value from table.
	 * 
	 * @param attribute
	 *            <code>String</code> type value of attribute
	 * @param value
	 *            <code>String</code> type value of inputed value to find in
	 *            table
	 * @return <code>String</code> type value of attribute from table
	 */
	public String findByAtibute(String attribute, String value) {
		return "SELECT " + attribute + "FROM " + tableName + " WHERE "
				+ attribute + " = " + value;
	}

	/**
	 * Default getter for tableName
	 * 
	 * @return <code>String</code> type value of table name
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * toString method that returns table name
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Table name: ").append(tableName);
		return sb.toString();
	}

}
