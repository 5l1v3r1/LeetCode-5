package solutions.easy;

/**
 * Created by dss886 on 2016/3/17.
 * https://leetcode.com/problems/first-bad-version/
 *
 * When calculate mid, using (q + p) / 2 may causing a overflow.
 */
public class No278 {
    public int firstBadVersion(int n) {
        int p = 1, q = n;
        while (p < q) {
            int mid = p + (q - p) / 2;
            if (isBadVersion(mid)) {
                q = mid;
            } else {
                p = mid + 1;
            }
        }
        return p;
    }

    boolean isBadVersion(int version) {
        return version >= 2;
    }
}
