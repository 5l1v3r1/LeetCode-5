package leetcode.medium;

/**
 * Created by dss886 on 2016/3/26.
 * https://leetcode.com/problems/single-number-iii/
 *
 * Not solved, the solution below is:
 * https://leetcode.com/discuss/52351/accepted-java-space-easy-solution-with-detail-explanations
 *
 * a & (a - 1)  : Remove the rightest binary '1'
 * a & ~(a - 1) : Get the rightest binary '1'
 *
 * First step, same idea as the No136, we xor all the numbers in the array.
 * Now we got the xor of two single numbers.
 * Thinking of the principle of xor : same binary is 0, else is 1.
 * Only need to select any bit '1' of the xor result, then we can separate the two numbers easily.
 * So we use 'a & ~(a - 1)' to get the rightest binary '1'.
 * Then go pass the array again to separate them.
 */
public class No260 {
    public int[] singleNumber(int[] nums) {
        int diff = 0;
        for (int num : nums) {
            diff ^= num;
        }
        diff &= -diff;  // short for 'diff = diff & ~(diff - 1)'
        int[] result = {0, 0};
        for (int num : nums) {
            if ((num & diff) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }
        return result;
    }
}
