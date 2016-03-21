package algorithm.sort;

/**
 * Created by dss886 on 2016/3/21.
 * https://zh.wikipedia.org/wiki/%E5%A0%86%E6%8E%92%E5%BA%8F
 *
 * Time Complexity:  O(n*log(n))
 * Space Complexity: O(1)
 * Stable: No
 */
public class HeapSort {
    public void sort(int[] list) {
        int lastParent = (list.length - 2) / 2;
        for (int i = lastParent; i >= 0; i--) {
            heapBalance(list, list.length, i);
        }

        for (int i = list.length - 1; i > 0; i--) {
            int temp = list[0];
            list[0] = list[i];
            list[i] = temp;
            heapBalance(list, i, 0);
        }
    }

    private void heapBalance(int[] heap, int heapSize, int index) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        int max = index;
        if (left < heapSize && heap[index] < heap[left]) max = left;
        if (right < heapSize && heap[index] < heap[right]) max = right;
        if (max != index) {
            int temp = heap[index];
            heap[index] = heap[max];
            heap[max] = temp;
            heapBalance(heap, heapSize, max);
        }
    }
}
