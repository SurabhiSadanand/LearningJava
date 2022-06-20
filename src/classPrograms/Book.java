package classPrograms;

public class Book {

	String bookAuthor;
	String title;
	int pageCount;

	public Book(String author, String name, int pages) {
		bookAuthor = author;
		title = name;
		pageCount = pages;
	}

	String getAuthor() {
		return bookAuthor;
	}

	String getName() {
		return title;
	}

	int getPages() {
		return pageCount;
	}
}
