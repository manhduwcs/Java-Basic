package myCompany;

import java.util.ArrayList;

public class EmployeeManagement {
    private ArrayList<Employee> employees;

    public EmployeeManagement() {
	employees = new ArrayList<Employee>();
    }

    public void addEmployee(Employee e) {
	for (Employee employee : employees) {
	    if (employee.getEmployeeID() == e.getEmployeeID()) {
		System.out.println("Error : Duplicated ID. Cannot add Employee !");
		return;
	    }
	}
	employees.add(e);
	System.out.println("Success : Add new Employee " + e.getName() + " succesfully");
    }

    public Employee getEmployeeByID(int employeeID) {
	for (Employee employee : employees) {
	    if (employee.getEmployeeID() == employeeID) {
		return employee;
	    }
	}
	return null;
    }

    public void deleteEmployee(int employeeID) {
	for (Employee employee : employees) {
	    if (employee.getEmployeeID() == employeeID) {
		Employee e = getEmployeeByID(employeeID);
		employees.remove(e);
		System.out.println("Success : Remove employee " + e.getName() + " succesfully");
		return;
	    }
	}
	System.out.println("Error : Cannot find Employee. Try again.");
    }

    public void showEmployeeList() {
	if (employees == null) {
	    System.out.println("Employee list is empty. Please add employee data !");
	    return;
	}
	System.out.println("Employee List : ----------");
	for (Employee employee : employees) {
	    employee.showEmployeeInfor();
	}
    }

    public ArrayList<Employee> getEmployeeList() {
	return this.employees;
    }
}
