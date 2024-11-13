package newPackage2;

public class DuluxePizza extends Pizza {
    private String toppings;

    public DuluxePizza(String toppings, double diameter, int slices) {
	super(diameter, slices);
	this.toppings = toppings;
    }

    public String getToppings() {
	return toppings;
    }

    public void setToppings(String toppings) {
	this.toppings = toppings;
    }

}
