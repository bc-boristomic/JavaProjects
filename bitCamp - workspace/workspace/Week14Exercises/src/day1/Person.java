package day1;

public class Person {
	
	Integer id;
	String name;
	String grade;
	
	public Person(Integer id, String name, String grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		//builder.append("Person ");
		//builder.append("id: ");
		builder.append(id);
		builder.append(", ");
		builder.append(name);
		builder.append(", ");
		builder.append(grade);
		return builder.toString();
	}
	
	
	

}
