package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dss886 on 16/8/31.
 * https://leetcode.com/problems/largest-divisible-subset/
 *
 * Not Solved, the solution below is:
 * https://discuss.leetcode.com/topic/49652/classic-dp-solution-similar-to-lis-o-n-2
 */
public class No368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int[] countList = new int[nums.length];
        int[] preIndexList = new int[nums.length];
        int maxLength = 0, index = -1;
        for (int i = 0; i < nums.length; i++) {
            countList[i] = 1;
            preIndexList[i] = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] % nums[j] == 0) {
                    if (1 + countList[j] > countList[i]) {
                        countList[i] = countList[j] + 1;
                        preIndexList[i] = j;
                    }
                }
            }
            if (countList[i] > maxLength) {
                maxLength = countList[i];
                index = i;
            }
        }
        List<Integer> result = new ArrayList<>();
        while (index != -1) {
            result.add(nums[index]);
            index = preIndexList[index];
        }
        return result;
    }
}
