package ba.bitcamp.classes.day2;

public class DynamicDouble {
	
	private static double myArray[];
	private static int count;
	
	public DynamicDouble() {
		this(8);
	}
	
	public DynamicDouble(int n) {
		this(n, 0.0);
	}
	
	public DynamicDouble(int n, double value) {
		super();
		count = n;
		myArray =  new double[n];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = value;
		}
	}
	
	private static void addElement(double element){
		double[] tmp = myArray;
		if (count >= myArray.length) {
			myArray = new double[myArray.length+1];
		}
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = tmp[i];
		}
		myArray[count] = element;
		count++;
	}
	
	private static void addElements(double[] element){
		for (int i = 0; i < element.length; i++) {
			addElement(element[i]);
		}
	}
	
	private static int returnSize(){
		return count;
	}
	
	private static int returnTotalSize(){
		return myArray.length;
	}
	
	private static void removeQuick (int offset) throws IndexOutOfBoundsException {
		if (count == 0) {
			throw new IndexOutOfBoundsException();
		}
		if (offset >= count) {
			throw new IndexOutOfBoundsException();
		}
		myArray[offset] = myArray[count-1];
		count--;
	}
	
	
	private static void removeSlow(int index){
		if (count <= myArray.length / 3) {
			double temp[] = new double[returnTotalSize() / 3];
			for (int i = 0; i < temp.length; i++) {
				temp[i] = myArray[i];
			}
			myArray = temp;
		}
	}
	
	public String toString() {
		String s = "\t[ ";
		for (int i = 0; i < count; i++) {
			s += myArray[i] + " ";
		}
		s +="]\n" + "\tsize is " + returnSize() + "\n\t [";
		for (int i = 0; i < myArray.length; i++) {
			s += myArray[i] + " ";
		}
		s += "]";
		return s;
	}
	
	
	
	
	public static void main(String[] args) {
		DynamicDouble dd = new DynamicDouble(10, 15);
		
		double[] d = { 1.2 };
		//addElement(1);
		//addElements(d);
		System.out.println(dd);
	}
	
	
}
