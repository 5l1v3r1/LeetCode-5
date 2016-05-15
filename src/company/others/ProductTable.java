package company.others;

import java.util.Scanner;

/**
 * Created by dss886 on 16/4/21.
 * From the online written test of Baidu 2016.
 */
public class ProductTable {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int minMN = Math.min(m, n);
            int maxMN = Math.max(m, n);
            int k = scanner.nextInt();
            int i = 2, sum = 1;
            for (; sum < k; i++) {
                for (int j = 1; j <= Math.sqrt(i) && j <= minMN; j++) {
                    double res = ((double) i) / j;
                    if ((int) res == res) {
                        if (res == j) {
                            sum += 1;
                        } else if (res <= minMN) {
                            sum += 2;
                        } else if (res <= maxMN) {
                            sum += 1;
                        }
                    }
                }
            }
            System.out.println(i - 1);
        }
    }
}
