package myPackage1;

import java.util.Scanner;

public class CircleCalculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c;

		System.out.println("ax2 + bx + c = 0");
		System.out.print("a = ");
		a = sc.nextDouble();
		System.out.print("b = ");
		b = sc.nextDouble();
		System.out.print("c = ");
		c = sc.nextDouble();

		if (a <= 0) {
			System.out.println("Variable a : " + a + " must be greater or equal to 0");
		} else if (a == 0) {
			double x = -c / b;
			System.out.println("Result : x = " + x);
		} else {
			double delta = Math.pow(b, 2) - (4 * a * c);
			if (delta < 0) {
				System.out.println("This equation has no solution");
			} else if (delta == 0) {
				System.out.println("This equation has one unique solution");
				double x = -b / (2 * a);
				System.out.println("x1 = x2 = " + x);
			} else {
				System.out.println("This equation has two solution");
				double x1 = Math.ceil((-b - Math.sqrt(delta)) / (2 * a));
				double x2 = Math.ceil((-b + Math.sqrt(delta)) / (2 * a));
				System.out.println("Result = ");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}
}
