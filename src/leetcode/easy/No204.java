package leetcode.easy;

/**
 * Created by dss886 on 2016/3/16.
 * https://leetcode.com/problems/count-primes/
 *
 * Actually we can reduce time cost by counting primes during marking off, see more details:
 * https://leetcode.com/discuss/35195/my-simple-java-solution
 */
public class No204 {
    public int countPrimes(int n) {
        int[] table = new int[n];
        int count = 0;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (table[i] == 1) continue;
            for (int j = i * i; j < n; j += i) {
                table[j] = 1;
            }
        }
        for (int i = 2; i < n; i++) {
            if (table[i] == 0) count++;
        }
        return count;
    }
}
