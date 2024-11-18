package myHotelChain;

import java.util.ArrayList;

public class Guest {
    protected String guestName;
    protected ArrayList<Room> bookedRooms;
    protected double totalSpent;

    public Guest(String guestName) {
	super();
	this.guestName = guestName;
	bookedRooms = new ArrayList<Room>();
	this.totalSpent = 0;
    }

    public double calculateTotalSpent() {
	// if you want to calculate here, you must have " protected int nights "
	// in every Room class to save data of nights ordered per room
	return this.totalSpent;
    }

    public void showBookedRooms() {
	int stdRoomCheck = 0;
	int vipRoomCheck = 0;
	int suiteRoomCheck = 0;
	System.out.println("All Standard Room this Guest booked : ");
	for (Room room : bookedRooms) {
	    if (room instanceof StandardRoom) {
		System.out.println("Standard Room number : " + room.getRoomNumber());
		stdRoomCheck++;
	    }
	}
	if (stdRoomCheck == 0) {
	    System.out.println("This Guest has not booked any Standard Room yet !");
	}
	System.out.println("---------------------------------------------");
	System.out.println("All Vip Room this Guest booked : ");
	for (Room room : bookedRooms) {
	    if (room instanceof VipRoom) {
		System.out.println("Vip Room number : " + room.getRoomNumber());
		vipRoomCheck++;
	    }
	}
	if (vipRoomCheck == 0) {
	    System.out.println("This Guest has not booked any Vip Room yet !");
	}
	System.out.println("---------------------------------------------");
	System.out.println("All Suite Room this Guest booked : ");
	for (Room room : bookedRooms) {
	    if (room instanceof SuiteRoom) {
		System.out.println("Suite Room number : " + room.getRoomNumber());
		suiteRoomCheck++;
	    }
	}
	if (suiteRoomCheck == 0) {
	    System.out.println("This Guest has not booked any Suite Room yet !");
	}

    }

    public void bookRoom(Room room, int nights) {
	room.bookRoom();
	if (room.isAvailable() == true) {
	    return;
	}
	// total Spent calcualted here
	this.totalSpent += room.calculatePrice(nights);
	bookedRooms.add(room);
    }

    public boolean isThisGuestBookRoom(Room room) {
	for (Room thisRoom : bookedRooms) {
	    if (thisRoom.equals(room)) {
		return true;
	    }
	}
	return false;
    }

    public void checkoutRoom(Room room) {
	if (isThisGuestBookRoom(room) == false) {
	    return;
	}
	room.releaseRoom();
	if (room.isAvailable() == false) {
	    return;
	}
	bookedRooms.remove(room);
    }

    public String getGuestName() {
	return guestName;
    }

    public void setGuestName(String guestName) {
	this.guestName = guestName;
    }

    public ArrayList<Room> getBookedRooms() {
	return bookedRooms;
    }

    public void setBookedRooms(ArrayList<Room> bookedRooms) {
	this.bookedRooms = bookedRooms;
    }

    public double getTotalSpent() {
	return totalSpent;
    }

    public void setTotalSpent(double totalSpent) {
	this.totalSpent = totalSpent;
    }

}
