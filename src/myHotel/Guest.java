package myHotel;

import java.util.ArrayList;

public class Guest {
    protected String guestName;
    protected ArrayList<Room> bookedRooms;

    public Guest(String guestName) {
	this.guestName = guestName;
	bookedRooms = new ArrayList<Room>();
    }

    public String getGuestName() {
	return this.guestName;
    }

    public boolean isGuestBookThisRoomNumber(String roomNumber) {
	for (Room room : bookedRooms) {
	    if (room.getRoomNumber().equals(roomNumber)) {
		return true;
	    }
	}
	return false;
    }

    public void bookRoom(Room room) {
	if (room.isRoomAvailable() == false) {
	    System.out.println("Error : Room number " + room.getRoomNumber()
		    + " has already been booked. You cannot book it now.");
	    return;
	}
	if (room instanceof StandardRoom) {
	    StandardRoom stdroom = (StandardRoom) room;
	    bookedRooms.add(stdroom);
	    stdroom.bookRoom();

	}
	if (room instanceof VipRoom) {
	    VipRoom viproom = (VipRoom) room;
	    bookedRooms.add(viproom);
	    viproom.bookRoom();

	}
    }

    public void checkoutRoom(Room room) {
	if (room.isRoomAvailable() == true) {
	    System.out.println("Error : Room number " + room.getRoomNumber() + " has already been released.");
	    return;
	}
	if (room instanceof StandardRoom) {
	    StandardRoom stdroom = (StandardRoom) room;
	    bookedRooms.remove(stdroom);
	    stdroom.releaseRoom();

	}
	if (room instanceof VipRoom) {
	    VipRoom viproom = (VipRoom) room;
	    bookedRooms.remove(viproom);
	    viproom.releaseRoom();

	}
    }

    public void showBookedRooms() {
	System.out.println("All standard room guest " + this.guestName + " has booked : ");
	int standardCount = 0;
	int vipCount = 0;
	for (Room room : bookedRooms) {
	    if (room instanceof StandardRoom) {
		StandardRoom stdroom = (StandardRoom) room;
		System.out.println(stdroom.getRoomType() + " : " + stdroom.getRoomNumber());
		standardCount++;
	    }
	}
	if (standardCount == 0) {
	    System.out.println("Guest " + this.guestName + " has not booked any Standard room !");
	}
	System.out.println("--------------------------------");
	System.out.println("All vip room guest " + this.guestName + " has booked : ");
	for (Room room : bookedRooms) {
	    if (room instanceof VipRoom) {
		VipRoom viproom = (VipRoom) room;
		System.out.println(viproom.getRoomType() + " : " + viproom.getRoomNumber());
		vipCount++;
	    }
	}
	if (vipCount == 0) {
	    System.out.println("Guest " + this.guestName + " has not booked any Vip room !");
	}
    }
}
