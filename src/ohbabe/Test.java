package ohbabe;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int option = 0;
	Library myLibrary = new Library();

	while (option != 6 || option < 1 || option > 6) {
	    System.out.println("---------------------------");
	    System.out.println(
		    "Menu --- 1: Them sach | 2: Them thanh vien | 3: Muon sach \n4: Tra sach | 5: Hien thi list sach | 6: Thoat ");
	    System.out.print("Lua chon : ");
	    option = sc.nextInt();
	    sc.nextLine();

	    if (option == 1) {
		String title;
		boolean isAvailable = true;
		System.out.println("Them sach moi. ");
		System.out.print("Tieu de sach : ");
		title = sc.nextLine();
		Book myBook = new Book(title, isAvailable);
		myLibrary.addBook(myBook);

	    }
	    if (option == 2) {
		String memberName;
		System.out.println("Them thanh vien moi.");
		System.out.print("Nhap ten thanh vien moi : ");
		memberName = sc.nextLine();
		LibraryMember myMember = new LibraryMember(memberName);
		myLibrary.addMember(myMember);
	    }
	    if (option == 3) {
		String memberBorrow;
		String bookBorrow;
		System.out.println("Muon sach.");
		System.out.println("Nhap ten thanh vien muon muon sach: ");
		memberBorrow = sc.nextLine();
		System.out.println("Nhap ten sach muon muon : ");
		bookBorrow = sc.nextLine();

		if (myLibrary.getSearchBook(bookBorrow) != null && myLibrary.getSearchMember(memberBorrow) != null) {
		    myLibrary.borrowBook(myLibrary.getSearchBook(bookBorrow), myLibrary.getSearchMember(memberBorrow));
		} else {
		    System.out.println("Thanh vien / Sach khong ton tai !");
		}
	    }
	    if (option == 4) {
		String memberBorrow;
		String bookBorrow;
		System.out.println("Tra sach.");
		System.out.println("Nhap ten thanh vien tra sach: ");
		memberBorrow = sc.nextLine();
		System.out.println("Nhap ten sach tra : ");
		bookBorrow = sc.nextLine();

		if (myLibrary.getSearchBook(bookBorrow) != null && myLibrary.getSearchMember(memberBorrow) != null) {
		    myLibrary.returnBook(myLibrary.getSearchMember(memberBorrow));
		} else {
		    System.out.println("Thanh vien / Sach khong ton tai !");
		}
	    }
	    if (option == 5) {
		System.out.println("Hien thi sach hien co trong thu vien.");
		myLibrary.showBookList();
	    }
	    if (option == 6) {
		continue;
	    }
	}

    }
}
