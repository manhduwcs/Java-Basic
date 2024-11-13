package newPackage2;

public class Pizza {
    private double diameter;
    private int slices;

    public Pizza(double diameter, int slices) {
	this.diameter = diameter;
	this.slices = slices;
    }

    public double getDiameter() {
	return diameter;
    }

    public void setDiameter(float diameter) {
	this.diameter = diameter;
    }

    public int getSlices() {
	return slices;
    }

    public void setSlices(int slices) {
	this.slices = slices;
    }

}
