package algorithm.sort;

/**
 * Created by dss886 on 2016/3/21.
 * https://zh.wikipedia.org/wiki/%E5%BF%AB%E9%80%9F%E6%8E%92%E5%BA%8F
 *
 * Time Complexity:  Best O(n*log(n)), Worst O(n^2), Average O(n*log(n))
 * Space Complexity: \
 * Stable: No
 */
public class QuickSort {
    public void sort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }

    private void quickSort(int[] list, int left, int right) {
        if (left < right) {
            int newPivot = partition(list, left, right, left);
            quickSort(list, left, newPivot - 1);
            quickSort(list, newPivot + 1, right);
        }
    }

    private int partition(int[] list, int left, int right, int pivot) {
        int store = left, pValue = list[pivot];
        swap(list, pivot, right);
        for (int i = left; i < right; i++) {
            if (list[i] <= pValue) {
                swap(list, store, i);
                store++;
            }
        }
        swap(list, store, right);
        return store;
    }

    private void swap(int[] list, int a, int b) {
        int tmp = list[a];
        list[a] = list[b];
        list[b] = tmp;
    }
}
