package ba.bitcamp.day3;

public class Employee {
	
	private String name;
	private String surname;
	private String gender;
	private String position;
	private Integer salary;
	
	
	public Employee(String name, String surname, String gender,
			String position, Integer salary) {
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.position = position;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public Integer getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "\n" + name + " " + surname + ", " + gender + ", position: " + position + ", salary: " + salary;
	}
	
	
	

}
