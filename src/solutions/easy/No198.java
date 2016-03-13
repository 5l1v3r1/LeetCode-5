package solutions.easy;

/**
 * Created by dss886 on 2016/3/13.
 * https://leetcode.com/problems/house-robber/
 *
 * This solution is O(N) time and O(N) space.
 * Actually, we only need to remain 2 numbers : sum[i-2] and sum[i-1],
 * so space complexity can reduce to O(1).
 */
public class No198 {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        sum[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            sum[i] = Math.max(sum[i - 2] + nums[i], sum[i - 1]);
        }
        return sum[nums.length - 1];
    }
}
