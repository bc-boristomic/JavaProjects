package ba.bitcamp.homework16.task4;

public class Company {
	
		
	private String name;
	private static Employee director;
	private static Employee[] workers;
	
	
	public Company (String name, Employee director, Employee[] workers ) {
		this.name = name;
		this.director = director;
		this.workers = workers;
	}
	
	/**
	 * Calculates number of employees in Company including director.
	 * 
	 * @return <code>int</code> type number of employees
	 */
	public int getNumberOfEmployees() {
		int counter = 0;
		for (int i = 0; i < workers.length; i++) {
			counter++;
		}
		if (director.equals(null)) {
			throw new NullPointerException("Add director.");
		} else {
			return ++counter;
		}
	}
	
	/**
	 * toString returns name of Company, name of Director and number of employees. 
	 */
	public String toString() {
		String s = String.format("Company is called %s, it's director is %s, and it employees %d workers.",
				name, director.getWorkerName(), getNumberOfEmployees());
		return s;
	}
	
	/**
	 * Calculates amount of money company spends on all employees.
	 * 
	 * @return <code>int</code> type amount of money
	 */
	public int getAmountOfMoneySpentOnSallarys() {
		int sum = 0;
		for (int i = 0; i < workers.length; i++) {
			sum += workers[i].getWorkerPay();
		}
		sum += director.getWorkerPay();
		return sum;
	}
	
	/**
	 * Calculates how many of employees are woman's.
	 * 
	 * @return <code>int</code> type 
	 */
	public static int getNumberOfWomanWorkers() {
		int counter = 0;
		for (int i = 0; i < workers.length; i++) {
			if (workers[i].getWorkerSex().equals("F")) {
				counter++;
			}
		}
		if (director.getWorkerSex().equals("F")) {
			counter++;
		}
		return counter;
	}
	
	/**
	 * Adds certain amount of money to every employee.
	 * 
	 * @param amount <code>int</code> type amount of money
	 */
	public void addMoneyToEveryWorker(int amount) {
		for (int i = 0; i < workers.length; i++) {
			workers[i].addMoneyToWorker(amount);
		}
		director.addMoneyToWorker(amount);
	}
	

}
