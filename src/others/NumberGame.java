package others;

import java.util.Scanner;

/**
 * Created by dss886 on 16/3/29.
 * From the online written test of 360 Inc. 2016/03/29.
 *
 * Notice: This solution only pass 60% test cases.
 */
public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int b = scanner.nextInt();
            if (n == 1) {
                System.out.println(1);
                continue;
            }
            float edge = ((float) n + 1) / 2;
            if (b >= edge) {
                System.out.println(b - 1);
            } else {
                System.out.println(b + 1);
            }
        }
    }
}
