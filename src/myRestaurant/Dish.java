package myRestaurant;

public class Dish {
    protected String dishName;
    protected double price;

    public Dish(String dishName, double price) {
	this.dishName = dishName;
	this.price = price;
    }

    public String getDishDetails() {
	return "Dish Name : " + dishName + " | Price : " + price;
    }
}
