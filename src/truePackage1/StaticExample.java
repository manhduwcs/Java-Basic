package truePackage1;

public class StaticExample {
	static int num1 = 10;
	int num2 = 14;

	public static void main(String[] args) {
		StaticExample st1 = new StaticExample();
		StaticExample st2 = new StaticExample();

		System.out.println("Normal :");
		st1.num2++;
		System.out.println("normal = " + st1.num2);
		st2.num2--;
		System.out.println("normal = " + st2.num2);

		System.out.println();
		System.out.println("Static");
		st1.num1++;
		System.out.println("normal = " + st1.num1);
		st2.num1--;
		System.out.println("normal = " + st2.num1);
	}
}
