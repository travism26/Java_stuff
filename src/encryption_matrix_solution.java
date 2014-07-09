import java.util.Scanner;

public class encryption_matrix_solution {

	public void solve() {

	}

	public static void println(String in) {
		System.out.println(in != null ? in : "null");
	}

	public static void println() {
		System.out.println();
	}

	public String printAns(char[][] input) {
		String out = "";
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 7; j++) {
				out += input[j][i];
			}
			out += " ";
		}
		return out;
	}

	public String encrypt(String input) {
		int cIndex = 0;
		String answer="";
		// remove all the spaces in the string.
		input = input.replaceAll(" ", "");
		char[][] matrix = new char[7][8];
		// System.out.println(message.length());

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 8; j++) {
				if (input.length() > cIndex)
					matrix[i][j] = input.charAt(cIndex++);
				else
					break;
			}
		}
		answer = printAns(matrix);
		return answer;
	}

	public static void main(String[] args) {

		encryption_matrix_solution obj = new encryption_matrix_solution();
		Scanner in = new Scanner(System.in);

		String message = in.nextLine();
		System.out.println(obj.encrypt(message));
		
	}

	private static void println(char c) {
		System.out.print(c);

	}
}