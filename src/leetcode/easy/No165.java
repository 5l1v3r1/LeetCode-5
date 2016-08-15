package leetcode.easy;

/**
 * Created by dss886 on 2016/3/19.
 * https://leetcode.com/problems/compare-version-numbers/
 */
public class No165 {
    public int compareVersion(String version1, String version2) {
        String[] av = version1.split("\\.");
        String[] bv = version2.split("\\.");
        for (int i = 0; i < av.length || i < bv.length; i++) {
            int a = i < av.length ? Integer.parseInt(av[i]) : 0;
            int b = i < bv.length ? Integer.parseInt(bv[i]) : 0;
            if (a == b) continue;
            return a < b ? -1 : 1;
        }
        return 0;
    }
}
