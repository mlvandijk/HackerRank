package thirtyDaysOfCode;

import java.util.ArrayList;
import java.util.Random;

class AI {
	
	public int pickSpot(TicTacToe game){
		ArrayList<Integer> choices = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			// if slot is available (not taken), add to choices
			if (game.board[i] == '-') {
				choices.add(i + 1);
			}
		}
		// Pick a random available spot
		Random rand = new Random();
		int choice = choices.get(Math.abs(rand.nextInt() % choices.size()));
		return choice;
	}
}
