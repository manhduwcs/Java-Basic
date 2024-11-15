package myPackage1;

public class Test {
    public static void main(String[] args) {
	AboutStatic aboutStatic = new AboutStatic("Project Manager", 124.99);
	AboutStatic aboutStatic2 = new AboutStatic();
	AboutStatic.name = "Oh Nooo";
	AboutStatic.changeName("Oh My God");
	aboutStatic.setName("Adopt Hitler");
	System.out.println("Name = " + AboutStatic.name + " ; Job : " + aboutStatic.getJob());
	System.out.println("Name = " + aboutStatic2.getName() + " ; Job : " + aboutStatic2.getJob());
    }
}
