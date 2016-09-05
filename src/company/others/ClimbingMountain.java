package company.others;

import java.util.Scanner;

/**
 * Created by dss886 on 16/9/5.
 * From the online test of JD.com at 16/09/05
 */
public class ClimbingMountain {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int maxRecord = -1, lastDay = -1, lastRecord = -1;
            boolean impossible = false;
            for (int i = 0; i < m; i++) {
                int day = scanner.nextInt();
                int record = scanner.nextInt();
                if (lastDay == -1) {
                    lastDay = day;
                    lastRecord = record;
                    maxRecord = Math.max(maxRecord, record + day - 1);
                    continue;
                }
                int result = getMaxRecords(lastRecord, record, day - lastDay - 1);
                if (result == -1) impossible = true;
                maxRecord = Math.max(maxRecord, result);
                lastDay = day;
                lastRecord = record;
            }
            if (lastDay != -1 && lastDay != n) {
                maxRecord = Math.max(maxRecord, lastRecord + (n - lastDay));
            }
            if (impossible) {
                System.out.println("IMPOSSIBLE");
            } else {
                System.out.println(maxRecord == -1 ? "IMPOSSIBLE" : String.valueOf(maxRecord));
            }
        }
    }

    private static int getMaxRecords(int left, int right, int days) {
        if (Math.abs(left - right) > days + 1) return -1;
        if (Math.abs(left - right) >= days) {
            return Math.max(left, right);
        }
        int max = Math.max(left, right);
        days -= Math.abs(left - right);
        return max + (days + 1) / 2;
    }
}
