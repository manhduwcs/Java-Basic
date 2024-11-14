package myCompany;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int option = 0;
	EmployeeManagement company = new EmployeeManagement();

	while (option != 9) {
	    try {
		System.out.println("---------------------------------------");
		System.out.println("Employee Management Menu - ");
		System.out.println("1. Add new Employee   2. Show All Employees");
		System.out.println("3. Check details of a Specific Employee");
		System.out.println("4. Delete an Employee ");
		System.out.println("9. Exit Program");
		System.out.print("Your option = ");
		option = sc.nextInt();
		sc.nextLine();
		System.out.println("---------------------------------------");

		if (option == 1) {
		    try {
			System.out.println("---------------------------------------");
			System.out.println("1. Add new Employee --");
			System.out.println();
			System.out.print("Enter Employee's Position : ");
			String position = sc.nextLine();
			System.out.print("Employee ID = ");
			int employeeID = sc.nextInt();
			sc.nextLine();
			System.out.print("Name = ");
			String name = sc.nextLine();
			System.out.print("Salary = ");
			double salary = sc.nextDouble();
			sc.nextLine();
			System.out.print("Employee Age = ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("Employee's Hours Worked = ");
			int hours = sc.nextInt();
			sc.nextLine();

			if (position.equals("Manager")) {
			    Manager m = new Manager(employeeID, name, salary, age, hours);
			    company.addEmployee(m);
			}

			System.out.println("---------------------------------------");
		    } catch (Exception e) {
			System.out.println("Error : Wrong input data. Try again !");
			System.out.println("---------------------------------------");
		    }
		}
		if (option == 2) {
		    System.out.println("---------------------------------------");
		    System.out.println("2. Show all Employee --");
		    System.out.println();
		    company.showEmployeeList();
		    System.out.println("---------------------------------------");
		}
		if (option == 3) {
		    try {
			System.out.println("---------------------------------------");
			System.out.println("3. Check details of a Specific Employee --");
			System.out.println();
			System.out.print("Enter Employee ID you want to check : ");
			int employeeID = sc.nextInt();
			Employee e = company.getEmployeeByID(employeeID);
			e.showEmployeeInfor();
			System.out.println("---------------------------------------");
		    } catch (Exception e) {
			System.out.println("Error : Wrong input data. Try again !");
			System.out.println("---------------------------------------");
		    }
		}
		if (option == 4) {
		    try {
			System.out.println("---------------------------------------");
			System.out.println("4. Delete an Employee --");
			System.out.print("Enter Employee's ID you want to delete : ");
			int employeeID = sc.nextInt();
			company.deleteEmployee(employeeID);
			System.out.println("---------------------------------------");
		    } catch (Exception e) {
			System.out.println("Error : Wrong input data. Try again !");
			System.out.println("---------------------------------------");
		    }
		}
		if (option == 9) {
		    System.out.println("---------------------------------------");
		    System.out.println("Exit Program --");
		    System.out.println("See you again > o_o <");
		}
	    } catch (Exception e) {
		System.out.println("Error : Wrong input data. Try again !");

		System.out.println("---------------------------------------");
	    }
	}
    }
}
