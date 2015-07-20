package ba.bitcamp.homeworkweekend8.task1;

public class Main {
	
	public static void main(String[] args) {
		
		LinkedListBoolean list = new LinkedListBoolean();
		list.add(true);
		list.add(true);
		list.add(false);
		list.add(false);
		list.add(false);
		list.add(false);
		list.add(true);
		
		System.out.println(list);
		
		list.remove(true);
		System.out.println(list);
		
		list.remove(1, false);
		list.remove(true);
		list.remove(false);
		list.remove(false);
		System.out.println(list);
		list.add(true);
		list.add(false);
		list.add(true);
		list.add(false);
				
		System.out.println(list);
		
		System.out.println(list.contains(true));
		
		System.out.println(list.isAlternating());
		
		
		
	}

}
