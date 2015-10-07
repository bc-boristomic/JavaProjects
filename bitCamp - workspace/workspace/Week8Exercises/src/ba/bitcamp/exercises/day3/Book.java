package ba.bitcamp.exercises.day3;

public class Book {
	
	private String authorName;
	private String bookName;
	private int publishedYear;
	

	public Book() {
		authorName = "Default Author Name";
		bookName = "Default Book Name";
		publishedYear = 0;
	}
	
	public Book(String authorName) {
		this(authorName, null, 0);
	}
	
	public Book(String authorName, String bookName, int publishedYear) {
		this.authorName = authorName;
		this.bookName = bookName;
		this.publishedYear = publishedYear;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	@Override
	public String toString() {
		return "Book [authorName = " + authorName + ", bookName = " + bookName
				+ ", publishedYear = " + publishedYear + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (publishedYear != other.publishedYear)
			return false;
		return true;
	}
	
	

}
