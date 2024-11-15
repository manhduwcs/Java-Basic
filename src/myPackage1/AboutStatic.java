package myPackage1;

public class AboutStatic {
    private String job;
    private double salary;

    public AboutStatic(String job, double salary) {
	super();
	this.job = job;
	this.salary = salary;
    }

    public AboutStatic() {
	this.job = "?";
	this.salary = 0;
    }

    static String name;
    static int age;
    static {
	name = "Johnson Baby";
	age = 23;
	System.out.println("Executed first in static block : ");
	System.out.println("Name : " + name);
	System.out.println("Age : " + age);
    }

    static void changeName(String newName) {
	name = newName;
    }

    public String getJob() {
	return this.job;
    }

    public void setName(String newName) {
	name = newName;
    }

    public String getName() {
	return name;
    }

    public int getAge() {
	return age;
    }
}
