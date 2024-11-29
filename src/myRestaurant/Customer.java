package myRestaurant;

import java.util.ArrayList;

public class Customer {
    protected String customerName;
    protected ArrayList<Table> bookedTables;
    protected ArrayList<Dish> orderedDishes;

    public Customer(String customerName) {
	super();
	this.customerName = customerName;
	bookedTables = new ArrayList<Table>();
	orderedDishes = new ArrayList<Dish>();
    }

    public Table searchTableCustomerBooked(String name) {
	for (Table t : bookedTables) {
	    if (t.getTableNumber().equals(name)) {
		return t;
	    }
	}
	return null;
    }

    public void showOrderedDishes() {
	for (Dish d : orderedDishes) {
	    System.out.println(d.getDishDetails());
	}
    }

    public void bookTable(Table table) {
	table.bookTable();
	bookedTables.add(table);
	for (Table t : bookedTables) {
	    System.out.println(t.getTableNumber());
	}
    }

    public void orderDish(Dish dish) {
	orderedDishes.add(dish);
    }

    public double calculateBill() {
	double total = 0;
	for (Dish dish : orderedDishes) {
	    total += dish.price;
	}
	return total;
    }

    public void checkoutTable(Table table) {
	table.releaseTable();
	bookedTables.remove(table);
    }
}
