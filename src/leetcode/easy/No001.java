package leetcode.easy;

/**
 * Created by dss886 on 2016/3/17.
 * https://leetcode.com/problems/two-sum/
 *
 * This solution cost O(n^2) time, actually we only need to go though the array once
 * by using a HashMap to store the nums met before:
 * https://leetcode.com/discuss/8150/accepted-java-o-n-solution
 */
public class No001 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return null;
    }
}
