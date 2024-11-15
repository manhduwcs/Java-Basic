package myHotel;

import java.util.ArrayList;

public class Hotel {
    protected ArrayList<Room> rooms;
    protected ArrayList<Guest> guests;

    public Hotel() {
	rooms = new ArrayList<Room>();
	guests = new ArrayList<Guest>();
    }

    public Guest findGuestByName(String guestName) {
	for (Guest guest : guests) {
	    if (guest.getGuestName().equals(guestName)) {
		return guest;
	    }
	}
	return null;
    }

    public Room findRoomByRoomNumber(String roomNumber) {
	for (Room room : rooms) {
	    if (room.getRoomNumber().equals(roomNumber)) {
		return room;
	    }
	}
	return null;
    }

    public void addRoom(Room room) {
	rooms.add(room);
	if (room instanceof StandardRoom) {
	    StandardRoom stdroom = (StandardRoom) room;
	    System.out.println(
		    "Standard Room with Room Number " + stdroom.getRoomNumber() + " has been added succesfully !");
	}
	if (room instanceof VipRoom) {
	    VipRoom viproom = (VipRoom) room;
	    System.out
		    .println("Vip Room with Room Number " + viproom.getRoomNumber() + " has been added succesfully !");
	}
    }

    public void addGuest(Guest guest) {
	guests.add(guest);
	System.out.println("Guest : " + guest.getGuestName() + " has been added succesfully !");
    }

    public void bookRoom(Guest guest, Room room) {
	guest.bookRoom(room);
    }

    public void releaseRoom(Guest guest, Room room) {
	guest.checkoutRoom(room);

    }

    public void showAllRooms() {
	int standardCount = 0;
	int vipCount = 0;
	System.out.println("All Standard Rooms : ");
	for (Room room : rooms) {
	    if (room instanceof StandardRoom) {
		System.out.println("Standard room : " + room.getRoomNumber() + " ; "
			+ (room.isRoomAvailable() == true ? "is ready for booking" : "has already been booked."));
		standardCount++;
	    }
	}
	if (standardCount == 0) {
	    System.out.println("There's no Standard Room in this hotel currently. Please add new Standard Room !");
	}
	System.out.println("--------------------------------");
	System.out.println("All Vip rooms : ");
	for (Room room : rooms) {
	    if (room instanceof VipRoom) {
		System.out.println("Vip room : " + room.getRoomNumber() + " ; "
			+ (room.isRoomAvailable() == true ? "is ready for booking" : "has already been booked."));
		vipCount++;
	    }
	}
	if (vipCount == 0) {
	    System.out.println("There's no Vip Room in this hotel currently. Please add new Vip Room !");
	}
    }
}
