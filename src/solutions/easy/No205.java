package solutions.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dss886 on 2016/3/15.
 * https://leetcode.com/problems/isomorphic-strings/
 *
 * HashMap is too slow (64ms when most at 26ms), see solutions without using HashMap at:
 * https://leetcode.com/discuss/33889/short-java-solution-without-maps
 */
public class No205 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for (int i = 0; i < sChars.length; i++) {
            if (sMap.containsKey(sChars[i]) && !sMap.get(sChars[i]).equals(tChars[i])) return false;
            if (tMap.containsKey(tChars[i]) && !tMap.get(tChars[i]).equals(sChars[i])) return false;
            sMap.put(sChars[i], tChars[i]);
            tMap.put(tChars[i], sChars[i]);
        }
        return true;
    }
}
