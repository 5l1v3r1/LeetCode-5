package solutions.medium;

/**
 * Created by dss886 on 16/7/5.
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 *
 * using loop instead of recursive will be more elegant.
 */
public class No153 {
    public int findMin(int[] nums) {
        return findMin(nums, 0, nums.length - 1);
    }

    private int findMin(int[] nums, int left, int right) {
        if (left == right) return nums[left];
        if (nums[left] < nums[right]) return nums[left];
        int mid = left + (right - left) / 2;
        int leftValue = findMin(nums, left, mid);
        int rightValue = findMin(nums, mid + 1, right);
        return Math.min(leftValue, rightValue);
    }
}
