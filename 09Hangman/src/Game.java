import java.io.FileNotFoundException;

public class Game {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Welcome to Hangman");
		Guess obj = new Guess();
		obj.checkGuess();
	}

}
