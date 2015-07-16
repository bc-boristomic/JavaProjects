package ba.bitcamp.homework20.part1;

public class Main {

	public static void main(String[] args) {

		StackOfStrings stack = new StackOfStrings();

		int length = 100000;
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < length; i++) {
			stack.push((i + 2) + "");
		}
		System.out.println("Time needed to input elements " + (System.currentTimeMillis() - start));
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.search("980"));

		System.out.println();

		// ***************************************************************

		StackOfLinkedStrings stack2 = new StackOfLinkedStrings();
		
		long start2 = System.currentTimeMillis();
		for (int i = 0; i < length; i+=2) {
			stack2.push(i + "");
		}
		System.out.println("Time needed to input elements " + (System.currentTimeMillis() - start2));

		System.out.println(stack2.empty());
		System.out.println(stack2.pop());
		System.out.println(stack2.search("980"));
	

	}

}
