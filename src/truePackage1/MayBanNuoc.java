package truePackage1;

import java.util.Scanner;

public class MayBanNuoc {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int tien = 0;
	int tong_tien = 0;
	int option = 0;
	char nuocngot = ' ';
	int cafeden = 15000, cafesua = 16000, coca = 11000, fanta = 10000, pepsi = 12000, bohuc = 14000, bia = 18000;

	System.out.println("Hi anh b, day la may ban nuoc ngot -.-");

	while (option != 4) {
	    while (option > 4 || option < 1) {
		System.out.print("1 - Nap tien, 2 - Mua nuoc, 3 - Rut tien thua, 4 - Thoat chuong trinh : ");
		option = sc.nextInt();
	    }

	    if (option == 1) {
		do {
		    System.out.println("Moi ban nap tien vao may ( it nhat 10000d ) --");
		    tien = sc.nextInt();
		    if (tien < 10000) {
			continue;
		    } else {
			tong_tien += tien;
		    }
		} while (tien < 10000);

		System.out.println("So tien hien tai ban co la : " + tong_tien);

		do {
		    System.out.print("1 - Nap tien, 2 - Mua nuoc, 3 - Rut tien thua, 4 - Thoat chuong trinh : ");
		    option = sc.nextInt();
		} while (option > 4 || option < 1);
	    }

	    if (option == 2) {
		System.out.println("Chon loai nuoc ban muon ---");
		System.out.println(
			"A - Cafe den ; B - Cafe sua ; C - Coca ; D - Fanta \nE - Pepsi ; F - Bo huc ; H - Bia");
		System.out.println("Ban muon uong : ");
		nuocngot = sc.next().charAt(0);
		nuocngot = Character.toUpperCase(nuocngot);

		switch (nuocngot) {
		case 'A': {
		    if (tong_tien < cafeden) {
			System.out.println(
				"Cafe den co gia " + cafeden + "d. Hien ban co " + tong_tien + "d. Ban can nap them !");
			break;
		    } else {
			System.out.println("Ban da mua Cafe den. Chuc ngon mieng !");
			tong_tien -= cafeden;
			System.out.println("So tien hien tai cua ban : " + tong_tien);
			break;
		    }
		}
		case 'B': {
		    if (tong_tien < cafesua) {
			System.out.println(
				"Cafe sua co gia " + cafesua + "d. Hien ban co " + tong_tien + "d. Ban can nap them !");
			break;
		    } else {
			System.out.println("Ban da mua Cafe sua. Chuc ngon mieng !");
			tong_tien -= cafesua;
			System.out.println("So tien hien tai cua ban : " + tong_tien);
			break;
		    }

		}
		case 'C': {
		    if (tong_tien < coca) {
			System.out.println(
				"Coca Cola co gia " + coca + "d. Hien ban co " + tong_tien + "d. Ban can nap them !");
			break;
		    } else {
			System.out.println("Ban da mua Coca cola. Chuc ngon mieng !");
			tong_tien -= coca;
			System.out.println("So tien hien tai cua ban : " + tong_tien);
			break;
		    }

		}
		case 'D': {
		    if (tong_tien < fanta) {
			System.out.println(
				"Fanta co gia " + fanta + "d. Hien ban co " + tong_tien + "d. Ban can nap them !");
			break;
		    } else {
			System.out.println("Ban da mua Fanta. Chuc ngon mieng !");
			tong_tien -= fanta;
			System.out.println("So tien hien tai cua ban : " + tong_tien);
			break;
		    }

		}
		case 'E': {
		    if (tong_tien < pepsi) {
			System.out.println(
				"Pepsi co gia " + pepsi + "d. Hien ban co " + tong_tien + "d. Ban can nap them !");
			break;
		    } else {
			System.out.println("Ban da mua Pepsi. Chuc ngon mieng !");
			tong_tien -= pepsi;
			System.out.println("So tien hien tai cua ban : " + tong_tien);
			break;
		    }
		}
		case 'F': {
		    if (tong_tien < bohuc) {
			System.out.println(
				"Bo Huc co gia " + bohuc + "d. Hien ban co " + tong_tien + "d. Ban can nap them !");
			break;
		    } else {
			System.out.println("Ban da mua Bo Huc. Chuc ngon mieng !");
			tong_tien -= bohuc;
			System.out.println("So tien hien tai cua ban : " + tong_tien);
			break;
		    }
		}
		case 'H': {
		    if (tong_tien < bia) {
			System.out
				.println("Bia co gia " + bia + "d. Hien ban co " + tong_tien + "d. Ban can nap them !");
			break;
		    } else {
			System.out.println("Ban da mua Bia. Chuc ngon mieng !");
			tong_tien -= bia;
			System.out.println("So tien hien tai cua ban : " + tong_tien);
			break;
		    }
		}
		default:
		    throw new IllegalArgumentException("Nhap sai loai nuoc anh b ei");
		}

		do {
		    System.out.print("1 - Nap tien, 2 - Mua nuoc, 3 - Rut tien thua, 4 - Thoat chuong trinh : ");
		    option = sc.nextInt();
		} while (option > 4 || option < 1);
	    }

	    if (option == 3) {
		System.out.println("Ban da chon rut tien !");
		System.out.println("So tien se duoc tra lai cho ban la : " + tong_tien + " VND");
		System.out.println("Hen gap ban lan sau");
		tien = 0;
		tong_tien = 0;

		do {
		    System.out.print("1 - Nap tien, 2 - Mua nuoc, 3 - Rut tien thua, 4 - Thoat chuong trinh : ");
		    option = sc.nextInt();
		} while (option > 4 || option < 1);
	    }

	    if (option == 4) {
		System.out.println("Ban chon thoat chuong trinh.");
		System.out.println("Tam biet va hen gap lai --");
	    }
	}
    }
}
