package company.microsoft;

import java.util.Scanner;

/**
 * Created by dss886 on 2016/10/10.
 * From the online written test of Microsoft 2016/10/10.
 */
public class Composition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char[] chars = scanner.next().toCharArray();
        int M = scanner.nextInt();
        int[][] map = new int[26][26];
        for(int m = 0; m < M; m++){
            char[] pair = scanner.next().toCharArray();
            map[pair[0]-'a'][pair[1]-'a'] = 1;
            map[pair[1]-'a'][pair[0]-'a'] = 1;
        }

        int max = 0;
        int[] nums = new int[26];
        nums[chars[0]-'a']++;
        for(int i = 1; i < chars.length; i++){
            int temp = 0;
            for(int j = 0; j < 26; j++){
                if (temp < nums[j] + 1 && map[j][chars[i] - 'a'] == 0) {
                    temp = nums[j] + 1;
                }
            }
            nums[chars[i]-'a'] = temp;
            max = Math.max(max, temp);
        }
        System.out.println(N == 1 ? 0 : chars.length - max);
    }
}
