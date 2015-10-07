package ba.bitcamp.classes.day2;

public class Main {
	
	public static void main(String[] args) {
		
		LinkedListInt list = new LinkedListInt();
		
		System.out.print(list);
		System.out.println(", " + list.isEmpty());
		
		
		list.addLast(1);
		list.addLast(2);
		list.addLast(9);
		list.addLast(111);
		
		list.addFront(8);

		System.out.println(list);
		
		list.removeFirst();
		
		System.out.println(list);
		
		
	}

}
