package guessTheMovieNameAssignmentRevised;

public class Main {

	public static void main(String[] args) {

		System.out.println("***GUESS MOVIE NAME GAME***");
		Game game = new Game();
		String selectedMovie = game.setMovieTitle();
		System.out.println("***GAME STARTS***");
		System.out.println("Movie selected for you to guess: (the name includes spaces and punctuations):"
				+ game.makeMovieTitleHidden(selectedMovie));
		System.out.println("No.of letters in the movie: " + game.noOfLettersToGuess(selectedMovie));
		game.processGuessLetter(selectedMovie);
	}

}
