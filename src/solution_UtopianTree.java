import java.util.*;

public class solution_UtopianTree {
	public int solve(int a) {
			int tempAns = 1;
			for (int i = 1; i <= a; i++) {
				if (i % 2 != 0) {
					tempAns *= 2;
				} else {
					tempAns++;
				}
			}
		return tempAns;
	}

	public void run() {

		Scanner in = new Scanner(System.in);

		int numTests = in.nextInt();
		ArrayList<Integer> testCases = new ArrayList<Integer>();		
		int userInput = 0;

		for (int i = 0; i < numTests; i++) {
			userInput = in.nextInt();
			testCases.add(userInput);
		}

		for (int i = 0; i < testCases.size(); i++) {
			System.out.println(solve(testCases.get(i)));
		}
	}

	public static void main(String[] args) {

		solution_UtopianTree obj = new solution_UtopianTree();

		obj.run();

	}
}