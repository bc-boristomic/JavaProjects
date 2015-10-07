package day5;

public class Person extends Model {

	Integer id;
	String value;
	String attribute;

	@Override
	public void setTableName(String tableName) {
		super.setTableName(tableName);
	}

	public void setId() {
		this.id = getId();
	}

	public void setName(String name) {
		this.value = getValue();
	}

	public Integer getId() {
		return Integer.parseInt(findByPk(id));
	}

	public String getValue() {
		return findByAtibute(attribute, value);
	}

}
