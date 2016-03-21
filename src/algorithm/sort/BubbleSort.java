package algorithm.sort;

/**
 * Created by dss886 on 2016/3/21.
 * https://zh.wikipedia.org/wiki/%E5%86%92%E6%B3%A1%E6%8E%92%E5%BA%8F
 *
 * Time Complexity:  Best O(n), Worst O(n^2), Average O(n^2)
 * Space Complexity: O(1)
 * Stable: Yes
 */
public class BubbleSort {
    public void sort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
        }
    }
}
