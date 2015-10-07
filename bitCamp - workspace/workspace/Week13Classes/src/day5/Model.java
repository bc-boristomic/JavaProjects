package day5;

public abstract class Model {

	String tableName;

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
	public String findByPk(Integer id) {
		return "select * from " + tableName + " where id = " + id;
	}

	public String findByAtibute(String attribute, String value) {
		return "select " + attribute + "from " + tableName + " where " + attribute + " = " + value;
	}

}
