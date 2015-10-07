package day1;

public class Student {
	
	String firstName;
	String lastName;
	Integer id;
	String faculty;
	String semester;
	
	public Student() {
		firstName = null;
		lastName = null;
		id = null;
		faculty = null;
		semester = null;
	}
	
	
	public Student(String name, String faculty, String semester) {
		this.firstName = name;
		this.faculty = faculty;
		this.semester = semester;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", id=");
		builder.append(id);
		builder.append(", faculty=");
		builder.append(faculty);
		builder.append(", semester=");
		builder.append(semester);
		builder.append("]");
		return builder.toString();
	}
	
	

}
