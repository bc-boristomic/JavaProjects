package ba.bitcamp.homeworkclasses17.task2;

public class DynamicString {

	private String myArray[];
	private int count;

	public DynamicString() {
		this(8);
	}

	public DynamicString(int n) {
		this(n, "default");
	}

	public DynamicString(int n, String value) {
		super();
		this.count = n;
		this.myArray = new String[n];
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

	public String[] getMyArray() {
		return myArray;
	}

	public void setMyArray(String[] myArray) {
		this.myArray = myArray;
	}

	public void addElement(String element) {
		if (count >= myArray.length) {
			String[] temp = myArray;
			myArray = new String[myArray.length * 2 + 1];
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

	public void addElements(String[] elements) {
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
			String[] temp = new String[totalSize() / 2];
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
			String[] tmp = new String[myArray.length / 2];
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
