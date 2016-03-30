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
            String K = scanner.next();
            char[] ks = String.valueOf(K).toCharArray();
            if (ks.length <= 1) { System.out.println(K); continue; }
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < ks.length - 1; j++) {
                if (judge(ks[j] - '0', ks[j + 1] - '0')) {
                    sb.append(ks[j]);
                    if (j == ks.length - 2) sb.append(ks[j + 1]);
                } else {
                    sb.append(ks[j]);
                    int maxValid = findMaxValid(ks[j] - '0', ks[j + 1] - '0');
                    if (maxValid != -1) {
                        sb.append(maxValid);
                        fillEnd(ks, sb);
                    } else {
                        goBack(sb, ks[j]);
                        if (sb.length() == 0) {
                            sb.append((char) (ks[j] - 1));
                            fillEnd(ks, sb);
                        } else {
                            int pre = ks[sb.length() - 1] - '0';
                            int next = ks[sb.length()] - '0';
                            sb.append(findMaxValid(pre, next));
                            fillEnd(ks, sb);
                        }
                    }
                    break;
                }
            }
            System.out.println(sb);
        }
    }

    private static void goBack(StringBuilder sb, char c) {
        sb.delete(sb.indexOf(String.valueOf(c)), sb.length());
    }

    private static void fillEnd(char[] ks, StringBuilder sb) {
        int fill = sb.charAt(sb.length() - 1) == '0' ? 0 : 9;
        while (sb.length() < ks.length) sb.append(fill);
    }

    private static int findMaxValid(int i, int j) {
        for (int k = j - 1; k >= 0; k--) {
            if (judge(i, k)) {
                return k;
            }
        }
        return -1;
    }

    private static boolean judge(int x, int y) {
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
                return y == 6 || y == 8 || y == 9 || y == 0;
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
