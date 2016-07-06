package company.google;

import java.util.Scanner;

/**
 * Created by dss886 on 16/7/6.
 *
 * From the Round-Test APAC Test of Google 2017 (Problem A)
 * https://code.google.com/codejam/contest/5254486/dashboard
 */
public class LazySpellingBee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int T = scanner.nextInt();
            for (int t = 0; t < T; t++) {
                String input = scanner.next();
                long result = 1;
                for (int i = 0; i < input.length(); i++) {
                    result *= getPossibility(input, i);
                    if (result > 1000000007) result %= 1000000007;
                }
                print(t, result);
            }
        }
    }

    private static int getPossibility(String input, int position) {
        char mid = input.charAt(position);
        char left = position == 0 ? mid : input.charAt(position - 1);
        char right = position == input.length() - 1 ? mid : input.charAt(position + 1);
        if (left == mid) return mid == right ? 1 : 2;
        if (right == mid) return 2;
        return left == right ? 2 : 3;
    }

    private static void print(int t, long result) {
        System.out.println("Case #" + (t + 1) + ": " + result);
    }
}
