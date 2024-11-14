package truePackage1;

public class Student {
	private String maSV;
	private double diemtb;
	private int tuoi;
	private String lop;

	public Student(String maSV, double diemtb, int tuoi, String lop) {
		maSV.trim();
		lop.trim();
		if (maSV.length() == 8) {
			this.maSV = maSV;
		} else {
			this.maSV = "[ Ma SV khong hop le ]";
		}
		if (diemtb <= 10.0 && diemtb >= 0.0) {
			this.diemtb = diemtb;
		} else {
			this.diemtb = 0;
		}
		if (tuoi >= 18) {
			this.tuoi = tuoi;
		} else {
			this.tuoi = 18;
		}
		if (lop.charAt(0) == 'A' || lop.charAt(0) == 'C') {
			this.lop = lop;
		} else {
			this.lop = "[ Lop khong hop le ]";
		}
	}

	public void inputInfo(String maSV, double diemtb, int tuoi, String lop) {
		maSV.trim();
		lop.trim();
		if (maSV.length() == 8) {
			this.maSV = maSV;
		} else {
			this.maSV = "[ Ma SV khong hop le ]";
		}
		if (diemtb <= 10.0 && diemtb >= 0.0) {
			this.diemtb = diemtb;
		} else {
			this.diemtb = 0;
		}
		if (tuoi >= 18) {
			this.tuoi = tuoi;
		} else {
			this.tuoi = 18;
		}
		if (lop.charAt(0) == 'A' || lop.charAt(0) == 'C') {
			this.lop = lop;
		} else {
			this.lop = "[ Lop khong hop le ]";
		}
	}

	public void showInfo() {
		System.out.println("Sinh vien ma so : " + this.maSV);
		System.out.println("Diem Trung Binh = " + this.diemtb);
		System.out.println("Tuoi : " + this.tuoi);
		System.out.println("Lop hoc : " + this.lop);
		System.out.println("------------------------");
	}

	public double getDiemtb() {
		return this.diemtb;
	}

	public boolean hocBong() {
		diemtb = getDiemtb();
		if (diemtb >= 8.0) {
			return true;
		}
		return false;
	}

	public void ktrHocBong() {
		if (hocBong() == false) {
			System.out.println("Diem hoc sinh la : " + getDiemtb() + ", khong duoc hoc bong");
		} else {
			System.out.println("Diem hoc sinh la : " + getDiemtb() + ", du dieu kien nhan hoc bong");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		Student std1 = new Student("2480938", 6.7, 20, "A12");
		Student std2 = new Student("A8098FG9", 6.8, 17, "C18");

		std1.showInfo();
		std1.inputInfo("A112233B", 9.2, 20, "A23");
		std1.showInfo();
		std1.ktrHocBong();

		std2.showInfo();
		std2.ktrHocBong();

	}

}
