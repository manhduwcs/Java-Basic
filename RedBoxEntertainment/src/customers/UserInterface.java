package customers;

import music.CompactDisk;

public class UserInterface {
    public static void main(String[] args) {
	CDCreator cdCreator = new CDCreator();
	music.CompactDisk cd1 = new CompactDisk("The Voice", "Johnny Boy", 1290000, 119934043);
	cdCreator.addMusicCD(cd1);
	cdCreator.displayAllMusic();
    }
}
