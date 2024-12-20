package customers;

public class CDCreator {
    protected int NextMovie;
    protected int NextMovieCode;
    protected int NextAlbum;
    protected int NextAlbumCode;
    protected music.CompactDisk[] cd;
    protected movies.CompactDisk[] vcd;

    public CDCreator() {
	NextMovie = 0;
	NextMovieCode = 10;
	NextAlbum = 0;
	NextAlbumCode = 10;
	cd = new music.CompactDisk[NextAlbumCode];
	vcd = new movies.CompactDisk[NextMovieCode];
    }

    public void addMusicCD(music.CompactDisk cd) {
	if (NextAlbum >= NextAlbumCode) {
	    System.out.println("Music Album is full. New music cannot be added.");
	    return;
	}
	this.cd[NextAlbum] = cd;
	this.NextAlbum++;
	System.out.println("New music album " + cd.getTitle() + " has been added succesfully !");
    }

    public void addMovieCD(movies.CompactDisk vcd) {
	if (NextMovie >= NextMovieCode) {
	    System.out.println("Movie List is full. New movie cannot be added.");
	    return;
	}
	this.vcd[NextMovie] = vcd;
	this.NextMovie++;
	System.out.println("New movie " + vcd.getTitle() + " has been added succesfully !");
    }

    public void displayAllMusic() {
	for (music.CompactDisk item : cd) {
	    if (item != null) {
		System.out.println("----------------------------------");
		System.out.println("Music Title : " + item.getTitle());
		System.out.println("Author : " + item.getAuthor());
		System.out.println("Price : " + item.getPrice());
		System.out.println("Music Code : " + item.getCode());
		System.out.println("----------------------------------");
	    }
	}
    }

    public void displayAllMovies() {
	for (movies.CompactDisk item : vcd) {
	    if (item != null) {
		System.out.println("----------------------------------");
		System.out.println("Music Title : " + item.getTitle());
		System.out.println("Price : " + item.getPrice());
		System.out.println("Music Code : " + item.getCode());
		System.out.println("----------------------------------");
	    }
	}
    }
}
