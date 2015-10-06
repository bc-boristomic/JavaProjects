package ba.bitcamp.homework16.task4;

public class Employee {
	
	private String workerName;
	private String workerSex;
	private int workerPay;
	
	public Employee (String wName, String wSex, int wPay) {
		this.workerName = wName;
		this.workerSex = wSex;
		this.workerPay = wPay;
	}
	
	/**
	 * Returns worker name.
	 * 
	 * @return <code>String</code> type name
	 */
	public String getWorkerName() {
		return workerName;
	}
	
	/**
	 * Returns worker sex.
	 * 
	 * @return <code>String</code> type sex
	 */
	public String getWorkerSex() {
		return workerSex;
	}
	
	/**
	 * Returns worker pay.
	 * 
	 * @return <code>int</code> type pay
	 */
	public int getWorkerPay() {
		return workerPay;
	}
	
	/**
	 * Adds certain amount of money to individual worker.
	 * 
	 * @param amount <code>int</code> type value
	 */
	public void addMoneyToWorker(int amount) {
		workerPay += amount;
	}
	

}
