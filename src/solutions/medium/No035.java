package solutions.medium;

/**
 * Created by dss886 on 2016/5/15.
 * https://leetcode.com/problems/search-insert-position/
 */
public class No035 {
    public int searchInsert(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    private int search(int[] nums, int target, int left, int right) {
        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            if (right == mid) return mid + 1;
            return search(nums, target, mid + 1, right);
        } else {
            if (left == mid) return mid;
            return search(nums, target, left, mid - 1);
        }
    }
}
