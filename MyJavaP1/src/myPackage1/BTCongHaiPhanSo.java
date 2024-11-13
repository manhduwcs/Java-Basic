package myPackage1;

import java.util.Scanner;

public class BTCongHaiPhanSo {
	public static void main(String[] args) {
		float x, y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Float x = ");
		x = sc.nextFloat();
		System.out.print("Float y = ");
		y = sc.nextFloat();
		System.out.println("-----------");
		System.out.println("Result = " + (x + y));
	}
}
