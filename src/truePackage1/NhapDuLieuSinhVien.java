package truePackage1;

import java.util.Scanner;

public class NhapDuLieuSinhVien {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input_name;
		String result = "";
		System.out.print("Student Name = ");
		input_name = sc.nextLine();

		input_name = input_name.trim();
		char[] name = input_name.toCharArray();

		if (input_name.isEmpty()) {
			System.out.println("Error: name must not be empty");
		} else {
			for (int i = 0; i < name.length; i++) {
				if (name[i] != ' ') {
					name[i] = Character.toUpperCase(name[i]);
					int count = i;
					for (int j = i + 1; j < name.length; j++) {
						if (name[j] == ' ') {
							break;
						} else {
							name[j] = Character.toLowerCase(name[j]);
							count++;
						}
					}
					String subStr = "";
					for (int x = i; x <= count; x++) {
						subStr += name[x];
					}

					result += subStr + " ";
					i = count;
				}
			}
		}
		result = result.trim();
		System.out.println("Name = " + result);
	}
}
