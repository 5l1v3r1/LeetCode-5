package solutions.medium;

/**
 * Created by dss886 on 2016/4/3.
 * https://leetcode.com/problems/unique-binary-search-trees/
 */
public class No096 {
    public int numTrees(int n) {
        int[] nums = new int[n + 1];
        nums[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                nums[i] += nums[j] * nums[i - 1 - j];
            }
        }
        return nums[n];
    }
}
