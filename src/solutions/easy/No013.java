package solutions.easy;

/**
 * Created by dss886 on 2016/3/9.
 * https://leetcode.com/problems/roman-to-integer/
 *
 * not solved, the solution below is:
 * https://leetcode.com/discuss/42582/my-java-solution#a63778
 */
public class No013 {
    public int romanToInt(String str) {
        // simulate a HashMap but faster than it.
        int[] a = new int[26];
        a['I' - 'A'] = 1;
        a['V' - 'A'] = 5;
        a['X' - 'A'] = 10;
        a['L' - 'A'] = 50;
        a['C' - 'A'] = 100;
        a['D' - 'A'] = 500;
        a['M' - 'A'] = 1000;
        char prev = 'A';
        int sum = 0;
        for(char s : str.toCharArray()) {
            if(a[s - 'A'] > a[prev - 'A']) {
                // if current is greater than the previous, subtract twice.
                sum = sum - 2 * a[prev - 'A'];
            }
            // always add current num to sum.
            sum = sum + a[s - 'A'];
            prev = s;
        }
        return sum;
    }
}
