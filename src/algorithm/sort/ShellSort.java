package algorithm.sort;

/**
 * Created by dss886 on 2016/3/21.
 * https://zh.wikipedia.org/wiki/%E5%B8%8C%E5%B0%94%E6%8E%92%E5%BA%8F
 *
 * Timer Complexity:  Best O(n), Worst O(n*log2(n)), Average O(n^2)
 * Space Complexity: O(1)
 * Stable: No
 */
public class ShellSort {
    public void sort(int[] list) {
        int step = 1;
        while (step < list.length / 3) step = 3 * step + 1;
        int i, j;
        while (step >= 1) {
            for (i = step; i < list.length; i++) {
                int tmp = list[i];
                for (j = i; j >= step && list[j - step] > tmp; j -= step) {
                    list[j] = list[j - step];
                }
                list[j] = tmp;
            }
            step = step / 3;
        }
    }
}
