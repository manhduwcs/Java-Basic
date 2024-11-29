package myRestaurant;

import java.util.ArrayList;

public class Restaurant {
    ArrayList<Table> tables;
    ArrayList<Customer> customers;
    Menu menu;

    public Restaurant() {
	tables = new ArrayList<Table>();
	customers = new ArrayList<Customer>();
	menu = new Menu();
    }

    public Table searchTableByTableNumber(String number) {
	for (Table t : tables) {
	    if (t.getTableNumber().equals(number)) {
		return t;
	    }
	}
	return null;
    }

    public Dish searchDishByName(String name) {
	for (Dish d : menu.dishes) {
	    if (d.dishName.equals(name)) {
		return d;
	    }
	}
	return null;
    }

    public Customer searchCustomerByName(String name) {
	for (Customer c : customers) {
	    if (c.customerName.equals(name)) {
		return c;
	    }
	}
	return null;
    }

    public void showCustomerOrders(Customer customer) {
	customer.showOrderedDishes();
    }

    public void addTable(Table table) {
	tables.add(table);
    }

    public void addCustomer(Customer customer) {
	customers.add(customer);
    }

    public void bookTableForCustomer(Customer customer, Table table) {
	if (table.isAvailable() == false) {
	    System.out.println("Error : Table Number : " + table.getTableNumber()
		    + " has already been booked ! It cannot be booked now.");
	    return;
	}
	if (table.isAvailable() == true) {
	    customer.bookTable(table);
	    System.out.println("Customer " + customer.customerName + " has booked Table " + table.getTableNumber()
		    + " succesfully.");
	}
    }

    public void takeOrder(Customer customer, Dish dish) {
	customer.orderDish(dish);
    }

    public void checkout(Customer customer, Table table) {
	if (table.isAvailable() == true) {
	    System.out.println("Error : Table Number " + table.getTableNumber()
		    + " is ready for booking, so you can't release it !");
	    return;
	} else {
	    customer.checkoutTable(table);
	    System.out.println("Customer " + customer.customerName + " has just released Table "
		    + table.getTableNumber() + " succesfully.");

	}
    }

    public void showAllTables() {
	for (Table t : tables) {
	    System.out.println(t.getTableType() + " table, number : " + t.getTableNumber() + ", "
		    + (t.isAvailable() == true ? "is ready for booking" : "has already been booked !"));
	}
    }

}
