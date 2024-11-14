package movies;

public class CompactDisk {
    protected String title;
    protected double price;
    protected int code;

    public CompactDisk(String title, double price, int code) {
	this.title = title;
	this.price = price;
	this.code = code;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public double getPrice() {
	return price;
    }

    public void setPrice(double price) {
	this.price = price;
    }

    public int getCode() {
	return code;
    }

    public void setCode(int code) {
	this.code = code;
    }

}
