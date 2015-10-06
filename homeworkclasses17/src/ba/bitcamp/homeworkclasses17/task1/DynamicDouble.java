package ba.bitcamp.homeworkclasses17.task1;

public class DynamicDouble {

	private double myArray[];
	private int count;

	public DynamicDouble() {
		this(8);
	}

	public DynamicDouble(int n) {
		this(n, 0.0);
	}

	public DynamicDouble(int n, double value) {
		super();
		this.count = n;
		this.myArray = new double[n];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = value;
		}
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double[] getMyArray() {
		return myArray;
	}

	public void setMyArray(double[] myArray) {
		this.myArray = myArray;
	}

	public void addElement(double element) {
		if (count >= myArray.length) {
			double[] temp = myArray;
			myArray = new double[myArray.length * 2 + 1];
			for (int i = 0; i < temp.length; i++) {
				myArray[i] = temp[i];
			}
			myArray[count] = element;
			count++;
		} else {
			myArray[count] = element;
			count++;
		}
	}

	public void addElements(double[] elements) {
		for (int i = 0; i < elements.length; i++) {
			addElement(elements[i]);
		}
	}

	public int size() {
		return count;
	}

	public int totalSize() {
		return myArray.length;
	}

	public void removeQuick(int offset) throws IndexOutOfBoundsException {
		if (count == 0) {
			throw new IndexOutOfBoundsException();
		}
		if (offset >= count) {
			throw new IndexOutOfBoundsException();
		}
		myArray[offset] = myArray[count - 1];
		count--;
		if (count <= myArray.length / 3) {
			double[] temp = new double[totalSize() / 2];
			for (int i = 0; i < temp.length; i++) {
				temp[i] = myArray[i];
			}
			myArray = temp;
		}
	}

	public void removeSlow(int offset) throws IndexOutOfBoundsException {
		if (count == 0) {
			throw new IndexOutOfBoundsException();
		}
		if (offset >= count) {
			throw new IndexOutOfBoundsException();
		}
		for (int i = offset; i < count - 1; i++) {
			myArray[i] = myArray[i + 1];
		}
		count--;
		if (count <= myArray.length / 3) {
			double[] tmp = new double[myArray.length / 2];
			for (int i = 0; i < count; i++) {
				tmp[i] = myArray[i];
			}
			myArray = tmp;
		}
	}

	public String toString() {
		String s = size() + "\t[ ";
		for (int i = 0; i < count; i++) {
			s += myArray[i] + " ";
		}
		s += "]\n" + totalSize() + "\t[ ";
		for (int i = 0; i < myArray.length; i++) {
			s += myArray[i] + " ";
		}
		s += "]";
		return s;
	}
}
