package ba.bitcamp.homeworkclasses12.task4;

import java.util.Arrays;

import ba.bitcamp.homeworkclasses12.task2.Author;
import ba.bitcamp.homeworkclasses12.task3.Book;

public class Bookstore {
	
	/*
	 * Napisati Klasu Knjizara koja ima podatke o imenu knjizare I knjigama koje su u

prodaji. Napisati I testni program koji napravi novu knjizaru, doda u knjizaru

odredeni broj knjiga a zatim simulira da dodajemo nove knjige I da se knjige

prodaju. Omoguciti da se ispisu knjige. I da se ispisu sve knjige od odredenog

autora.
	 */
	
	private String name;
	private Boolean inSale;
	Book[] books;
	
	public Bookstore(String name, Book[] books) {
		this.name = name;
		this.books = books;
		this.inSale = getInSale(); 
		
	}
	
	public Boolean getInSale() {
		for (int i = 0; i < books.length; i++) {
			if (books[i].getCondition() > Book.NO_BOOK) {
				return true;
			}
		}
		return false;
	}
	
	public Book[] buyBook(Book[] books) {
		Book[] bought = new Book [books.length + this.books.length];
		for (int i = 0; i < bought.length; i++) {
			if(bought[i] == null) {
				bought[i] = this.books[i];
			} else if (bought[i] == null) {
				bought[i] = books[i];
			}
		}
		return bought;
	}

	
	public String toString(){
		return "Books in bookstore" + books;
	}
	
	public String getBooksFromOneAuthor(Author author) {
		String s = "";
		for (int i = 0; i < books.length; i++) {
			//if (books[i].getAuthor().equals(author)) {
				
				return books[i].getAuthor().equals(author) + toString();
				
			
		}
		return "No books from that author";
	}

}
