package ba.bitcamp.day1;

public class Main {
	
	public static void main(String[] args) {
		
		StringQueue strQ = new StringQueue();
		
		strQ.enqueue("A");
		strQ.enqueue("B");
		strQ.enqueue("C");
		
		System.out.println(strQ);
		System.out.println(strQ.size());
		strQ.dequeue();
		System.out.println(strQ);
	}

}
