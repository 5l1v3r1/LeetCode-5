package solutions.easy;

/**
 * Created by dss886 on 2016/3/18.
 * https://leetcode.com/problems/rotate-array/
 *
 * My ideas to solve:
 * 1. Loop k times, each loop rotate 1 step. [O(n*k), O(1)]
 * 2. Create a new array, copy and rotate at the same time. [O(n), O(n)]
 * 3. Linked-swap the item. [O(n), O(1)]
 *
 * The solution below using the 3rd idea but exceeded the time limit,
 * because the operation '%' cost a lot of time when both of the array's length and k are very big.
 *
 * See amazing solution just using three array reverse at:
 * https://leetcode.com/discuss/36477/easy-to-read-java-solution
 */
public class No189 {
    public void rotate(int[] nums, int k) {
        if (k >= nums.length) k = k % nums.length;
        if (k <= 0 || nums.length < 2) return;
        int step = nums.length % k == 0 ? k : 1;
        if (nums.length < 2 * k) step = nums.length - k;
        for (int i = 0; i < step; i++) {
            for (int j = (i + k) % nums.length; j != i; j = (j + k) % nums.length) {
                int tmp = nums[j];
                nums[j] = nums[i];
                nums[i] = tmp;
            }
        }
    }
}
