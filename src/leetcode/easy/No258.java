package leetcode.easy;

/**
 * Created by dss886 on 2016/3/4.
 * https://leetcode.com/problems/add-digits/
 */
public class No258 {

    public int addDigits(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            sum += Character.getNumericValue(chars[i]);
            if (sum / 10 > 0) {
                sum = sum % 10 + 1;
            }
        }
        return sum;
    }
}
