package solutions.easy;

import java.util.Arrays;

/**
 * Created by dss886 on 2016/3/5.
 * https://leetcode.com/problems/valid-anagram/
 *
 * See amazing solution at:
 * https://leetcode.com/discuss/90137/the-ms-fastest-for-alphabets-and-universal-for-unicode-java
 */
public class No242 {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()){
            return false;
        }
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        /**
         * Arrays.sort() using Dual-Pivot Quicksort, more detail at:
         * http://www.tuicool.com/articles/BfY7Nz
         */
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return new String(sChars).equals(new String(tChars));
    }
}
