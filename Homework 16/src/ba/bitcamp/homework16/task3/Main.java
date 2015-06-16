package ba.bitcamp.homework16.task3;

public class Main {
	
	public static void main(String[] args) {
		
		Printer p1 = new Printer("HP");
		
		System.out.println("System check");
		System.out.println(p1);
		System.out.println();
		
		System.out.println("Is there ink? " + p1.getIsThereInk());
		System.out.println("Is there paper? " + p1.getIsTherePaper());
		System.out.println("How much did you print so far? " + p1.getPrintedPages() + " page(s)");
		
		System.out.println();
		
		System.out.println("Add paper");
		p1.addPaper(120); // Add more paper then printer can hold
		p1.addPaper(100); // Add max amount of paper printer can hold
		System.out.println("Is there paper? " + p1.getIsTherePaper());
		
		System.out.println();
		
		System.out.println("Add ink");
		p1.addInk(101); // Add more ink then printer can hold
		p1.addInk(50); // Add ink to printer
		System.out.println("Is there ink? " + p1.getIsThereInk());

		System.out.println();
		
		System.out.println("System check");
		System.out.println(p1);
		
		p1.usePrinter(80);
		
		System.out.println();
		
		System.out.println("How much did you print so far? " + Printer.printedSoFar + " page(s)");
		System.out.println();
		
		Printer p2 = new Printer("Cannon");
		p2.addInk(60);
		p2.addPaper(60);
		p1.addPaper(9);
		p1.addPaper(2);
		
		Printer p3 = new Printer("InkJet");
		
		Printer[] pn1 = new Printer[] {p1, p2, p3};
		PrinterNetwork net = new PrinterNetwork(pn1);
		
		System.out.println("Which of three printers is ready to print?");
		net.getFirstReadyPrinter(pn1);
		
		System.out.println();
		
		System.out.println("Paper in printer 1 " + p1.getAmountOfPaper());
		System.out.println("Paper in printer 2 " + p2.getAmountOfPaper());
		System.out.println("Paper in printer 3 " + p3.getAmountOfPaper());
		
		System.out.println();
		System.out.println("Adding 160 papers to all printers.");
		net.addMaxPaperToAllPrinters(pn1, 160);
		
		System.out.println();
		
		System.out.println("Paper in printer 1 " + p1.getAmountOfPaper());
		System.out.println("Paper in printer 2 " + p2.getAmountOfPaper());
		System.out.println("Paper in printer 3 " + p3.getAmountOfPaper());
	}

}