package ba.bitcamp.homeworkclasses17.task1;

public class Main {
	
	public static void main(String[] args) {
		
		DynamicDouble dd = new DynamicDouble(8, 3.2);
		
		System.out.println(dd);
		
		dd.addElement(9);
		System.out.println(dd);
		
		double[] array = { 1.2, 2.3, 3.4 };
		dd.addElements(array);
		System.out.println(dd);
		
		dd.removeQuick(10);
		System.out.println(dd);
		
		dd.removeSlow(8);
		System.out.println(dd);
		
	}

}
