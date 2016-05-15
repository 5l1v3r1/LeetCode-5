package algorithm.sort;

/**
 * Created by dss886 on 2016/3/22.
 * https://zh.wikipedia.org/wiki/%E5%BD%92%E5%B9%B6%E6%8E%92%E5%BA%8F
 *
 * Timer Complexity:  Best O(n), Worst O(n*log(n)), Average O(n*log(n))
 * Space Complexity: O(n)
 * Stable: Yes
 */
public class MergeSort {
    public void sort(int[] list) {
//        mergeSortRecursive(list, new int[list.length], 0, list.length - 1);
        mergeSortLoop(list);
    }

    @SuppressWarnings({"UnnecessaryLocalVariable", "unused"})
    private void mergeSortRecursive(int[] list, int[] tmpList, int start, int end) {
        if (start >= end) return;
        int mid = (end - start) / 2 + start;
        int start1 = start, end1 = mid;
        int start2 = mid + 1, end2 = end;
        mergeSortRecursive(list, tmpList, start1, end1);
        mergeSortRecursive(list, tmpList, start2, end2);

        int i = start;
        while (start1 <= end1 && start2 <= end2)
            tmpList[i++] = list[start1] < list[start2] ? list[start1++] : list[start2++];
        while (start1 <= end1) tmpList[i++] = list[start1++];
        while (start2 <= end2) tmpList[i++] = list[start2++];
        System.arraycopy(tmpList, start, list, start, end - start + 1);
    }

    @SuppressWarnings("UnnecessaryLocalVariable")
    private void mergeSortLoop(int[] list) {
        int[] result = new int[list.length];
        for (int block = 1; block < list.length; block *= 2) {
            for (int start = 0; start < list.length; start += block * 2) {
                int end = start + 2 * block - 1;
                int mid = (end - start) / 2 + start;
                int start1 = start;
                int end1 = mid;
                int start2 = mid + 1;
                int end2 = end < list.length ? end : list.length - 1;

                int p = start;
                while (start1 <= end1 && start2 <= end2)
                    result[p++] = list[start1] < list[start2] ? list[start1++] : list[start2++];
                while(start1 <= end1) result[p++] = list[start1++];
                while(start2 <= end2) result[p++] = list[start2++];
            }
            System.arraycopy(result, 0, list, 0, list.length);
        }
    }
}
