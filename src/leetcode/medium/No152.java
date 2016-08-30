package leetcode.medium;

/**
 * Created by dss886 on 16/8/30.
 * https://leetcode.com/problems/maximum-product-subarray/
 */
public class No152 {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int nowMax = nums[0];
        int nowMin = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int tempMax = Math.max(Math.max(nowMax * num, nowMin * num), num);
            int tempMin = Math.min(Math.min(nowMax * num, nowMin * num), num);
            result = Math.max(result, tempMax);
            nowMax = tempMax;
            nowMin = tempMin;
        }
        return result;
    }
}
