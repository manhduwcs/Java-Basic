package truePackage1;

import myPackage1.Dog;

public class MainClass {
    public static void main(String[] args) {
	Dog dog1 = new Dog("Barky", 10, 14);
	dog1.showNumberBitten();
	dog1.getName();
    }
}
