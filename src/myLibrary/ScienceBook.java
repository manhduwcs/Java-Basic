package myLibrary;

public class ScienceBook implements Book {
    protected String bookType;
    protected int iD;
    protected String bookName;
    protected String author;
    protected double bookPrice;
    protected short yearOfPublication;

    public ScienceBook(int iD, String bookName, String author, double bookPrice, short yearOfPublication) {
	this.bookType = "Science";
	this.iD = iD;
	this.bookName = bookName;
	this.author = author;
	this.bookPrice = bookPrice;
	this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String getBookType() {
	return this.bookType;
    }

    @Override
    public int getID() {
	return this.iD;
    }

    @Override
    public String getBookName() {
	return this.bookName;
    }

    @Override
    public double getBookPrice() {
	return this.bookPrice;
    }

}
