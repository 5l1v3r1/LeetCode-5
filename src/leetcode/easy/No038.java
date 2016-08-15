package leetcode.easy;

/**
 * Created by dss886 on 2016/3/15.
 * https://leetcode.com/problems/count-and-say/
 */
public class No038 {
    public String countAndSay(int n) {
        String say = "1";
        for (int i = 1; i < n; i++) {
            char[] chars = say.toCharArray();
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int j = 0; j < chars.length; j++) {
                if (j == chars.length - 1 || chars[j] != chars[j + 1]) {
                    sb.append(count).append(Character.getNumericValue(chars[j]));
                    count = 1;
                    continue;
                }
                count++;
            }
            say = sb.toString();
        }
        return say;
    }
}
