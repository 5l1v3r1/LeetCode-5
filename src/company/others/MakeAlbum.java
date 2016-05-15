package company.others;

import java.util.Scanner;

/**
 * Created by dss886 on 16/4/27.
 * From the online written test of Toutiao.com 2016.
 */
public class MakeAlbum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            float n = scanner.nextInt();
            int s = scanner.nextInt();
            float L = scanner.nextInt();
            int numInOneCD = (int) ((L + 1) / s - 1);
            if (numInOneCD % 13 == 0) numInOneCD--;
            System.out.println((int) Math.ceil(n / numInOneCD));
        }
    }
}
