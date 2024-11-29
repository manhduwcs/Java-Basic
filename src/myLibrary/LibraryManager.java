package myLibrary;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    protected ArrayList<Book> books;
    protected List<Double> prices;

    public LibraryManager() {
	books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
	books.add(book);
	prices.add(book.getBookPrice());
    }

    public void sortBookByPriceMin() {

    }

    public Book updateBookById(int id) {
	for (Book b : books) {
	    if (b.getID() == id) {
		return b;
	    }
	}
	return null;
    }

    public void deleteBookById(int id) {
	for (Book b : books) {
	    if (b.getID() == id) {
		books.remove(b);
	    }
	}
    }

    public Book searchBookByName(String name) {
	for (Book b : books) {
	    if (b.getBookName().equals(name)) {
		return b;
	    }
	}
	return null;
    }

    public void displayBook(Book book) {
	int sciCount = 0;
	int ecoCount = 0;
	System.out.println();
	System.out.println("All Science Book in the Library : ");
	for (Book b : books) {
	    if (b instanceof ScienceBook) {
		ScienceBook scienceBook = (ScienceBook) b;
		sciCount++;
		System.out.println("-----------------------------------");
		System.out.println("Book type : " + scienceBook.bookType);
		System.out.println("Book name : " + scienceBook.bookName);
		System.out.println("Author : " + scienceBook.author);
		System.out.println("Year of Publication : " + scienceBook.yearOfPublication);
		System.out.println("Price : " + scienceBook.bookPrice + " USD");
		System.out.println("-----------------------------------");
	    }
	}
	if (sciCount == 0) {
	    System.out.println("This Library has none book of type Science Book. Please add more book !");
	}
	System.out.println();
	System.out.println("All Economic Book in the Library : ");
	for (Book b : books) {
	    if (b instanceof EconomicBook) {
		EconomicBook economicBook = (EconomicBook) b;
		ecoCount++;
		System.out.println("-----------------------------------");
		System.out.println("Book type : " + economicBook.bookType);
		System.out.println("Book name : " + economicBook.bookName);
		System.out.println("Author : " + economicBook.author);
		System.out.println("Year of Publication : " + economicBook.yearOfPublication);
		System.out.println("Price : " + economicBook.bookPrice + " USD");
		System.out.println("-----------------------------------");
	    }
	}
	if (ecoCount == 0) {
	    System.out.println("This Library has none book of type Economic Book. Please add more book !");
	}
    }
}
