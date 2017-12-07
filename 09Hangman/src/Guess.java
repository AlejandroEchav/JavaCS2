import java.io.FileNotFoundException;
import java.util.Scanner;

public class Guess {
	private Scanner wordScan = new Scanner(System.in);
	String secretWord = "";
	int missed = 0;
	int ltrGuessed=0;
	char[] hWord;
	Dictionary Words;
	boolean ag=false;
	public Guess() throws FileNotFoundException{
		Words = new Dictionary();
		secretWord = Words.randomWord();
		
		System.out.println(secretWord);
		System.out.println("the word has " + secretWord.length() + " letters");
		
		hWord= new char[secretWord.length()];
		for (int i=0; i<secretWord.length(); i++) {
			hWord[i]='-';
		}
		System.out.println(new String(hWord));
		
	}
	public char askGuess(){

		System.out.print("Insert a letter: ");
		String guessLine = wordScan.nextLine();
		guessLine = guessLine.toLowerCase();
		char guessLetter=' ';
		if(guessLine.length() >=1) {
		guessLetter = guessLine.charAt(0);
		}
		ag=false;
		for (int i=0;i<secretWord.length(); i++) {
			if (hWord[i]==guessLetter) {
				ag=true;
			}
		}
		while((guessLine.length() !=1 ||(guessLetter < 'a' || guessLetter > 'z'))||ag) {
			System.out.println("The guess is invalid! Try  again: ");
			guessLine = wordScan.nextLine();
			guessLetter = guessLine.charAt(0);
			ag=false;
			for (int i=0;i<secretWord.length(); i++) {
				if (hWord[i]==guessLetter) {
					ag=true;
				}
			}
		}
		
		return(guessLetter);
		
	}
	

	public void checkGuess() throws FileNotFoundException{
		while(missed!=7&&ltrGuessed!=secretWord.length()) {
			ltrGuessed=0;
			
			char guessedLetter = this.askGuess();
		
			if(secretWord.indexOf(guessedLetter) != -1) {
				System.out.println("Correct Guess!");
				int ltrPos = secretWord.indexOf(guessedLetter);
				hWord[ltrPos]=guessedLetter;
				//System.out.println("The letter is at posistion: " + ltrPos);
				while (ltrPos != -1) {
					int i = ltrPos +1;
					hWord[ltrPos]=guessedLetter;
					ltrPos = secretWord.indexOf(guessedLetter, i);
					
				}
			}
			else {
				missed = missed +1;
				System.out.println("There is no " + Character.toString(guessedLetter) +" in the word\n" +  missed + " wrong guesses");
			}
			System.out.println(new String(hWord));
			for (int i=0; i<secretWord.length(); i++) {
				if (hWord[i]!='-') {
					ltrGuessed++;
				}
			}
			if (ltrGuessed==secretWord.length()) {
				System.out.println("win");
			}
			else if (missed==7) {
				System.out.println("lose");
			}
		}
	}
	
}
