import java.util.*;

public class Solution {

    	public int[] parseToString(String line){
		String[] numbers = line.split("\\s");
		int[] myNumbers = new int[numbers.length];
		int i = 0;
		for (String s : numbers) {
			try {
				int num = Integer.parseInt(s);
				myNumbers[i] = num;
				i++;
			} catch (NumberFormatException e) {
				// was not a number
			}
		}
		return myNumbers;
	}
    
	public void getPath(int mX, int mY, int pX, int pY) {

		int xDiff = mX - pX;
		int abs = Math.abs(xDiff);
		for (int i = 0; i < abs; i++) {
			if (xDiff > 0) {
				System.out.println("UP");
			} else if (xDiff < 0) {
				System.out.println("DOWN");
			}
		}
		int yDiff = mY - pY;
		abs = Math.abs(yDiff);
		for (int i = 0; i < abs; i++) {
			if (yDiff < 0) {
				System.out.println("RIGHT");
			} else if (yDiff > 0) {
				System.out.println("LEFT");
			}
		}

	}

	public void solve(char[][] grid, int mX, int mY) {
		// mario local
		//int mX = 0;
		//int mY = 0;

		// princess local
		int pX = 0;
		int pY = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j] == 'p') {
					pX = i;
					pY = j;
				} else if (grid[i][j] == 'm') {
					mX = i;
					mY = j;
				} else
					;
			}
		}
		getPath(mX, mY, pX, pY);
	}

	public static void main(String[] args) {
		Solution obj = new Solution();

		Scanner in = new Scanner(System.in);
		int gridHeight = in.nextInt();
		String consume = in.nextLine();
        String mpos = in.nextLine();
        int[] position = obj.parseToString(mpos);
        
        int mX = position[0];
        int mY = position[1];
            
		char[][] grid = new char[gridHeight][gridHeight];

		String input = "";
		int i = 0;

		while (gridHeight-- > 0) {
			input = in.nextLine();
			grid[i] = input.toCharArray();
			i++;
		}
		obj.solve(grid, mX, mY);
	}
}
