package myHotelChain;

import java.util.ArrayList;

public class HotelBranch {
    protected String branchName;
    protected ArrayList<Room> rooms;
    protected ArrayList<Guest> guests;
    protected double revenue;

    public HotelBranch(String branchName) {
	this.branchName = branchName;
	rooms = new ArrayList<Room>();
	guests = new ArrayList<Guest>();
	revenue = 0;
    }

    public Room getRoomFromBranch(String roomNumber) {
	for (Room room : rooms) {
	    if (room.getRoomNumber().equals(roomNumber)) {
		return room;
	    }
	}
	return null;
    }

    public Guest getGuestFromBranch(String guestName) {
	for (Guest guest : guests) {
	    if (guest.getGuestName().equals(guestName)) {
		return guest;
	    }
	}
	return null;
    }

    public ArrayList<Room> getBranchRoomBooked() {
	return this.rooms;
    }

    public String getBranchName() {
	return this.branchName;
    }

    public void addRoom(Room room) {
	rooms.add(room);
    }

    public void addGuest(Guest guest) {
	guests.add(guest);
    }

    public void bookRoom(Room room, Guest guest, int nights) {
	guest.bookRoom(room, nights);
	this.revenue += room.calculatePrice(nights);
    }

    public void releaseRoom(Room room, Guest guest) {
	guest.checkoutRoom(room);
    }

    public double calculateRevenue() {
	revenue = (revenue * 100.0) / 100.0;
	return revenue;
    }

    public void showAllRooms() {
	int stdRoomCheck = 0;
	int vipRoomCheck = 0;
	int suiteRoomCheck = 0;
	System.out.println("All Standard Room in Hotel " + this.branchName + " : ");
	for (Room room : rooms) {
	    if (room instanceof StandardRoom) {
		System.out.println("Standard Room number : " + room.getRoomNumber() + " ; "
			+ (room.isAvailable() == true ? "is ready for booking." : "has already been booked."));
		stdRoomCheck++;
	    }
	}
	if (stdRoomCheck == 0) {
	    System.out
		    .println("This hotel " + this.branchName + " has no Standard Room. Please add new Standard Room !");
	}
	System.out.println("---------------------------------------------");
	System.out.println("All Vip Room in Hotel " + this.branchName + " : ");
	for (Room room : rooms) {
	    if (room instanceof VipRoom) {
		System.out.println("Vip Room number : " + room.getRoomNumber() + " ; "
			+ (room.isAvailable() == true ? "is ready for booking." : "has already been booked."));
		vipRoomCheck++;
	    }
	}
	if (vipRoomCheck == 0) {
	    System.out.println("This hotel " + this.branchName + " has no Vip Room. Please add new Vip Room !");
	}
	System.out.println("---------------------------------------------");
	System.out.println("All Suite Room in Hotel " + this.branchName + " : ");
	for (Room room : rooms) {
	    if (room instanceof SuiteRoom) {
		System.out.println("Suite Room number : " + room.getRoomNumber() + " ; "
			+ (room.isAvailable() == true ? "is ready for booking." : "has already been booked."));
		suiteRoomCheck++;
	    }
	}
	if (suiteRoomCheck == 0) {
	    System.out.println("This hotel " + this.branchName + " has no Suite Room. Please add new Suite Room !");
	}

    }
}
