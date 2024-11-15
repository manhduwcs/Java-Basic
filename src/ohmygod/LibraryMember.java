package ohmygod;

import java.util.ArrayList;

public class LibraryMember {
    private String memberName;
    private ArrayList<LibraryItem> borrowedItems;

    public LibraryMember(String memberName) {
	this.memberName = memberName;
	borrowedItems = new ArrayList<>();
    }

    public String getMemberName() {
	return this.memberName;
    }

    public ArrayList<LibraryItem> getBorrowedItems() {
	return this.borrowedItems;
    }

    public void showBorrowedItems() {
	if (borrowedItems == null) {
	    System.out.println("Thanh vien " + this.memberName + " chua muon cuon sach nao.");
	    return;
	}
	System.out.println("-----------------------------------------------");
	System.out.println("Danh sach sach da muon cua thanh vien " + this.memberName);
	for (LibraryItem item : borrowedItems) {
	    if (item instanceof Book) {
		Book book = (Book) item;
		System.out.println("\tTen sach : " + book.getTitle());
		System.out.println("\tTac gia : " + book.getAuthor());
		System.out.println("\tTrang thai : Da muon");
		System.out.println("_______________________________");
	    }
	}
	System.out.println("-----------------------------------------------");
    }

    public void borrowItem(LibraryItem item) {
	if (item.isAvailable() == true) {
	    item.borrowItem();
	    borrowedItems.add(item);
	}
    }

    public void returnItem(LibraryItem item) {
	if (item.isAvailable() == false) {
	    item.returnItem();
	    borrowedItems.remove(item);
	}
    }
}
