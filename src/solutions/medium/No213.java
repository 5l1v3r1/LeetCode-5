package solutions.medium;

/**
 * Created by dss886 on 2016/5/16.
 * https://leetcode.com/problems/house-robber-ii/
 *
 * Problem House-Robber-I (No.198) use integers to store the result of (n-2) and (n-1),
 * As a circle, this solution divide both of the previous results into two result: rob the first or not.
 * Then we got 4 integers:
 * rob1Y: n-2 and rob the first, rob1N: n-2 and not rob the first
 * rob2Y: n-1 and rob the first, rob2N: n-1 and not rob the first
 *
 * Finally, we only need to consider the situation of the last one and got the result easily.
 */
public class No213 {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int rob1Y = nums[0], rob1N = 0;
        int rob2Y = nums[0], rob2N = nums[1];
        for (int i = 2; i < nums.length - 1; i++) {
            int tempY = Math.max(nums[i] + rob1Y, rob2Y);
            int tempN = Math.max(nums[i] + rob1N, rob2N);
            rob1Y = rob2Y; rob1N = rob2N;
            rob2Y = tempY; rob2N = tempN;
        }
        // maxA means rob the last house, maxB means not
        int maxA = nums[nums.length - 1] + rob1N;
        int maxB = Math.max(Math.max(rob1Y, rob1N), Math.max(rob2Y, rob2N));
        return Math.max(maxA, maxB);
    }
}
