package others;

import java.util.Scanner;

/**
 * Created by dss886 on 16/4/27.
 * From the online written test of Toutiao.com 2016.
 */
public class DecodeReversalString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.next());
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int p = scanner.nextInt();
            int l = scanner.nextInt();
            for (int j = 0; j < l; j++) {
                sb.insert(p + l + j, sb.charAt(l + p - j - 1));
            }
        }
        System.out.println(sb.toString());
    }
}
