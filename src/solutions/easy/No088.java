package solutions.easy;

/**
 * Created by dss886 on 2016/3/14.
 * https://leetcode.com/problems/merge-sorted-array/
 *
 * This solution is too stupid
 */
public class No088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = 0, q = 0;
        while (p < m + n && q < n){
            if (p < m + q && nums1[p] < nums2[q]){
                p++;
                continue;
            }
            //noinspection ManualArrayCopy
            for (int i = m + q; i > p; i--) {
                nums1[i] = nums1[i - 1];
            }
            nums1[p] = nums2[q];
            q++;
        }
        int x = 0;
    }
}
