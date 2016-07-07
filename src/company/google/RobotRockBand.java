package company.google;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by dss886 on 16/7/6.
 *
 * From the Round-Test APAC Test of Google 2017 (Problem B)
 * https://code.google.com/codejam/contest/5254486/dashboard
 *
 * Find the possibilities of a ^ b ^ c ^ d = K, the instant thought of this problem is using 4-nested loop.
 * But when N is very big, the time cost of the deep-nested loop will be very terrible.
 * Considering of the operation of ^(xor), which obey the commutative law,
 * so we can find the ways of a ^ b = c ^ d ^ K instead.
 * Then the 4-nested loop have been changed to two 2-nest loop, the large test case passed through.
 */
public class RobotRockBand {

    private static final String FILE_PATH = "/Users/duansishu/workspace/Google/ApacTest2017/RoundTest/";
    private static final String FILE_NAME_IN = "B-large-practice.in";
    private static final String FILE_NAME_OUT = "B-large-practice.out";
    private static final boolean DEBUG = false;

    public static void main(String[] args) {
        initSystemInAndOut();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int T = scanner.nextInt();
            for (int t = 0; t < T; t++) {
                int N = scanner.nextInt();
                int K = scanner.nextInt();
                int[][] nums = new int[4][N];
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < N; j++) {
                        nums[i][j] = scanner.nextInt();
                    }
                }
                Map<Integer, Integer> AB = new HashMap<>();
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        int ab = nums[0][i] ^ nums[1][j];
                        if (AB.containsKey(ab)) {
                            AB.put(ab, AB.get(ab) + 1);
                        } else {
                            AB.put(ab, 1);
                        }
                    }
                }
                long result = 0;
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        int cdk = nums[2][i] ^ nums[3][j] ^ K;
                        if (AB.containsKey(cdk)) {
                            result += AB.get(cdk);
                        }
                    }
                }
                print(t, result);
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

    private static void print(int t, long result) {
        System.out.println("Case #" + (t + 1) + ": " + result);
    }
}
