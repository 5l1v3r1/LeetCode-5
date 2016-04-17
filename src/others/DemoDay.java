package others;

import java.util.Scanner;

/**
 * Created by dss886 on 2016/4/6.
 */
public class DemoDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            char[][] map = new char[N][M];
            for (int i = 0; i < N; i++) {
                map[i] = scanner.next().toCharArray();
            }
            System.out.println(findWayOut(map, 0, 0, 0, N, M, true));
        }
    }

    private static int findWayOut(char[][] map, int nowStep, int x, int y, int N, int M, boolean towardsRight) {
        if (x == N || y == M) return Integer.MAX_VALUE - 1;
        if (x == N - 1 && y == M - 1) return nowStep;
        if (x == N - 1) towardsRight = true;
        if (y == M - 1) towardsRight = false;
        int right = findWayOut(map, nowStep, x, y + 1, N, M, towardsRight) + (towardsRight ? 0 : 1);
        int down = findWayOut(map, nowStep, x + 1, y, N, M, towardsRight) + (towardsRight ? 1 : 0);

        if (map[x][y + 1] == 'b') right++;
        return Math.min(right, down);
    }
}
