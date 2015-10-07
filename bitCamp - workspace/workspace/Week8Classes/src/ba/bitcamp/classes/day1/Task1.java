package ba.bitcamp.classes.day1;

public class Task1 {

	/**
	 * 
	 * @param params Can accept as much int types as needed
	 * @return
	 */
	private static int sumParams(int... params){
		int sum = 0;
		for (int i = 0; i < params.length; i++) {
			sum += params[i];
		}
		return sum;
	}
	
	/**
	 * If Object is used input can be any type.
	 * 
	 * @param params
	 * @return
	 */
	private static String getString(Object... params){
		StringBuilder sb = new StringBuilder();
		for (Object string : params) {
			sb.append(string);
		}
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(sumParams(1,2,3,4,5,6));
		System.out.println(sumParams(1,2,3));
		System.out.println(sumParams(new int[]{1,2,3})); // Array can be sent, but it's not necessary
		
		System.out.println(getString("Some", "String"));
		System.out.println(getString(1,2,3,4,5,6,7,8,9));
	}

}
