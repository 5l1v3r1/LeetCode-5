package leetcode.easy;

/**
 * Created by dss886 on 2016/3/15.
 * https://leetcode.com/problems/length-of-last-word/
 *
 * This problem can use String.split() and String.trim() for cheating.
 * Using char array: 2ms
 * Using String.split(): 3ms
 */
public class No058 {
    public int lengthOfLastWord(String s) {
        char[] chars = s.trim().toCharArray();
        int p = -1;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ' ') p = i;
        }
        return chars.length - p - 1;
//        String[] strings = s.split(" ");
//        return strings.length > 0 ? strings[strings.length - 1].length() : 0;
    }
}
