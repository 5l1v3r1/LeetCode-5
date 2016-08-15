package leetcode.medium;

import java.util.Arrays;

/**
 * Created by dss886 on 16/8/12.
 * https://leetcode.com/problems/longest-increasing-subsequence/
 *
 * This problem is not solved, the solution below is:
 * https://discuss.leetcode.com/topic/28719/short-java-solution-using-dp-o-n-log-n
 *
 * The basic idea is present in the majority of leetcode shared for this task,
 * I have only tried to implement it in a manner as concise as possible without damaging the code readability.
 *
 * The idea is that as you iterate the sequence,
 * you keep track of the minimum value a subsequence of given length might end with,
 * for all so far possible subsequence lengths.
 * So dp[i] is the minimum value a subsequence of length i+1 might end with.
 * Having this info, for each new number we iterate to,
 * we can determine the longest subsequence where it can be appended using binary search.
 * The final answer is the length of the longest subsequence we found so far.
 */
public class No300 {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;

        for(int x : nums) {
            int i = Arrays.binarySearch(dp, 0, len, x);
            if(i < 0) i = -(i + 1);
            dp[i] = x;
            if(i == len) len++;
        }

        return len;
    }
}
