package algorithm.sort;

/**
 * Created by dss886 on 2016/3/21.
 * https://zh.wikipedia.org/wiki/%E6%8F%92%E5%85%A5%E6%8E%92%E5%BA%8F
 *
 * Timer Complexity:  Best O(n), Worst O(n^2), Average O(n^2)
 * Space Complexity: O(1)
 * Stable: Yes
 */
public class InsertionSort {
    public void sort(int[] list) {
        int i, j;
        for (i = 1; i < list.length; i++) {
            int tmp = list[i];
            for (j = i; j > 0 && list[j - 1] > tmp; j--) {
                list[j] = list[j - 1];
            }
            list[j] = tmp;
        }
    }
}
