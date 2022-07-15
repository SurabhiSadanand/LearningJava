package gameAssignment;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class Game {
	int wrongAttempts = 0;
	String rightLetters = "";
	String wrongLetters = "";

	// method to randomly pick movie
	public String pickMovie(String[] listOfMovies) {

		Random rand = new Random();
		int randomIndexValue = rand.nextInt(25);
		String movieToGuess = listOfMovies[randomIndexValue];
		return movieToGuess;
	}
	// method to read each letter, check if its present in movie if yes replace
	// underscore with its occurences
	// if not display wrong attempt and increment attempt count by 1,

	public void processCheckMovie(String movieToGuess, int noOfLetterToGuess, char[] maskMovie,
			String maskedMovieName) {

		do {
			System.out.println("Guess the letter: ");
			Scanner scanner = new Scanner(System.in);
			String letterGuessed = scanner.next();
			if (movieToGuess.contains(letterGuessed) && noOfLetterToGuess > 0) {

				if (rightLetters.contains(letterGuessed)) {
					System.out.println("This letter was already tried");

				} else {
					System.out.println("Letter is present in the movie");
					// finding all index of letter correctly guessed
					for (int index = movieToGuess.indexOf(letterGuessed); index >= 0; index = movieToGuess
							.indexOf(letterGuessed, index + 1)) {
						System.out.println("Letter is present at index:" + index);
						maskMovie[index] = movieToGuess.charAt(index);
						noOfLetterToGuess--;
						rightLetters += " " + letterGuessed;
					}
				}
				System.out.println(maskMovie);
			} else {
				if (wrongLetters.contains(letterGuessed)) {
					System.out.println("This letter was already tried");

				} else {
					System.out.println("Incorrectly guessed");
					System.out.println("you have made " + (wrongAttempts + 1) + " incorrect attempts");
					wrongAttempts++;
					wrongLetters += " " + letterGuessed;
				}
			}

		} while (wrongAttempts < 10 && movieToGuess != (maskedMovieName) && noOfLetterToGuess > 0);
		if (noOfLetterToGuess == 0) {
			System.out.println("********Congratulations.....you won *********");
		} else if (wrongAttempts == 10) {
			System.out.println("... Game over...");
		}
	}
}
