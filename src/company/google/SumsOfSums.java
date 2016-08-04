package company.google;

import algorithm.sort.QuickSort;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by dss886 on 16/7/7.
 * From the Round-Test APAC Test of Google 2017 (Problem D)
 * https://code.google.com/codejam/contest/5254486/dashboard#s=p3
 *
 * This problem is not solved, the solution below is:
 * https://www.quora.com/How-can-problem-D-Sums-of-sums-from-Round-E-of-the-Google-APAC-Test-2016-be-solved-for-the-large-dataset
 */
public class SumsOfSums {
    private static final String FILE_PATH = "/Users/duansishu/workspace/Google/ApacTest2017/RoundTest/";
    private static final String FILE_NAME_IN = "B-large-practice.in";
    private static final String FILE_NAME_OUT = "B-large-practice.out";
    private static final boolean DEBUG = true;

    public static void main(String[] args) {
        initSystemInAndOut();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int T = scanner.nextInt();
            for (int t = 0; t < T; t++) {
                int N = scanner.nextInt();
                int Q = scanner.nextInt();
                int[] initialArray = new int[N];
                for (int i = 0; i < N; i++) {
                    initialArray[i] = scanner.nextInt();
                }
                new QuickSort().sort(initialArray);
                int[] sums = new int[N + 1];
                int[] sumsWithRights = new int[N + 1];
                for (int i = 1; i <= N; i++) {
                    sums[i] = sums[i - 1] + initialArray[i - 1];
                    sumsWithRights[i] = sumsWithRights[i - 1] + (N - i + 1) * initialArray[i - 1];
                }

                for (int i = 1; i <= Q; i++) {

                }
            }
        }
    }

    private static void initSystemInAndOut() {
        if (DEBUG) return;
        try {
            System.setIn(new FileInputStream(new File(FILE_PATH + FILE_NAME_IN)));
            System.setOut(new PrintStream(new File(FILE_PATH + FILE_NAME_OUT)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void print(int t, int[] resultList) {
        StringBuilder sb = new StringBuilder("Case #" + (t + 1) + ":\n");
        for (int result : resultList) {
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
