package myHotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Hotel myhotel = new Hotel();
	int option = 0;

	while (option != 7) {
	    try {
		System.out.println("--------------------------------");
		System.out.println("Menu bar : ");
		System.out.println("1 - Add new Room ; 2 - Add new Guest");
		System.out.println("3 - Book room ; 4 - Release room");
		System.out.println("5 - Show all rooms ; 6 - Show guest's booked rooms");
		System.out.println("7 - Exit");
		System.out.print("Your choice = ");
		option = sc.nextInt();
		sc.nextLine();

		if (option == 1) {
		    System.out.println("--------------------------------");
		    System.out.println("1 - Add new Room ");
		    System.out.print("Enter room type ( Standard ( S ) or Vip ( V ) Room ) :  ");
		    char roomType = sc.next().charAt(0);

		    roomType = Character.toUpperCase(roomType);

		    if (roomType != 'S' && roomType != 'V') {
			throw new Exception("Error Message");
		    }
		    sc.nextLine();
		    System.out.print("Enter room number = ");
		    String roomNumber = sc.nextLine();
		    System.out.print("Enter room rate ( per night ) = ");
		    double rate = sc.nextDouble();
		    sc.nextLine();
		    if (roomType == 'S') {
			StandardRoom stdroom = new StandardRoom(roomNumber, rate, true);
			myhotel.addRoom(stdroom);
		    }
		    if (roomType == 'V') {
			VipRoom viproom = new VipRoom(roomNumber, rate, true);
			myhotel.addRoom(viproom);
		    } else {

		    }
		    System.out.println("--------------------------------");
		}
		if (option == 2) {
		    System.out.println("--------------------------------");
		    System.out.println("2 - Add new Guest");
		    System.out.print("Enter Guest name : ");
		    String guestName = sc.nextLine();
		    guestName = guestName.trim();
		    if (guestName == "") {
			throw new Exception();
		    }
		    Guest newGuest = new Guest(guestName);
		    myhotel.addGuest(newGuest);
		    System.out.println("--------------------------------");
		}
		if (option == 3) {
		    System.out.println("--------------------------------");
		    System.out.println("3 - Book a Room");
		    System.out.print("Enter Guest name who want to book room : ");
		    String guestName = sc.nextLine();
		    System.out.print("Enter Room number of a Room that this Guest want to book : ");
		    String roomNumber = sc.nextLine();

		    if (myhotel.findGuestByName(guestName) != null && myhotel.findRoomByRoomNumber(roomNumber) != null
			    && myhotel.findRoomByRoomNumber(roomNumber).isRoomAvailable() == true) {
			myhotel.bookRoom(myhotel.findGuestByName(guestName), myhotel.findRoomByRoomNumber(roomNumber));
			System.out.println(
				"Guest " + guestName + " has booked this room number " + roomNumber + " succesfully !");
		    } else {
			System.out.println("Error : Cannot find Guest with name " + guestName
				+ " or Room with roomnumber " + roomNumber + ". Please try again !");
		    }
		    System.out.println("--------------------------------");
		}
		if (option == 4) {
		    System.out.println("--------------------------------");
		    System.out.println("4 - Release a Room");
		    System.out.print("Enter Guest name who want to release room : ");
		    String guestName = sc.nextLine();
		    System.out.print("Enter Room number of a Room that this Guest want to release : ");
		    String roomNumber = sc.nextLine();
		    Guest thisGuest = myhotel.findGuestByName(guestName);
		    Room thisRoom = myhotel.findRoomByRoomNumber(roomNumber);
		    if (thisGuest != null && thisRoom != null) {
			if (thisRoom.isRoomAvailable() == false
				&& thisGuest.isGuestBookThisRoomNumber(roomNumber) == true) {
			    myhotel.releaseRoom(myhotel.findGuestByName(guestName),
				    myhotel.findRoomByRoomNumber(roomNumber));
			    System.out.println("Guest " + guestName + " has release this room with room number "
				    + roomNumber + " succesfully !");
			} else {
			    System.out.println(
				    "Error : This guest " + guestName + " has not book this room with room number "
					    + roomNumber + " yet, so that he can't release this room !");
			}
		    } else {
			System.out.println("Error : Cannot find Guest with name " + guestName
				+ " or Room with roomnumber " + roomNumber + ". Please try again !");
		    }
		    System.out.println("--------------------------------");
		}
		if (option == 5) {
		    System.out.println("--------------------------------");
		    System.out.println("5 - Display all Rooms in this Hotel.");
		    myhotel.showAllRooms();
		    System.out.println("--------------------------------");
		}
		if (option == 6) {
		    System.out.println("--------------------------------");
		    System.out.println("6 - Display all Rooms that a Guest has booked : ");
		    System.out.print("Enter the guest's name that you want to find : ");
		    String guestName = sc.nextLine();
		    guestName = guestName.trim();
		    Guest newGuest = myhotel.findGuestByName(guestName);
		    if (newGuest != null) {
			newGuest.showBookedRooms();
		    } else {
			System.out.println("Error : Cannot find Guest with name " + guestName + ". Please try again.");
		    }
		    System.out.println("--------------------------------");
		}
		if (option == 7) {
		    System.out.println("--------------------------------");
		    System.out.println("Exit program ---");
		    System.out.println("Thank you. See you again !");
		    return;
		}
	    } catch (Exception e) {
		System.out.println("Error : Wrong input. Please try again !");
		sc.nextLine();
	    }
	}
    }
}
