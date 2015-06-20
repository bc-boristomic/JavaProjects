package ba.bitcamp.homeworkclasses12.task4;

import java.util.Arrays;

import ba.bitcamp.homeworkclasses12.task2.Author;
import ba.bitcamp.homeworkclasses12.task3.Book;

public class Main {
	
	public static void main(String[] args) {
		
		Author a1 = new Author("Ivo Andric", "abc@mail.com", "M");
		Author a2 = new Author("Mesa Selimovic", "bcd@mail.com", "M");
		Author a3 = new Author("Miroslav Krleza", "cde@mail.com", "M");
		
		Book b1 = new Book(a1, "Gospodjica", 19.99, Book.TWO_BOOKS);
		Book b2 = new Book(a1, "Prokleta avlija", 22.95, Book.NO_BOOK);
		Book b3 = new Book(a2, "Tvrdjava", 19.95, Book.THREE_BOOKS);
		Book b4 = new Book(a2, "Ostrvo", 12.99, Book.NO_BOOK);
		Book b5 = new Book(a2, "Dervis i smrt", 22.95, Book.THREE_BOOKS);
		
		Book[] b = new Book[] {b1, b2, b3};
		
		Book[] bb = new Book[] {b4, b5};
		
		
		Bookstore bs = new Bookstore("Bookstore", b);
		
		//System.out.println(Arrays.toString(bs.buyBook(bb)));
		
		System.out.println(bs);
		
		System.out.println(bs.getAllBooksFromOneAuthor(a1));
		
	}

}
