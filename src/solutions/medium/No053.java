package solutions.medium;

/**
 * Created by dss886 on 2016/5/18.
 * https://leetcode.com/problems/maximum-subarray/
 *
 * This problem is not solved, the solution below is:
 * https://leetcode.com/discuss/15805/accepted-o-n-solution-in-java
 */
public class No053 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int sum = nums[0], maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
