package solutions.easy;

import java.util.HashSet;

/**
 * Created by dss886 on 2016/3/8.
 * https://leetcode.com/problems/contains-duplicate/
 *
 * After seeing discuss:
 * HashSet.add() return false if the key is duplicated!
 * See: https://leetcode.com/discuss/87846/java-9ms-solution-using-hashset-very-very-easy-version
 */
public class No217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        return hashSet.size() != nums.length;
    }
}
