package truePackage1;

import java.util.Scanner;

public class SvAptech {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String khoahoc;
		double diemtongket;
		int viphamnoiquy;
		int solanthilai;

		System.out.print("Nhap khoa hoc : ");
		khoahoc = sc.nextLine();
		System.out.print("Diem tong ket = ");
		diemtongket = sc.nextDouble();
		System.out.print("So lan vi pham noi quy ? ");
		viphamnoiquy = sc.nextInt();
		System.out.print("So lan thi lai = ");
		solanthilai = sc.nextInt();

		khoahoc = khoahoc.trim().toUpperCase();
		if (khoahoc == "HDSE" && diemtongket >= 7.5 && viphamnoiquy == 0 && solanthilai == 0) {
			System.out.println("Chuc mung ! Sinh vien se duoc nhan hoc bong");
		} else {
			String err = "";
			String thongbao = "";
			if (khoahoc != "HDSE") {
				err = "Sinh vien khong dang ki khoa HDSE";
				thongbao += err + "; \n";
			}
			if (diemtongket < 7.5) {
				err = "Diem tong ket chua du 7.5";
				thongbao += err + "\n";
			}
			if (viphamnoiquy > 0) {
				err = "Sinh vien da vi pham noi quy";
				thongbao += err + "\n";
			}
			if (solanthilai > 0) {
				err = "Sinh vien da tung thi lai";
				thongbao += err + "\n";
			}
			System.out.println("-------------------------");
			System.out.println("Sinh vien chua du dieu kien nhan hoc bong : \n" + thongbao);
		}
	}
}
