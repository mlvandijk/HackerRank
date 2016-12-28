package thirtyDaysOfCode;

/* Credits: Blondiebytes via HackerRank
 * https://www.hackerrank.com/challenges/30-binary-trees/tutorial
 * https://www.youtube.com/watch?v=edg25CkMtOc
 * 
 * Additional fixes:
 * - catch InputMismatchException if expected input is int, but input is not
 * - accept 'y' in addition to 'Y' for Yes.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToeApplication {
	public static void main(String[] args) {
		// Getting input
		Scanner sc = new Scanner(System.in);
		// Allow for cont. games
		boolean doYouWantToPlay = true;
		while(doYouWantToPlay) {
			// Setting up our tokens and AI
			System.out.println("Welcome to TicTacToe. You are playing against the TicTacToe master. Are your ready?");
			System.out.println("First pick what character you want to be.");
			System.out.println("Enter a single character that will represent you on the board:");
			char playerToken = sc.next().charAt(0);
			System.out.println("Enter a single character that will represent your opponent on the board:");
			char opponentToken = sc.next().charAt(0);
			TicTacToe game = new TicTacToe(playerToken, opponentToken);
			AI ai = new AI();
			
			//Set up the game
			System.out.println();
			System.out.println("Now we can start the game.");
			System.out.println("To play, enter a number and your token will be put in its place");
			System.out.println("The numbers go from 1 - 9, left to right");
			TicTacToe.printIndexBoard();
			System.out.println();
			
			// let's play
			int spot = 0;
			while(game.gameOver().equals("Not over")) {
				if (game.currentMarker == game.userMarker) {
					// User's turn
					System.out.println("It's your turn! Enter a spot for your token");
					try {
						spot = sc.nextInt();
						while(!game.playTurn(spot)) {
							System.out.println("Try again. This spot is already taken or it is out of range.");
							spot = sc.nextInt();
						}
						System.out.println("You picked " + spot + "!");
					} catch (InputMismatchException e) {
						System.out.println("Type a number from 1 - 9");
						sc.nextLine(); // clear buffer
					}
				} else {
					// AI's turn
					System.out.println("It's my turn!");
					int aiSpot = ai.pickSpot(game);
					game.playTurn(aiSpot);
					System.out.println("I picked " + aiSpot + "!");
				}
				System.out.println();
				game.printBoard();
			}
			System.out.println(game.gameOver());
			System.out.println();
			// Set up a new game...?
			System.out.println("Dou you want to play again? Enter Y for Yes or N for No.");
			char response = Character.toUpperCase(sc.next().charAt(0)); // Ensure capital (i.e. accept Y and y)
			doYouWantToPlay = (response == 'Y');
			System.out.println();
			System.out.println();
		}
	}
}
