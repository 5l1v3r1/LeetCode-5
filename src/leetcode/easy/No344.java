package leetcode.easy;

/**
 * Created by dss886 on 2016/5/15.
 * https://leetcode.com/problems/reverse-string/
 */
public class No344 {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(s.length() - i - 1));
        }
        return sb.toString();
    }
}
