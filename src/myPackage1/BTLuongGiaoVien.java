package myPackage1;

import java.util.Scanner;

public class BTLuongGiaoVien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double k;
		int luong;
		String chuc_vi;
		System.out.println("Nhap chuc vi cua Giao vien :");
		System.out.println("THS - Thac si, TS - Tien si, GS - Giao su");
		System.out.print("= ");
		chuc_vi = sc.nextLine();
		chuc_vi = chuc_vi.toUpperCase();

		System.out.print("Nhap so tiet Giao vien da day: ");
		n = sc.nextInt();

		switch (chuc_vi) {
		case "THS": {
			k = 2.3;
			chuc_vi = "THS";
			break;
		}
		case "TS": {
			k = 2.5;
			chuc_vi = "TS";
			break;
		}
		case "GS": {
			k = 3;
			chuc_vi = "GS";
			break;
		}
		default:
			throw new IllegalArgumentException("Nhap sai gia tri chuc_vi : " + chuc_vi);
		}

		if (n <= 0) {
			System.out.println("Nhap sai gia tri so tiet day : " + n);
			return;
		} else {
			if (n <= 250) {
				luong = (int) (50000 * n * k);
			} else if (n > 250 && n <= 350) {
				luong = (int) ((50000 * n * k) + 500000);
			} else {
				luong = (int) ((50000 * 350 * k) + ((n - 350) * 100000));
			}
		}

		System.out.println("----------------------------");
		System.out.println("N = " + n);
		System.out.println(
				"Chuc vi cua Giao vien : " + (chuc_vi == "THS" ? "Thac Si" : chuc_vi == "TS" ? "Tien Si" : "Giao Su"));
		System.out.println("Luong cua Giao vien : " + luong + " Dollar");
	}
}
