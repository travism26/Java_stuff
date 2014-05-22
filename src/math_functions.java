import java.util.*;

public class math_functions {
	
	public ArrayList<String> listArray = new ArrayList<String>();
	
	public int count=0;
	
	int decPlace=0;
	
	public boolean finished=false;
	
	public static void print(String input){
		System.out.println(input);
	}
	
	public static void print(int input){
		System.out.println(input);
	}
	
	public static void print(double input){
		System.out.println(input);
	}
	
	public static void print(ArrayList<String> input){
		for(int i=0; i<input.size(); i++){
		System.out.print(input.get(i));
		}
	}
	
	public static String arrayToString(ArrayList<String> input){
		String result = "";
		for(int i=0; i<input.size(); i++){
			result += input.get(i);
		}
		
		return result;
	}
	
	//just used to reset saved variables.
	public void resetVar(){
		listArray.clear();
		count=0;
		decPlace=0;
	}
	
	public double divideCommand(double dividend, double divisor){
		double result;
		if(dividend == divisor){
			count++;
			listArray.add(count+"");
			result = Double.parseDouble(arrayToString(listArray));
			resetVar();
			return result;
		}else if((decPlace == 4) ) {
			result = Double.parseDouble(arrayToString(listArray));
			resetVar();
			return result;
		}else if(dividend < divisor){
			listArray.add(count+"");
			if(!listArray.contains(".")){ listArray.add("."); }
			dividend *=10;
			decPlace++;
			count=0;	
		}
		count++;
		return divideCommand(dividend-divisor, divisor);
	}
	
	public void runTestCases(int numTestCases){
		int ranDividend;
		int ranDivisor;
		double answer=0;
		boolean passed = false;
		print("---------------- Running test cases ---------------");
		for(int i =0; i <= numTestCases; i++){
			ranDividend = (int) (Math.random()*100);
			ranDivisor =  (int) (Math.random()*50+1);//to avoid divide by 0
			answer=0;
			answer = divideCommand(ranDividend, ranDivisor);
			if(answer==0){
				print("Failed");
				
			}else{
				print("Passed: "+ " "+ ranDividend + "/"+ ranDivisor + "= "+ answer);
			}	
		}
	}
	public static void main(String[] args){
		
		start runable = new start();
		
		runable.run();

	}
}
