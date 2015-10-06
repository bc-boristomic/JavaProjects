package ba.bitcamp.homeworkweekend8.task2;

public class Main {
	
	public static void main(String[] args) {
		
		UniqueStackInt ints = new UniqueStackInt();
		
		ints.push(7);
		ints.push(5);
		ints.push(4);
		//ints.push(5); // Uncomment to see that you can't add same element 
		ints.push(6);
		
		System.out.println(ints);
		
		//ints.pop(); // Uncomment to see that elements are pushed increasingly
		
		System.out.println(ints);
		
		System.out.println(ints.isIncreasing());
	}

}
