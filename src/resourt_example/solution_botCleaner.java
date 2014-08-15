import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class solution_botCleaner {
	
	public int getNumDirty(String[] board){
		int counter = 0;
		for (int i = 0; i < board.length; i++) {
			for(int j = 0; j<board[i].length(); j++){
				if(board[i].charAt(j) == 'd'){
					counter++;
				}
				else
					;
			}
		}
		return counter;
	}
	public String[][] getDirt(String[] board) {

		int numDirty = 0;

		String[][] dirtLocation = new String[numDirty][2];

		return null;
	}

	static void nextMove(int posr, int posc, String[] board) {

	}

	public static void main(String[] args) {
		String test_input = "-----";
		Scanner in = new Scanner(System.in);
		int[] pos = new int[2];
		String board[] = new String[5];

		for (int i = 0; i < board.length; i++) {
			board[i] = test_input;
		}

		board[0] = "-b--d";
		pos[0] = 0;
		pos[1] = 1;

		// for (int i = 0; i < 2; i++)
		// pos[i] = in.nextInt();
		// for (int i = 0; i < 5; i++)
		// board[i] = in.next();
		nextMove(pos[0], pos[1], board);
	}
}
