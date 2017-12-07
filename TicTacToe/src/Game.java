import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Board gameBoard = new Board();
		System.out.println("Welcome to Tic Tac Toe");
		gameBoard.display();
		Scanner guessScan = new Scanner(System.in);
		
		Player[] players = new Player[2];
		Player[0] = new Player('X');
		Player[1] = new Player('O');
		
		boolean gameOn = true;
		while (gameOn) {
			
		}
		
		// Instantiate a class for player 1

		// Instantiate a class for player 2
		
		// Loop while the game is not over
		
			// Ask a player a for a row and column
		
			// Place the proper token on board in the proper place
		
			// Print the board

		// Print a victory message or a tie message
	}
}


class Player {
	Player() {
	}
	private char marker = ' ';
	Player(char token) {
		marker = token;
	}
	
}



class Board {
	private char [][] theBoard = {
			{' ', ' ', ' '},
			{' ', ' ', ' '},
			{' ', ' ', ' '}
	};
	
	Board() {
		// Do nothing for now.
	}
	
	// This method needs to display the current board.
	void display() {
		System.out.println("    0   1   2");
		System.out.println(" A  " + theBoard[0][0] + " | " + theBoard[0][1] + " | " + theBoard[0][2]);
		System.out.println("    ----------");
		System.out.println(" B  " + theBoard[1][0] + " | " + theBoard[1][1] + " | " + theBoard[1][2]);
		System.out.println("    ----------");
		System.out.println(" C  " + theBoard[2][0] + " | " + theBoard[2][1] + " | " + theBoard[2][2]);
		// Challenge: Try to put the above output statements into a loop -- or two.
	}	
	
	char update1() {
		return('x');
	}
	char update2() {
		return('o');
	}
	
	
}