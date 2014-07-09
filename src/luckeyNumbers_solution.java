import java.util.Scanner;


public class luckeyNumbers_solution {
	public int MAX_NUM_LENGTH = 18;
	
	//the max sum is 9*18 and max sqrt sum
	public int MAX_NUM_SUM = 162;
	public int MAX_SQRT_SUM = 1458;
	
	//this will contain the all the possible prime numbers.
	public int[] primes = new int[1460];
	
	
	public long[][][] dyn_table = new long[20][164][1460];
	
	public long[][][][] ans = new long[19][10][164][1460];
	
	public int[][] start = new int[19][163];
	public int[][] end = new int[19][163];
	
	public void gen_primes() {
	    for (int i = 0; i <= MAX_SQRT_SUM; ++i) {
	        primes[i] = 1;
	    }
	    primes[0] = primes[1] = 0;

	    for (int i = 2; i * i <= MAX_SQRT_SUM; ++i) {
	        if (primes[i] != 1) {
	            continue;
	        }
	        for (int j = 2; i * j <= MAX_SQRT_SUM; ++j) {
	            primes[i*j] = 0;
	        }
	    }
	}
	
	public void gen_table() {
	    for (int i = 0; i <= MAX_NUM_LENGTH; ++i) {
	        for (int j = 0; j <= MAX_NUM_SUM; ++j) {
	            for (int k = 0; k <= MAX_SQRT_SUM; ++k) {
	                dyn_table[i][j][k] = 0;
	            }
	        }
	    }
	    dyn_table[0][0][0] = 1;

	    for (int i = 0; i < MAX_NUM_LENGTH; ++i) {
	        for (int j = 0; j <= 9 * i; ++j) {
	            for (int k = 0; k <= 9 * 9 * i; ++k) {
	                for (int l = 0; l < 10; ++l) {
	                    dyn_table[i + 1][j + l][k + l*l] += dyn_table[i][j][k];
	                }
	            }
	        }
	    }
	}
	
	public long count_lucky (long maxp) {
	    long result = 0;
	    int len = 0;
	    int[] split_max = new int[MAX_NUM_LENGTH];
	    while (maxp>0) {
	        split_max[len] = (int) (maxp % 10);
	        maxp /= 10;
	        ++len;
	    }
	    int sum = 0;
	    int sq_sum = 0;
	    long step_result;
	    long step_;
	    for (int i = len-1; i >= 0; --i) {
	        step_result = 0;
	        int x1 = 9*i;
	        for (int l = 0; l < split_max[i]; ++l) {
	//changed here........2
	            step_ = 0;
	            if(ans[i][l][sum][sq_sum]!=0)
	                {
	                    step_result +=ans[i][l][sum][sq_sum];
	                    continue;
	                }
	            int y = l + sum;
	            int x = l*l + sq_sum;
	            for (int j = 0; j <= x1; ++j) {
	                if(primes[j + y] > 0)
	                    for (int k=start[i][j]; k<=end[i][j]; ++k) {
	                        if (primes[k + x] >0) {
	                            step_result += dyn_table[i][j][k];
	                            step_+=dyn_table[i][j][k];
	                        }
	                }

	            }
	             ans[i][l][sum][sq_sum] = step_;
	//upto here...............2
	        }
	        result += step_result;
	        sum += split_max[i];
	        sq_sum += split_max[i] * split_max[i];
	    }

	    if (primes[sum] >0 && primes[sq_sum] > 0) {
	        ++result;
	    }

	    return result;
	}
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
		luckeyNumbers_solution obj = new luckeyNumbers_solution();
		
		obj.gen_primes();
	    obj.gen_table();
	    
	    for(int i=0;i<=18;i++)
	        for(int j=0;j<=163;j++)
	            {
	                for(int k=0;k<=1458;k++)
	                        if(obj.dyn_table[i][j][k]!=0)
	                            {
	                                obj.start[i][j] = k;
	                                break;                               
	                            }

	                for(int k=1460;k>=0;k--)
	                        if(obj.dyn_table[i][j][k]!=0)
	                            {
	                                obj.end[i][j]=k;
	                                break;                               
	                            }
	            }
	//upto here..........3
	    int cases = 0;
	    cases = in.nextInt();
	    for (int i = 0; i < cases; ++i) {
	        long a, b;

	        a = in.nextLong();
	        b = in.nextLong();
	//changed here......4
	        if(b == (long)1000000000000000000l)
	            b--;
	//upto here.........4
	        System.out.println(obj.count_lucky(b) - obj.count_lucky(a-1));
	    }
	    return ;
	}
}