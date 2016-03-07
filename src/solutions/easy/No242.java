package solutions.easy;

/**
 * Created by dss886 on 2016/3/5.
 * https://leetcode.com/problems/valid-anagram/
 */
public class No242 {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        if (sChars.length != tChars.length) {
            return false;
        }

        int[] sFlags = new int[sChars.length];
        int[] tFlags = new int[sChars.length];

        sFor :
        for (int i = 0; i < sChars.length; i++) {
            for (int j = 0; j < tChars.length; j++) {
                if (tFlags[j] == -1) {
                    continue;
                }
                if (sChars[i] == tChars[j]) {
                    sFlags[i] = -1;
                    tFlags[j] = -1;
                    continue sFor;
                }
            }
        }

        boolean isAnagram = true;
        for (int i = 0; i < sFlags.length; i++) {
            if (sFlags[i] != -1) {
                isAnagram = false;
            }
        }
        return isAnagram;
    }
}
