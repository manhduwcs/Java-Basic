package ohbabe;

public class Book {
    private String title;
    private boolean available;

    public Book(String title, boolean available) {
	super();
	this.title = title;
	this.available = available;
    }

    public String getTitle() {
	return this.title;
    }

    public boolean isAvailable() {
	return this.available;
    }

    public void setAvailable(boolean available) {
	this.available = available;
    }

    public void borrow() {
	if (this.available == true) {
	    System.out.println("Sach " + this.title + " duoc danh dau la da muon");
	    setAvailable(false);
	} else {
	    System.out.println("Loi : Sach " + this.title + " dang duoc cho nguoi khac muon !");
	}
    }

    public void returnBook() {
	if (this.available == false) {
	    System.out.println("Sach " + this.title + " da duoc tra lai va san sang cho muon.");
	    setAvailable(true);
	} else {
	    System.out.println("Loi : Sach " + this.title + " dang o trong trang thai san sang cho muon !");
	    return;
	}
    }
}