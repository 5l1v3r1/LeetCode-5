package solutions.easy;

/**
 * Created by dss886 on 2016/3/5.
 * https://leetcode.com/problems/move-zeroes/
 */
public class No283 {
    public void moveZeroes(int[] nums) {
        int numOfZero = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                numOfZero++;
                continue;
            }
            if(numOfZero != 0){
                nums[i-numOfZero] = nums[i];
                nums[i] = 0;
            }
        }
    }
}
