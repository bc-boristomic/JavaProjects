package ba.bitcamp.boris.exercises.day2.task3;

public class Printer {

	public static int printedSoFar = 0;
	
	private String name;
	private int amountOfPaper;
	private int amountOfInk;
	private int printedPages;
	
	public Printer() {
		this.name = "DefaultPrinter";
		this.amountOfPaper = 0;
		this.amountOfInk = 0;
		this.printedPages = 0;
	}

	public Printer(String name) {
		this();
		this.name = name;
	}
	
	
	public String toString () {
		String s = "";
		if (this.amountOfPaper > 0 && this.amountOfInk > 0) {
			s = "Ready to print! " + name;
		} else if (this.amountOfPaper == 0 && this.amountOfInk > 0) {
			s = "No paper!";
		} else if (this.amountOfPaper > 0 && this.amountOfInk == 0) {
			s = "No ink!";
		} else if (this.amountOfPaper == 0 && this.amountOfInk == 0) {
			s = "No ink or paper!";
		}
		
		return s;
	}
	
	
	/**
	 * Returns if there is ink in printer.
	 * 
	 * @return <code>boolean</code> type value
	 */
	public boolean getIsThereInk() {
		if (this.amountOfInk != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Returns if there is paper in printer. 
	 * 
	 * @return <code>boolean</code> type value
	 */
	public boolean getIsTherePaper() {
		if(this.amountOfPaper != 0) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Amount of paper left in printer
	 * 
	 * @return
	 */
	public int getAmountOfPaper(){
		return this.amountOfPaper;
	}
	
	/**
	 * Amount of ink left in printer
	 * 
	 * @return
	 */
	public int getAmountOfInk(){
		return this.amountOfInk;
	}

	/**
	 * Returns amount of printed pages.
	 * 
	 * @return <code>int</code> type value
	 */
	public int getPrintedPages() {
		return this.printedPages += printedSoFar ;
	}


	/**
	 * Adds paper to printer.
	 * 
	 * @param paper <code>int</code> type value
	 */
	public void addPaper (int paper) {
		if (paper < 101) {
			this.amountOfPaper += paper;
			if (this.amountOfPaper > 100) {
				int leftover;
				leftover = this.amountOfPaper - 100; 
				System.out.println("You added too much paper!");
				System.out.println("I added max 100 papers for you, you have " + leftover + " leftover papers.");
				this.amountOfPaper = 100;
			}
		} else {
			System.out.println("You aded too much paper!");
		}
	}
	
	/**
	 * Adds ink to printer.
	 * 
	 * @param ink <code>int</code> type value
	 */
	public void addInk (int ink) {
		if (ink < 101) {
			this.amountOfInk += ink;
			if (this.amountOfInk > 100) {
				int leftover;
				leftover = this.amountOfInk - 100; 
				System.out.println("You added too much ink!");
				System.out.println("I added max 100 ink for you, you have " + leftover + " leftover ink.");
				this.amountOfPaper = 100;
			}
		} else {
			System.out.println("You aded too much ink!");
		}
	}
	
	
	/**
	 * Prints pages, spends paper and ink for every page printed.
	 * 
	 * @param pages <code>int</code> type value
	 */
	public void usePrinter (int pages) {
		for (int i = 0; i < pages; i++) {
			if (this.amountOfInk < 1 || this.amountOfPaper < 1) {
				break;
			}
			this.amountOfPaper -= 1;
			this.amountOfInk -= 3;
			printedSoFar++;
			
		}
	}

}
