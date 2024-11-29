package myRestaurant;

public interface Table {
    public String getTableType();

    public String getTableNumber();

    public boolean isAvailable();

    public void bookTable();

    public void releaseTable();
}
