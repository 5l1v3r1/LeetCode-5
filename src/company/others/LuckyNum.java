package company.others;

import java.util.Scanner;

/**
 * Created by dss886 on 16/4/21.
 * From the online written test of Baidu 2016.
 */
public class LuckyNum {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int aLength = String.valueOf(a).length();
            int bLength = String.valueOf(b).length();
            int diff = aLength - bLength;
            int result;
            if (a < b) {
                result = b;
            } else if (diff == 0){
                result = b + (int) java.lang.Math.pow(10, bLength);
            } else {
                int aMod = a % ((int) java.lang.Math.pow(10, bLength));
                if (aMod < b) result = b + a - aMod;
                else result = b + (int) java.lang.Math.pow(10, bLength) + a - aMod;
            }
            System.out.println(result);
        }
    }
}
