package ohbabe;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<LibraryMember> libraryMembers;

    public Library() {
	this.books = new ArrayList<>();
	this.libraryMembers = new ArrayList<>();
    }

    public ArrayList<Book> getBookList() {
	return this.books;
    }

    public ArrayList<LibraryMember> getMemberList() {
	return this.libraryMembers;
    }

    public LibraryMember getSearchMember(String memberName) {
	if (memberName == null) {
	    return null;
	}
	for (LibraryMember libraryMember : libraryMembers) {
	    if (libraryMember.getMemberName().equals(memberName)) {
		return libraryMember;
	    }
	}
	return null;
    }

    public Book getSearchBook(String bookName) {
	for (Book book : books) {
	    if (book.getTitle().equals(bookName)) {
		return book;
	    }
	}
	return null;
    }

    public void showBookList() {
	if (this.books != null) {
	    for (Book book : books) {
		System.out.println("-------------------------");
		System.out.println("Sach : " + book.getTitle());
		System.out.println("Trang thai : " + book.isAvailable());
	    }
	} else {
	    System.out.println("Tu sach hien tai dang khong co sach ! De nghi them sach moi.");
	}
    }

    public void addBook(Book book) {
	if (book == null) {
	    System.out.println("Loi : Sach khong phu hop !");
	} else {
	    books.add(book);
	    System.out.println("Sach " + book.getTitle() + " da duoc them vao thu vien thanh cong !");
	}
    }

    public void addMember(LibraryMember member) {
	if (member == null) {
	    System.out.println("Loi : Thanh vien khong phu hop !");
	} else {
	    libraryMembers.add(member);
	    System.out.println("Thanh vien " + member.getMemberName() + " da duoc them vao thu vien thanh cong !");
	}
    }

    public void borrowBook(Book book, LibraryMember member) {
	member.borrowBook(book);
    }

    public void returnBook(LibraryMember member) {
	member.returnBook(member.getMemberBorrowedBook());
    }

}
