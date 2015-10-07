package ba.bitcamp.boris.classes.day2;

public class User {
	
	public static int userCount = 0;
	
	private String name;
	private String surname;
	private int age;
	private int id;
	
	public User(User other) { // Konstruktor za kopiranje vrijednosti objekta, input mu je kreirani objekt user
		this(other.name, other.surname, other.age);
		userCount--;
		this.id = other.id;
		
	}
	
	public User(String name, String surname) { // Ovako napisan konstruktor poziva drugi konstruktor
		this(name, surname, 0);
	}
	
	public User(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.id = ++userCount;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	
	
	public String toString() {
		String output = String.format("Name: %s, Surname: %s, Age: %d, Id: %d", name, surname, age, id);
		return output;
	}
	
	
	public boolean equals(User other) {
		if (this.name.equals(other.name) && this.surname.equals(other.surname) 
				&& this.age == other.age && this.id == other.id) {
			return true;
		} else {
			return false;
		}
	}

}
