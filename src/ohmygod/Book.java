package ohmygod;

public class Book implements LibraryItem {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author, boolean available) {
	this.title = title;
	this.author = author;
	this.available = available;
    }

    public void setAvailable(boolean available) {
	try {
	    this.available = available;
	} catch (Exception e) {
	    System.out.println("Loi : khong the dat trang thai sach.");
	}
    }

    @Override
    public String getTitle() {
	return this.title;
    }

    public String getAuthor() {
	return this.author;
    }

    @Override
    public boolean isAvailable() {
	return this.available;
    }

    @Override
    public void borrowItem() {
	if (this.available == false)
	    return;
	else
	    setAvailable(false);
    }

    @Override
    public void returnItem() {
	if (this.available == true)
	    return;
	else
	    setAvailable(true);
    }

}
