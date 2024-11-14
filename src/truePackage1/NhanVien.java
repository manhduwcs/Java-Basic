package truePackage1;

public class NhanVien {
	private String name;
	private int age;
	private String address;
	private double salary;
	private int hours;

	public NhanVien(String name, int age, String address, double salary, int hours) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.salary = salary;
		this.hours = hours;
	}

	public void inputInfo(String name, int age, String address, double salary, int hours) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.salary = salary;
		this.hours = hours;
	}

	public void printInfo() {
		System.out.println("Employee Information :");
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
		System.out.println("Address : " + this.address);
		System.out.printf("Salary : %.0f\n", this.salary);
		System.out.println("Hours worked : " + this.hours);
		System.out.println("-------------------------");
	}

	public int getHours() {
		return hours;
	}

	public double getSalary() {
		return salary;
	}

	public double tinhThuong() {
		hours = getHours();
		salary = getSalary();

		if (hours >= 200) {
			return salary * 0.2;
		} else if (hours < 200 && hours >= 100) {
			return salary * 0.1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("Nguyen Hoang Long", 25, "19 Nguyen Trai", 71200000, 150);
		NhanVien nv2 = new NhanVien("Hoang Viet Hung", 30, "198 Ngo Cho", 10300050, 240);

		nv1.printInfo();
		nv1.inputInfo("Nguyen Viet Long", 24, "17 Nguyen Trai", 7320000, 140);
		nv1.printInfo();

		nv2.printInfo();
		nv2.inputInfo("Hoang Minh Long", 30, "92 Kham Thien", 12250050, 280);
		nv2.printInfo();
		System.out.println("Tien thuong nv1 = " + nv1.tinhThuong());
		System.out.println("Tien thuong nv2 = " + nv2.tinhThuong());

	}

}
