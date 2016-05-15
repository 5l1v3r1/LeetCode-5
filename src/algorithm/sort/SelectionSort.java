package algorithm.sort;

/**
 * Created by dss886 on 2016/3/21.
 * https://zh.wikipedia.org/wiki/%E9%80%89%E6%8B%A9%E6%8E%92%E5%BA%8F
 *
 * Timer Complexity:  O(n^2)
 * Space Complexity: O(1)
 * Stable: No
 */
public class SelectionSort {
    public void sort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[min]) min = j;
            }
            int tmp = list[i];
            list[i] = list[min];
            list[min] = tmp;
        }
    }
}
