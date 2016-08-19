package leetcode.medium;

import java.util.Arrays;

/**
 * Created by dss886 on 16/8/19.
 * https://leetcode.com/problems/combination-sum-iv/
 */
public class No377 {
    public int combinationSum4(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;
        int[] cache = new int[target + 1];
        Arrays.sort(nums);
        Arrays.fill(cache, -1);
        return combinationWithCache(nums, cache, target);
    }

    private int combinationWithCache(int[] nums, int[] cache, int target) {
        if (target == 0) return 1;
        if (cache[target] != -1) {
            return cache[target];
        }
        int sum = 0;
        for (int num : nums) {
            if (target < num) break;
            sum += combinationWithCache(nums, cache, target - num);
        }
        cache[target] = sum;
        return cache[target];
    }
}
