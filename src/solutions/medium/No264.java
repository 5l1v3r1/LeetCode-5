package solutions.medium;

/**
 * Created by dss886 on 16/8/4.
 * https://leetcode.com/problems/ugly-number-ii/
 */
public class No264 {
    public int nthUglyNumber(int n) {
        if(n <= 0) return 0;
        if(n == 1) return 1;
        int i2 = 0, i3 = 0, i5 = 0;
        int[] list = new int[n];
        list[0] = 1;
        for (int i = 1; i < n; i++) {
            list[i] = Math.min(list[i2] * 2, Math.min(list[i3] * 3, list[i5] * 5));
            if (list[i] == list[i2] * 2) i2++;
            if (list[i] == list[i3] * 3) i3++;
            if (list[i] == list[i5] * 5) i5++;
        }
        return list[n - 1];
    }
}
