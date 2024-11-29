package myRestaurant;

public class StandardTable implements Table {
    protected String tableType;
    protected String tableNumber;
    protected int capacity;
    protected boolean available;

    public StandardTable(String tableNumber, int capacity, boolean available) {
	super();
	this.tableType = "Standard";
	this.tableNumber = tableNumber;
	this.capacity = capacity;
	this.available = available;
    }

    @Override
    public String getTableType() {
	return tableType;
    }

    @Override
    public String getTableNumber() {
	return tableNumber;
    }

    @Override
    public boolean isAvailable() {
	return available;
    }

    @Override
    public void bookTable() {
	available = false;
    }

    @Override
    public void releaseTable() {
	available = true;
    }

}
