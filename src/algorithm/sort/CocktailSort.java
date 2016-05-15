package algorithm.sort;

/**
 * Created by dss886 on 2016/3/21.
 * https://zh.wikipedia.org/wiki/%E9%B8%A1%E5%B0%BE%E9%85%92%E6%8E%92%E5%BA%8F
 *
 * Timer Complexity:  Best O(n), Worst O(n^2), Average O(n^2)
 * Space Complexity: O(1)
 * Stable: Yes
 */
public class CocktailSort {
    public void sort(int[] list) {
        int left = 0, right = list.length - 1;
        while (right - left > 1) {
            for (int i = left; i < right; i++) {
                if (list[i] > list[i + 1]) {
                    int tmp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = tmp;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (list[i - 1] > list[i]) {
                    int tmp = list[i];
                    list[i] = list[i - 1];
                    list[i - 1] = tmp;
                }
            }
            left++;
        }
    }
}
