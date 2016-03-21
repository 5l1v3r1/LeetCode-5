import algorithm.sort.ShellSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] list = new int[]{3, 4, 5, 6, 1, 2};
//        int[] list2 = new int[]{2, 4, 6, 8, 10};
//        new No189().rotate(list, 3);
//        System.out.println(Arrays.toString(list));
        new ShellSort().sort(list);
        System.out.println(Arrays.toString(list));
//        System.out.println(new No008().myAtoi("123  456"));
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    }
}
