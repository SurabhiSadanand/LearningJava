package guessTheMovieGameAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class MovieList {

	String[] listOfMovies = new String[25];

	// Method to read movie names from a txt file and store it in an array
	// listOfMovies[] and display it
	 public MovieList(String pathname) {
		File f1 = new File(pathname);
		try {
			Scanner sc = new Scanner(f1); // read from file
			do {
				for (int i = 0; i < listOfMovies.length; i++) {
					listOfMovies[i] = sc.nextLine(); // store it in an array
				}
			} while (sc.hasNextLine()); // to read till end of file
			// display list of movies in string
			System.out.println("List of Movies read from the file: ");
			for (int i = 0; i < listOfMovies.length; i++) {
				System.out.println(listOfMovies[i]);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist!");
		}
	}

	public String getRandomMovie() {
		Random rand = new Random();
		int randomIndexValue = rand.nextInt(25);
		String movieToGuess = listOfMovies[randomIndexValue];
		//System.out.println("Movie picked:" + movieToGuess);
		//char[] movieToGuessArray = movieToGuess.toCharArray();
		return movieToGuess;
	}
	
	
}
