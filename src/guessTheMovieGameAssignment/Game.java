package guessTheMovieGameAssignment;

	import java.util.Scanner;
	public class Game {

		/*
		 * Class that represents a "Guess The Movie" Game: computer randomly picks a
		 * movie title, and shows how many letters it's made up of. The goal is to try
		 * to figure out the movie by guessing one letter at a time. If a letter is
		 * indeed in the title the computer will reveal its correct position in the
		 * word, if not, the player loses a point. If the player loses 10 points, the
		 * game is over.
		 */

		private String movieNameToGuess;
		private int noOfAttempts;
		private String wrongLetters;
		private String rightLetters;
		private boolean gameWon;
		private int noOfLetterToGuess;
		private String maskedMovieName;
		private String letterGuessed;
		
		private int wrongAttempts;
		

		// constructor to initialize class variable
		public Game(String pathname) {
			MovieList movieList = new MovieList(pathname);
			movieNameToGuess = movieList.getRandomMovie();
			noOfAttempts = 0;
			rightLetters = "";
			wrongLetters = "";
		}

		// method to return movie title to be guessed
		public String getMovieTitle() {
			return movieNameToGuess;
		}

		/*
		 * method to replace all movie title alphabets with underscore,if not guessed
		 * correctly and to replace all alphabets except guessed ones, if letter was
		 * guessed correctly
		 */
		public String getHiddenMovieTitle() {
			maskedMovieName = movieNameToGuess.replaceAll("[a-zA-Z]", "_");
			System.out.println(maskedMovieName);
			return maskedMovieName;
		}

		// Method that returns letters guessed that are not in the movie title.
		public String getWrongLetters() {
			return wrongLetters;
		}
		
		// Method that takes input letter and checks if its present in movie name if
		// yes, then replace the underscore with correct letter and if not present,
		// gives another 9 attempts
		public void inputLetter() {
			char[] maskMovie = maskedMovieName.toCharArray();
			char[] movieToGuessArray = movieNameToGuess.toCharArray();
			String movieNameWithoutSpace = movieNameToGuess.replace(" ", "");
			//System.out.println("Total no of letter in the movie: " + movieNameWithoutSpace.length());
			noOfLetterToGuess = movieNameWithoutSpace.length(); // length of movie without space
			do {
				System.out.println("Guess the letter: ");
				Scanner scanner = new Scanner(System.in);
				letterGuessed = scanner.next();

				if (movieNameToGuess.contains(letterGuessed) && noOfLetterToGuess > 0) {

					if (rightLetters.contains(letterGuessed)) {
						System.out.println("This letter was already tried");

					} else {
						System.out.println("Letter is present in the movie");
						// finding all index of letter correctly guessed
						for (int index = movieNameToGuess.indexOf(letterGuessed); index >= 0; index = movieNameToGuess
								.indexOf(letterGuessed, index + 1)) {
							System.out.println("Letter is present at index:" + index);
							maskMovie[index] = movieNameToGuess.charAt(index);
							noOfLetterToGuess--;
							rightLetters += " " + letterGuessed;
						}
					}
					System.out.println(maskMovie);

				} else {

					if (wrongLetters.contains(letterGuessed)) {
						System.out.println("This letter was already tried");

					} else {
						// wrongLetters=letterGuessed;
						System.out.println("Incorrectly guessed");
						System.out.println("you have made " + (wrongAttempts + 1) + " incorrect attempts");
						wrongAttempts++;
						wrongLetters += " " + letterGuessed;
					}
				}

			} while (wrongAttempts < 10 && movieToGuessArray != maskMovie && noOfLetterToGuess > 0);
			if (noOfLetterToGuess == 0) {
				System.out.println("********Congratulations.....you won *********");
			} else if (wrongAttempts == 10) {
				System.out.println("... Game over...");
			}
		}
	}


