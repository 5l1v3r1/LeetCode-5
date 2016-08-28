package company.google.apac2017b;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by dss886 on 2016/8/28.
 * https://code.google.com/codejam/contest/5254487/dashboard#s=p0
 */
public class SherlockAndParentheses {
    private static final String FILE_PATH = "C:\\Users\\dss886\\Desktop\\Google\\ApacTest2017\\RoundB\\";
    private static final String FILE_NAME_IN = "A-large.in";
    private static final String FILE_NAME_OUT = "A-large.out";
    private static final boolean DEBUG = true;

    private static int[] cache = new int[100001];
    private static int maxCacheNum = 0;

    public static void main(String[] args) {
        initSystemInAndOut();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int T = scanner.nextInt();
            for (int t = 0; t < T; t++) {
                int L = scanner.nextInt();
                int R = scanner.nextInt();
                int num = Math.min(L, R);
                if (num == 0) {
                    print(t, 0);
                    continue;
                }
                if (cache[num] != 0) {
                    print(t, cache[num]);
                    continue;
                }
                int sum = cache[maxCacheNum];
                for (int i = maxCacheNum + 1; i <= num; i++) {
                    sum += i;
                    cache[i] = sum;
                    maxCacheNum = i;
                }
                print(t, sum);
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

    private static void print(int t, int result) {
        System.out.println("Case #" + (t + 1) + ": " + result);
    }
}
