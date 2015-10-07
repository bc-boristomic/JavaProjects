package ba.bitcamp.day1;


public class Main {
	
	public static void main(String[] args) {
		
		
		MyLinkedList<Integer> ints = new MyLinkedList<>();
		ints.add(18);
		ints.add(5);
		ints.add(4);
		ints.add(22);
		ints.add(-8);
		ints.add(6);
		System.out.println(ints);
		
		MyLinkedList<String> strings = new MyLinkedList<String>();
		strings.add("ABC");
		strings.add("BVF");
		
		
		System.out.println(strings);
		
		MyLinkedList<Double> dubs = new MyLinkedList<Double>();
		dubs.add(5.5);
		System.out.println(dubs);
		
		System.out.println(dubs.getFirst());
		System.out.println(strings.getLast());
		System.out.println(ints.indexOf(18));
		System.out.println(ints.contains(-8));
		System.out.println(dubs.contains(1.1));
		
		System.out.println();		
		//**********************************************************
		
		System.out.println("Stack LIFO");
		
		MyStack<Integer> stack = new MyStack<>();
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		
		MyStack<Integer> stack2 = new MyStack<>();
		stack2.push(9);
		stack2.push(18);
		
		stack.addAll(stack2);
		
		
		
	}

}
