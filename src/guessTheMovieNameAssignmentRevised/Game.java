package guessTheMovieNameAssignmentRevised;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Game {

	String movieTitle;
	String letterGuessed;
	String rightLetters;
	String wrongLetters;
	String hiddenMovieTitle;
	int noOfLettersToGuess;
	int wrongAttempts;

	Game()
	{
		noOfLettersToGuess=0;
		wrongAttempts=0;
		rightLetters="";
		wrongLetters="";
	}
	public String getMovieTitle() {
		return movieTitle;
	}

	public String setMovieTitle() {
		String[] movieListArray = new String[25];
		int i = 0;
		try {
			// to read movie name from file
			File file = new File("C:\\Users\\Surabhi\\Desktop\\QA COURSE\\Class21-10July\\movies.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				movieListArray[i] = sc.nextLine();
				i++;
			}
			// to display list of movies
			System.out.println("List of Movies read from the file: ");
			for (int j = 0; j < movieListArray.length; j++) {
				System.out.println(movieListArray[j]);
			}
			// to randomly select one movie from list of movies
			Random rand = new Random();
			int randomIndexValue = rand.nextInt(25);
			movieTitle = movieListArray[randomIndexValue];
			System.out.println(movieTitle);

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
		return movieTitle;
	}

	// method to make Movie Title Hidden
	public String makeMovieTitleHidden(String movieName) {
		hiddenMovieTitle = movieName.replaceAll("[a-zA-Z]", "_");
		return hiddenMovieTitle;
	}

	// method to get the total number of letters to be guessed
	public int noOfLettersToGuess(String movieName) {
		
		String movieNameWithoutSpace = movieName.replace(" ", "");
		noOfLettersToGuess=movieNameWithoutSpace.length();
		int duplicate = 0 ;
	    for (int i = 0; i < movieNameWithoutSpace.length(); i++) {
	        for (int j = i+1; j < movieNameWithoutSpace.length(); j++) {
	            if(movieNameWithoutSpace.charAt(i)==movieNameWithoutSpace.charAt(j))
	            {
	                duplicate++;
                    break;
	            }
	        }  
	    }
	    //System.out.println(duplicate);
		return noOfLettersToGuess-duplicate;
	}

	// method to check if letter guessed was guessed before or not
	public boolean isLetterGuessedAlready(String guessLetter) {
		if (rightLetters.contains(guessLetter) || wrongLetters.contains(guessLetter)) {
			return true;
		}
		return false;
	}

	// to read letter and check if its in movie name
	public void processGuessLetter(String movieTitle) {
		char[] hiddenMovie = hiddenMovieTitle.toCharArray();
		int index = -1;
		do {
			System.out.println("Guess the letter: ");
			Scanner scanner = new Scanner(System.in);
			letterGuessed = scanner.next();
			if (movieTitle.contains(letterGuessed) && (noOfLettersToGuess(movieTitle)) > 0) {
				if (isLetterGuessedAlready(letterGuessed)) {
					System.out.println("This letter was already tried");

				} else {
					System.out.println("Letter is present in the movie");
					// finding all index of letter correctly guessed
					while ((index = movieTitle.indexOf(letterGuessed, index + 1)) != -1) {

						System.out.println("Letter is present at index:" + index);
						hiddenMovie[index] = movieTitle.charAt(index);
						noOfLettersToGuess--;
						rightLetters += " " + letterGuessed;
					}
				}
				System.out.println(hiddenMovie);

			} else {

				if (isLetterGuessedAlready(letterGuessed)) {
					System.out.println("This letter was already tried");

				} else {

					System.out.println("Incorrectly guessed");
					System.out.println("you have made " + (wrongAttempts + 1) + " incorrect attempts");
					wrongAttempts++;
					wrongLetters += " " + letterGuessed;
				}
			}

		} while (wrongAttempts < 10 && movieTitle != hiddenMovieTitle && noOfLettersToGuess > 0);
		isGameWonOrLost();
	}

	// method to check if after processing input letter, game was won or lost
	public void isGameWonOrLost() {
		if (noOfLettersToGuess == 0) {
			System.out.println("********Congratulations.....you won *********");
		} else if (wrongAttempts == 10) {
			System.out.println("... Game over...");
		}
	}
}
