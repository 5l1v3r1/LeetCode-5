package leetcode.easy;

/**
 * Created by dss886 on 2016/3/15.
 * https://leetcode.com/problems/bulls-and-cows/
 */
public class No299 {
    public String getHint(String secret, String guess) {
        int[] flags = new int[10];
        int a = 0, b = 0;
        char[] sChars = secret.toCharArray();
        char[] gChars = guess.toCharArray();
        for (int i = 0; i < gChars.length; i++) {
            if (sChars[i] == gChars[i]) {
                a++;
                continue;
            }
            if (flags[gChars[i] - 48] > 0) b++;
            flags[gChars[i] - 48]--;
            if (flags[sChars[i] - 48] < 0) b++;
            flags[sChars[i] - 48]++;
        }
        return a + "A" + b + "B";
    }
}
