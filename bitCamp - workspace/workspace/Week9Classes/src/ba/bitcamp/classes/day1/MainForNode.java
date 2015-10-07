package ba.bitcamp.classes.day1;

import java.util.Scanner;

public class MainForNode {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Node head = null;
		Node last = null;
		int sum = 0;
		
		System.out.println("Enter positive number");
		
		while (true) {
			int n = in.nextInt();
			if (n > 0) {
				Node newNode = new Node(n);
				sum += n;
				if (head == null && last == null) {
					head = newNode;
					last = newNode;
				} else {
					last.setNext(newNode);
				}
			} else {
				break;
			}
		}
		
		int length = 0;
		Node currentNode = head;
		int sum2 = 0;
		while (currentNode != null) {
			length += 1;
			sum2 += currentNode.getValue();
			currentNode = currentNode.getNext();
		}
		
		System.out.printf("You entered %d positive numbers, \n sum is %d, %d", length, sum, sum2);
			
		in.close();
	}

}
