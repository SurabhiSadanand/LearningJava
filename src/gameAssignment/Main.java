package gameAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Game g1 = new Game();
		System.out.println("Guess Movie Game Begins:");
		File f1 = new File("C:\\Users\\Surabhi\\Desktop\\QA COURSE\\Class21-10July\\movies.txt");
		try {
			Scanner sc = new Scanner(f1); // read from file
			String[] listOfMovies = new String[25];
			do {
				for (int i = 0; i < listOfMovies.length; i++) {
					listOfMovies[i] = sc.nextLine(); // store it in an array
				}

			} while (sc.hasNextLine());

			String movieToGuess = g1.pickMovie(listOfMovies);

			// replace all letters
			String maskedMovieName = movieToGuess.replaceAll("[a-zA-Z]", "_");
			System.out.println(maskedMovieName);
			char[] maskMovie = maskedMovieName.toCharArray();
			String movieNameWithoutSpace = movieToGuess.replace(" ", "");
			int noOfLetterToGuess = movieNameWithoutSpace.length(); // length of movie without space
			g1.processCheckMovie(movieToGuess, noOfLetterToGuess, maskMovie, maskedMovieName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
