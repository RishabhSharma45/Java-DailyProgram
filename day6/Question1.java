package day6;

import java.util.ArrayList;

class Book{
	private int bookId;
	private String bookName;
	private String authorName;
	
	public Book(int bookId, String bookName, String authorName) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + "]";
	}
	
	
	
	
}

public class Question1 {
	
	/*
	 * 1. Create a Book class with bookId, bookName and authorName.
	 * Create parameterized constructor to initialize the object. 
	 * Create an ArrayList of type Book and store all book objects into collections and display all book details. 
	 * [Hint:Use advanced for loop to display all Books details]
	 */

	public static void main(String[] args) {
		ArrayList<Book> book = new ArrayList<>();
		Book book1 = new Book(1,"abc" , "xyz");
		Book book2 = new Book(2,"uvw" , "efg");
		Book book3 = new Book(3,"hij" , "rst");
		book.add(book1);
		book.add(book2);
		book.add(book3);
		
		for(Book b1 : book) {
			System.out.println(b1);
		}
		

	}

}
