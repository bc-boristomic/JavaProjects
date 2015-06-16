package ba.bitcamp.homework16.task4;

public class Main {
	
	public static void main(String[] args) {
		
	Employee w1 = new Employee("Worker 1", "M", 1000);
	Employee w2 = new Employee("Worker 2", "M", 1200);
	Employee w3 = new Employee("Worker 3", "F", 1000);
	
	Employee d = new Employee("Director", "M", 2000);
	
	Employee[] w = new Employee[] {w1, w2, w3};

	Company c1 = new Company("Company", d, w);
	
	
	System.out.println("Number of employees in company is " + c1.getNumberOfEmployees());
	System.out.println("Company spends " + c1.getAmountOfMoneySpentOnSallarys() + " monthly on salaries.");
	System.out.println(c1.getNumberOfWomanWorkers() + " woman('s) work at company.");
	
	System.out.println();
	
	System.out.println("Director have " + d.getWorkerPay() + " amount of money.");
	System.out.println("Worker 1 have " + w1.getWorkerPay() + " amount of money.");
	System.out.println("Worker 2 have " + w2.getWorkerPay() + " amount of money.");
	System.out.println("Worker 3 have " + w3.getWorkerPay() + " amount of money.");
	
	System.out.println();
	
	System.out.println("We will add 200$ bonus for everyone in company.");
	c1.addMoneyToEveryWorker(200);
	
	System.out.println();

	System.out.println("Director have " + d.getWorkerPay() + " amount of money.");
	System.out.println("Worker 1 have " + w1.getWorkerPay() + " amount of money.");
	System.out.println("Worker 2 have " + w2.getWorkerPay() + " amount of money.");
	System.out.println("Worker 3 have " + w3.getWorkerPay() + " amount of money.");
	
	System.out.println();
	System.out.println(c1);
	
	}
}
