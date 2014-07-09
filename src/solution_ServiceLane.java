import java.util.*;

public class solution_ServiceLane {
	
	
	public int[] parseToString(String line){
		String[] numbers = line.split("\\s");
		int[] myNumbers = new int[numbers.length];
		//System.out.println(numbers.length);

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
	public void printArray(int[] array){
		for(int i : array){
			System.out.print(i+", ");
		}
	}
	public void printArray(int[][] array){
		for(int i[] : array){
			System.out.println();
			for(int j: i){
				System.out.print(j);
			}
		}
	}
	
	public void solve(int[][] testCases, int[] width, int size){
		int i=0;
		
		int tempStart;
		int tempFinish;
		int smallest;
		while (i<size) {
			tempStart = testCases[i][0];
			tempFinish = testCases[i][1];
			smallest = width[tempStart];
			for (int j = tempStart; j <= tempFinish; j++) {
				
				if(smallest > width[j]){
					smallest = width[j];
				}
			}
			System.out.println(smallest);
			i++;
		}
	}
	
	public static void main(String[] args) {
		

	}
}
