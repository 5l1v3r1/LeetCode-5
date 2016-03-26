package solutions.medium;

/**
 * Created by dss886 on 2016/3/25.
 * https://leetcode.com/problems/single-number-ii/
 *
 * Not solved, the solution below is:
 * https://leetcode.com/discuss/6632/challenge-me-thx
 *
 * The operator 'xor' can be seen as 'binary add without carry',
 * so we can create an loop for this add operation.
 */
public class No137 {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums){
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones | twos;
    }
}
