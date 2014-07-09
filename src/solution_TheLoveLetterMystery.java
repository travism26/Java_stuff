import java.util.*;

public class solution_TheLoveLetterMystery {

	public int getShortestChange(char first, char second) {
		int difference = 0;
		if ((int) first > (int) second) {
			difference = (int) first - (int) second;
		} else{
			difference = (int)second - (int)first;
		}
		return difference;
	}

	public String turnToPali(String nonPali) {
		int difference = 0;
		int end = nonPali.length() - 1;
		for (int i = 0; i < end; i++) {
			if (nonPali.charAt(i) != nonPali.charAt(end)) {
				difference += getShortestChange(nonPali.charAt(i), nonPali.charAt(end));
			}
			end--;
		}
		System.out.println(difference);
		return "t";
	}

	public void solve(ArrayList<String> word) {
		int i = 0;
		String tempWord;
		while (i < word.size()) {
			tempWord = new StringBuffer(word.get(i)).reverse().toString();
			if (tempWord.equals(word.get(i))) {
				System.out.println("0");
			}
			else {
				turnToPali(word.get(i));
			}
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		solution_TheLoveLetterMystery obj = new solution_TheLoveLetterMystery();
		ArrayList<String> words = new ArrayList<String>();
		obj.solve(words);

		int testCases = in.nextInt();
		String consumer = in.nextLine();

		int i = 0;
		while (i++ < testCases) {
			words.add(in.nextLine());
		}
		obj.solve(words);
	}
}
