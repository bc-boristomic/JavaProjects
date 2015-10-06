package ba.bitcamp.homework20.part2;

public class Main {
	
	public static void main(String[] args) {
		
		QueueOfDoubles qu = new QueueOfDoubles();
		
		System.out.println(qu);
		System.out.println(qu.add(3.3));
		System.out.println(qu.add(1.1));
		System.out.println(qu.empty());
		System.out.println(qu.peek());
		System.out.println(qu);
		System.out.println(qu.poll());
		System.out.println(qu);
		
		System.out.println();
		
		//******************************************
		
		QueueOfLinkedDoubles qu2 = new QueueOfLinkedDoubles();
		
		System.out.println(qu2);
		System.out.println(qu2.add(5.5));
		System.out.println(qu2.add(8.4));
		System.out.println(qu2.peek());
		System.out.println(qu2);
		System.out.println(qu2.poll());
		System.out.println(qu2);
		
		
	}

}
