package myHotelChain;

import java.util.ArrayList;

public class VipRoom implements Room {
    protected String roomType;
    protected String roomNumber;
    protected double rate;
    protected boolean available;
    protected int maxGuests;
    protected ArrayList<String> amenities;

    public VipRoom(String roomNumber, double rate, boolean available, int maxGuests) {
	this.roomType = "Vip Room";
	this.roomNumber = roomNumber;
	this.rate = rate;
	this.available = available;
	this.maxGuests = maxGuests;
	amenities = new ArrayList<String>();
    }

    // Amentities Vip Room : Minibar - 15 USD per night ; Premium Bathtub - 30 USD
    // per night
    public void setAmenities(ArrayList<String> addAmentities) {
	// Minibar ; Premium Bathtub
	for (String amentity : addAmentities) {
	    this.amenities.add(amentity);
	}
    }

    @Override
    public void bookRoom() {
	if (available == false) {
	    return;
	}
	available = false;
    }

    @Override
    public void releaseRoom() {
	if (available == true) {
	    return;
	}
	available = true;
    }

    @Override
    public double calculatePrice(int nights) {
	double minibarPrice = 0;
	double bathtubPrice = 0;
	for (String a : amenities) {
	    if (a.equals("Minibar")) {
		minibarPrice = 15 * nights;
	    }
	    if (a.equals("Premium Bathtub")) {
		bathtubPrice = 30 * nights;
	    }
	}
	return (rate * nights) + minibarPrice + bathtubPrice;
    }

    public String getRoomType() {
	return roomType;
    }

    public void setRoomType(String roomType) {
	this.roomType = roomType;
    }

    public String getRoomNumber() {
	return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
	this.roomNumber = roomNumber;
    }

    public double getRate() {
	return rate;
    }

    public void setRate(double rate) {
	this.rate = rate;
    }

    public boolean isAvailable() {
	return available;
    }

    public void setAvailable(boolean available) {
	this.available = available;
    }

    public int getMaxGuests() {
	return maxGuests;
    }

    public void setMaxGuests(int maxGuests) {
	this.maxGuests = maxGuests;
    }

    public ArrayList<String> getAmenities() {
	return amenities;
    }

}
