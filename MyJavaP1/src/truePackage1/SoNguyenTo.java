package truePackage1;

import java.util.Scanner;

public class SoNguyenTo {
	private int a;

	public SoNguyenTo(int a) {
		if (a == 2) {
			this.a = a;
		} else if (a < 2) {
			this.a = 2;
		} else {
			for (int i = 2; i <= Math.sqrt(a); i++) {
				if (a % i == 0) {
					this.a = 2;
					return;
				}
			}
			this.a = a;
		}
	}

	public int getSoNguyenTo() {
		return this.a;
	}

	public static boolean isSoNguyenTo(int x) {
		if (x == 2) {
			return true;
		} else if (x < 2) {
			return false;
		} else {
			for (int i = 2; i <= Math.ceil(Math.sqrt(x)); i++) {
				if (x % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

	public void luuSoNguyenTo(int x) {
		if (isSoNguyenTo(x) == false) {
			System.out.println("X = " + x + " khong phai la so nguyen to !");
			System.out.println("X khong duoc luu");
		} else {
			System.out.println("X = " + x + " la so nguyen to hop le");
			System.out.println("X = " + x + " da duoc luu tru !");
			this.a = x;
		}
	}

	public int timSoNguyenToTiepTheo() {
		for (int i = this.a + 1; i <= (a * 2); i++) {
			if (i % 2 == 0)
				continue;
			else {
				int count = 0;
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						count++;
						break;
					}
				}
				if (count == 0) {
					return i;
				} else
					continue;
			}
		}
		return this.a;
	}

	public static void main(String[] args) {
		int x = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen to : ");
		x = sc.nextInt();
		while (isSoNguyenTo(x) == false) {
			System.out.println("Nhap so nguyen to : ");
			x = sc.nextInt();
		}
		SoNguyenTo snt = new SoNguyenTo(x);
		System.out.println("So nguyen to hien tai : " + snt.getSoNguyenTo());
		System.out.println("So nguyen to tiep theo : " + snt.timSoNguyenToTiepTheo());
	}

}
