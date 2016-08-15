package leetcode.easy;

/**
 * Created by dss886 on 2016/3/13.
 * https://leetcode.com/problems/remove-element/
 */
public class No027 {
    public int removeElement(int[] nums, int val) {
        int removeSize = 0;
        for (int i = 0; i < nums.length - removeSize; i++) {
            if (nums[i] == val) {
                if (nums[nums.length - 1 - removeSize] == val) {
                    removeSize++;
                    i--;
                    continue;
                }
                nums[i] = nums[nums.length - 1 - removeSize];
                removeSize++;
            }
        }
        return nums.length - removeSize;
    }
}
