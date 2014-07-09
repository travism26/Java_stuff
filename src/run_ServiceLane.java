import java.util.*;

public class run_ServiceLane {

	public long solve(long range, long mod){
		
		long sumofMod =0;
		long div=0;
		
		long totalSum = 0;
		
		for (long i = 1; i <= mod; i++) {
			sumofMod += i%mod;
		}
		
		div = range/mod;
		long remainder = range%mod;
		totalSum = div * sumofMod;
		return totalSum ;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		run_ServiceLane obj = new run_ServiceLane();
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
