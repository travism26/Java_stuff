import java.util.*;

public class easySum {

	public long solve(long range, long mod){
		
		long sum =0;
		
		for (long i = 1; i <= range; i++) {
			sum += i%mod;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		easySum obj = new easySum();
		int numTestCase = in.nextInt();
		ArrayList<Long> ans = new ArrayList<Long>();
		for (int i = 0; i < numTestCase; i++) {
			ans.add(obj.solve(in.nextLong(), in.nextLong()));
		}
		
		for (Long val : ans) {
			System.out.println(val);
		}
	}

}
