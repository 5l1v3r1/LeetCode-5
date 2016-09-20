package company.others;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dss886 on 2016/9/20.
 * From the online test of baidu.com at 16/09/20
 */
public class CatchTrain {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            List<Integer> s = new ArrayList<>(A);
            List<Integer> e = new ArrayList<>(B);
            for (int a = 0; a < A; a++) {
                s.add(scanner.nextInt());
            }
            for (int b = 0; b < B; b++) {
                e.add(scanner.nextInt());
            }
            int[][] map = new int[N + 1][N + 1];
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    map[i][j] = -1;             // 初始化为-1
                }
            }
            for (int m = 0; m < M; m++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                int w = scanner.nextInt();
                map[u][v] = w;
                map[v][u] = w;
            }

            int min = Integer.MAX_VALUE;
            for (Integer value : s) {
                int result = DFS(value, N, e, map, new int[N + 1]);
                if (result != Integer.MAX_VALUE) {
                    min = Math.min(min, result);
                }
            }

            print(t, min == Integer.MAX_VALUE ? "No answer" : String.valueOf(min));
        }
    }

    private static int DFS(int now, int N, List<Integer> e, int[][] map, int[] flag) {
        if (e.contains(now)) return 0;
        flag[now] = 1;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) {
            if (i == now || flag[i] == 1 || map[now][i] == -1) continue;
            int result = DFS(i, N, e, map, flag);
            if (result != Integer.MAX_VALUE) {
                min = Math.min(min, result + map[now][i]);
            }
        }
        return min;
    }

    private static void print(int t, String result) {
        System.out.println("Case #" + (t + 1) + ": " + result);
    }
}
