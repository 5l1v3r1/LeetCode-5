package others;

import java.util.Scanner;

/**
 * Created by dss886 on 16/3/29.
 * From the simulate online written test of 360 Inc. 2016/03/22.
 */
public class SumOfArray {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            double sum = m, now = m;
            for (int i = 0; i < n; i++) {
                now = Math.sqrt(now);
                sum += now;
            }
            String result = String.valueOf(sum);
            System.out.println(result.substring(0, result.indexOf(".") + 3));
        }
    }
}
