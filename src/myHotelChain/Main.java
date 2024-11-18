package myHotelChain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void handleAmenities(Room room, Scanner sc, List<String> addAmenities, int nights,
	    double minibarPrice, double bathtubPrice, double butlerPrice) {
	try {

	} catch (Exception e) {
	    System.out.println("Wrong input option. Try again !");
	}
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	HotelChain myHotelChain = new HotelChain();
	int op = 0;

	while (op != 6) {
	    try {
		System.out.println("Option Menus : ");
		System.out.println("1 - Room Management");
		System.out.println("2 - Guest Management");
		System.out.println("3 - Book Room and Release Room");
		System.out.println("4 - Hotel Branch Management");
		System.out.println("5 - Report and Analyze");
		System.out.println("6 - Exit.");
		System.out.print("Your choice = ");
		op = sc.nextInt();
		sc.nextLine();

		if (op == 1) {
		    System.out.println("+++++++++++++++++++++++++++++");
		    System.out.println();
		    System.out.println("++ 1 - Room Management ++");
		    System.out.println();
		    System.out.println("You can : 1 - Add new Room || 2 - Show all Rooms in a Hotel Branch");
		    System.out.print("Your choice = ");
		    int c = sc.nextInt();
		    sc.nextLine();
		    System.out.println();

		    if (c == 1) {
			System.out.println("++ Add new Room ++");
			System.out.print("Current Branch that you want to add room : ");
			String branchName = sc.nextLine();
			HotelBranch hotelBranch = myHotelChain.findBranchByName(branchName);
			if (hotelBranch == null) {
			    throw new Exception("Cannot find Branch with name " + branchName + ".");
			}
			System.out.print("What type of room will be added ? Standard (S), Vip (V) or Suite (R) : ");
			char roomType = sc.next().charAt(0);
			roomType = Character.toUpperCase(roomType);
			if (roomType != 'S' && roomType != 'V' && roomType != 'R') {
			    throw new Exception("You enter the wrong room type !");
			}
			sc.nextLine();
			System.out.print("Room number = ");
			String roomNumber = sc.nextLine().trim();

			System.out.print("Room Price per Night = ");
			double rate = sc.nextDouble();
			sc.nextLine();
			System.out.print("Max Guests for the room = ");
			int maxGuests = sc.nextInt();
			sc.nextLine();
			boolean available = true;

			if (roomType == 'S') {
			    StandardRoom stdRoom = new StandardRoom(roomNumber, rate, available, maxGuests);
			    hotelBranch.addRoom(stdRoom);
			    System.out.println("Standard Room number : " + stdRoom.getRoomNumber()
				    + " has been added succesfully to Hotel Branch " + hotelBranch.getBranchName());
			    System.out.println("+ Room price per night : " + rate);
			    System.out.println("+ Room max Guests = " + maxGuests);
			}
			if (roomType == 'V') {
			    VipRoom vipRoom = new VipRoom(roomNumber, rate, available, maxGuests);
			    hotelBranch.addRoom(vipRoom);
			    System.out.println("Vip Room number : " + vipRoom.getRoomNumber()
				    + " has been added succesfully to Hotel Branch " + hotelBranch.getBranchName());
			    System.out.println("+ Room price per night : " + rate);
			    System.out.println("+ Room max Guests = " + maxGuests);
			}
			if (roomType == 'R') {
			    SuiteRoom suiteRoom = new SuiteRoom(roomNumber, rate, available, maxGuests);
			    hotelBranch.addRoom(suiteRoom);
			    System.out.println("Suite Room number : " + suiteRoom.getRoomNumber()
				    + " has been added succesfully to Hotel Branch " + hotelBranch.getBranchName());
			    System.out.println("+ Room price per night : " + rate);
			    System.out.println("+ Room max Guests = " + maxGuests);
			}
		    }

		    if (c == 2) {
			System.out.println("++ Show all Room in a Branch ++");
			System.out.print("Enter current Branch name that you want to display all room : ");
			String branchName = sc.nextLine();
			HotelBranch hotelBranch = myHotelChain.findBranchByName(branchName);
			if (hotelBranch == null) {
			    throw new Exception("Cannot find Branch with name " + branchName + ".");
			}
			hotelBranch.showAllRooms();
		    }

		    if (c != 1 && c != 2) {
			throw new Exception("You entered the wrong option ! Option must be 1 or 2");
		    }

		    System.out.println();
		    System.out.println("+++++++++++++++++++++++++++++");
		}
		if (op == 2) {
		    System.out.println("+++++++++++++++++++++++++++++");
		    System.out.println();
		    System.out.println("++ 2 - Guest Management ++");
		    System.out.println();
		    System.out.println(
			    "You can : 1 - Add new Guest || 2 - Show all Rooms that Guest booked and show Guest's Total Spent");
		    System.out.print("Your choice = ");
		    int c = sc.nextInt();
		    sc.nextLine();
		    System.out.println();

		    if (c == 1) {
			System.out.println("++ Add new Guest ++");
			System.out.print("Current Branch that you want to add Guest : ");
			String branchName = sc.nextLine();
			HotelBranch hotelBranch = myHotelChain.findBranchByName(branchName);
			if (hotelBranch == null) {
			    throw new Exception("Cannot find Branch with name " + branchName + ".");
			}
			System.out.print("Enter Guest name : ");
			String guestName = sc.nextLine();
			Guest newGuest = new Guest(guestName);
			hotelBranch.addGuest(newGuest);
			System.out.println("Guest " + guestName + " has been added to Hotel Branch "
				+ hotelBranch.getBranchName() + " succesfully.");
		    }

		    if (c == 2) {
			System.out.println("++ Show all Rooms that a Guest booked and Guest's Total Spent ++");
			System.out.print("Enter Guest name : ");
			String guestName = sc.nextLine();
			System.out.print("Enter Guest's Current Branch : ");
			String branchName = sc.nextLine();
			HotelBranch hotelBranch = myHotelChain.findBranchByName(branchName);
			if (hotelBranch == null) {
			    throw new Exception("Cannot find Branch with name " + branchName + ".");
			}

			Guest guest = hotelBranch.getGuestFromBranch(guestName);
			if (guest == null) {
			    throw new Exception("Cannot find this Guest named " + guestName + " from Hotel Branch "
				    + hotelBranch.getBranchName() + ".");
			}

			guest.showBookedRooms();
			System.out.println("Guest " + guestName + " spent " + guest.calculateTotalSpent() + " USD");
		    }

		    if (c != 1 && c != 2) {
			throw new Exception("You entered the wrong option ! Option must be 1 or 2");
		    }

		    System.out.println();
		    System.out.println("+++++++++++++++++++++++++++++");
		}

		if (op == 3) {
		    System.out.println("+++++++++++++++++++++++++++++");
		    System.out.println();
		    System.out.println("++ 3 - Book Room and Release Room ++");
		    System.out.println("You can : 1 - Book a room. || 2 - Release Room.");
		    System.out.print("Your choice = ");
		    int c = sc.nextInt();
		    sc.nextLine();
		    System.out.println();

		    if (c == 1) {
			System.out.println("++ Book a Room. ++");

			// test
			HotelBranch hotelBranch2 = new HotelBranch("Osaka Japan");
			myHotelChain.addBranch(hotelBranch2);
			Guest newGuest = new Guest("Manh Nguyen");
			hotelBranch2.addGuest(newGuest);
			Room newRoom = new SuiteRoom("RR12", 125.25, true, 4);
			hotelBranch2.addRoom(newRoom);

			System.out.print("Enter your Current Branch : ");
			String branchName = sc.nextLine();
			HotelBranch hotelBranch = myHotelChain.findBranchByName(branchName);
			if (hotelBranch == null) {
			    throw new Exception("Cannot find Branch with name " + branchName + ".");
			}

			System.out.print("Enter Guest name : ");
			String guestName = sc.nextLine();
			Guest guest = hotelBranch.getGuestFromBranch(guestName);
			if (guest == null) {
			    throw new Exception("Cannot find this Guest named " + guestName + " from Hotel Branch "
				    + hotelBranch.getBranchName() + ".");
			}

			System.out.print("Enter Room Number that you want to book : ");
			String roomNumber = sc.nextLine();
			Room room = hotelBranch.getRoomFromBranch(roomNumber);
			if (room == null) {
			    throw new Exception("Cannot find Room with Room number = " + roomNumber);
			}

			if (room.isAvailable() == false) {
			    throw new Exception("This Room number " + roomNumber
				    + " is not available. It is booked by another Guest");
			}

			System.out.print("How many nights would you like to rent this room ? -- ");
			int nights = sc.nextInt();
			if (nights <= 0) {
			    throw new Exception("Nights must be equal or greater than 1 !");
			}

			List<String> addAmenities = new ArrayList<String>();
			double minibarPrice = 0;
			double bathtubPrice = 0;
			double butlerPrice = 0;

			addAmenities = new ArrayList<String>();

			if (room.getRoomType() == "Vip Room") {
			    System.out.println("We have some exclusive amenities for you to choose : ");
			    System.out.println("( 1 - choose, 0 - ignore;");
			    // Minibar
			    System.out.println("Minibar : ");
			    c = sc.nextInt();
			    if (c != 1 && c != 0) {
				throw new Exception("Wrong input option ! Please try again !");
			    }
			    if (c == 1) {
				addAmenities.add("Minibar");
				minibarPrice = nights * 15;
			    }

			    // Premium Bathtub
			    System.out.println("Premium Bathtub : ");
			    c = sc.nextInt();
			    if (c != 1 && c != 0) {
				throw new Exception("Wrong input option ! Please try again !");
			    }
			    if (c == 1) {
				addAmenities.add("Premium Bathtub");
				bathtubPrice = nights * 30;
			    }
			}

			if (room.getRoomType() == "Suite Room") {
			    System.out.println("We have some exclusive amenities for you to choose : ");
			    System.out.println("( 1 - choose, 0 - ignore;");
			    // Minibar
			    System.out.println("Minibar : ");
			    c = sc.nextInt();
			    if (c != 1 && c != 0) {
				throw new Exception("Wrong input option ! Please try again !");
			    }
			    if (c == 1) {
				addAmenities.add("Minibar");
				minibarPrice = nights * 15;
			    }

			    // Premium Bathtub
			    System.out.println("Premium Bathtub : ");
			    c = sc.nextInt();
			    if (c != 1 && c != 0) {
				throw new Exception("Wrong input option ! Please try again !");
			    }
			    if (c == 1) {
				addAmenities.add("Premium Bathtub");
				bathtubPrice = nights * 30;
			    }

			    // Private Butler Service
			    System.out.println("Private Butler Service : ");
			    c = sc.nextInt();
			    if (c != 1 && c != 0) {
				throw new Exception("Wrong input option ! Please try again !");
			    }
			    if (c == 1) {
				addAmenities.add("Private Butler Service");
				bathtubPrice = nights * 60;
			    }
			}

			hotelBranch.bookRoom(room, guest, nights);
			System.out.println("From Hotel " + hotelBranch.getBranchName() + " :");
			System.out.println(" Guest " + guest.getGuestName() + " has booked a " + room.getRoomType()
				+ " with Room Number = " + room.getRoomNumber() + " succesfully.");
			System.out.println(
				"This " + room.getRoomType() + " costs you " + room.calculatePrice(nights) + " USD");

			if (minibarPrice != 0) {
			    System.out.println("Minibar costs you " + minibarPrice + " USD");
			}
			if (bathtubPrice != 0) {
			    System.out.println("Premium Bathtub costs you " + bathtubPrice + " USD");
			}
			if (butlerPrice != 0) {
			    System.out.println("Private Butler Service costs you " + butlerPrice + " USD");
			}
		    }

		    if (c == 2) {
			System.out.println("++ Release Room ++");
			System.out.print("Enter your Current Branch : ");
			String branchName = sc.nextLine();
			HotelBranch hotelBranch = myHotelChain.findBranchByName(branchName);
			if (hotelBranch == null) {
			    throw new Exception("Cannot find Branch with name " + branchName + ".");
			}

			System.out.print("Enter Guest name : ");
			String guestName = sc.nextLine();
			Guest guest = hotelBranch.getGuestFromBranch(guestName);
			if (guest == null) {
			    throw new Exception("Cannot find this Guest named " + guestName + " from Hotel Branch "
				    + hotelBranch.getBranchName() + ".");
			}

			System.out.println("Enter Room Number that you want to release : ");
			String roomNumber = sc.nextLine();
			Room room = hotelBranch.getRoomFromBranch(roomNumber);
			if (room == null) {
			    throw new Exception("Cannot find Room with Room number = " + roomNumber);
			}

			if (guest.isThisGuestBookRoom(room) == false) {
			    throw new Exception("Guest " + guestName
				    + " has not booked this room yet, so that he can't release it !");
			}

			if (room.isAvailable() == true) {
			    throw new Exception("This Room number " + roomNumber
				    + " is currently available, so that you cannot release it !");
			}

			sc.nextLine();
			hotelBranch.releaseRoom(room, guest);
			System.out.println("From Hotel " + branchName + " : Guest " + guestName
				+ " has just Released a room with Room Number " + room.getRoomNumber() + ".");

		    }

		    if (c != 1 && c != 2) {
			throw new Exception("You entered the wrong option ! Option must be 1 or 2");
		    }

		    System.out.println();
		    System.out.println("+++++++++++++++++++++++++++++");
		}

		if (op == 4) {
		    System.out.println("+++++++++++++++++++++++++++++");
		    System.out.println();
		    System.out.println("++ 4 - Hotel Branch Management ++");
		    System.out.println();
		    System.out.println(
			    "You can : 1 - Add new Hotel Branch || 2 - Show all Hotel Branches in your Hotel Chain");
		    System.out.print("Your choice = ");
		    int c = sc.nextInt();
		    sc.nextLine();

		    if (c == 1) {
			System.out.println("++ Add new Hotel Branch ++");
			System.out.print("Enter the new Hotel's Branch Name : ");
			String branchName = sc.nextLine();
			HotelBranch hotelBranch = new HotelBranch(branchName);
			myHotelChain.addBranch(hotelBranch);
			System.out.println("A new Hotel : " + branchName + " has been added to your Hotel Chain !");
		    }

		    if (c == 2) {
			System.out.println("++ Show all Hotel Branches in your Hotel Chain ++");
			myHotelChain.showAllBranches();
		    }

		    if (c != 1 && c != 2) {
			throw new Exception("You entered the wrong option ! Option must be 1 or 2");
		    }
		    System.out.println();
		    System.out.println("+++++++++++++++++++++++++++++");
		}

		if (op == 5) {
		    System.out.println("+++++++++++++++++++++++++++++");
		    System.out.println();
		    System.out.println("++ 5 - Report and Analyze your Hotel Chain ++");
		    System.out.println();
		    System.out.println("You can : ");
		    System.out.println("1 - Calculate a Hotel branch's Revenue");
		    System.out.println("2 - Calculate Total Revenue of your Hotel Chain");
		    System.out.println("3 - Analyze the most popular room type");
		    System.out.println("and Find out What's Hotel has highest Revenue in your entire Hotel Chain");
		    System.out.print("Your choice = ");
		    int c = sc.nextInt();
		    sc.nextLine();
		    System.out.println();

		    if (c == 1) {
			System.out.println("++ Calculate a Hotel branch's Revenue ++");
			System.out.print("Enter Hotel's name that you want to calculate Revenue : ");
			String branchName = sc.nextLine();
			HotelBranch hotelBranch = myHotelChain.findBranchByName(branchName);
			if (hotelBranch == null) {
			    throw new Exception("Cannot find Hotel branch with name " + branchName);
			}
			System.out.println(
				"Hotel " + branchName + "'s Current Revenue = " + hotelBranch.calculateRevenue());
		    }

		    if (c == 2) {
			System.out.println("++ Calculate total Revenue of your Hotel Chain ++");
			System.out.println(
				"Total Revenue of your entire Hotel Chain : " + myHotelChain.calculateTotalRevenue());
		    }
		    if (c == 3) {
			System.out.println("++ Find the most Popular Room Type ++");
			myHotelChain.findTheMostPopularRoomType();
			System.out.println();
			System.out
				.println("++ Find out What's Hotel has highest Revenue in your entire Hotel Chain ++");
			myHotelChain.findHotelWithHighestRevenue();
		    }

		    if (c != 1 && c != 2 && c != 3) {
			throw new Exception("You entered the wrong option ! Option must be 1,2 or 3");
		    }
		    System.out.println();
		    System.out.println("+++++++++++++++++++++++++++++");
		}
		if (op == 6) {
		    System.out.println("+++++++++++++++++++++++++++++");
		    System.out.println();
		    System.out.println("Exit program -- ");
		    System.out.println("Thank you. See you again !");
		    return;
		}
	    } catch (Exception e) {
		System.out.println("Error : " + e.getMessage());
		sc.nextLine();
	    }
	}
    }
}
