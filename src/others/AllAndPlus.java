package others;

import java.util.Scanner;

/**
 * Created by dss886 on 16/4/27.
 * From the online written test of Toutiao.com 2016.
 */
public class AllAndPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            int k = scanner.nextInt();
            String xString = Integer.toBinaryString(x);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < xString.length(); i++) {
                if (xString.charAt(xString.length() - i - 1) == '1') {
                    sb.append(0);
                } else {
                    if (k <= 0) {
                        break;
                    } else {
                        sb.append(k % 2);
                        k = k >> 1;
                    }
                }
            }
            String result = sb.reverse().toString();
            if (k > 0) {
                result = Integer.toBinaryString(k) + result;
            }
            long r = Long.parseLong(result, 2);
            System.out.println(r);
        }
    }
}
