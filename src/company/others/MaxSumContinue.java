package company.others;

import java.util.Scanner;

/**
 * Created by dss886 on 16/9/6.
 * From online test of xiaojukeji.com at 2016/09/06.
 *
 * Same as LeetCode No053.
 */
public class MaxSumContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = scanner.nextInt(), maxSum = sum;
        for (int i = 1; i < n; i++) {
            int num = scanner.nextInt();
            sum = Math.max(sum + num, num);
            maxSum = Math.max(sum, maxSum);
        }
        System.out.println(maxSum);
    }
}
