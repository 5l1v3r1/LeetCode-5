package leetcode.easy;

import java.util.HashSet;

/**
 * Created by dss886 on 2016/3/14.
 * https://leetcode.com/problems/contains-duplicate-ii/
 *
 * Not solved, the solution below is:
 * https://leetcode.com/discuss/38445/simple-java-solution
 */
public class No219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length < 2 || k < 1) return false;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.size() == k + 1) hashSet.remove(nums[i - k - 1]);
            if (!hashSet.add(nums[i])) return true;
        }
        return false;
    }
}
