package ba.bitcamp.classes.day1.task1;

public class Main {
	
	// We use Compare since we implemented Compare interface
	private static Compare getMax(Compare[] foones) {
		Compare max = foones[0];
		for (int i = 0; i < foones.length; i++) {
			if (max.compare(foones[i]) == -1) {
				max = foones[i];
			}
		}
		return max;
	}
	
	
//	private static Bar getMax(Bar[] names) {
//		Bar max = names[0];
//		for (int i = 0; i < names.length; i++) {
//			if(max.compare(names[i]) == -1) {
//				max = names[i];
//			}
//		}
//		return max;
//	}
	
	
	public static void  main(String[] args) {
		
		
		Foo[] f = {new Foo(7), new Foo(8), new Foo(3)};
		Bar[] b = {new Bar("name1"), new Bar("name12"), new Bar("name123")};
		
		//System.out.println(getMax(f));
		//System.out.println(getMax(b));
		
		System.out.println(getMax(f));
		System.out.println(getMax(b));
		
		
	}
}
