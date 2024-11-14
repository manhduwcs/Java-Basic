package customers;

import java.util.Scanner;

import music.CompactDisk;

public class UserInterface {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	CDCreator cdCreator = new CDCreator();
	int option = 0;

	while (option != 5) {
	    try {
		System.out.println("----------------------------------");
		System.out.println("Menu Bar ; ");
		System.out.println("1 - Add new Music CD ; 2 - Add new Movie CD");
		System.out.println("3 - Display all Music CDs ; 4 - Display add Movie CDs");
		System.out.println("5 - Exit");
		System.out.print("Your choice = ");
		option = sc.nextInt();
		sc.nextLine();
		System.out.println("----------------------------------");

		if (option == 1) {
		    System.out.println("----------------------------------");
		    System.out.println("1 - Add new Music CD -");
		    String title;
		    String author;
		    double price;
		    int code;
		    System.out.print("Album Title = ");
		    title = sc.nextLine();
		    title = title.trim();
		    System.out.print("Album Author = ");
		    author = sc.nextLine();
		    author = author.trim();
		    System.out.print("Price = ");
		    price = sc.nextDouble();
		    sc.nextLine();
		    System.out.print("Album Code = ");
		    code = sc.nextInt();
		    sc.nextLine();

		    music.CompactDisk newMusic = new CompactDisk(title, author, price, code);
		    cdCreator.addMusicCD(newMusic);
		    System.out.println("----------------------------------");
		}
		if (option == 2) {
		    System.out.println("----------------------------------");
		    System.out.println("2 - Add new Movie CD -");
		    String title;
		    double price;
		    int code;
		    System.out.print("Movie Title = ");
		    title = sc.nextLine();
		    title = title.trim();
		    System.out.print("Price = ");
		    price = sc.nextDouble();
		    sc.nextLine();
		    System.out.print("Movie Code = ");
		    code = sc.nextInt();
		    sc.nextLine();

		    movies.CompactDisk newMovie = new movies.CompactDisk(title, price, code);
		    cdCreator.addMovieCD(newMovie);
		    System.out.println("----------------------------------");
		}
		if (option == 3) {
		    System.out.println("----------------------------------");
		    System.out.println("3 - Display all Music CDs");
		    cdCreator.displayAllMusic();
		    System.out.println("----------------------------------");
		}
		if (option == 4) {
		    System.out.println("----------------------------------");
		    System.out.println("4 - Display all Movie CDs");
		    cdCreator.displayAllMovies();
		    System.out.println("----------------------------------");
		}
		if (option == 5) {
		    System.out.println("----------------------------------");
		    System.out.println("5 - Exit program.");
		    System.out.println("Thank you. See you later !");
		    return;
		}

	    } catch (Exception e) {
		sc.nextLine();
		System.out.println("Wrong input type. Please enter your choice again !");
	    }
	}
    }
}
