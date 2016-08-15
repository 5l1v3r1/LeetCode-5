package leetcode.easy;

/**
 * Created by dss886 on 2016/3/16.
 * https://leetcode.com/problems/implement-strstr/
 *
 * More elegant solution:
 * https://leetcode.com/discuss/46047/elegant-java-solution
 */
public class No028 {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (haystack.length() < needle.length()) return -1;
        outFor:
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                for (int j = 1; j < needle.length(); j++) {
                    if (i + j >= haystack.length()) return -1;
                    if (haystack.charAt(i + j) != needle.charAt(j)) continue outFor;
                }
                return i;
            }
        }
        return -1;
    }
}
