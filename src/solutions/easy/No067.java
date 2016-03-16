package solutions.easy;

/**
 * Created by dss886 on 2016/3/16.
 * https://leetcode.com/problems/add-binary/
 */
public class No067 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < Math.max(a.length(), b.length()); i++) {
            int aDigit = i < a.length() ? a.charAt(a.length() - i - 1) - '0' : 0;
            int bDigit = i < b.length() ? b.charAt(b.length() - i - 1) - '0' : 0;
            int sum = aDigit + bDigit + carry;
            sb.insert(0, sum % 2);
            carry = sum / 2;
        }
        if (carry > 0) sb.insert(0, carry);
        return sb.toString();
    }
}
