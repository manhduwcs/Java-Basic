package myRestaurant;

import java.util.ArrayList;

public class Menu {
    protected ArrayList<Dish> dishes;

    public Menu() {
	dishes = new ArrayList<Dish>();
    }

    public void addDish(Dish dish) {
	dishes.add(dish);
    }

    public void showMenu() {
	for (Dish dish : dishes) {
	    System.out.println(dish.getDishDetails());
	}
    }
}
