package leetcode.easy;

/**
 * Created by dss886 on 2016/3/16.
 * https://leetcode.com/problems/range-sum-query-immutable/
 *
 * Calculate the sum during sumRang() is too slow, 132ms when most are 3ms.
 */
public class No303 {

    private int[] sums;

    public No303(int[] nums) {
        sums = new int[nums.length + 1];        // i and j are inclusive, we need one more position to store sums.
        for (int i = 0; i < nums.length; i++) {
            sums[i + 1] = sums[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sums[j + 1] - sums[i];
    }

    /**
     * Intuitive solution, but slow
     */
//    private int[] nums;
//    private HashMap<Integer, Integer> map = new HashMap<>();
//
//    public No303(int[] nums) {
//        this.nums = nums;
//    }
//
//    public int sumRange(int i, int j) {
//        int key = (nums.length * 2 - i + 1) * i / 2 + j - i;
//        if (map.containsKey(key)) return map.get(key);
//        int sum = 0;
//        for (int k = i; k <= j; k++) {
//            sum += nums[k];
//        }
//        map.put(key, sum);
//        return sum;
//    }
}
