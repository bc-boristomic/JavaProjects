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
	
	//Dodati knjigu
	//Prodati knjigu (samo ako je getInSale true)

	/**
	 * Prints all the books in bookstore.
	 */
	public String toString(){
		return "Books in bookstore" + Arrays.toString(books);
	}
	
	/**
	 * Returns names of all books from inputed author.
	 * 
	 * @param author Object author
	 * @return <code>String</code> type names of books
	 */
	public String getAllBooksFromOneAuthor(Author author) {
		String s = "";
		for (int i = 0; i < books.length; i++) {
			if (books[i].getAuthor().equals(author)) {
				s += books[i].getName() + ", ";
			}
		}
		return s;
	}
	

	
	
	
	
	


}
