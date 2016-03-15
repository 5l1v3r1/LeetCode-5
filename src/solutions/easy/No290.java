package solutions.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by dss886 on 2016/3/15.
 * https://leetcode.com/problems/word-pattern/
 *
 * This solution use a HashMap and a HashSet to detect if there are duplicate keys.
 * See amazing solution only use one HashMap to do that:
 * https://leetcode.com/discuss/62374/8-lines-simple-java
 */
public class No290 {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        char[] patterns = pattern.toCharArray();
        String[] words = str.split(" ");
        if (patterns.length != words.length) return false;
        for (int i = 0; i < patterns.length; i++) {
            if (map.containsKey(patterns[i])) {
                if (!map.get(patterns[i]).equals(words[i])) return false;
            } else {
                if (!set.add(words[i])) return false;
                map.put(patterns[i], words[i]);
            }
        }
        return true;
    }
}
