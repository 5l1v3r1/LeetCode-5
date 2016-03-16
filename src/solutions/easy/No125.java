package solutions.easy;

/**
 * Created by dss886 on 2016/3/16.
 * https://leetcode.com/problems/valid-palindrome/
 */
public class No125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        for (int i = 0, j = s.length() - 1; i < s.length() && j > 0; i++, j--) {
            if (i == j) return true;
            if (!Character.isLetterOrDigit(s.charAt(i))) {j++; continue;}
            if (!Character.isLetterOrDigit(s.charAt(j))) {i--; continue;}
            if (s.charAt(i) != s.charAt(j)) return false;
            if (j == i + 1) return true;
        }
        return true;
    }
}
