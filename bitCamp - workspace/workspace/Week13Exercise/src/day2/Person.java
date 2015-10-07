package day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Person {
	
	private Integer id;
	private String name;
	private String gender;
	private Integer salary;
	
	public Person(Integer id, String name, String gender, Integer salary) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public Integer getSalary() {
		return salary;
	}



	public void setSalary(Integer salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}
	

	public static void main(String[] args) {
		
		try {
			ArrayList<Person> list = new ArrayList<>();
			
			BufferedReader reader = new BufferedReader(new FileReader("/Users/boris.tomic/Desktop/file.csv"));
			String id = "";
			String name = "";
			String gender = "";
			String salary = "";
			String line = "";
						
			line = reader.readLine();
			while (reader.ready()) {
				line = reader.readLine();
				StringTokenizer st = new StringTokenizer(line, ",");
				id = st.nextToken();
				name = st.nextToken();
				gender = st.nextToken();
				salary = st.nextToken();
			
				Person temp = new Person(Integer.parseInt(id), name, gender, Integer.parseInt(salary));
				list.add(temp);
				}
			
			System.out.println(list + "\n");
			
			System.out.println("Salary over 5000");
			for (Person person : list) {
				if (person.getSalary() > 5000) {
					System.out.println(person);
				}
			}
			
			System.out.println("\nSalary less then 1000 and id over 2");
			for (Person person : list) {
				if (person.getSalary() < 1000 && person.getId() > 2) {
					System.out.println(person);
				}
			}
			
			System.out.println("\nNames");
			for (Person person : list) {
				System.out.println(person.getName());
			}
			
			System.out.println("\nNames and salarys");
			for (Person person : list) {
				System.out.println(person.getName() + " " + person.getSalary());
			}
			
			ArrayList<Manager> list2 = new ArrayList<>();
			
			BufferedReader reader2;
			try {
				reader2 = new BufferedReader(new FileReader("/Users/boris.tomic/Desktop/manager.csv"));
			String id2 = "";
			String name2 = "";
			String line2 = "";
						
			line2 = reader2.readLine();
			while (reader2.ready()) {
				line2 = reader2.readLine();
				StringTokenizer st = new StringTokenizer(line2, ",");
				id2 = st.nextToken();
				name2 = st.nextToken();
				
			
				Manager temp = new Manager(Integer.parseInt(id2), name2);
				list2.add(temp);
				}
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println(list2 + "\n");
			
			for (Person person : list) {
				
				System.out.print(person.getName());	
				Manager myM = null;
				for (Manager manager : list2) {
					if (person.getId() == manager.getId()) {
						myM = manager;
					}
				}
				if (myM == null) {
					System.out.println(" null");
				} else {
					System.out.println(" " + myM.getName());
				}
				
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	

}
