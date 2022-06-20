package classPrograms;

public class BookMain {

	public static void main(String[] args) {

		Book b1 = new Book("J K Rowling", "Harry Potter and the Deathly Hallows", 789);
		System.out.println("Book Name: " + b1.getName());
		System.out.println("Author: " + b1.getAuthor());
		System.out.println("Page Count: " + b1.getPages());

	}

}
