package myPackage1;

import java.util.Scanner;

public class CountDayInMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year, month;
		int day;
		System.out.println("Month / Year");
		System.out.print("Month = ");
		month = sc.nextInt();
		System.out.print("Year = ");
		year = sc.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: {
			day = 31;
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11: {
			day = 30;
			break;
		}
		case 2: {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				day = 29;
				break;
			} else {
				day = 28;
				break;
			}
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + month);
		}

		System.out.println("Day = " + day);
	}
}
