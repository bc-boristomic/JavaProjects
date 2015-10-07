package ba.bitcamp.day1;

public class QueueTest {
	
	public static void main(String[] args) {
		
		StringQueueComposition sqc = new StringQueueComposition();
		
		sqc.enqueue("A");
		sqc.enqueue("B");
		sqc.enqueue("C");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(sqc.dequeue());
			System.out.println(sqc.size());
		}
		
		System.out.println();
		//*******************************************************
	
		System.out.println("Inheritance");
		StringQueueInheritance sqi = new StringQueueInheritance();
		
		sqi.enqueue("A");
		sqi.enqueue("B");
		sqi.enqueue("C");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(sqi.dequeue());
			System.out.println(sqi.size());
		}
	}

}
