package guessTheMovieGameAssignment;

public class Main {

	public static void main(String[] args) {

		//creating object of game class with pathname of movies.txt as argument 
		
		Game game= new Game("C:\\Users\\Surabhi\\Desktop\\QA COURSE\\Class21-10July\\movies.txt");
        System.out.println("**************Guess the Movie Game*********************");
		System.out.println("Enter one letter at a time.");
        System.out.println("If its correct, you will be shown the position of that alphabet in the name else you will be shown no. of wrong attempts made");
		System.out.println("Let's start!");
		System.out.println("The movie title has " + game.getMovieTitle().length() + " characters (including spaces "+ "and punctuation).");
        
		game.getHiddenMovieTitle();
		game.inputLetter();

}
}