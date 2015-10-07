package ba.bitcamp.exercises.day2;

public class HomeworkTask {
	
	private static void myStringFormat(String string, Object... obj) {
		int counterChar = 0;
		int index = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '%') {
				counterChar++;
			}
		}
		
		if (counterChar != obj.length) {
			throw new UnsupportedOperationException("");
		}
		String s = "";
		
		for (int i = 0; i < obj.length; i++) {
			s = string.replaceFirst("%b", obj[i].toString());
		}
					
		System.out.println(s);
	}
	
	
	
	public static void main(String[] args) {
		int a = 1;
		double d = 3.5;
		double e = a + d;
		String s = "sum";
		myStringFormat("%b of %b + %b is %b", s, a, d, e);
		
	}

}
