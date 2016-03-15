package solutions.easy;

/**
 * Created by dss886 on 2016/3/14.
 * https://leetcode.com/problems/rectangle-area/
 *
 * See a different way to calculate overlap area:
 * https://leetcode.com/discuss/43549/just-another-short-way
 */
public class No233 {
    public int computeArea(int a, int b, int c, int d, int e, int f, int g, int h) {
        int overlap = 0;
        if (g > a && e < c && h > b && f < d) {
            int x = a < e ? Math.min(g - e, c - e) : Math.min(c - a, g - a);
            int y = b < f ? Math.min(h - f, d - f) : Math.min(d - b, h - b);
            overlap = x * y;
        }
        return (c - a) * (d - b) + (g - e) * (h - f) - overlap;
    }
}
