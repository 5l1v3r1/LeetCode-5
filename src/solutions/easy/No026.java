package solutions.easy;

/**
 * Created by dss886 on 2016/3/13.
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class No026 {
    public int removeDuplicates(int[] nums) {
        int removeSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                removeSize++;
                continue;
            }
            nums[i - removeSize] = nums[i];
        }
        return nums.length - removeSize;
    }
}
