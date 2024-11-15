package myHotel;

public interface Room {
    public String getRoomNumber();

    public boolean isRoomAvailable();

    public void bookRoom();

    public void releaseRoom();
}
