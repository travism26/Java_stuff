import java.util.InputMismatchException;
import java.util.Scanner;


public class start extends math_functions implements Runnable {
//not finished
	@Override
	public void run() {
		Scanner in = new Scanner(System.in);
		math_functions obj = new math_functions();
		String keepGoing ="";
		
		double dividend= 0;
		double divisor = 0;
		double answer;
		
		do{
			try{
			print("Enter a number 'A' you want to divide");
			dividend = in.nextDouble();
			
			print("Enter a number 'B' that will divide a ie: A/B");
			
				divisor = in.nextDouble();
			
			
			answer = obj.divideCommand(dividend, divisor);
			print(answer);
			System.out.println("keep going?");
			keepGoing = in.nextLine();
			//run test cases
			//obj.runTestCases(10);
			
			} catch (InputMismatchException e){
				print(e.getMessage());
				//print("Please enter a valid number not a string value");
			}
			keepGoing = in.nextLine();
			if(keepGoing.startsWith("n")){
				break;
			}
		}while(true);
	}
}
