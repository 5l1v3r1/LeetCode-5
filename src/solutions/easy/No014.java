package solutions.easy;

/**
 * Created by dss886 on 2016/3/16.
 * https://leetcode.com/problems/longest-common-prefix/
 *
 * More elegant solution:
 * https://leetcode.com/discuss/20993/java-code-with-13-lines
 *
 * Using Arrays.sort() for cheating:
 * https://leetcode.com/discuss/65855/sorted-the-array-java-solution-2-ms
 */
public class No014 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        int i = 0;
        wLabel:
        while (true) {
            char c = 0;
            for (String str : strs) {
                if (i == str.length()) break wLabel;
                if (c == 0) c = str.charAt(i);
                if (str.charAt(i) != c) break wLabel;
            }
            sb.append(c);
            i++;
        }
        return sb.toString();
    }
}
