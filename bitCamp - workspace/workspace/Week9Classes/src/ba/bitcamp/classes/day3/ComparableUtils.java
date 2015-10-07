package ba.bitcamp.classes.day3;

public class ComparableUtils {

	public static Student getMax(Student[] array) throws UnsupportedOperationException {
		if (array != null && array.length > 0) {
			Student max = array[0];
			for (int i = 0; i < array.length; i++) {
				if (max.compareTo(array[i]) < 0) {
					max = array[i];
				}
			}
			return max;
		}
		throw new UnsupportedOperationException();
	}
	
	public static <T extends Comparable<T>> T getMaxComparable(T[] array) throws UnsupportedOperationException {
		if (array != null && array.length > 0) {
			T max = array[0];
			for (int i = 0; i < array.length; i++) {
				if (max.compareTo(array[i]) < 0) {
					max = array[i];
				}
			}
			return max;
		}
		throw new UnsupportedOperationException();
	}

	public static void main(String[] args) {
		
		Student[] students = { new Student("A"), new Student("B"), new Student("C") };
		
		System.out.println(getMax(students));
		System.out.println(getMaxComparable(students));
	}
}
