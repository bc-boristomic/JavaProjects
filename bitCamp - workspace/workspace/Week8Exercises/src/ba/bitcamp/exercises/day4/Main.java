package ba.bitcamp.exercises.day4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Prvi", "Radnik", "M", 1000, 12, 7, 1989);
		Employee e2 = new Employee("Drugi", "Radnik", "M", 1000, 13, 8, 1985);
		Employee e3 = new Employee("Drugi", "Radnik", "M", 1000, 14, 9, 1982);
		Employee e4 = new Employee("Cetvrta", "Radnica", "F", 1000, 14, 9, 1983);
		
		Employee e5 = new Employee("Peti", "Radnik", "M", 1000, 12, 7, 1989);
		Employee e6 = new Employee("Sesti", "Radnik", "M", 1000, 13, 8, 1985);
		
		Employee e7 = new Employee("Sedmi", "Radnik", "M", 1000, 14, 9, 1982);
		Employee e8 = new Employee("Osma", "Radnica", "F", 1000, 14, 9, 1983);
		
		Employee e9 = new Employee("Deveti", "Radnik", "M", 1000, 14, 9, 1982);
		Employee e10 = new Employee("Deseta", "Radnica", "F", 1000, 14, 9, 1983);
		
		Employee[] array;
		ArrayList<Employee> list;
		ArrayList<Employee> list2 = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5, e6));
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		
		Company company = new Company();
		
		System.out.println();
		
		System.out.println("Company before hiring " + company); // Company before hiring
		company.hireEmployee(e1); // Hiring someone
		company.hireEmployee(e1); // Hiring same employee which is impossible
		System.out.println("Company after hiring " + company); // Company after hiring
		
		System.out.println();
		
		company.hireEmployee(e2); // Hiring employee that will be fired afterwards
		System.out.println("Company with two employees " + company); // Checking status
		company.fireEmployee(e2); // Firing employee that was just hired
		System.out.println("Company after firing second employee " + company); // Checking status
		
		company.fireEmployee(e3); // Firing someone that isn't working in company
		
		System.out.println();
		
		System.out.println("Is worker employed by company? " + company.isWorkingHere(e1)); // Checking if worker works in company
		System.out.println("Is worker employed by company? " + company.isWorkingHere(e3)); // Checking if worker works in company

		System.out.println();
		
		company.hireEmployee(e4); // Hiring female employee
		System.out.println("Does company have female workers? " + company.hasFemaleEmployees()); // Checking if company have female workers
		
		System.out.println();
		
		company.hireEmployee(e2);
		
		System.out.println(company); // Company employees before being sorted by ID
		company.sortByID();
		System.out.println(company); // Company employees after being sorted by ID
		
		company.sortByAge();
		System.out.println(company);
		
		for (Employee employee : company.getEmployeeList()) { // getEmployeeList returns ArrayList so it can be used to print all employees
			System.out.println(employee);
		}
		
		company.addEmployees(e5, e6); // Add as much employees as you want.

		company.addEmployeesArray(array = new Employee[]{ e7, e8 }); // Add an array of employees.
	
		company.addEmployeesArrayList(list = new ArrayList<>(Arrays.asList(e9, e10))); // Add an ArrayList of employees.
		
		System.out.println();
		
		System.out.println(company.indexOf(e8)); // Checks indexOf employee
		System.out.println(company.indexOf(e3)); // Checks indexOf employee
		
		for (Employee employee : company.getEmployeeList()) { // getEmployeeList returns ArrayList so it can be used to print all employees
			System.out.println(employee);
		}		
		
		company.removeEmployeeByIndex(-9); // Removing inexistent employee
		company.removeEmployeeByIndex(2); // Removing existing employee
		
		company.removeEmployeeByID(1000);
		company.removeEmployeeByID(1001);
		
		System.out.println();
		
		
		System.out.println(company.getNameList(list2));
		
		company.sortByName();
		System.out.println();
		for (Employee employee : company.getEmployeeList()) { // getEmployeeList returns ArrayList so it can be used to print all employees
			System.out.println(employee);
		}
		
		
	}

}
