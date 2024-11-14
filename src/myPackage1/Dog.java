package myPackage1;

public class Dog extends Animal {
    protected int number_bitten;

    public Dog(String name, int age, int number_bitten) {
	super(name, age);
	this.number_bitten = number_bitten;
    }

    public void makeSound() {
	System.out.println("Dog is Barking");
    }

    public int getNumberBitten() {
	return this.number_bitten;
    }

    public String getName() {
	return name;
    }

    public void showNumberBitten() {
	int number_bitten_1 = getNumberBitten();
	String name1 = getName();
	System.out.println("This Dog named " + name1 + " has bitten " + number_bitten_1 + " people. Awesome !");
    }

}
