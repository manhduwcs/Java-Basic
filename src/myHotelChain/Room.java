package myHotelChain;

import java.util.ArrayList;

public interface Room {
    public String getRoomNumber();

    public boolean isAvailable();

    public void bookRoom();

    public void releaseRoom();

    public double calculatePrice(int nights);

    public String getRoomType();

    public void setAmenities(ArrayList<String> addAmentities);

}
