package others;

import java.util.Scanner;

/**
 * Created by dss886 on 16/3/29.
 * From the simulate online written test of 360 Inc. 2016/03/28.
 */
public class ShuiXianHuaNumber {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int i = m; i <= n; i++) {
                int a = i / 100;
                int b = (i % 100) / 10;
                int c = i % 10;
                if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == i) sb.append(i).append(" ");
            }
            System.out.println(sb.length() == 0 ? "no" : sb.toString().trim());
        }
    }
}
