package music;

public class CompactDisk {
    protected String title;
    protected String author;
    protected double price;
    protected int code;

    public CompactDisk(String title, String author, double price, int code) {
	this.title = title;
	this.author = author;
	this.price = price;
	this.code = code;
    }

    public String getAuthor() {
	return author;
    }

    public void setAuthor(String author) {
	this.author = author;
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
