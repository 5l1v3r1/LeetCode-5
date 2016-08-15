package leetcode.easy;

/**
 * Created by dss886 on 2016/3/16.
 * https://leetcode.com/problems/zigzag-conversion/
 */
public class No006 {
    public String convert(String s, int n) {
        if (s.isEmpty() || n == 1) return s;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int cycle = 2 * n - 2;
            for (int j = 0; j < s.length() / cycle + 1; j++) {
                if (cycle * j + i < s.length()) sb.append(s.charAt(cycle * j + i));
                int index = cycle * j + cycle - i;
                if (0 < i && i < n - 1 && index < s.length()) sb.append(s.charAt(index));
            }
        }
        return sb.toString();
    }
}
