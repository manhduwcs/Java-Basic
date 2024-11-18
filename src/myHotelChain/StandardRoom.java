package myHotelChain;

import java.util.ArrayList;
import java.util.Arrays;

public class StandardRoom implements Room {
    protected String roomType;
    protected String roomNumber;
    protected double rate;
    protected boolean available;
    protected int maxGuests;
    protected ArrayList<String> amenities;

    public StandardRoom(String roomNumber, double rate, boolean available, int maxGuests) {
	this.roomType = "Standard Room";
	this.roomNumber = roomNumber;
	this.rate = rate;
	this.available = available;
	this.maxGuests = maxGuests;
	amenities = new ArrayList<String>(Arrays.asList("Free Wi-Fi", "Air Conditioning", "TV"));
    }

    // Amenities Standard Room
    // Free Wi Fi, Air conditioning, TV ( free )

    public void setAmenities(ArrayList<String> addAmentities) {
	// do nothing ..
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
	return rate * nights;
	// all free amentities
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

    public String getRoomType() {
	return roomType;
    }

    public void setRoomType(String roomType) {
	this.roomType = roomType;
    }

}
