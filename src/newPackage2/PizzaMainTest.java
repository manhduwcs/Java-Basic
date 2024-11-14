package newPackage2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PizzaMainTest {
    public static void main(String args[]) throws Exception {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter added toppings: ");
	String addedToppings = in.readLine();
	System.out.print("Enter diameter: ");
	double diameter = Double.parseDouble(in.readLine());
	System.out.print("Enter number of slices: ");
	int slices = Integer.parseInt(in.readLine());

	System.out.println("OUTPUT:");
	Pizza p = new Pizza(diameter, slices);
	System.out.println("diameter = " + p.getDiameter());
	System.out.println("slices = " + p.getSlices());
	DuluxePizza dp = new DuluxePizza(addedToppings, diameter, slices);
	System.out.println();
	System.out.println("added toppings = " + dp.getToppings());
	System.out.println("diameter = " + dp.getDiameter());
	System.out.println("slices = " + dp.getSlices());
    }

}
