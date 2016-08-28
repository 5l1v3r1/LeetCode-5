package company.google.apac2017b;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by dss886 on 2016/8/28.
 * https://code.google.com/codejam/contest/5254487/dashboard#s=p1
 */
public class SherlockAndWatsonGymSecrets {
    private static final String FILE_PATH = "C:\\Users\\dss886\\workspace\\Google\\ApacTest2017\\RoundB\\";
    private static final String FILE_NAME_IN = "A-large.in";
    private static final String FILE_NAME_OUT = "A-large.out";
    private static final boolean DEBUG = true;

    public static void main(String[] args) {
        initSystemInAndOut();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            // 完全没思路卧槽
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
        System.out.println("Case #" + (t + 1) + ": " + (result % 1000000007));
    }
}
