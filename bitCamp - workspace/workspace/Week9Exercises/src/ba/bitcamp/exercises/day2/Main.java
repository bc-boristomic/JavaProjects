package ba.bitcamp.exercises.day2;

public class Main {
	
	public static void main(String[] args) {
		
		StackOfStrings stack = new StackOfStrings();
		
		System.out.println(stack.empty());
		System.out.println(stack.push("a"));
		System.out.println(stack.empty());
		System.out.println(stack.push("b"));
		System.out.println(stack.push("c"));
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		
		System.out.println();
		
		//***************************************************************
		
		StackOfLinkedStrings stack2 = new StackOfLinkedStrings();
		
		//System.out.println(stack2); // Exception since it's empty
		System.out.println(stack2.empty());
		System.out.println(stack2.push("a"));
		System.out.println(stack2.empty());
		System.out.println(stack2.push("b"));
		System.out.println(stack2.push("c"));
		System.out.println(stack2.toString());
		System.out.println(stack2.pop());
		System.out.println(stack2);

		
	}

}
