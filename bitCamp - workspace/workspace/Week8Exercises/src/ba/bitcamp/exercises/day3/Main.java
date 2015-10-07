package ba.bitcamp.exercises.day3;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		Book[] books = new Book[5];
		
		Book book1 = new Book("Author 8");
		Book book2 = new Book("Author 2");
		
		for (int i = 0; i < books.length; i++) {
			books[i] = new Book("Author " + (i+1)); // Creating books
			
			if (book1.equals(books[i])) { // Checking if one of these equals some of created books
				System.out.println("Not Equals");				
			} else if (book2.equals(books[i])) {
				System.out.println("Book2 equals some book in array\n");
			}
		}
	
		for (Book string : books) { // Printing array of books
			System.out.println(string);
		}

		//**********************************************************************************************
		
		System.out.println();
		System.out.println("Arrays List");
		System.out.println();

		ArrayList<Book> bookList = new ArrayList<>();
		
		for (int i = 0; i < 7; i++) {
			bookList.add(i, new Book("Author " + (i+1), "Book " + (i+2), i+2000));
		}
		
		System.out.println("Is book at index 2 same as book at index 2 -> " +  bookList.get(2).equals(bookList.get(2)) + "\n"); // Equals check
		
		for (Book book : bookList) {
			System.out.println(book);
		}
		
		
	}

}
