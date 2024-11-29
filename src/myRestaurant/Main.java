package myRestaurant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int option = 0;
	Restaurant restaurant = new Restaurant();

	while (option != 9) {
	    try {
		System.out.println("----------------------------------------------");
		System.out.println();

		System.out.println("Restaurant Management Menu -- ");
		System.out.println("1 - Add new Table to the Restaurant");
		System.out.println("2 - Add new Customer to the Restaurant");
		System.out.println("3 - Add new Dish to the restaurant's Menu");
		System.out.println("4 - Book a Table for Customer");
		System.out.println("5 - Order Dishes");
		System.out.println("6 - Checkout Table and Pay the Restaurant Bill");
		System.out.println("7 - Show all Dishes in our Restaurant");
		System.out.println("8 - Show all Tables and its Available Status");
		System.out.println("9 - Exit program");
		System.out.print("Your choice = ");
		option = sc.nextInt();

		System.out.println();
		System.out.println("----------------------------------------------");

		if (option < 1 && option > 8) {
		    throw new Exception("Wrong input type. Try again !");
		}
		sc.nextLine();

		if (option == 1) {
		    System.out.println("----------------------------------------------");
		    System.out.println();

		    System.out.println("1 - Add new Table");
		    System.out.print("What's new Table's Type ? Standard (S) or Vip (V) : ");
		    char type = sc.next().charAt(0);
		    type = Character.toUpperCase(type);

		    if (type != 'S' && type != 'V') {
			throw new Exception("Wrong input type. Input must be S or V !");
		    }
		    sc.nextLine();
		    System.out.print("Enter Table Number : ");
		    String tableNumber = sc.nextLine();
		    System.out.print("Enter Table max capacity : ");
		    int capacity = sc.nextInt();

		    if (type == 'S') {
			StandardTable standardTable = new StandardTable(tableNumber, capacity, true);
			restaurant.addTable(standardTable);
			System.out.println(standardTable.tableType + " table, number : "
				+ standardTable.getTableNumber() + " has been added succesfully !");
		    }

		    if (type == 'V') {
			VipTable vipTable = new VipTable(tableNumber, capacity, true);
			restaurant.addTable(vipTable);
			System.out.println(vipTable.tableType + " table, number : " + vipTable.getTableNumber()
				+ " has been added succesfully !");
		    }

		    System.out.println();
		    System.out.println("----------------------------------------------");
		}

		if (option == 2) {
		    System.out.println("----------------------------------------------");
		    System.out.println();

		    System.out.println("2 - Add new Customer");
		    System.out.print("Enter Customer's Name : ");
		    String customerName = sc.nextLine();

		    Customer customer = new Customer(customerName);
		    restaurant.addCustomer(customer);
		    System.out.println("Customer " + customerName + " has just been added !");

		    System.out.println();
		    System.out.println("----------------------------------------------");
		}

		if (option == 3) {
		    System.out.println("----------------------------------------------");
		    System.out.println();

		    System.out.println("3 - Add new Dish to the Menu");
		    System.out.print("New Dish name : ");
		    String dishName = sc.nextLine();
		    System.out.print("Enter Dish " + dishName + " price : ");
		    double price = sc.nextDouble();

		    Dish dish = new Dish(dishName, price);
		    restaurant.menu.addDish(dish);
		    System.out.println("Dish " + dishName + " has been added to the restaurant's Menu.");

		    System.out.println();
		    System.out.println("----------------------------------------------");
		}

		if (option == 4) {
		    System.out.println("----------------------------------------------");
		    System.out.println();

		    System.out.println("4 - Book Table for Customer");
		    System.out.print("Enter Customer's Name : ");
		    String customerName = sc.nextLine();

		    Customer customer = restaurant.searchCustomerByName(customerName);
		    if (customer == null) {
			throw new Exception("Cannot find Customer with name " + customerName);
		    }

		    System.out.print("Enter Table's Number that customer " + customerName + " want to book : ");
		    String tableNumber = sc.nextLine();

		    Table table = restaurant.searchTableByTableNumber(tableNumber);

		    if (table == null) {
			throw new Exception("Cannot find Table with Table Number = " + tableNumber);
		    }

		    Table table2 = customer.searchTableCustomerBooked(customerName);

		    if (table2 == null) {
			restaurant.bookTableForCustomer(customer, table);
		    } else {
			System.out.println("This table number " + tableNumber + " has already been booked by Guest "
				+ customerName);
		    }
		    System.out.println();
		    System.out.println("----------------------------------------------");
		}

		if (option == 5) {
		    System.out.println("----------------------------------------------");
		    System.out.println();

		    System.out.println("5 - Order Dish for Customer");
		    System.out.print("Enter Customer's Name who want to order : ");
		    String customerName = sc.nextLine();

		    Customer customer = restaurant.searchCustomerByName(customerName);
		    if (customer == null) {
			throw new Exception("Cannot find Customer with name " + customerName);
		    }

		    if (customer.bookedTables == null) {
			System.out
				.println("Attention : You haven't booked any table, so that you cannot order dishes.");
			System.out.println("Please choose option 4 to book a Table before ordering Dishes !");
		    } else {
			System.out.print("Enter Dish's Name that customer " + customerName + " want to order : ");
			String dishName = sc.nextLine();
			Dish dish = restaurant.searchDishByName(dishName);
			if (dish == null) {
			    throw new Exception("Cannot find Dish with name : " + dishName);
			}

			restaurant.takeOrder(customer, dish);
			System.out
				.println("Customer " + customerName + " orderes Dish : " + dishName + " succesfully.");

		    }
		    System.out.println();
		    System.out.println("----------------------------------------------");
		}

		if (option == 6) {
		    // Error : what if table does not belong to customer ? show custom error
		    // notification
		    System.out.println("----------------------------------------------");
		    System.out.println();

		    System.out.println("6 - Checkout Table and Pay the Restaurant Bill");
		    System.out.print("Enter Customer's Name who want to release Table : ");
		    String customerName = sc.nextLine();
		    Customer customer = restaurant.searchCustomerByName(customerName);
		    if (customer == null) {
			throw new Exception("Cannot find Customer with name " + customerName);
		    }

		    if (customer.bookedTables == null) {
			System.out
				.println("Attention : You haven't booked any table, so that you cannot order dishes.");
			System.out.println("Please choose option 4 to book a Table before ordering Dishes !");
			throw new Exception();
		    }

		    System.out.print("Enter Table Number that need to release : ");
		    String tableNumber = sc.nextLine();

		    if (restaurant.searchTableByTableNumber(tableNumber) == null) {
			throw new Exception("Cannot find Table with Table Number = " + tableNumber);
		    }

		    if (restaurant.searchTableByTableNumber(tableNumber) == null) {
			throw new Exception("Cannot find Table with table number : " + tableNumber);
		    }

		    Table table = customer.searchTableCustomerBooked(tableNumber);
		    if (table == null) {
			System.out.println(
				"Customer " + customerName + " hasn't booked this table yet, so he can't release it !");
		    }

		    else {
			System.out.println("Dear Customer " + customerName + ", you have to pay : "
				+ customer.calculateBill() + " USD");
			System.out.print("Enter 1 for payment ; 0 for decline : ");
			int paid = sc.nextInt();
			if (paid != 0 && paid != 1) {
			    throw new Exception("Wrong input type ! Input value must be 1 or 0 !");
			}

			if (paid == 1) {
			    restaurant.checkout(customer, table);
			    System.out.println("Customer " + customerName + " paid the bill and checkout table number "
				    + tableNumber + " succesfully. See you again !");
			}

			if (paid == 0) {
			    System.out.println("Please pay your bill later to checkout table.");
			}

		    }

		    System.out.println();
		    System.out.println("----------------------------------------------");
		}

		if (option == 7) {
		    System.out.println("----------------------------------------------");
		    System.out.println();

		    System.out.println("7 - Show all Dishes in our Restaurant's Menu.");
		    restaurant.menu.showMenu();

		    System.out.println();
		    System.out.println("----------------------------------------------");
		}

		if (option == 8) {
		    System.out.println("----------------------------------------------");
		    System.out.println();

		    System.out.println("8 - Show all Tables and its available status : ");
		    restaurant.showAllTables();

		    System.out.println();
		    System.out.println("----------------------------------------------");
		}

		if (option == 9) {
		    System.out.println("----------------------------------------------");
		    System.out.println();

		    System.out.println("9 - Exit the program....");
		    System.out.println("Thank you. See you later !");
		}

	    } catch (Exception e) {
		if (sc.hasNextLine()) {
		    sc.nextLine();
		}

		if (e.getMessage() == null) {
		    System.out.println("Error : Wrong input type. Please try again !");
		} else {
		    System.out.println("Error : " + e.getMessage());
		}
	    }
	}
    }
}
