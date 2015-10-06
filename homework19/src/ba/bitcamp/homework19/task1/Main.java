package ba.bitcamp.homework19.task1;

public class Main {

	public static void main(String[] args) {

		LinkedListDouble list = new LinkedListDouble();

		System.out.println(list); // Empty list

		// Adding elements
		list.add(4.4);
		list.add(2.0);
		list.add(1.0);
		list.add(1.2);
		list.add(0.1);
		list.add(1.1);
		list.add(99.2);
		list.add(158.2);
		list.add(338.2);
		System.out.println(list); // List with all added elements

		list.remove(3); // Removed element at specified index
		
		System.out.println(list); // List without removed element 

		System.out.println("Size is " + list.size()); // Size of links


		System.out.println(list.getMiddle()); // Middle element

		System.out.println(list.getFirst()); // First element
		System.out.println(list.getLast()); // Last element

		System.out.println(list.deleteFirst()); // Value of deleted first element
		System.out.println(list.deleteLast()); // Value of deleted last element

		System.out.println(list); // List without first and last element previously deleted
		
		list.add(7.7, 2); // Adding element with specified value at specified index 
		
		System.out.println(list); // List after last add

	}

}
