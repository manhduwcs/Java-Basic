package ohbabe;

public class LibraryMember {
    private String memberName;
    private Book borrowedBook;

    public LibraryMember(String memberName) {
	this.memberName = memberName;
	this.borrowedBook = null;
    }

    public LibraryMember(String memberName, Book borrowedBook) {
	super();
	this.memberName = memberName;
	if (borrowedBook == null) {
	    this.borrowedBook = null;
	} else {
	    this.borrowedBook = borrowedBook;
	}
    }

    public String getMemberName() {
	return this.memberName;
    }

    public Book getMemberBorrowedBook() {
	return this.borrowedBook;
    }

    public boolean isMemberBorrowedBook() {
	if (this.borrowedBook != null) {
	    return true;
	} else
	    return false;
    }

    public void borrowBook(Book book) {
	if (book.isAvailable() == false) {
	    System.out.println("Sach " + book.getTitle() + " khong co san, hien tai khong the cho muon !");
	} else if (isMemberBorrowedBook() == true) {
	    System.out.println(
		    "Ban " + getMemberName() + " truoc day da muon 1 cuon sach, hien tai khong the muon sach tiep !");
	} else {
	    this.borrowedBook = book;
	    book.borrow();
	    System.out.println("Ban " + getMemberName() + " da muon sach " + book.getTitle() + ".");

	}
    }

    public void returnBook(Book book) {
	book.returnBook();
	this.borrowedBook = null;
	System.out.println("Thanh vien " + this.memberName + " hien dang khong muon cuon sach nao !");
    }
}
