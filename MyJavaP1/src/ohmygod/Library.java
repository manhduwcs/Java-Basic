package ohmygod;

import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> items;
    private ArrayList<LibraryMember> members;

    public Library() {
	items = new ArrayList<LibraryItem>();
	members = new ArrayList<LibraryMember>();
    }

    public void addItem(LibraryItem item) {
	if (item != null && item instanceof Book) {
	    Book book = (Book) item;
	    items.add(book);
	}
	return;
    }

    public void addMember(LibraryMember member) {
	if (member != null) {
	    members.add(member);
	}
	return;
    }

    public LibraryItem searchItem(String itemName) {
	for (LibraryItem item : items) {
	    if (item.getTitle().equals(itemName)) {
		return item;
	    }
	}
	return null;
    }

    public LibraryItem searchItemWithMemberName(String itemName, String memberName) {
	for (LibraryItem item : searchMember(memberName).getBorrowedItems()) {
	    if (item.getTitle().equals(itemName)) {
		return item;
	    }
	}
	return null;
    }

    public LibraryMember searchMember(String memberName) {
	for (LibraryMember member : members) {
	    if (member.getMemberName().equals(memberName)) {
		return member;
	    }
	}
	return null;
    }

    public void borrowItem(LibraryMember member, LibraryItem item) {
	if (item instanceof Book) {
	    Book book = (Book) item;
	    if (book.isAvailable() == false) {
		System.out.println(
			"Loi : Sach " + book.getTitle() + " da duoc nguoi khac muon, hien tai khong the cho muon.");
	    } else {
		member.borrowItem(book);
		System.out.println(
			"Thanh vien " + member.getMemberName() + " da MUON sach " + book.getTitle() + " thanh cong.");
	    }
	}
    }

    public void returnItem(LibraryMember member, LibraryItem item) {
	if (item instanceof Book) {
	    Book book = (Book) item;
	    if (book.isAvailable() == true) {
		System.out.println("Loi : Sach " + book.getTitle() + " da co san trong thu vien, khong can tra lai.");
	    } else {
		member.returnItem(book);
		System.out.println(
			"Thanh vien " + member.getMemberName() + " da TRA sach " + book.getTitle() + " thanh cong.");
	    }
	}
    }

    public void showAllItems() {
	if (items == null) {
	    System.out.println("Hien tai thu vien sach dang trong ! De nghi them sach moi.");
	    return;
	}
	System.out.println("Danh sach sach trong thu vien : ");
	for (LibraryItem item : items) {
	    if (item instanceof Book) {
		Book book = (Book) item;
		System.out.println("\tTen sach " + book.getTitle());
		System.out.println("\tTac gia : " + book.getAuthor());
		System.out.println("\tTrang thai : " + (book.isAvailable() == true ? "Co san" : "Da duoc muon"));
		System.out.println("_______________________________");
	    }
	}
	return;

    }
}
