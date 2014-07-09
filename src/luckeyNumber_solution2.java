import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class luckeyNumber_solution2 {

    final static int DIGITS = 18, MOD = DIGITS * 81 + 1;
    static HashSet<Integer> primes = new HashSet();
    static HashMap<Integer, long[]> sums = new HashMap();
    static HashSet<Integer> sumsPrime = new HashSet();
    static HashMap<Integer, long[]> stat = new HashMap();
    static int[] sofar = new int[9];
    static long[] factors = {1L, 1L, 2L, 6L, 24L, 120L, 720L, 5040L,
        40320L, 362880L, 3628800L, 39916800L, 479001600L, 6227020800L,
        87178291200L, 1307674368000L, 20922789888000L, 355687428096000L,
        6402373705728000L};
    static long[][] binom = new long[DIGITS + 1][DIGITS + 1];
    static long MAX = 1;

    static void makePrimes() {
        for (int i = 2; i <= 81 * DIGITS; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
    }

    static void makeSums(int tofix, int sumsofar, int sumdigits, int sumdigits2, long factor) {
        int rem = DIGITS - sumsofar;
        if (tofix == 0) {
            for (int i = 0; i <= rem; i++) {
                sofar[0] = i;
                makeSums(1, i, 0, 0, 1);
            }
        } else if (tofix == 9) {
            int sd = sumdigits + 9 * rem;
            int sd2 = sumdigits2 + 81 * rem;
            int newelem = MOD * sd + sd2;
            if (!sums.containsKey(newelem)) {
                sums.put(newelem, new long[DIGITS + 1]);
            }
            sums.get(newelem)[sofar[0]] += factors[DIGITS - sofar[0]] / (factor * factors[rem]);
            if (primes.contains(sd) && primes.contains(sd2)) {
                sumsPrime.add(newelem);
            }
        } else {
            for (int i = 0; i <= rem; i++) {
                sofar[tofix] = i;
                makeSums(tofix + 1, sumsofar + i, sumdigits + i * tofix, sumdigits2 + i * tofix * tofix, factor * factors[i]);
            }
        }
    }

    static void init() {
        makePrimes();
        makeSums(0, 0, 0, 0, 0);
        for (int i = 0; i < DIGITS; i++)  MAX *= 10;
        for (int i = 0; i <= DIGITS; i++) {
            for (int j = 0; j <= i; j++) {
                binom[DIGITS - i][DIGITS - j] = factors[i] / factors[j] / factors[i - j];
            }
        }
        
        for (long[] sum : sums.values()) {
            long[] cp = sum.clone();
            for (int i = 0; i <= DIGITS; i++) {
                long s = 0;
                for (int j = i; j <= DIGITS; j++) {
                    s += cp[j] * binom[i][j];
                }
                sum[i] = s;
            }
        }
        
        
        for (int sum : sums.keySet()) {
            long[] newelem = new long[DIGITS + 1];
            stat.put(sum, newelem);
            for (int sum_prime : sumsPrime) {
                if (sum <= sum_prime) {
                    long[] sumsdiff = sums.get(sum_prime - sum);
                    if (sumsdiff != null) {
                        for (int i = 0; i <= DIGITS; i++) {
                            newelem[i] += sumsdiff[i];
                        }
                    }
                }
            }
        }
    }

    static long luckyNum(long n) {
        if (n == MAX) {
            n--;
        }
        String s = Long.toString(n);
        int[] numarray = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            numarray[i] = Integer.parseInt(s.substring(i, i + 1));
        }
        long ret = 0;
        int fixnum = DIGITS - numarray.length;
        int fixsum = 0;
        int fixsum2 = 0;
        for (int i = 0; i < numarray.length; i++) {
            for (int j = 0; j < numarray[i]; j++) {
                long plus = stat.get(MOD * (fixsum + j) + fixsum2 + j * j)[fixnum + 1];
                ret += plus;
            }
            fixnum++;
            fixsum += numarray[i];
            fixsum2 += numarray[i] * numarray[i];
        }
        long plus = stat.get(MOD * fixsum + fixsum2)[fixnum];
        ret += plus;
        return ret;
    }

    static long solve(long a, long b) {
        return luckyNum(b) - luckyNum(a - 1);
    }

    static long solveOne(BufferedReader br) throws Exception {
        String[] ab = br.readLine().split(" ");
        long a = Long.parseLong(ab[0]), b = Long.parseLong(ab[1]);
        return solve(a, b);
    }

    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        if (args.length > 0) {
            FileInputStream is = new FileInputStream(args[0]);
            System.setIn(is);
        }

        init();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (; t > 0; t--) {
            System.out.printf("%s\n", solveOne(br));
        }
        if (args.length > 0) {
            System.out.printf("ellapsed time: %s milliseconds\n",
                    System.currentTimeMillis() - startTime);
        }
    }
}