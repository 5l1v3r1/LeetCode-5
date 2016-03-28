import algorithm.sort.MergeSort;
import algorithm.sort.ShellSort;
import solutions.medium.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] list = new int[]{1, 2, 3, 4};
//        int[] list2 = new int[]{2, 4, 6, 8, 10};
//        new No189().rotate(list, 3);
//        System.out.println(Arrays.toString(list));
//        new MergeSort().sort(list);
//        System.out.println(Arrays.toString(list));
//        System.out.println(new No238().productExceptSelf(list));
        System.out.println(Arrays.toString(new No238().productExceptSelf(list)));
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    }
}
