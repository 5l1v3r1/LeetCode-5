import solutions.easy.*;
import util.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] list = new int[]{1, 2, 3, 4, 5, 6};
//        int[] list2 = new int[]{2, 4, 6, 8, 10};
        new No189().rotate(list, 8);
        System.out.println(Arrays.toString(list));

    }
}
