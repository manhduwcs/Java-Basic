package truePackage1;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void showSomething() {
        System.out.println("This is something !");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("-- Person : " + this.name + " --");
        System.out.println("Name : " + this.name);
        System.out.println("Age = " + this.age);
        System.out.println("Address = " + this.address);
        System.out.println("-------------------------");
    }

    public void setInfo(String name, int age, String address) {
        System.out.println("-- Set Person : " + this.name + " --");
        this.name = name;
        this.age = age;
        this.address = address;
        displayInfo();
    }

}
