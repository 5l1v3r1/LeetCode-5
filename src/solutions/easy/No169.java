package solutions.easy;

import java.util.Arrays;

/**
 * Created by dss886 on 2016/3/8.
 * https://leetcode.com/problems/majority-element/
 *
 * Amazing solution at:
 * https://leetcode.com/discuss/24971/o-n-time-o-1-space-fastest-solution
 *
 * Even using Arrays.sort()(O(N log N) time), there are more faster method:
 * https://leetcode.com/discuss/24971/o-n-time-o-1-space-fastest-solution#a51123
 */
public class No169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            }
            if (count > nums.length / 2) {
                return nums[i];
            }

            if (nums[i] != nums[i - 1]) {
                count = 1;
            }
        }
        return nums[0];
    }
}
