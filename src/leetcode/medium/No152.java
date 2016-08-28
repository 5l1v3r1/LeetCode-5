package leetcode.medium;

/**
 * Created by dss886 on 2016/8/20.
 * https://leetcode.com/problems/maximum-product-subarray/
 */
public class No152 {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int min = 0, max = 0, curMin = 0, curMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (curMin == 0) {
                curMin = nums[i];
            } else {
                curMin *= nums[i];
            }
        }
    }
}
