package company.microsoft;

import java.util.Scanner;

/**
 * Created by dss886 on 2016/10/10.
 * From the online written test of Microsoft 2016/10/10.
 */
public class ShorteningSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int odds = 0;
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 1) odds++;
        }
        int evens = N - odds;
        System.out.println(Math.abs(odds - evens));
    }
}
