package solutions.easy;

/**
 * Created by dss886 on 2016/3/13.
 * https://leetcode.com/problems/plus-one/
 *
 * This solution can be more simple, see comments below
 */
public class No066 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        // this line is useless, because digits will be all zero when code could run here.
        System.arraycopy(digits, 0, newDigits, 1, digits.length);
        return newDigits;
    }
}
