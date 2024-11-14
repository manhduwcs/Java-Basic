package truePackage1;

import java.util.ArrayList;
import java.util.Scanner;

public class KiemTraLuanVan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String luan_van = "";
		ArrayList<String> cac_tu = new ArrayList<String>();
		System.out.println("Nhap bai luan van vao day b ei -.-");
		luan_van = sc.nextLine();

		char[] arr = luan_van.toCharArray();

		if (luan_van.isEmpty()) {
			System.out.println("Anh ban khong duoc de trong luan van !");
		} else {
			System.out.println("De toi check cho anh ban nhe =))");
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != ' ') {
					int count = i;
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[j] == ' ') {
							break;
						} else {
							count++;
						}
					}
					String subStr = luan_van.substring(i, count + 1);
					cac_tu.add(subStr);
					i = count;
				}
			}
		}
		System.out.println("-----------------------------");
		System.out.print("Bai luan van cua anh ban la : ");
		for (String tu : cac_tu) {
			System.out.print(tu + " ");
		}

		System.out.println();
		int check_laptu = 0;
		ArrayList<Integer> vi_tri_tulap = new ArrayList<>();
		for (int i = 0; i < cac_tu.size(); i++) {
			int count_socau = 0;
			int count_tulap = 1;
			for (Integer vitri : vi_tri_tulap) {
				if (i == vitri) {
					i++;
					break;
				}
			}
			String tu = cac_tu.get(i);
			for (int j = i + 1; j < cac_tu.size(); j++) {
				if (count_tulap == 3) {
					System.out.println("Tu : " + tu + " bi lap");
					check_laptu++;
					break;
				} else if (count_socau == 3) {
					break;
				} else {
					String tu_check = cac_tu.get(j);
					tu = tu.trim();
					tu_check = tu_check.trim();
					tu = tu.toLowerCase();
					tu_check = tu_check.toLowerCase();

					if (tu_check.charAt(tu_check.length() - 1) == '.') {
						count_socau++;
					}

					if (tu.equals(tu_check)) {
						count_tulap++;
						vi_tri_tulap.add(j);
					}

				}
			}
		}
		System.out.println();
		if (check_laptu == 0) {
			System.out.println("Anh ban viet van gioi vay ? Doan van khong bi lap");
		} else {
			System.out.println("Doan van bi lap tu roi, anh ban hay xem lai *.*");
		}
	}
}
