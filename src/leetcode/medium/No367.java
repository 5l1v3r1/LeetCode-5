package leetcode.medium;

/**
 * Created by dss886 on 16/8/4.
 * https://leetcode.com/problems/wiggle-subsequence/
 */
public class No367 {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int lastDiff = nums[1] - nums[0];
        int maxLength = lastDiff == 0 ? 1 : 2;
        for (int i = 1; i < nums.length - 1; i++) {
            int diff = nums[i + 1] - nums[i];
            if ((diff > 0 && lastDiff <= 0) || (diff < 0 && lastDiff >= 0)) {
                lastDiff = diff;
                maxLength++;
            }
        }
        return maxLength;
    }
}
