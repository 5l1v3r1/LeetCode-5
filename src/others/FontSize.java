package others;

import java.util.Scanner;

/**
 * Created by dss886 on 2016/4/6.
 * From the online written test of Microsoft 2016.
 *
 * When testing I got 90/100, mistakenly using Math.round() rather than Math.ceil().
 */
public class FontSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int P = scanner.nextInt();
            int W = scanner.nextInt();
            int H = scanner.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = scanner.nextInt();
            }
            for (int i = 1; i < Integer.MAX_VALUE; i++) {
                int line = W / i;
                int lineCount = 0;
                for (int j = 0; j < N; j++) {
                    lineCount += Math.ceil(((float)a[j]) / line);
                }
                if (Math.ceil(((float) lineCount) / (H / i)) > P) {
                    System.out.println(i - 1);
                    break;
                }
            }
        }
    }
}
