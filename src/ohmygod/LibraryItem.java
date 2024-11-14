package ohmygod;

public interface LibraryItem {
    String getTitle();

    boolean isAvailable();

    void borrowItem();

    void returnItem();
}
