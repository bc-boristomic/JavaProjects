package ba.bitcamp.homework16.task3;

// Bonus task
public class PrinterNetwork {
	
	private Printer[] printer;
	
	public PrinterNetwork(Printer[] p) {
		this.printer = p;
	}
	
	/**
	 * Searches for first ready printer and prints it's name.
	 * 
	 * @param p Array of printers
	 */
	public void getFirstReadyPrinter(Printer[] p) {
		for (int i = 0; i < p.length; i++) {
			if(p[i].getIsTherePaper() == true && p[i].getIsThereInk() == true) {
				System.out.println(p[i].toString());
			}
		}
	}
	

	/**
	 * Adds papers to printers, first fills first printer in line, 
	 * when reaches maximum capacity fills second and so on.
	 * 
	 * @param p - Array of printers
	 * @param paper - Amount of papers to fill all printers
	 */
	public void addMaxPaperToAllPrinters(Printer[] p, int paper) {
		int adder = 1;
		int leftovers = paper;
		int counter = 0;
		for (int i = 0; i < p.length; i++) {
			for (int j = paper; j > 0; j--) {
				if (p[i].getAmountOfPaper() < 100) {
					p[i].addPaper(adder);
					counter++;
					paper--;
					}
			}
		}
		if (leftovers - counter > 0) {
			System.out.println("You have " + (leftovers - counter) + " papers that couldn't fit in printers.");
		}
	}
	
	
	
	
}