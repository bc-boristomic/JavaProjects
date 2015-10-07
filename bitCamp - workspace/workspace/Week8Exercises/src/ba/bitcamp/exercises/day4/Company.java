package ba.bitcamp.exercises.day4;

import java.util.ArrayList;

public class Company {

	ArrayList<Employee> employees = new ArrayList<>();

	/**
	 * Hires employee only if he/she isn't already hired.
	 * 
	 * @param employeeToHire
	 *            - Employee object
	 */
	public void hireEmployee(Employee employeeToHire) {
		if (employees.contains(employeeToHire)) {
			System.out.println("You already hired this employee!");
		} else {
			employees.add(employeeToHire);
		}
	}

	/**
	 * Fires employee only if he/she is working in company.
	 * 
	 * @param employeeToFire
	 *            - Employee object
	 */
	public void fireEmployee(Employee employeeToFire) {
		if (!employees.contains(employeeToFire)) {
			System.out
					.println("You can't fire someone that is not working for you!");
		} else {
			employees.remove(employeeToFire);
		}
	}

	/**
	 * Linearly check entire company to see if worker is employed
	 * 
	 * @param employeeToCheck
	 *            - Employee object
	 * @return <code>boolean</code> true if is employed, false if isn't
	 */
	public boolean isWorkingHere(Employee employeeToCheck) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).equals(employeeToCheck)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Linearly check entire company to see if there is woman worker.
	 * 
	 * @param companyToCheck
	 *            - Company object
	 * @return <code>boolean</code> true if there is woman worker, false if
	 *         isn't
	 */
	public boolean hasFemaleEmployees() {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getSex().equals("F")) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Sorts employees by ID, first is smaller ID and so on.
	 * <p>
	 * Selection sort is used to sort employees.
	 * 
	 */
	public void sortByID() {
		for (int i = 0; i < employees.size(); i++) {
			int minIndex = 0;
			for (int j = minIndex; j < employees.size(); j++) {
				if (employees.get(i).getiD() > employees.get(minIndex).getiD()) {
					minIndex = j;
				}
			}
			Employee temp = employees.get(minIndex);
			employees.set(minIndex, employees.get(i));
			employees.set(i, temp);
		}
	}

	/**
	 * 
	 */
	public void sortByAge() {
		for (int i = 0; i < employees.size(); i++) {
			int minIndex = 0;
			for (int j = 1; j < employees.size(); j++) {
				if (employees.get(i).getDoubleDate() > employees.get(minIndex)
						.getDoubleDate()) {
					minIndex = j;
				}
			}
			Employee temp = employees.get(minIndex);
			employees.set(minIndex, employees.get(i));
			employees.set(i, temp);
		}
	}

	/**
	 * Returns ArrayList of all employees.
	 * 
	 * @return ArrayList
	 */
	public ArrayList<Employee> getEmployeeList() {
		return employees;
	}

	/**
	 * Uses varargs to add as much employees to employees ArrayList. Employees
	 * are added thru foreach loop.
	 * 
	 * @param employeToAdd
	 *            - Employee varargs
	 */
	public void addEmployees(Employee... employeeToAdd) {

		for (Employee employee : employeeToAdd) {
			hireEmployee(employee);
		}
	}

	/**
	 * Uses Employee array to add employees to employees ArrayList. Employees
	 * are added thru for each loop. Array can be long as much as needed.
	 * 
	 * @param employeeArrayToAdd
	 *            - Employee array
	 */
	public void addEmployeesArray(Employee[] employeeArrayToAdd) {

		for (Employee employee : employeeArrayToAdd) {
			hireEmployee(employee);
		}
	}

	/**
	 * Uses Employee ArrayList to add as much employees as you want. Each
	 * employee is added thru for each loop. ArrayList can be long as much as
	 * needed.
	 * 
	 * @param employeeArrayListToAdd
	 *            - Employee ArrayList
	 */
	public void addEmployeesArrayList(ArrayList<Employee> employeeArrayListToAdd) {
		for (Employee employee : employeeArrayListToAdd) {
			hireEmployee(employee);
		}
	}

	/**
	 * Checks if employee is listed in Employees ArrayList, returns position in
	 * ArrayList if he/she is there, and null if not.
	 * 
	 * @param employee
	 *            - Employee
	 * @return <code>Integer</code> value of ArrayList index
	 */
	public Integer indexOf(Employee employee) {
		for (int i = 0; i < employees.size(); i++) {
			if (employee.equals(employees.get(i))) {
				return i;
			}
		}
		return null;
	}

	/**
	 * Removes employee from ArrayList at provided index.
	 * 
	 * @param index
	 *            - <code>int</code> type index value
	 * @exception IndexOutOfBoundsException
	 */
	public void removeEmployeeByIndex(int index) {
		try {
			employees.remove(index);
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Employee doesn't exist at inputed index.");
		}
	}

	/**
	 * Removes employee from ArrayList given employees ID number.
	 * 
	 * @param iD
	 *            - <code>Integer</code> type ID
	 */
	public void removeEmployeeByID(int iD) {
		int j = 0;
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getiD() == iD) {
				employees.remove(i);
			} else if (employees.get(i).getiD() != iD) {
				j++;
			}
		}
		if (j == employees.size()) {
			System.out.println("No employee with that ID");
		}
	}

	/**
	 * Takes ArrayList of employees and turns it into Array of employees.
	 * 
	 * @param employeeArrayList
	 *            - Employee ArrayList
	 * @return Employee array
	 */
	public Employee[] getArray(ArrayList<Employee> employeeArrayList) {
		Employee[] array = new Employee[employeeArrayList.size()];
		return employeeArrayList.toArray(array);
	}

	/**
	 * Sorts Employees by first name.
	 */
	public void sortByName() {
		for (int i = 0; i < employees.size(); i++) {
			for (int j = employees.size() - 1; j > 0; j--) {
				if (employees.get(j - 1).getFirstName().compareToIgnoreCase(employees.get(j).getFirstName()) > 0) {
					Employee temp = employees.get(j);
					employees.set(j, employees.get(j - 1));
					employees.set(j - 1, temp);
				}
			}
		}

	}

	/**
	 * Takes ArrayList of employees goes thru their first names, takes names and
	 * adds names to <code>String</code> type ArrayList.
	 * 
	 * @param employees
	 *            - Employee ArrayList
	 * @return <code>String</code> type ArrayList
	 */
	public ArrayList<String> getNameList(ArrayList<Employee> employees) {
		ArrayList<String> list = new ArrayList<>();
		for (Employee employee : employees) {
			list.add(employee.getFirstName());
		}
		return list;
	}

	@Override
	public String toString() {
		return "Company employees are " + employees;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((employees == null) ? 0 : employees.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (employees == null) {
			if (other.employees != null)
				return false;
		} else if (!employees.equals(other.employees))
			return false;
		return true;
	}

}
