package myHotelChain;

import java.util.ArrayList;

public class HotelChain {
    protected ArrayList<HotelBranch> branches;

    public HotelChain() {
	branches = new ArrayList<HotelBranch>();
    }

    public void addBranch(HotelBranch branch) {
	branches.add(branch);
    }

    public void findHotelWithHighestRevenue() {
	// highest revenue
	double hightestRevenue = 0;
	HotelBranch highestRevenueBranch = new HotelBranch("");
	for (HotelBranch hotelBranch : branches) {
	    if (hotelBranch.calculateRevenue() > hightestRevenue) {
		hightestRevenue = hotelBranch.calculateRevenue();
		highestRevenueBranch = hotelBranch;
	    }
	}
	System.out.println("Hotel Branch with highest Revenue : " + highestRevenueBranch.getBranchName());

	// Room Type that has been booked the most
    }

    public void findTheMostPopularRoomType() {
	double stdRoomCount = 0;
	double vipRoomCount = 0;
	double suiteRoomCount = 0;
	for (HotelBranch hotelBranch : branches) {
	    for (Room room : hotelBranch.getBranchRoomBooked()) {
		if (room instanceof StandardRoom) {
		    stdRoomCount++;
		}
		if (room instanceof VipRoom) {
		    vipRoomCount++;
		}
		if (room instanceof SuiteRoom) {
		    suiteRoomCount++;
		}
	    }
	}
	double mostBooked = Math.max(stdRoomCount, Math.max(vipRoomCount, suiteRoomCount));
	if (mostBooked == stdRoomCount) {
	    System.out.println("Standard Room is the most booked Room type, with total book count = " + mostBooked);
	    return;
	}
	if (mostBooked == vipRoomCount) {
	    System.out.println("Vip Room is the most booked Room type, with total book count = " + mostBooked);
	    return;
	}
	if (mostBooked == suiteRoomCount) {
	    System.out.println("Suite Room is the most booked Room type, with total book count = " + mostBooked);
	    return;
	}
    }

    public double calculateTotalRevenue() {
	double totalRevenue = 0;

	for (HotelBranch hotelBranch : branches) {
	    totalRevenue += hotelBranch.calculateRevenue();
	}
	totalRevenue = (totalRevenue * 100.0) / 100.0;
	return totalRevenue;
    }

    public void showAllBranches() {
	for (HotelBranch hotelBranch : branches) {
	    System.out.println("Hotel Branch " + hotelBranch.getBranchName());
	}
    }

    public HotelBranch findBranchByName(String branchName) {
	for (HotelBranch hotelBranch : branches) {
	    if (hotelBranch.getBranchName().equals(branchName)) {
		return hotelBranch;
	    }
	}
	return null;
    }
}
