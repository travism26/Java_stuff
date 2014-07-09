import java.util.*;
public class solution_GemStones implements Runnable {
	
	public void run(){
		Scanner in = new Scanner(System.in);
		int numOfGems = in.nextInt();
		ArrayList<String> gemStones = new ArrayList<String>();
		do{ 
			gemStones.add(in.nextLine());
		} while (numOfGems-- > 0);
		gemStones.remove(0);
		solve(gemStones);
	}
	
	public void solve(ArrayList<String> gemStones){
		
		ArrayList<Character> chars = new ArrayList<Character>();
		
		ArrayList<Character> tempChars = new ArrayList<Character>();
		
		String firstGem = gemStones.get(0);
		for (int i = 0; i < firstGem.length(); i++) {
			if (!chars.contains(firstGem.charAt(i))) {
				chars.add(firstGem.charAt(i));
			}
		}
		for (String gem : gemStones) {
			for (int j = 0; j < gem.length(); j++) {
				tempChars.add(gem.charAt(j));
			}
			chars.retainAll(tempChars);
			tempChars.clear();
		}
		System.out.println(chars.size());
	}
	public static void main(String[] args){
		
		solution_GemStones obj = new solution_GemStones();
		
		obj.run();
	}
}
