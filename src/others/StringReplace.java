package others;

import java.util.Scanner;

/**
 * Created by dss886 on 16/3/29.
 * From the online written test of 360 Inc. 2016/03/29.
 */
public class StringReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String s = scanner.next();
            char[] sc = s.toCharArray();
            for (int i = 0; i < m; i++) {
                int x = scanner.nextInt();
                char c = scanner.next().charAt(0);
                sc[x - 1] = c;
                // 实现 f(s)
                StringBuilder sb = new StringBuilder(new String(sc));
                int count = 0;
                for (int j = 0; j < n - 1; j++) {
                    if (sb.charAt(j) == '.' && sb.charAt(j + 1) == '.') {
                        int k = j + 2;
                        int tempCount = 1;
                        while (k < n && sb.charAt(k) == '.') { tempCount++; k++;}
                        count += tempCount;
                        j = k;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
