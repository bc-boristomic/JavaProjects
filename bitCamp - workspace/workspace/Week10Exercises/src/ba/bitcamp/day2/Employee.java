package ba.bitcamp.day2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;

public class Employee implements Serializable {
	private static final long serialVersionUID = -64052523766135775L;

	public static int idCounter = 1;

	private String firstName;
	private String lastName;
	private Integer id;

	public Employee(String name, String surname) {
		this.firstName = name;
		this.lastName = surname;
		this.id = idCounter++;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + ", id: " + id;
	}

	public static void main(String[] args) {

		LinkedList<Employee> list = new LinkedList<>();
		ObjectOutputStream bw = null;
		try {
			bw = new ObjectOutputStream(new FileOutputStream("employees.txt"));
			for (int i = 0; i < 10; i++) {
				list.add(new Employee("Name" + i, "Surname" + i));
				//bw.writeObject(new Employee("Name" + i, "Surname" + i));
				bw.writeObject(list);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
