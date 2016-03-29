package others;

import java.util.Scanner;

/**
 * Created by dss886 on 16/3/29.
 * From the online written test of Microsoft 2015.
 */
public class NumericKeypad {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int K = scanner.nextInt();
            char[] ks = String.valueOf(K).toCharArray();
            if (ks.length <= 1) { System.out.println(K); continue; }
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < ks.length - 1; j++) {
                if (judge(ks[j], ks[j + 1])) {
                    
                }
            }
        }
    }

    /**
     * Keypad:
     * 1  2  3
     * 4  5  6
     * 7  8  9
     *    0
     */
    private static boolean judge(char a, char b) {
        int x = Character.getNumericValue(a);
        int y = Character.getNumericValue(b);
        if (x == 0) return y == 0;
        if (y != 0 && x > y) return false;
        if (x == y) return true;
        switch (x) {
            case 1:
                return true;
            case 2:
                return !(y == 4 || y == 7);
            case 3:
                return y == 6 || y == 9;
            case 4:
                return true;
            case 5:
                return y == 6 || y == 8 || y == 9;
            case 6:
                return y == 9;
            case 7:
                return true;
            case 8:
                return y == 0;
            case 9:
                return false;
        }
        return false;
    }
}
