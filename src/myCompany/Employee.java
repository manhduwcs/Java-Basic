package myCompany;

public class Employee extends Person {
    private int employeeID;
    private String position;
    private double salary;
    private int hoursWorked;
    private double tax;
    private double rate;

    public Employee(int employeeID, String position, String name, double salary, int age, int hoursWorked) {
	super(name, age);
	this.employeeID = employeeID;
	this.position = position;
	this.hoursWorked = hoursWorked;
	this.salary = salary;
    }

    // Tax : salary < 1000USD : 3% ; salary >= 1000USD : 5% ; >= 2000USD : 7%; >=
    // 3000USD : 10%
    // rate - hrs : 1 - <100hr | 1.05 - >=100hr | 1.1 - >=200hr | 1.25 - >=300hr
    public void showEmployeeInfor() {
	System.out.println("---Employee " + getName() + " information---");
	System.out.println("Name : " + getName());
	System.out.println("Age : " + getAge());
	System.out.println("Default : " + this.salary);
	System.out.println("Hours worked = " + this.hoursWorked);
	System.out.println("Tax = " + getSalaryTax() + "%");
	System.out.println("Salary Rate = " + getSalaryRate());
	System.out.println("Real Salary : ");
	System.out.println("\tGross Salary = " + calculateGrossSalary());
	System.out.println("\tNet Salary = " + calculateNetSalary());

	System.out.println("______________________________________________");
    }

    public double calculateGrossSalary() {
	return salary * getSalaryRate();
    }

    public double calculateNetSalary() {
	return calculateGrossSalary() - (salary * (getSalaryTax() / 100));
    }

    public double getSalaryRate() {
	if (this.hoursWorked >= 300) {
	    rate = 1.25;
	    return rate;
	} else if (this.hoursWorked >= 200) {
	    rate = 1.1;
	    return rate;
	} else if (this.hoursWorked >= 100) {
	    rate = 1.04;
	    return rate;
	} else if (this.hoursWorked < 100) {
	    rate = 1;
	    return rate;
	}
	return 0;
    }

    public double getSalaryTax() {
	if (salary >= 3000) {
	    this.tax = 10;
	    return tax;
	} else if (salary >= 2000) {
	    this.tax = 7;
	    return tax;
	} else if (salary >= 1000) {
	    this.tax = 5;
	    return tax;
	} else if (salary < 1000) {
	    this.tax = 3;
	    return tax;
	}
	return 0;
    }

    public int getEmployeeID() {
	return this.employeeID;
    }

    public void setEmployeeID(int employeeID) {
	this.employeeID = employeeID;
    }

    public String getPosition() {
	return this.position;
    }

    public void setPosition(String position) {
	this.position = position;
    }

    public double getSalary() {
	return salary;
    }

    public void setSalary(double salary) {
	this.salary = salary;
    }

    public int getHoursWorked() {
	return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
	this.hoursWorked = hoursWorked;
    }

}
