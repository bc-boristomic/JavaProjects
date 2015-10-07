package ba.bitcamp.day1;

import java.util.HashSet;

public class GenericsInhericatnceTest {
	
	public static void main(String[] args) {
			
		GenericsQueueInheritance<Integer> list = new GenericsQueueInheritance<Integer>();
		GenericsQueueInheritance<Integer> list2 = new GenericsQueueInheritance<Integer>();
	
		HashSet<Integer> ints = new HashSet<>();
		ints.add(2);
		ints.add(8);
		ints.add(6);
		
		list.enqueueAllSameType(ints); // adds a hash list from above, works with any list and type
		System.out.println(list);
		
		System.out.println(list2.size());
		System.out.println(list2);
		list.dequeueTo(list2);
		System.out.println(list2.size());
		System.out.println(list2);
		System.out.println(list);
		
		GenericsQueueInheritance<Number> numbers = new GenericsQueueInheritance<Number>();
		numbers.enqueue(10);
		numbers.enqueue(15L);
		numbers.enqueue(2.2);
		System.out.println("Any number in list " + numbers);
		
		GenericsQueueInheritance<String> strings = new GenericsQueueInheritance<>();
		strings.enqueue("V");
		System.out.println(strings);
		
		numbers.enueueAll(ints); // ints are HashSet type but are accepted in GenericsStringQueueInheritance collection because of generics method enqueueAll
		System.out.println(numbers);
	}

}
