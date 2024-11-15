package ohmygod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int option = 0;
	Library library = new Library();

	while (option != 7) {
	    try {
		System.out.println("Menu :");
		System.out.println("\t1:Them sach.\t2:Them thanh vien.\t3:Muon sach");
		System.out.println("\t4:Tra sach.\t5:Hien thi thu vien sach.");
		System.out.println("\t6:Hien thi sach thanh vien da muon.\t7: Thoat chuong trinh.");
		System.out.print("Lua chon = ");
		option = sc.nextInt();
		sc.nextLine();

		if (option == 1) {
		    try {
			System.out.println("-----------------------------------------------");
			System.out.println("1 - Them sach.");
			System.out.print("Nhap ten sach : ");
			String title = sc.nextLine();
			title = title.trim();
			System.out.print("Nhap ten tac gia : ");
			String author = sc.nextLine();
			author = author.trim();

			Book book = new Book(title, author, true);
			library.addItem(book);
			System.out.println("Sach " + title + " da duoc them vao thu vien thanh cong !");
			System.out.println("-----------------------------------------------");
		    } catch (Exception e) {
			System.out.println("Loi : Du lieu khong hop le. Nhap lai !");
		    }
		}
		if (option == 2) {
		    try {
			System.out.println("-----------------------------------------------");
			System.out.println("2 - Them thanh vien moi.");
			System.out.print("Nhap ten thanh vien : ");
			String memberName = sc.nextLine();
			memberName = memberName.trim();

			LibraryMember member = new LibraryMember(memberName);
			library.addMember(member);
			System.out.println("Thanh vien " + memberName + " da duoc them vao thu vien thanh cong !");
			System.out.println("-----------------------------------------------");
		    } catch (Exception e) {
			System.out.println("Loi : Du lieu khong hop le. Nhap lai !");
		    }
		}
		if (option == 3) {
		    try {
			System.out.println("-----------------------------------------------");
			System.out.println("3 - Muon sach.");
			System.out.print("Nhap ten thanh vien muon sach : ");
			String memberName = sc.nextLine();
			memberName = memberName.trim();
			System.out.print("Nhap sach muon : ");
			String title = sc.nextLine();
			title = title.trim();

			if (library.searchItem(title) != null && library.searchMember(memberName) != null) {
			    library.borrowItem(library.searchMember(memberName), library.searchItem(title));

			} else {
			    System.out.println("Loi : Khong tim thay thanh vien / ten sach. De nghi nhap lai !");
			}
			System.out.println("-----------------------------------------------");
		    } catch (Exception e) {
			System.out.println("Loi : Du lieu khong hop le. Nhap lai !");
		    }
		}
		if (option == 4) {
		    try {
			System.out.println("-----------------------------------------------");
			System.out.println("4 - Tra sach.");
			System.out.print("Nhap ten thanh vien tra sach : ");
			String memberName = sc.nextLine();
			memberName = memberName.trim();
			System.out.print("Nhap sach tra : ");
			String title = sc.nextLine();
			title = title.trim();
			if (library.searchItemWithMemberName(title, memberName) != null
				&& library.searchMember(memberName) != null) {
			    library.returnItem(library.searchMember(memberName),
				    library.searchItemWithMemberName(title, memberName));
			} else {
			    System.out.println("Loi : Khong tim thay thanh vien / ten sach. De nghi nhap lai !");
			}
			System.out.println("-----------------------------------------------");
		    } catch (Exception e) {
			System.out.println("Loi : Du lieu khong hop le. Nhap lai !");
		    }
		}
		if (option == 5) {
		    System.out.println("-----------------------------------------------");
		    System.out.println("5 - Hien thi sach trong thu vien.");
		    library.showAllItems();
		    System.out.println("-----------------------------------------------");
		}
		if (option == 6) {
		    try {
			System.out.println("-----------------------------------------------");
			System.out.println("6 - Hien thi so sach thanh vien muon.");
			System.out.print("Nhap ten thanh vien : ");
			String memberName = sc.nextLine();
			memberName = memberName.trim();
			if (library.searchMember(memberName) != null) {
			    library.searchMember(memberName).showBorrowedItems();
			} else {
			    System.out.println("Loi : Khong tim thay thanh vien. De nghi nhap lai !");
			}
			System.out.println("-----------------------------------------------");
		    } catch (Exception e) {
			System.out.println("Loi : Du lieu khong hop le. Nhap lai !");
		    }
		}
		if (option == 7) {
		    System.out.println("-----------------------------------------------");
		    System.out.println("Thoat chuong trinh. Hen gap lai !");
		    System.out.println("> o_o <");
		    return;
		}
	    } catch (Exception e) {
		System.out.println("Loi : Nhap sai lua chon. Nhap lai !");
		sc.nextLine();
	    }
	}
    }
}
