package ba.bitcamp.classes.day3;

public class NumberUtils {

	public static int getMax(int[] numbers)	throws UnsupportedOperationException {
		if (numbers != null && numbers.length > 0) {
			int max = numbers[0];
			for (int i = 0; i < numbers.length; i++) {
				if (max < numbers[i]) {
					max = numbers[i];
				}
			}
			return max;
		}
		throw new UnsupportedOperationException("Array is empty");
	}
	
	public static Number getMax(Number[] numbers) throws UnsupportedOperationException {
		if (numbers != null && numbers.length > 0) {
			Number max = numbers[0];
			for (int i = 0; i < numbers.length; i++) {
				if (max.doubleValue() < numbers[i].doubleValue()) {
					max = numbers[i];
				}
			}
			return max;
		}
		throw new UnsupportedOperationException();
	}
	
	

	public static void main(String[] args) {

		int[] array = { 1, 2, 8, 55, 4 };
		Integer[] array2 = { 1, 2, 8, 55, 4 };
		Double[] array3 = { 1.1, 2.2, 8.8, 55.0, 4.4 };
		Number[] array4 = { 1, 2L, 8.0, 55L, 55.0, 4 };
		
		System.out.println(getMax(array));
		System.out.println(getMax(array2));
		System.out.println(getMax(array3));
		System.out.println(getMax(array4));

	}

}
