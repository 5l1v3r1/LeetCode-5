package leetcode.easy;

import java.util.HashMap;

/**
 * Created by dss886 on 2016/3/16.
 * https://leetcode.com/problems/range-sum-query-immutable/
 *
 * Calculate the sum during sumRang() is too slow, 132ms when most are 3ms.
 * See simple and fast solution at:
 * https://leetcode.com/discuss/68696/java-simple-o-n-init-and-o-1-query-solution
 */
public class No303 {

    private int[] nums;
    private HashMap<Integer, Integer> map = new HashMap<>();

    public No303(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int key = (nums.length * 2 - i + 1) * i / 2 + j - i;
        if (map.containsKey(key)) return map.get(key);
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += nums[k];
        }
        map.put(key, sum);
        return sum;
    }
}
