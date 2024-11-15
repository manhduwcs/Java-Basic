package myHotel;

public class VipRoom implements Room {
    protected String roomType;
    protected String roomNumber;
    protected double rate;
    protected boolean available;

    public VipRoom(String roomNumber, double rate, boolean available) {
	super();
	this.roomType = "Vip Room";
	this.roomNumber = roomNumber;
	this.rate = rate;
	this.available = available;
    }

    public String getRoomType() {
	return this.roomType;
    }

    @Override
    public String getRoomNumber() {
	return this.roomNumber;
    }

    @Override
    public boolean isRoomAvailable() {
	return this.available;
    }

    @Override
    public void bookRoom() {
	if (this.available == false) {
	    System.out
		    .println("Error : Room number " + roomNumber + " has already been booked. You cannot book it now.");
	    return;
	}
	this.available = false;

    }

    @Override
    public void releaseRoom() {
	if (this.available == true) {
	    System.out.println("Error : Room number " + roomNumber + " has already been released.");
	    return;
	}
	this.available = true;

    }

}
