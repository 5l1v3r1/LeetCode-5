package solutions.medium;

/**
 * Created by dss886 on 2016/4/2.
 * https://leetcode.com/problems/missing-number/
 *
 * as: sum + x = n*(n+1)/2;
 * so: x = n*(n+1)/2 - sum;
 *
 * See solution using xor (avoiding cast long to int) at:
 * https://leetcode.com/discuss/58647/line-simple-java-bit-manipulate-solution-with-explaination
 */
public class No268 {
    public int missingNumber(int[] nums) {
        long n = nums.length;
        long sum = n * (n + 1) / 2;
        for (int num : nums) sum -= num;
        return (int) sum;
    }
}
