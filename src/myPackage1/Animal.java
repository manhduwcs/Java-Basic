package myPackage1;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
	super();
	this.name = name;
	this.age = age;
    }

    public void makeSound() {
	System.out.println("This animal is making sound");
    }

}
